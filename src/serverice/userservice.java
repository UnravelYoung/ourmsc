package serverice;

import po.user;

public interface userservice{

	public user login(int userid,String password,String role);

	user queryuserByIdAndPwd(user u);
}
