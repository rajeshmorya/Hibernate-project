package com.amazoneprime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="Kids_familytv")
public class Kids_familyTV {

	@Id
	@Column(name="kids_familytvid")
	private Integer kids_familytvid;
	@Column(name="kids_familytvname")
	private String kids_familytvname;
	
	@OneToOne(targetEntity=Kids.class,cascade=CascadeType.ALL)
	@JoinColumn(name="kidsid_fk",referencedColumnName="kidsid")
	private Kids Parent;
	
	@OneToOne(targetEntity=Home.class,cascade=CascadeType.ALL)
	@JoinColumn(name="homeid_fk",referencedColumnName="homeid")
	private Home Parent_Home;

	public Home getParent_Home() {
		return Parent_Home;
	}
	public void setParent_Home(Home parent_Home) {
		Parent_Home = parent_Home;
	}
	public Kids getParent() {
		return Parent;
	}
	public void setParent(Kids parent) {
		Parent = parent;
	}
	public Integer getKids_familytvid() {
		return kids_familytvid;
	}
	public void setKids_familytvid(Integer kids_familytvid) {
		this.kids_familytvid = kids_familytvid;
	}
	public String getKids_familytvname() {
		return kids_familytvname;
	}
	public void setKids_familytvname(String kids_familytvname) {
		this.kids_familytvname = kids_familytvname;
	}
}
