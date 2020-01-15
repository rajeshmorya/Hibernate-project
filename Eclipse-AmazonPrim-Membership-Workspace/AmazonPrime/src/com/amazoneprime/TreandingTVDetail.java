package com.amazoneprime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="treandingtvdetail")
public class TreandingTVDetail {

	@Id
	@Column(name="treandingtvdetailid")
	private Integer treandingtvdetailid;
	@Column(name="treandingtvdetailname")
	private String treandingtvdetailname;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="treandingtvid_fk",referencedColumnName="treandingtvid")
	private TreandingTV parent;

	public TreandingTV getParent() {
		return parent;
	}

	public void setParent(TreandingTV parent) {
		this.parent = parent;
	}

	public Integer getTreandingtvdetailid() {
		return treandingtvdetailid;
	}

	public void setTreandingtvdetailid(Integer treandingtvdetailid) {
		this.treandingtvdetailid = treandingtvdetailid;
	}

	public String getTreandingtvdetailname() {
		return treandingtvdetailname;
	}

	public void setTreandingtvdetailname(String treandingtvdetailname) {
		this.treandingtvdetailname = treandingtvdetailname;
	}
}
