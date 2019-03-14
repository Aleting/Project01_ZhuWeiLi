package cn.edu.qut.service;

import cn.edu.qut.dao.StoreMapper;
import cn.edu.qut.dao.TypeMapper;
import cn.edu.qut.entity.Store;
import cn.edu.qut.entity.StoreExample;
import cn.edu.qut.entity.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {

    @Autowired
    StoreMapper storeMapper;
    @Autowired
    TypeMapper typeMapper;
    /**
     * 显示店铺数量
     */
    public long select_store(){
        StoreExample storeExample = new StoreExample();
        long count = storeMapper.countByExample(storeExample);
        return count;
    }

    /**
     * 回显店铺信息
     * @param store_name
     * @return
     */
    public List<Store> store_info(String store_name) {
        StoreExample storeExample = new StoreExample();
        StoreExample.Criteria criteria = storeExample.createCriteria();
        criteria.andStoreNameEqualTo(store_name);
        return storeMapper.selectByExample(storeExample);
    }
    /**
     * 修改店铺信息
     */
    public void update_store(Store store) {

        StoreExample storeExample = new StoreExample();
        StoreExample.Criteria criteria = storeExample.createCriteria();
        criteria.andStoreIdEqualTo(store.getStoreId());
        storeMapper.updateByExampleSelective(store,storeExample);
    }

    /**
     * 创建店铺
     */
    public void creatStore(Store store){
        storeMapper.insertSelective(store);
    }

    /**
     * select_store_id
     */
    public Store select_store_id(int storeId){
        return storeMapper.selectByPrimaryKey(storeId);
    }

    public List<Type> selectAllType(){
        return typeMapper.selectByExample(null);
    }
}
