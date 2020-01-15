package com.amazoneprime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="youdetail")
public class YourDetail {

	@Id
	@Column(name="yourdetailid")
	private Integer yourdetailid;
	@Column(name="yourdetailname")
	private String yourdetailname;
	public Integer getYourdetailid() {
		return yourdetailid;
	}
	public void setYourdetailid(Integer yourdetailid) {
		this.yourdetailid = yourdetailid;
	}
	public String getYourdetailname() {
		return yourdetailname;
	}
	public void setYourdetailname(String yourdetailname) {
		this.yourdetailname = yourdetailname;
	}
}
