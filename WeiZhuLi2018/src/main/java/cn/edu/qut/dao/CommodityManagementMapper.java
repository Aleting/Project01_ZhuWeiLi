package cn.edu.qut.dao;


import cn.edu.qut.entity.CommodityManagement;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommodityManagementMapper {

    List<CommodityManagement> findAllPage(@Param("storeId") int storeId, @Param("page") int page);

    int count(int storeId);

    CommodityManagement selectGoodsId(@Param("GoodsId") int GoodsId, @Param("storeId") int storeId);

    List<CommodityManagement> selectGoodsName(@Param("goodsName") String goodsName, @Param("storeId") int storeId);

    List<CommodityManagement> query1(String storeId);

    List<CommodityManagement> selectSortId(@Param("sortId") int sortId, @Param("storeId") int storeId, @Param("page") int page);

    CommodityManagement selectByPrimaryKey(int goodsId);
}
