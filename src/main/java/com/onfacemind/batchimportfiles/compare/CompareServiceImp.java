package com.onfacemind.batchimportfiles.compare;

import com.onfacemind.batchimportfiles.compare.beans.*;
import com.onfacemind.batchimportfiles.config.props.CompareProps;
import com.onfacemind.batchimportfiles.util.http.HttpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.HashMap;
import java.util.List;

/**
 * 通过http调用算法，返回state为0标识成功，其他为不成功,返回到上层的值做了转换，返回1标识为成功，0为不成功
 */
@Service
public class CompareServiceImp implements CompareService{

    @Autowired
    CompareProps comparePorps;

    @Override
    public int addStandardFaceByPic(String popId, File faceFile) {

        HashMap<String, String> params = new HashMap<>();
        params.put("tempId",popId);

        HashMap<String, File> files = new HashMap<>();
        files.put("face",faceFile);

        FaceSearchResponse respon = HttpUtil.post(comparePorps.getHost()+FaceCompareApiConsts.addStandardFacePic, params, files, null,null, FaceSearchResponse.class);
        if (respon != null)
            return respon.getState() == 0?1:0;
        return 0;
    }

    @Override
    public int addStandardFaceByPic(String popId, MultipartFile faceFile) {
        HashMap<String, String> params = new HashMap<>();
        params.put("tempId",popId);

        HashMap<String, MultipartFile> files = new HashMap<>();
        files.put("face",faceFile);

        FaceSearchResponse respon = HttpUtil.post(comparePorps.getHost()+FaceCompareApiConsts.addStandardFacePic, params, null, files,null, FaceSearchResponse.class);
        if (respon != null)
            return respon.getState() == 0?1:0;
        return 0;
    }

    //TODO 暂未实现
    @Override
    public int addStandardFaceByPath(String popId, String facePath) {
        return 0;
    }

    @Override
    public int addStandardFaceByPic(String popId, byte[] faceFile) {
        HashMap<String, String> params = new HashMap<>();
        params.put("tempId",popId);

        HashMap<String, byte[]> files = new HashMap<>();
        files.put("face",faceFile);

        FaceSearchResponse respon = HttpUtil.post(comparePorps.getHost()+FaceCompareApiConsts.addStandardFacePic, params, null, null,files, FaceSearchResponse.class);
        if (respon != null)
            return respon.getState() == 0?1:0;
        return 0;
    }

    @Override
    public int addDynamicFaceByFeature(String popId, MultipartFile featureFile) {
        HashMap<String, String> params = new HashMap<>();
        params.put("tempId",popId);

        HashMap<String, MultipartFile> files = new HashMap<>();
        files.put("feature",featureFile);

        FaceSearchResponse respon = HttpUtil.post(comparePorps.getHost()+FaceCompareApiConsts.addDynamicFacePic, params, null, files,null, FaceSearchResponse.class);
        if (respon != null)
            return respon.getState() == 0?1:0;
        return 0;
    }

    @Override
    public List<FaceSearchData> searchInStandardFaceByPic(MultipartFile faceFile) {

        HashMap<String, MultipartFile> files = new HashMap<>();
        files.put("face",faceFile);

        FaceSearchResponse respon = HttpUtil.post(comparePorps.getHost()+FaceCompareApiConsts.searchInStandardFactoryByPic, null, null, files,null, FaceSearchResponse.class);
        if (respon != null && respon.getState() == 0){
            List<FaceSearchData> data = respon.getData();
            if (data != null && data.size() > 0)
                return data;
        }
        return null;
    }

    @Override
    public List<FaceSearchData> searchInStandardFaceByPic(File faceFile) {

        HashMap<String, File> files = new HashMap<>();
        files.put("face",faceFile);

        FaceSearchResponse respon = HttpUtil.post(comparePorps.getHost()+FaceCompareApiConsts.searchInStandardFactoryByPic, null, files, null,null, FaceSearchResponse.class);
        if (respon != null && respon.getState() == 0){
            List<FaceSearchData> data = respon.getData();
            if (data != null && data.size() > 0)
                return data;
        }
        return null;
    }

