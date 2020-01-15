package com.amazoneprime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table()
public class Tv_shows {

	@Id
	@Column(name="tvshowid")
	private Integer Tv_showsid;
	@Column(name="tvshowname")
	private String Tv_showsname;
	
	@OneToOne(targetEntity=User.class,cascade=CascadeType.ALL)
	@JoinColumn(name="userid_fk",referencedColumnName="uid")
	private User Parent;
	
	public User getParent() {
		return Parent;
	}
	public void setParent(User parent) {
		Parent = parent;
	}
	public Integer getTv_showsid() {
		return Tv_showsid;
	}
	public void setTv_showsid(Integer tv_showsid) {
		Tv_showsid = tv_showsid;
	}
	public String getTv_showsname() {
		return Tv_showsname;
	}
	public void setTv_showsname(String tv_showsname) {
		Tv_showsname = tv_showsname;
	}
}
