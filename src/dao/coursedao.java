package dao;

import java.util.List;

public interface coursedao {
	public void insertcou(int cno,String cname,double credit);
    public void deletecou(int cno);
    public List select(int cno,String cname,double credit);
	public List selectid(int cno);
	public void updatecou(int cno,String cname,double credit);

}
