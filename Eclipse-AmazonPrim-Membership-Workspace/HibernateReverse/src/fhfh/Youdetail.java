package fhfh;
// Generated Nov 26, 2019 3:59:58 PM by Hibernate Tools 5.3.0.Beta2

/**
 * Youdetail generated by hbm2java
 */
public class Youdetail implements java.io.Serializable {

	private int yourdetailid;
	private Youaccount youaccount;
	private String yourdetailname;

	public Youdetail() {
	}

	public Youdetail(int yourdetailid) {
		this.yourdetailid = yourdetailid;
	}

	public Youdetail(int yourdetailid, Youaccount youaccount, String yourdetailname) {
		this.yourdetailid = yourdetailid;
		this.youaccount = youaccount;
		this.yourdetailname = yourdetailname;
	}

	public int getYourdetailid() {
		return this.yourdetailid;
	}

	public void setYourdetailid(int yourdetailid) {
		this.yourdetailid = yourdetailid;
	}

	public Youaccount getYouaccount() {
		return this.youaccount;
	}

	public void setYouaccount(Youaccount youaccount) {
		this.youaccount = youaccount;
	}

	public String getYourdetailname() {
		return this.yourdetailname;
	}

	public void setYourdetailname(String yourdetailname) {
		this.yourdetailname = yourdetailname;
	}

}