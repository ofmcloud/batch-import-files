package com.onfacemind.batchimportfiles.business;

import com.github.tobato.fastdfs.service.FastFileStorageClient;
import com.onfacemind.batchimportfiles.read.beans.Person;
import com.onfacemind.batchimportfiles.service.PopulationRecordService;
import com.onfacemind.batchimportfiles.write.pojo.Area;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.File;

@Order(1)
@Component
public class ImportBusiness implements CommandLineRunner {
    @Value("${custom.import.destory}")
    private String destoryPath;
    @Value("${custom.import.filenameformate}")
    private int filenameformate;
    @Value("${custom.import.areaId}")
    private String areaId;
    private int fileCount = 0;
    private int currCount = 0;
    @Autowired
    PopulationRecordService recordService;

    private Area area;


    private Logger logger = LoggerFactory.getLogger(ImportBusiness.class);

    @Override
    public void run(String... args) throws Exception {
        File destory = new File(destoryPath);
        if (!destory.exists()) {
            throw new Exception("文件夹不存在");
        }
        if (!destory.isDirectory())
            throw new Exception("请选择正确的文件夹");
        area =recordService.findAreaById(areaId);
        if (area ==null || StringUtils.isEmpty(area.getId())){
            throw new Exception("ERROR:档案分类ID不存在！");
        }
        fileCount=fileCount(destory,0);
        traversingFiles(destory);
        System.out.println("---->导入完成,总共 "+fileCount+" 个文件，成功 "+currCount+" 个文件，失败 "+(fileCount-currCount)+" 个文件");
        System.out.println("---->如有导入失败的文件，请检查文件格式");
    }

    private void traversingFiles(File detory) throws Exception {
        File[] files = detory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    traversingFiles(file);
                } else {
                    String name = file.getName();
                    String suffix = name.substring(name.lastIndexOf(".") + 1, name.length());
                    if (suffix.equalsIgnoreCase("jpg") || suffix.equalsIgnoreCase("jpeg")
                            || suffix.equalsIgnoreCase("jpe")) {
                        Person person = null;
                        switch (filenameformate) {
                            case 1:
                                person = subByName_IdCard(file);
                                break;
                            case 2:
                                person = subByIdCard_Name(file);
                                break;
                            case 3:
                                person = subByName(file);
                                break;
                            case 4:
                                person = subByIdCard(file);
                                break;
                        }
                        if(person!=null){
                            recordService.saveRecord(person,area);
                            logger.info("---->导入"+person);
                            System.out.println("---->总共 "+fileCount+" 个文件，当前导入了 "+(++currCount)+" 个文件。");
                        }
                    }

                }
            }
        }
    }

    private Person subByName_IdCard(File file) {
        Person person = new Person();
        person.setPhoto(file);
        String fileName = file.getName();
        int index = fileName.lastIndexOf(".");
        fileName = fileName.substring(0, index > 0 ? index : fileName.length());
        String[] strs = fileName.split("_");
        if (strs.length < 2) {
            person.setIdcard("unknown");
            person.setName("unknown");
        } else {
            person.setName(strs[0]);
            person.setIdcard(strs[1]);
        }
        return person;
    }

    private Person subByIdCard_Name(File file) {
        Person person = new Person();
        person.setPhoto(file);
        String fileName = file.getName();
        int index = fileName.lastIndexOf(".");
        fileName = fileName.substring(0, index > 0 ? index : fileName.length());
        String[] strs = fileName.split("_");
        if (strs.length < 2) {
            person.setIdcard("unknown");
            person.setName("unknown");
        } else {
            person.setName(strs[1]);
            person.setIdcard(strs[0]);
        }
        return person;
    }

    private Person subByIdCard(File file) {
        Person person = new Person();
        person.setPhoto(file);
        String fileName = file.getName();
        int index = fileName.lastIndexOf(".");
        fileName = fileName.substring(0, index > 0 ? index : fileName.length());
        person.setName("unknown");
        person.setIdcard(fileName);
        return person;
    }

    private Person subByName(File file) {
        Person person = new Person();
        person.setPhoto(file);
        String fileName = file.getName();
        int index = fileName.lastIndexOf(".");
        fileName = fileName.substring(0, index > 0 ? index : fileName.length());
        person.setName(fileName);
        person.setIdcard("unknown");
        return person;
    }

    private int fileCount(File destory,int count){
        File[] files = destory.listFiles();
        if(files!=null){
            for(File file:files){
                if(!file.isDirectory())
                    count++;
                else
                    count+=fileCount(file,count);
            }
        }
        return count;
    }

}
