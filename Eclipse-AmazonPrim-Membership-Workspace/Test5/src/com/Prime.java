package com;
// Generated Nov 26, 2019 2:52:51 PM by Hibernate Tools 5.3.0.Beta2

/**
 * Prime generated by hbm2java
 */
public class Prime implements java.io.Serializable {

	private int primeid;
	private Youaccount youaccount;
	private String primename;

	public Prime() {
	}

	public Prime(int primeid) {
		this.primeid = primeid;
	}

	public Prime(int primeid, Youaccount youaccount, String primename) {
		this.primeid = primeid;
		this.youaccount = youaccount;
		this.primename = primename;
	}

	public int getPrimeid() {
		return this.primeid;
	}

	public void setPrimeid(int primeid) {
		this.primeid = primeid;
	}

	public Youaccount getYouaccount() {
		return this.youaccount;
	}

	public void setYouaccount(Youaccount youaccount) {
		this.youaccount = youaccount;
	}

	public String getPrimename() {
		return this.primename;
	}

	public void setPrimename(String primename) {
		this.primename = primename;
	}

}
