package com;
// Generated Nov 26, 2019 2:52:51 PM by Hibernate Tools 5.3.0.Beta2

/**
 * Watchanywheredetail generated by hbm2java
 */
public class Watchanywheredetail implements java.io.Serializable {

	private int watchanywheredetailid;
	private Watchanywhere watchanywhere;
	private String watchanywheredetailname;

	public Watchanywheredetail() {
	}

	public Watchanywheredetail(int watchanywheredetailid) {
		this.watchanywheredetailid = watchanywheredetailid;
	}

	public Watchanywheredetail(int watchanywheredetailid, Watchanywhere watchanywhere, String watchanywheredetailname) {
		this.watchanywheredetailid = watchanywheredetailid;
		this.watchanywhere = watchanywhere;
		this.watchanywheredetailname = watchanywheredetailname;
	}

	public int getWatchanywheredetailid() {
		return this.watchanywheredetailid;
	}

	public void setWatchanywheredetailid(int watchanywheredetailid) {
		this.watchanywheredetailid = watchanywheredetailid;
	}

	public Watchanywhere getWatchanywhere() {
		return this.watchanywhere;
	}

	public void setWatchanywhere(Watchanywhere watchanywhere) {
		this.watchanywhere = watchanywhere;
	}

	public String getWatchanywheredetailname() {
		return this.watchanywheredetailname;
	}

	public void setWatchanywheredetailname(String watchanywheredetailname) {
		this.watchanywheredetailname = watchanywheredetailname;
	}

}
