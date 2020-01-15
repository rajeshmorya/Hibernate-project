package com.amazoneprime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="kids")
public class Kids {

	@Id
	@Column(name="kidsid")
	private Integer kidsid;
	@Column(name="kidsname")
	private String kidsname;
	
	@OneToOne(targetEntity=User.class,cascade=CascadeType.ALL)
	@JoinColumn(name="userid_fk",referencedColumnName="uid")
	private User Parent;
	public User getParent() {
		return Parent;
	}
	public void setParent(User parent) {
		Parent = parent;
	}
	public Integer getKidsid() {
		return kidsid;
	}
	public void setKidsid(Integer kidsid) {
		this.kidsid = kidsid;
	}
	public String getKidsname() {
		return kidsname;
	}
	public void setKidsname(String kidsname) {
		this.kidsname = kidsname;
	}
}
