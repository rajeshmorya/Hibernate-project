// default package
// Generated Nov 26, 2019 1:35:49 PM by Hibernate Tools 4.0.1.Final

/**
 * Watchhistorydetail generated by hbm2java
 */
public class Watchhistorydetail implements java.io.Serializable {

	private int watchhistorydetailid;
	private Watchhistory watchhistory;
	private String watchhistorydetailname;

	public Watchhistorydetail() {
	}

	public Watchhistorydetail(int watchhistorydetailid) {
		this.watchhistorydetailid = watchhistorydetailid;
	}

	public Watchhistorydetail(int watchhistorydetailid, Watchhistory watchhistory, String watchhistorydetailname) {
		this.watchhistorydetailid = watchhistorydetailid;
		this.watchhistory = watchhistory;
		this.watchhistorydetailname = watchhistorydetailname;
	}

	public int getWatchhistorydetailid() {
		return this.watchhistorydetailid;
	}

	public void setWatchhistorydetailid(int watchhistorydetailid) {
		this.watchhistorydetailid = watchhistorydetailid;
	}

	public Watchhistory getWatchhistory() {
		return this.watchhistory;
	}

	public void setWatchhistory(Watchhistory watchhistory) {
		this.watchhistory = watchhistory;
	}

	public String getWatchhistorydetailname() {
		return this.watchhistorydetailname;
	}

	public void setWatchhistorydetailname(String watchhistorydetailname) {
		this.watchhistorydetailname = watchhistorydetailname;
	}

}
