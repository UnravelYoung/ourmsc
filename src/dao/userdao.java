package dao;

import po.user;

public interface userdao {
	
	public user queryuserByIdAndPwd(user u);
	public void addstudent(int sid,String sname,String scode,String kind);
	public void delstudent(int sid);
	public void stuupdate(int sid,String scode);
	public void delteacher(int tid);
	public void inserttea(int tid,String tname,String tcode,String kind);
}
