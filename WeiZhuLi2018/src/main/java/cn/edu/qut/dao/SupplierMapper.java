package cn.edu.qut.dao;

import cn.edu.qut.entity.Supplier;
import cn.edu.qut.entity.SupplierExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SupplierMapper {
    long countByExample(SupplierExample example);

    int deleteByExample(SupplierExample example);

    int deleteByPrimaryKey(Integer supplierId);

    int insert(Supplier record);

    int insertSelective(Supplier record);

    List<Supplier> selectByExampleWithBLOBs(SupplierExample example);

    List<Supplier> selectByExample(SupplierExample example);

    Supplier selectByPrimaryKey(Integer supplierId);

    int updateByExampleSelective(@Param("record") Supplier record, @Param("example") SupplierExample example);

    int updateByExampleWithBLOBs(@Param("record") Supplier record, @Param("example") SupplierExample example);

    int updateByExample(@Param("record") Supplier record, @Param("example") SupplierExample example);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKeyWithBLOBs(Supplier record);

    int updateByPrimaryKey(Supplier record);

    int count(int storeId);

    List<Supplier> query1(int storeId);
}