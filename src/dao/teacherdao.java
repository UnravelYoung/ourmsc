package dao;

import java.util.List;

public interface teacherdao {
	public void inserttea(int tid,String tname,String teacode);
    public void delteacher(int tid);
    public List select(int tid,String tname,String teacode);
	public List selectid(int tid);
	public void teaupdate(int tid,String tname,String teacode);
}


