package cn.edu.qut.dao;

import cn.edu.qut.entity.Orde;
import cn.edu.qut.entity.OrdeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdeMapper {
    long countByExample(OrdeExample example);

    int deleteByExample(OrdeExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(Orde record);

    int insertSelective(Orde record);

    List<Orde> selectByExample(OrdeExample example);

    Orde selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") Orde record, @Param("example") OrdeExample example);

    int updateByExample(@Param("record") Orde record, @Param("example") OrdeExample example);

    int updateByPrimaryKeySelective(Orde record);

    int updateByPrimaryKey(Orde record);

    List<Orde> findAllPage(@Param("storeId") int storeId, @Param("page") int page);

    int count(int storeId);

    Orde selectId(@Param("orderId") int orderId, @Param("storeId") int storeId);

    List<Orde> findOrders(@Param("storeId") int storeId, @Param("page") int page);

    List<Orde> selectCustomerName(@Param("name") String name, @Param("storeId") int storeId);

    List<Orde> query1(int storeId);
}