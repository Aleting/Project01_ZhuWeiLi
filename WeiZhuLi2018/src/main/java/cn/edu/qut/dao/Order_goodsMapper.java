package cn.edu.qut.dao;

import cn.edu.qut.entity.Order_goods;
import cn.edu.qut.entity.Order_goodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Order_goodsMapper {
    long countByExample(Order_goodsExample example);

    int deleteByExample(Order_goodsExample example);

    int deleteByPrimaryKey(Integer orderGoodsId);

    int insert(Order_goods record);

    int insertSelective(Order_goods record);

    List<Order_goods> selectByExample(Order_goodsExample example);

    Order_goods selectByPrimaryKey(Integer orderGoodsId);

    int updateByExampleSelective(@Param("record") Order_goods record, @Param("example") Order_goodsExample example);

    int updateByExample(@Param("record") Order_goods record, @Param("example") Order_goodsExample example);

    int updateByPrimaryKeySelective(Order_goods record);

    int updateByPrimaryKey(Order_goods record);
}