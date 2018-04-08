package com.onfacemind.batchimportfiles.write.mapper;

import com.onfacemind.batchimportfiles.write.pojo.Face;
import com.onfacemind.batchimportfiles.write.pojo.FaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FaceMapper {
    int countByExample(FaceExample example);

    int deleteByExample(FaceExample example);

    int deleteByPrimaryKey(String id);

    int insert(Face record);

    int insertSelective(Face record);

    List<Face> selectByExample(FaceExample example);

    Face selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Face record, @Param("example") FaceExample example);

    int updateByExample(@Param("record") Face record, @Param("example") FaceExample example);

    int updateByPrimaryKeySelective(Face record);

    int updateByPrimaryKey(Face record);
}