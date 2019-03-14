package cn.edu.qut.dao;

import cn.edu.qut.entity.Access;
import cn.edu.qut.entity.AccessExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccessMapper {
    long countByExample(AccessExample example);

    int deleteByExample(AccessExample example);

    int insert(Access record);

    int insertSelective(Access record);

    List<Access> selectByExample(AccessExample example);

    int updateByExampleSelective(@Param("record") Access record, @Param("example") AccessExample example);

    int updateByExample(@Param("record") Access record, @Param("example") AccessExample example);
}