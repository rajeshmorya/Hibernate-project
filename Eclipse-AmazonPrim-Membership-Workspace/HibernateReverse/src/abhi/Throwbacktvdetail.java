package abhi;
// Generated Nov 26, 2019 4:53:06 PM by Hibernate Tools 5.3.0.Beta2

/**
 * Throwbacktvdetail generated by hbm2java
 */
public class Throwbacktvdetail implements java.io.Serializable {

	private int throwbacktvdetailid;
	private Throwback throwback;
	private String throwbacktvdetailname;

	public Throwbacktvdetail() {
	}

	public Throwbacktvdetail(int throwbacktvdetailid) {
		this.throwbacktvdetailid = throwbacktvdetailid;
	}

	public Throwbacktvdetail(int throwbacktvdetailid, Throwback throwback, String throwbacktvdetailname) {
		this.throwbacktvdetailid = throwbacktvdetailid;
		this.throwback = throwback;
		this.throwbacktvdetailname = throwbacktvdetailname;
	}

	public int getThrowbacktvdetailid() {
		return this.throwbacktvdetailid;
	}

	public void setThrowbacktvdetailid(int throwbacktvdetailid) {
		this.throwbacktvdetailid = throwbacktvdetailid;
	}

	public Throwback getThrowback() {
		return this.throwback;
	}

	public void setThrowback(Throwback throwback) {
		this.throwback = throwback;
	}

	public String getThrowbacktvdetailname() {
		return this.throwbacktvdetailname;
	}

	public void setThrowbacktvdetailname(String throwbacktvdetailname) {
		this.throwbacktvdetailname = throwbacktvdetailname;
	}

}