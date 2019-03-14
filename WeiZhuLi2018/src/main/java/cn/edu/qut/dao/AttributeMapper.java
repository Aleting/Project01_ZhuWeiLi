package cn.edu.qut.dao;

import cn.edu.qut.entity.Attribute;
import cn.edu.qut.entity.AttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttributeMapper {
    long countByExample(AttributeExample example);

    int deleteByExample(AttributeExample example);

    int deleteByPrimaryKey(Integer attributeId);

    int insert(Attribute record);

    int insertSelective(Attribute record);

    List<Attribute> selectByExampleWithBLOBs(AttributeExample example);

    List<Attribute> selectByExample(AttributeExample example);

    Attribute selectByPrimaryKey(Integer attributeId);

    int updateByExampleSelective(@Param("record") Attribute record, @Param("example") AttributeExample example);

    int updateByExampleWithBLOBs(@Param("record") Attribute record, @Param("example") AttributeExample example);

    int updateByExample(@Param("record") Attribute record, @Param("example") AttributeExample example);

    int updateByPrimaryKeySelective(Attribute record);

    int updateByPrimaryKeyWithBLOBs(Attribute record);

    int updateByPrimaryKey(Attribute record);
}