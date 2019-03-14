package cn.edu.qut.dao;

import cn.edu.qut.entity.Customer;
import cn.edu.qut.entity.CustomerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomerMapper {
    long countByExample(CustomerExample example);

    int deleteByExample(CustomerExample example);

    int deleteByPrimaryKey(Integer customerId);

    int insert(Customer record);

    int insertSelective(Customer record);

    List<Customer> selectByExample(CustomerExample example);

    Customer selectByPrimaryKey(Integer customerId);

    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

    List<Customer> findAllPage(@Param("sellerId") int sellerId,@Param("page") int page);

    int count(int sellerId);

    Customer selectCustomerPhone(@Param("phone") String phone,@Param("sellerId") int sellerId);
}