package po;

public class Course {
	private String couname;
	private int counumber;
	private double credit;
	/**
	 * @return the couname
	 */
	public String getCouname() {
		return couname;
	}
	/**
	 * @param couname the couname to set
	 */
	public void setCouname(String couname) {
		this.couname = couname;
	}
	/**
	 * @return the counumber
	 */
	public int getCounumber() {
		return counumber;
	}
	/**
	 * @param counumber the counumber to set
	 */
	public void setCounumber(int counumber) {
		this.counumber = counumber;
	}
	/**
	 * @return the credit
	 */
	public double getCredit() {
		return credit;
	}
	/**
	 * @param credit the credit to set
	 */
	public void setCredit(double credit) {
		this.credit = credit;
	}

	public Course() {
		// TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Course [couname=" + couname + ", counumber=" + counumber
				+ ", credit=" + credit + "]";
	}
	public Course(String couname, int counumber, double credit) {
		super();
		this.couname = couname;
		this.counumber = counumber;
		this.credit = credit;
	}
	
	
}
