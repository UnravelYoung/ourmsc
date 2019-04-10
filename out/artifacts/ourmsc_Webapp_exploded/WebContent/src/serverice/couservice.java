package serverice;

public interface couservice {
	public String delcou(int cno);
	public String selectcou(int cno,String cname);
	public String selectcno(int cno);
	public String insertcou(int cno,String cname,double credit);
	public String updatecou(int cno,String cname,double credit);

}
