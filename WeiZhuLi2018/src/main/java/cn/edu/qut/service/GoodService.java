package cn.edu.qut.service;


import cn.edu.qut.dao.GoodsMapper;
import cn.edu.qut.entity.Goods;
import cn.edu.qut.entity.GoodsExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodService {
    @Autowired
    GoodsMapper goodsMapper;

    /**
     * 商品列表数据
     */
    public List<Goods> all_goods(){
        return goodsMapper.selectByExample(null);
    }
    /**
     * 添加商品
     */
    public boolean addGoods(Goods goods){
        goodsMapper.insertSelective(goods);
        return true;
    }

    /**
     * 删除商品
     */
    public boolean deleteGoods(int goodsId){
        goodsMapper.deleteByPrimaryKey(goodsId);
        return true;
    }

    /**
     * 修改商品
     */
    public boolean updateGoods(Goods goods){
        goodsMapper.updateByPrimaryKeySelective(goods);
        return true;
    }
    /**
     * 更改是否下架
     * @param
     * @param
     * @return
     */
    public boolean updataGoodsState(int goId,String state){
        GoodsExample example = new GoodsExample();
        GoodsExample.Criteria criteria= example.createCriteria();
        criteria.andGoodsIdEqualTo(goId);
        Goods goods = new Goods();
        goods.setGoodsState(state);
        goodsMapper.updateByExampleSelective(goods,example);
        return true;
    }
}
