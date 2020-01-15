package com.amazoneprime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="kids_familyTVdetail")
public class Kids_familyTVdetail {

	@Id
	@Column(name="kids_familyTvdetailid")
	private Integer kids_familyTvdetailid;
	@Column(name="kids_familyTvdetailname")
	private String kids_familyTvdetailname;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="kids_familytvid_fk",referencedColumnName="kids_familytvid")
	private Kids_familyTV parent;

	public Kids_familyTV getParent() {
		return parent;
	}

	public void setParent(Kids_familyTV parent) {
		this.parent = parent;
	}

	public Integer getKids_familyTvdetailid() {
		return kids_familyTvdetailid;
	}

	public void setKids_familyTvdetailid(Integer kids_familyTvdetailid) {
		this.kids_familyTvdetailid = kids_familyTvdetailid;
	}

	public String getKids_familyTvdetailname() {
		return kids_familyTvdetailname;
	}

	public void setKids_familyTvdetailname(String kids_familyTvdetailname) {
		this.kids_familyTvdetailname = kids_familyTvdetailname;
	}
}
