package com.onfacemind.batchimportfiles.compare;

import com.onfacemind.batchimportfiles.compare.beans.FaceProps;
import com.onfacemind.batchimportfiles.compare.beans.FaceSearchData;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;

public interface CompareService {

    int addStandardFaceByPic(String popId, File faceFile);

    int addStandardFaceByPic(String popId, MultipartFile faceFile);

    int addStandardFaceByPath(String popId, String facePath);

    int addStandardFaceByPic(String popId, byte[] faceFile);

    int addDynamicFaceByFeature(String popId, MultipartFile featureFile);

    List<FaceSearchData> searchInStandardFaceByPic(MultipartFile faceFile);

    List<FaceSearchData> searchInStandardFaceByPic(File faceFile);

    List<FaceSearchData> searchInStandardFaceByPic(byte[] faceFile);

    List<FaceSearchData> searchInStandardFaceByFeature(MultipartFile faceFeature);

    List<FaceSearchData> searchInStandardFaceByFeature(File faceFeature);

    List<FaceSearchData> searchInDynamicFaceByPic(MultipartFile faceFile);

    List<FaceSearchData> searchInDynamicFaceByPic(byte[] faceFile);

    int deletePopulationById(String popId);

    FaceProps getFaceFeatureByPic(MultipartFile faceFile);

    Float compareFaces(MultipartFile faceFile1, MultipartFile faceFile2);

}
