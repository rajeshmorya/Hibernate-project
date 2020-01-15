package com.amazoneprime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="watchanywheredetail")
public class watchanywheredetail {

	@Id
	@Column(name="watchanywheredetailid")
	private Integer watchanywheredetailid;
	@Column(name="watchanywheredetailname")
	private String watchanywheredetailname;
	public Integer getWatchanywheredetailid() {
		return watchanywheredetailid;
	}
	public void setWatchanywheredetailid(Integer watchanywheredetailid) {
		this.watchanywheredetailid = watchanywheredetailid;
	}
	public String getWatchanywheredetailname() {
		return watchanywheredetailname;
	}
	public void setWatchanywheredetailname(String watchanywheredetailname) {
		this.watchanywheredetailname = watchanywheredetailname;
	}
}
