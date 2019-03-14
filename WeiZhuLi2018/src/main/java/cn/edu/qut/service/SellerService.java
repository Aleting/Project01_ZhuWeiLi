package cn.edu.qut.service;


import cn.edu.qut.dao.PermissionDao;
import cn.edu.qut.dao.SellerDao;
import cn.edu.qut.dao.SellerMapper;
import cn.edu.qut.entity.Seller;
import cn.edu.qut.entity.SellerExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SellerService {

    @Autowired
    SellerMapper sellerMapper;
    @Autowired
    PermissionDao permissionDao;
    @Autowired
    SellerDao sellerDao;
    public void login(Seller seller){
    }

    /**
     * 用户登陆
     * @param sellerLoginName
     * @param sellerPassword
     * @return
     */
    public List<Seller> checklogin(String sellerLoginName, String sellerPassword) {

        SellerExample sellerExample = new SellerExample();
        SellerExample.Criteria criteria = sellerExample.createCriteria();
        criteria.andSellerLoginNameEqualTo(sellerLoginName);
        criteria.andSellerPasswordEqualTo(sellerPassword);
        List<Seller> sellers = sellerMapper.selectByExample(sellerExample);
        if(sellers.size()>0){
            return sellers;
        }else return null;
    }

    //根据Role_id和Store_id来查询店员信息
    public List<Seller> getSeller2(int store_id){
        SellerExample sellerExample = new SellerExample();
        SellerExample.Criteria criteria = sellerExample.createCriteria();
        criteria.andRoleIdEqualTo(3);
        criteria.andStoreIdEqualTo(store_id);
        List<Seller> sellers = sellerMapper.selectByExample(sellerExample);
        return sellers;
    }


    public Seller upImg(int sellerId){
        SellerExample sellerExample = new SellerExample();
        SellerExample.Criteria criteria = sellerExample.createCriteria();
        criteria.andSellerIdEqualTo(sellerId);
        List<Seller> sellers = sellerMapper.selectByExample(sellerExample);
        return sellers.get(0);
    }
    // 用户注册
    public boolean register(Seller seller){
        int insert = sellerMapper.insert(seller);
        boolean flage = insert>1?true:false;
        return flage;
    }

    /**
     * 修改店主的个人信息
     * @param seller
     */

    public void update_seller(Seller seller) {
        // System.out.println("进入update_seller");
        SellerExample sellerExample = new SellerExample();
        SellerExample.Criteria criteria = sellerExample.createCriteria();
        criteria.andSellerIdEqualTo(seller.getSellerId());
        sellerMapper.updateByExampleSelective(seller,sellerExample);
//        System.out.println("结束update_seller");
    }

    /**
     * 按照ID查询员工
     * @param id
     * @return
     */
    public List<Seller> getsel(Integer id) {
        SellerExample sellerExample = new SellerExample();
        SellerExample.Criteria criteria = sellerExample.createCriteria();
        criteria.andSellerIdEqualTo(id);
        System.out.println(sellerMapper.selectByExample(sellerExample));
        return sellerMapper.selectByExample(sellerExample);
    }

    /**
     * 检查旧密码功能
     * @param sellerid
     * @param password
     * @return
     */
    public boolean check_old(int sellerid, String password) {
        SellerExample sellerExample = new SellerExample();
        SellerExample.Criteria criteria = sellerExample.createCriteria();
        criteria.andSellerIdEqualTo(sellerid);
        criteria.andSellerPasswordEqualTo(password);
        List<Seller> sellers = sellerMapper.selectByExample(sellerExample);
        if (sellers.size()>0){
            return true;
        }else {return  false;}
    }

    public void update_password(int sellerId, String new_password) {
        SellerExample sellerExample = new SellerExample();
        SellerExample.Criteria criteria = sellerExample.createCriteria();
        criteria.andSellerIdEqualTo(sellerId);
        Seller seller = new Seller();
        seller.setSellerPassword(new_password);
        sellerMapper.updateByExampleSelective(seller, sellerExample);

    }
    public List<Map<String, Object>> queryMenu(String seller_login_name){
        List<Map<String,?>> menu2s = permissionDao.queryMenu(seller_login_name);
        //查询店员额外的权限
        List<Map<String,?>> clerkMenuList = permissionDao.clerkMenuList(seller_login_name);
        menu2s.addAll(clerkMenuList);


        List<Map<String,Object>> menu1s = permissionDao.queryMenu1();
        for(Map<String,Object> menu1:menu1s){
            String menu1id = menu1.get("permission_id").toString();
            List<Map<String,?>> childMenu2 = new ArrayList<Map<String,?>>();
            for(Map<String,?> menu2:menu2s){
                if(menu2.get("permission_parent").toString().equals(menu1id.toString())){
                    childMenu2.add(menu2);
                }
            }
            menu1.put("childNavigations", childMenu2);
        }

        //如果1级菜单中不包含二级菜单，则删除该一级菜单
        Iterator<Map<String,Object>> it = menu1s.iterator();
        while(it.hasNext()){
            ArrayList<Map<String,Object>> list2 = (ArrayList<Map<String, Object>>) it.next().get("childNavigations");
            if(list2.isEmpty())
                it.remove();
        }
        return menu1s;
    }
    //根据用户名查找角色
    public Set<String> findRolesByUserName(String seller_login_name){
        return new HashSet<String>(sellerDao.findRolesByUserName(seller_login_name));
    }

    //根据用户名查找权限
    public Set<String> findPermissionsByUserName(String seller_login_name){
        //return new HashSet(sellerDao.findPermissionsByUserName(seller_login_name));
        //System.out.println("用户名是"+seller_login_name);
        List<String> list1 = sellerDao.findPermissionsByUserName(seller_login_name);
        List<String> list2 = sellerDao.listClerkPermission(seller_login_name);
        //System.out.println("用户的list1权限是"+list1.toString());
        //System.out.println("用户的list2权限是"+list2.toString());
        list1.addAll(list2);
        //System.out.println("用户的权限是"+list1.toString());
        return new HashSet<String>(list1);


    }
    public Seller getSellerByUserName(String userName){
        return sellerDao.getSellerByUserName(userName);
    }

    /**
     * 查询激活邮箱
     */
    public boolean selectRegister(String sellerLoginName, String sellerState) {

        SellerExample sellerExample = new SellerExample();
        SellerExample.Criteria criteria = sellerExample.createCriteria();
        criteria.andSellerLoginNameEqualTo(sellerLoginName);
        //System.out.println(customerLoginName);
        criteria.andSellerStateEqualTo(sellerState);
        List<Seller> seller = sellerMapper.selectByExample(sellerExample);

        if(seller.size()>0){
            sellerMapper.updateState(sellerState);
            return true;
        }else
            return false;
    }

    /**
     * 通过seller_id返回stroe_id
     */

    public List<Seller> findStoreId(int sellerId){
        SellerExample sellerExample=new SellerExample();
        SellerExample.Criteria criteria=sellerExample.createCriteria();
        criteria.andSellerIdEqualTo(sellerId);
        return sellerMapper.selectByExample(sellerExample);
    }

    /**
     * count
     */
    public int count(int store_id){
        int cout = sellerMapper.selectCount(store_id);
        return cout;
    }
    public List<Seller> findAllPage(int storeId, int page){
        return sellerMapper.findAllPage(storeId,page);
    }
    public Seller selectId(int storeId,int bouId){
        Seller orders = sellerMapper.selectId(storeId,bouId);
        return orders;
    }

    /**
     * 查询sellerName
     */
    public List<Seller> checkName(String name){
        SellerExample example = new SellerExample();
        SellerExample.Criteria criteria = example.createCriteria();
        criteria.andSellerLoginNameEqualTo(name);
        return sellerMapper.selectByExample(example);
    }

    /**
     * boss
     */
    public List<Seller> selectStoreBoss(int storeId,int role){
        SellerExample example = new SellerExample();
        SellerExample.Criteria criteria = example.createCriteria();
        criteria.andStoreIdEqualTo(storeId);
        criteria.andRoleIdEqualTo(role);
        return sellerMapper.selectByExample(example);
    }

}