package cn.edu.qut.dao;

import cn.edu.qut.entity.T_bought;
import cn.edu.qut.entity.T_boughtExample;
import cn.edu.qut.entity.T_boughtKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface T_boughtMapper {
    long countByExample(T_boughtExample example);

    int deleteByExample(T_boughtExample example);

    int deleteByPrimaryKey(T_boughtKey key);

    int insert(T_bought record);

    int insertSelective(T_bought record);

    List<T_bought> selectByExample(T_boughtExample example);

    T_bought selectByPrimaryKey(T_boughtKey key);

    int updateByExampleSelective(@Param("record") T_bought record, @Param("example") T_boughtExample example);

    int updateByExample(@Param("record") T_bought record, @Param("example") T_boughtExample example);

    int updateByPrimaryKeySelective(T_bought record);

    int updateByPrimaryKey(T_bought record);

    List<T_bought> findAllPage(@Param("storeId") int storeId, @Param("page") int page);

    int count(@Param("storeId") int storeId);

    List<T_bought> selectSupplierName(@Param("supplierName") String supplierName, @Param("storeId") int storeId);

    List<T_bought> query1(@Param("storeId") int storeId);
}