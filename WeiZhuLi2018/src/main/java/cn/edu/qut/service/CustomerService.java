package cn.edu.qut.service;

import cn.edu.qut.dao.CustomerDao;
import cn.edu.qut.dao.CustomerMapper;
import cn.edu.qut.entity.Customer;
import cn.edu.qut.entity.CustomerExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerMapper customerMapper;
    @Autowired
    CustomerDao customerDao;

    /**
     * 查询所有员工
     * @return
     */
    public List<Customer> getAll() {
        return customerMapper.selectByExample(null);
    }


    /**
     * 修改员工的个人信息
     * @param customer
     */
    public void update_customer(Customer customer) {
        // System.out.println("进入update_customer");
        CustomerExample customerExample = new CustomerExample ();
        CustomerExample.Criteria criteria = customerExample.createCriteria();
        criteria.andCustomerIdEqualTo(customer.getCustomerId());
        customerMapper.updateByExampleSelective(customer,customerExample);
//        System.out.println("结束update_seller");
    }

    /**
     * 按照ID查询顾客
     * @param id
     * @return
     */
    public List<Customer> getCus(Integer id) {

        CustomerExample customerExample = new CustomerExample();
        CustomerExample.Criteria criteria = customerExample.createCriteria();
        criteria.andCustomerIdEqualTo(id);
        System.out.println(customerMapper.selectByExample(customerExample));
        return customerMapper.selectByExample(customerExample);
    }

    /**
     * 通过姓名查找顾客
     * @param userName
     * @return
     */
    public Customer getCustomerByUserName(String userName){
        return customerDao.getSellerByUserName(userName);
    }

    /**
     * 添加顾客
     */
    public void add_customer(Customer customer) {
        System.out.println("进入service层");
        customerMapper.insert(customer);
        System.out.println("结束service层");
    }

    /**分页
     *
     * @param sellerId
     * @return
     */
    public List<Customer> select_cus(int sellerId,int page){
        return customerMapper.findAllPage(sellerId,page);
    }

    public int count(int sellerId){
        return customerMapper.count(sellerId);
    }

    public Customer selectPhone(String phone,int sellerId){
        return customerMapper.selectCustomerPhone(phone,sellerId);
    }

    /**
     * 删除操作
     */
    public void deleteCustomer(int id){
        customerMapper.deleteByPrimaryKey(id);
    }
    /**返回销售人员的Id
     *
     * @param sellerId
     * @return
     */
    public List<Customer> select_cus2(int sellerId){
        CustomerExample example=new CustomerExample();
        CustomerExample.Criteria criteria=example.createCriteria();
        criteria.andSellerIdEqualTo(sellerId);
        return customerMapper.selectByExample(example);
    }
}

