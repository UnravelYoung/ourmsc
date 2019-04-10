package po;

public class Student {
	private int stuid;
	private int majorpm;
	private int classpm;
	private String stuname;
	private String stumajor;
	private String stuclass;
	private String stucode;
	private double tcredit;
	private double tcreditjd;
	private double ocredit;
	private double acredit;
	private double egrade;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int stuid, int majorpm, int classpm, String stuname,
			String stumajor, String stuclass, String stucode, double tcredit,
			double tcreditjd, double ocredit, double acredit, double egrade) {
		super();
		this.stuid = stuid;
		this.majorpm = majorpm;
		this.classpm = classpm;
		this.stuname = stuname;
		this.stumajor = stumajor;
		this.stuclass = stuclass;
		this.stucode = stucode;
		this.tcredit = tcredit;
		this.tcreditjd = tcreditjd;
		this.ocredit = ocredit;
		this.acredit = acredit;
		this.egrade = egrade;
	}

	/**
	 * @return the stuid
	 */
	public int getStuid() {
		return stuid;
	}

	/**
	 * @param stuid the stuid to set
	 */
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}

	/**
	 * @return the majorpm
	 */
	public int getMajorpm() {
		return majorpm;
	}

	/**
	 * @param majorpm the majorpm to set
	 */
	public void setMajorpm(int majorpm) {
		this.majorpm = majorpm;
	}

	/**
	 * @return the classpm
	 */
	public int getClasspm() {
		return classpm;
	}

	/**
	 * @param classpm the classpm to set
	 */
	public void setClasspm(int classpm) {
		this.classpm = classpm;
	}

	/**
	 * @return the stuname
	 */
	public String getStuname() {
		return stuname;
	}

	/**
	 * @param stuname the stuname to set
	 */
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	/**
	 * @return the stumajor
	 */
	public String getStumajor() {
		return stumajor;
	}

	/**
	 * @param stumajor the stumajor to set
	 */
	public void setStumajor(String stumajor) {
		this.stumajor = stumajor;
	}

	/**
	 * @return the stuclass
	 */
	public String getStuclass() {
		return stuclass;
	}

	/**
	 * @param stuclass the stuclass to set
	 */
	public void setStuclass(String stuclass) {
		this.stuclass = stuclass;
	}

	/**
	 * @return the stucode
	 */
	public String getStucode() {
		return stucode;
	}

	/**
	 * @param stucode the stucode to set
	 */
	public void setStucode(String stucode) {
		this.stucode = stucode;
	}

	/**
	 * @return the tcredit
	 */
	public double getTcredit() {
		return tcredit;
	}

	/**
	 * @param tcredit the tcredit to set
	 */
	public void setTcredit(double tcredit) {
		this.tcredit = tcredit;
	}

	/**
	 * @return the tcreditjd
	 */
	public double getTcreditjd() {
		return tcreditjd;
	}

	/**
	 * @param tcreditjd the tcreditjd to set
	 */
	public void setTcreditjd(double tcreditjd) {
		this.tcreditjd = tcreditjd;
	}

	/**
	 * @return the ocredit
	 */
	public double getOcredit() {
		return ocredit;
	}

	/**
	 * @param ocredit the ocredit to set
	 */
	public void setOcredit(double ocredit) {
		this.ocredit = ocredit;
	}

	/**
	 * @return the acredit
	 */
	public double getAcredit() {
		return acredit;
	}

	/**
	 * @param acredit the acredit to set
	 */
	public void setAcredit(double acredit) {
		this.acredit = acredit;
	}

	/**
	 * @return the egrade
	 */
	public double getEgrade() {
		return egrade;
	}

	/**
	 * @param egrade the egrade to set
	 */
	public void setEgrade(double egrade) {
		this.egrade = egrade;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [stuid=" + stuid + ", majorpm=" + majorpm
				+ ", classpm=" + classpm + ", stuname=" + stuname
				+ ", stumajor=" + stumajor + ", stuclass=" + stuclass
				+ ", stucode=" + stucode + ", tcredit=" + tcredit
				+ ", tcreditjd=" + tcreditjd + ", ocredit=" + ocredit
				+ ", acredit=" + acredit + ", egrade=" + egrade + "]";
	}


}
