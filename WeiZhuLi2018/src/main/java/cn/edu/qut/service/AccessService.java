package cn.edu.qut.service;


import cn.edu.qut.entity.Access;
import cn.edu.qut.dao.AccessMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccessService {
    /**
     * 将访问记录添加数据库
     */
    @Autowired
    AccessMapper accessMapper;
    public void access_cord(Access access) {

        accessMapper.insertSelective(access);

    }

    /**
     * 将访问量返回
     * @return
     */
    public int select_num() {

        long count = accessMapper.countByExample(null);
        return (int) count;
    }
}
