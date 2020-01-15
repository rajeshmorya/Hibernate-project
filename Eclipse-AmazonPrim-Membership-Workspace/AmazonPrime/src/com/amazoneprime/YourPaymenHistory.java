package com.amazoneprime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="youpaymenthistory")
public class YourPaymenHistory {

	@Id
	@Column(name="youpaymenthistoryid")
	private Integer youpaymenthistoryid;
	@Column(name="youpaymenthistoryname")
	private String youpaymenthistoryname;
	public Integer getYoupamenthistoryid() {
		return youpaymenthistoryid;
	}
	public void setYoupamenthistoryid(Integer youpaymenthistoryid) {
		this.youpaymenthistoryid = youpaymenthistoryid;
	}
	public String getYoupamenthistoryname() {
		return youpaymenthistoryname;
	}
	public void setYoupamenthistoryname(String youpaymenthistoryname) {
		this.youpaymenthistoryname = youpaymenthistoryname;
	}
}
