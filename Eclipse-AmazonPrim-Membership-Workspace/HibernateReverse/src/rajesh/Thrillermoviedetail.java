package rajesh;
// Generated Nov 26, 2019 4:36:19 PM by Hibernate Tools 5.3.0.Beta2

/**
 * Thrillermoviedetail generated by hbm2java
 */
public class Thrillermoviedetail implements java.io.Serializable {

	private int thrillermoviedetailid;
	private Thrillermovie thrillermovie;
	private String thrillermoviedetailname;

	public Thrillermoviedetail() {
	}

	public Thrillermoviedetail(int thrillermoviedetailid) {
		this.thrillermoviedetailid = thrillermoviedetailid;
	}

	public Thrillermoviedetail(int thrillermoviedetailid, Thrillermovie thrillermovie, String thrillermoviedetailname) {
		this.thrillermoviedetailid = thrillermoviedetailid;
		this.thrillermovie = thrillermovie;
		this.thrillermoviedetailname = thrillermoviedetailname;
	}

	public int getThrillermoviedetailid() {
		return this.thrillermoviedetailid;
	}

	public void setThrillermoviedetailid(int thrillermoviedetailid) {
		this.thrillermoviedetailid = thrillermoviedetailid;
	}

	public Thrillermovie getThrillermovie() {
		return this.thrillermovie;
	}

	public void setThrillermovie(Thrillermovie thrillermovie) {
		this.thrillermovie = thrillermovie;
	}

	public String getThrillermoviedetailname() {
		return this.thrillermoviedetailname;
	}

	public void setThrillermoviedetailname(String thrillermoviedetailname) {
		this.thrillermoviedetailname = thrillermoviedetailname;
	}

}