    @Override
    public List<FaceSearchData> searchInStandardFaceByPic(byte[] faceFile) {
        HashMap<String, byte[]> files = new HashMap<>();
        files.put("face", faceFile);
        FaceSearchResponse response = HttpUtil.post(comparePorps.getHost() + FaceCompareApiConsts.searchInStandardFactoryByPic, null, null, null, files, FaceSearchResponse.class);
        if (response != null && response.getState() == 0){
            List<FaceSearchData> data = response.getData();
            if (data != null && data.size() > 0)
                return data;
        }
        return null;
    }

    @Override
    public List<FaceSearchData> searchInStandardFaceByFeature(MultipartFile faceFeature) {
        HashMap<String, MultipartFile> files = new HashMap<>();
        files.put("feature",faceFeature);

        FaceSearchResponse respon = HttpUtil.post(comparePorps.getHost()+FaceCompareApiConsts.searchInStandardFactoryByPicFeature, null, null, files,null, FaceSearchResponse.class);
        if (respon != null && respon.getState() == 0){
            List<FaceSearchData> data = respon.getData();
            if (data != null && data.size() > 0)
                return data;
        }
        return null;
    }

    @Override
    public List<FaceSearchData> searchInStandardFaceByFeature(File faceFeature) {
        HashMap<String, File> files = new HashMap<>();
        files.put("feature",faceFeature);

        FaceSearchResponse respon = HttpUtil.post(comparePorps.getHost()+FaceCompareApiConsts.searchInStandardFactoryByPicFeature, null, files, null,null, FaceSearchResponse.class);
        if (respon != null && respon.getState() == 0){
            List<FaceSearchData> data = respon.getData();
            if (data != null && data.size() > 0)
                return data;
        }
        return null;
    }

    @Override
    public List<FaceSearchData> searchInDynamicFaceByPic(MultipartFile faceFile) {
        HashMap<String, MultipartFile> files = new HashMap<>();
        files.put("face",faceFile);

        FaceSearchResponse respon = HttpUtil.post(comparePorps.getHost()+FaceCompareApiConsts.searchInDynamicFactoryByPic, null, null, files,null, FaceSearchResponse.class);
        if (respon != null && respon.getState() == 0){
            List<FaceSearchData> data = respon.getData();
            if (data != null && data.size() > 0)
                return data;
        }
        return null;
    }

    @Override
    public List<FaceSearchData> searchInDynamicFaceByPic(byte[] faceFile) {
        HashMap<String, byte[]> files = new HashMap<>();
        files.put("face", faceFile);
        FaceSearchResponse response = HttpUtil.post(comparePorps.getHost() + FaceCompareApiConsts.searchInDynamicFactoryByPic, null, null, null, files, FaceSearchResponse.class);
        if (response != null && response.getState() == 0){
            List<FaceSearchData> data = response.getData();
            if (data != null && data.size() > 0)
                return data;
        }
        return null;
    }

    @Override
    public int deletePopulationById(String popId) {

        HashMap<String, String> params = new HashMap<>();
        params.put("tempId",popId);
        FaceSearchResponse response = HttpUtil.post(comparePorps.getHost()+comparePorps.getHost()+FaceCompareApiConsts.deletePopulationById, params, null, null,null, FaceSearchResponse.class);
        if (response != null)
            return response.getState() == 0?1:0;
        return 0;

    }

    @Override
    public FaceProps getFaceFeatureByPic(MultipartFile faceFile) {

        HashMap<String, MultipartFile> files = new HashMap<>();
        files.put("face",faceFile);

        FacePropsResponse response = HttpUtil.post(comparePorps.getHost() + FaceCompareApiConsts.getFacePropsByPic, null, null, files,null, FacePropsResponse.class);
        if (response != null && response.getState() == 0){
            return response.getData();
        }
        return null;
    }

    @Override
    public Float compareFaces(MultipartFile faceFile1, MultipartFile faceFile2) {

        HashMap<String, MultipartFile> files = new HashMap<>();
        files.put("face1",faceFile1);
        files.put("face2",faceFile2);

        FaceCompareResponse response = HttpUtil.post(comparePorps.getHost() + FaceCompareApiConsts.compareFaces, null, null, files,null, FaceCompareResponse.class);
        if (response != null && response.getState() == 0 && response.getData() != null){
            return response.getData().getScore();
        }
        return -1f;
    }
}
