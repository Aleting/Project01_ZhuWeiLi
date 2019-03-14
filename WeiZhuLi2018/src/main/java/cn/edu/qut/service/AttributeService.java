package cn.edu.qut.service;

import cn.edu.qut.dao.AttributeMapper;
import cn.edu.qut.entity.Attribute;
import cn.edu.qut.entity.AttributeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttributeService {
    @Autowired
    AttributeMapper attributeMapper;

    /**
     * 增加商品属性
     * @param attribute
     * @return
     */
    public boolean addAttribute(Attribute attribute){
        System.out.println("进入servicr");
        attributeMapper.insertSelective(attribute);
        System.out.println("离开servicr");
        return true;
    }
    /**
     * 删除商品属性
     */
    public boolean deleteAttribute(int goodsId){
        AttributeExample example = new AttributeExample();
        AttributeExample.Criteria criteria = example.createCriteria();
        criteria.andGoodsIdEqualTo(goodsId);
        attributeMapper.deleteByExample(example);
        return true;
    }

    /**
     * 修改商品属性
     */
    public boolean updataAttribute(Attribute attribute){
        attributeMapper.updateByPrimaryKeySelective(attribute);
        return true;
    }

}
