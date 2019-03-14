package cn.edu.qut.shiro.realm;

import cn.edu.qut.entity.Seller;
import cn.edu.qut.service.CustomerService;
import cn.edu.qut.service.SellerService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

//import cn.edu.qut.entity.User;
//import cn.edu.qut.service.UserService;



public class UserRealm extends AuthorizingRealm{

	//@Autowired
	//private UserService sellerService;
	
	@Autowired
	private SellerService sellerService;
	@Autowired
	private CustomerService customerService;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		System.out.println("验证权限和角色");
		//String userName=(String)principals.getPrimaryPrincipal();
		Seller seller = (Seller) principals.getPrimaryPrincipal();
		String userName = seller.getSellerLoginName();
		SimpleAuthorizationInfo authorizationInfo=new SimpleAuthorizationInfo();
		authorizationInfo.setRoles(sellerService.findRolesByUserName(userName));
		authorizationInfo.setStringPermissions(sellerService.findPermissionsByUserName(userName));
		
		
		return authorizationInfo;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		System.out.println("登录时调用");
		String userName=(String)token.getPrincipal();
		System.out.println(userName);
		
		Seller seller = null;
		try{
			seller = sellerService.getSellerByUserName(userName);
//			//System.out.println("????seller==null="+seller);
//			if(seller==null){
//				Customer customer = customerService.getCustomerByUserName(userName);
//				//System.out.println("customer是"+customer.toString());
//				if(customer!=null){
//					seller = new Seller();
//					seller.setRoleId(customer.getRoleId());
//					seller.setSellerEpay(customer.getCustomerEpay());
//					seller.setSellerId(customer.getCustomerId());
//					seller.setSellerImg(customer.getCustomerImg());
//					seller.setSellerLoginName(customer.getCustomerLoginName());
//					seller.setSellerPhone(customer.getCustomerPhone());
//					seller.setSellerRealName(customer.getCustomerRealName());
//					seller.setSellerRegDate(customer.getCustomerRegDate());
////					seller.setSellerState(customer.getCustomerState());
//					seller.setSellerPassword(customer.getCustomerPassword());
//				}
//
//			}
			//System.out.println(seller);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		//System.out.println("顾客登录时seller还是空的吗"+seller+(null==seller));
		if(seller == null){
			System.out.println("还是抛出了异常");
			throw new UnknownAccountException();
		}
		//System.out.println(seller.get("seller_login_name")+"+++++++++数据库密码是"+seller.get("seller_password"));
		SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
				//seller.get("seller_login_name"),//以后将要拿取session信息的地方
				seller,
				seller.getSellerPassword(),
				//ByteSource.Util.bytes(seller.getSeller_real_name()+seller.getSeller_salt()),
				//私钥V2UyMDE4   ByteSource.Util.bytes("We2018"),
				getName());
		return authenticationInfo;
		
	}

}
