package com.onfacemind.batchimportfiles.service;

import com.github.tobato.fastdfs.domain.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import com.onfacemind.batchimportfiles.compare.CompareService;
import com.onfacemind.batchimportfiles.read.beans.Person;
import com.onfacemind.batchimportfiles.util.PKgen;
import com.onfacemind.batchimportfiles.write.mapper.AreaMapper;
import com.onfacemind.batchimportfiles.write.mapper.FaceMapper;
import com.onfacemind.batchimportfiles.write.mapper.RecordMapper;
import com.onfacemind.batchimportfiles.write.pojo.Area;
import com.onfacemind.batchimportfiles.write.pojo.Face;
import com.onfacemind.batchimportfiles.write.pojo.Record;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Service
@Transactional
public class PopulationRecordService {

    @Resource
    RecordMapper recordMapper;

    @Resource
    FaceMapper faceMapper;

    @Resource
    AreaMapper areaMapper;

    @Autowired
    FastFileStorageClient storageClient;

    @Autowired
    CompareService compareService;

    public int saveRecord(Person person, Area area){
        File photo = person.getPhoto();
        if (photo != null && photo.exists()){

            FileInputStream inputStream = null;
            try {
                //上传图片
                inputStream = new FileInputStream(photo);
                StorePath path = storageClient.uploadFile(inputStream, photo.length(), "jpg", null);
                String fullPath = path.getFullPath();

                if (StringUtils.isNotEmpty(fullPath)){

                    Record record = new Record();
                    record.setId(PKgen.getId());
                    record.setName(person.getName());
                    record.setIdCard(person.getIdcard());
                    record.setFaceTotal(1);
                    record.setTempId(area.getId());
                    record.setState("Y");
                    record.setHasWarn(area.getState());
                    record.setWarnNum(area.getWarningValue());
                    record.setWarnAnalyse(area.getState());

                    Face face = new Face();
                    face.setId(PKgen.getId());
                    face.setImage("/"+fullPath);
                    face.setRecordId(record.getId());

                    //发算法
                    int is_pass = compareService.addStandardFaceByPic(record.getId(), photo);
                    face.setIsPass(is_pass);

                    recordMapper.insert(record);
                    faceMapper.insert(face);

                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (inputStream != null)
                        inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return 1;
    }

    public Area findAreaById(String id){
        if (StringUtils.isEmpty(id))
            return null;
        return areaMapper.selectByPrimaryKey(id);
    }

}
