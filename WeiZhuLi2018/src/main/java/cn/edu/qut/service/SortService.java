package cn.edu.qut.service;


import cn.edu.qut.dao.SortMapper;
import cn.edu.qut.entity.Sort;
import cn.edu.qut.entity.SortExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SortService {

    @Autowired
    SortMapper sortMapper;
    public List<Sort> select_sort(int store_id){
        SortExample sortExample=new SortExample();
        SortExample.Criteria criteria=sortExample.createCriteria();
        criteria.andStoreIdEqualTo(store_id);
        return sortMapper.selectByExample(sortExample);
    }

    /**
     * 添加分类
     */
    public boolean addSort(Sort sort){
        sortMapper.insertSelective(sort);
        return true;
    }
}
