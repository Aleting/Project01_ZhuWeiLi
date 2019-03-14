package cn.edu.qut.dao;

import cn.edu.qut.entity.Seller;
import cn.edu.qut.entity.SellerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SellerMapper {
    long countByExample(SellerExample example);

    int deleteByExample(SellerExample example);

    int deleteByPrimaryKey(Integer sellerId);

    int insert(Seller record);

    int insertSelective(Seller record);

    List<Seller> selectByExample(SellerExample example);

    Seller selectByPrimaryKey(Integer sellerId);

    int updateByExampleSelective(@Param("record") Seller record, @Param("example") SellerExample example);

    int updateByExample(@Param("record") Seller record, @Param("example") SellerExample example);

    int updateByPrimaryKeySelective(Seller record);

    int updateByPrimaryKey(Seller record);

    int updateState(String sellerState);

    int selectCount(int storeId);

    Seller selectId(@Param("storeId") int storeId, @Param("bouId") int bouId);

    List<Seller> findAllPage(@Param("storeId") int storeId, @Param("page") int page);
}