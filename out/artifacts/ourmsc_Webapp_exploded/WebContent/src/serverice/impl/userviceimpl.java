package serverice.impl;

import po.user;
import serverice.userservice;
import dao.userdao;
import dao.impl.userdaoimpl;

public class userviceimpl implements userservice {
     
	private userdao ud=new userdaoimpl();
	@Override
	public user queryuserByIdAndPwd(user u) {
		// TODO Auto-generated method stub
		return u;
	}



	@Override
	public user login(int userid, String password, String role) {
		// TODO Auto-generated method stub
		user u=new user();
		u.setUserid(userid);
		u.setPassword(password);
		u.setRole(role);
		return u;
	}
	


}
