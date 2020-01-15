package com.amazoneprime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="helpdetail")
public class HelpDetail {

	@Id
	@Column(name="helpdetailid")
	private Integer helpdetailid;
	@Column(name="helpdetailname")
	private String helpdetailname;
	public Integer getHelpdetailid() {
		return helpdetailid;
	}
	public void setHelpdetailid(Integer helpdetailid) {
		this.helpdetailid = helpdetailid;
	}
	public String getHelpdetailname() {
		return helpdetailname;
	}
	public void setHelpdetailname(String helpdetailname) {
		this.helpdetailname = helpdetailname;
	}
}
