package com;
// Generated Nov 26, 2019 2:52:51 PM by Hibernate Tools 5.3.0.Beta2

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
