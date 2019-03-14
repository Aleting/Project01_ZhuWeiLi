package cn.edu.qut.service;


import cn.edu.qut.dao.CostMapper;
import cn.edu.qut.entity.Cost;
import cn.edu.qut.entity.CostExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CostService {
    @Autowired
    CostMapper costMapper;

    public boolean insertCost(Cost cost){
        costMapper.insertSelective(cost);
        return true;
    }

    public List<Cost> select_cost(int storeId){
        CostExample example = new CostExample();
        CostExample.Criteria criteria = example.createCriteria();
        criteria.andStoreIdEqualTo(storeId);
        return costMapper.selectByExample(example);
    }

    public void addCost(Cost cost,int storeId){
        CostExample example = new CostExample();
        CostExample.Criteria criteria = example.createCriteria();
        criteria.andStoreIdEqualTo(storeId);
        costMapper.updateByExampleSelective(cost,example);
    }

}
