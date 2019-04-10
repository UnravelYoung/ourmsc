package serverice;

public interface teaservice {
	public String deltea(int tid);
	public String selecttea(int tid,String tname);
	public String selecttid(int tid);
	public String inserttea(int tid,String tname,String tcode);
	public String updatetea(int tid,String tname,String tcode);

}
