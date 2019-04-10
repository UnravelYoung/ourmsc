package dao;

import java.util.List;


public interface studentDao {
	public void insertstudent(int sid,String sname,String smajor,String sclass,String scode);
    public void delstudent(int sid);
    public List select(String sclass,String major);
	public List selectid(int sid);
	public void stuupdate(int sid,String sname,String smajor,String sclass,String scode);
}
