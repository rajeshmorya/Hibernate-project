package com.amazoneprime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="throwbacktvdetail")
public class ThrowbackTVDetail {

	@Id
	@Column(name="throwbacktvdetailid")
	private Integer throwbacktvdetailid;
	@Column(name="throwbacktvdetailname")
	private String throwbacktvdetailname;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="throwbackTVid_fk",referencedColumnName="throwbackTVid")
	private ThrowbackTV parent;

	public ThrowbackTV getParent() {
		return parent;
	}

	public void setParent(ThrowbackTV parent) {
		this.parent = parent;
	}

	public Integer getThrowbacktvdetailid() {
		return throwbacktvdetailid;
	}

	public void setThrowbacktvdetailid(Integer throwbacktvdetailid) {
		this.throwbacktvdetailid = throwbacktvdetailid;
	}

	public String getThrowbacktvdetailname() {
		return throwbacktvdetailname;
	}

	public void setThrowbacktvdetailname(String throwbacktvdetailname) {
		this.throwbacktvdetailname = throwbacktvdetailname;
	}
}
