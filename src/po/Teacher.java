package po;

public class Teacher {
	private int tid;
	private String tname;
	private String tcode;
	
   public Teacher() {
	// TODO Auto-generated constructor stub
   }

  /**
    * @return the tid
  */
  public int getTid() {
	return tid;
  }

  /**
   * @param tid the tid to set
  */
  public void setTid(int tid) {
	this.tid = tid;
  }

  /**
   * @return the tname
   */
  public String getTname() {
	  return tname;
  }

  /**
   * @param tname the tname to set
   */
   public void setTname(String tname) {
	 this.tname = tname;
   }

  /**
   * @return the tcode
   */
  public String getTcode() {
	 return tcode;
  }

  /**
   * @param tcode the tcode to set
   */
  public void setTcode(String tcode) {
	 this.tcode = tcode;
  }

 /* (non-Javadoc)
  * @see java.lang.Object#toString()
  */
 @Override
 public String toString() {
	return "Teacher [tid=" + tid + ", tname=" + tname + ", tcode=" + tcode
			+ "]";
 }

 public Teacher(int tid, String tname, String tcode) {
 	super();
 	this.tid = tid;
	this.tname = tname;
	this.tcode = tcode;
 }
   
   

}
