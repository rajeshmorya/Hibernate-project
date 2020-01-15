package com.amazoneprime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="kids_family")
public class Kids_familyMovie {

	@Id
	@Column(name="kids_familyMovieid")
	private Integer kids_familyMovieid;
	@Column(name="kids_familyMoviename")
	private String kids_familyMoviename;
	
	@OneToOne(targetEntity=Kids.class,cascade=CascadeType.ALL)
	@JoinColumn(name="kidsid_fk",referencedColumnName="kidsid")
	private Kids Parent;
	
	@OneToOne(targetEntity=Home.class,cascade=CascadeType.ALL)
	@JoinColumn(name="homeid_fk",referencedColumnName="homeid")
	private Home Parent1;
	
	public Home getParent1() {
		return Parent1;
	}
	public void setParent1(Home parent1) {
		Parent1 = parent1;
	}
	public Kids getParent() {
		return Parent;
	}
	public void setParent(Kids parent) {
		Parent = parent;
	}
	public Integer getKids_familyMovieid() {
		return kids_familyMovieid;
	}
	public void setKids_familyMovieid(Integer kids_familyMovieid) {
		this.kids_familyMovieid = kids_familyMovieid;
	}
	public String getKids_familyMoviename() {
		return kids_familyMoviename;
	}
	public void setKids_familyMoviename(String kids_familyMoviename) {
		this.kids_familyMoviename = kids_familyMoviename;
	}
	
}
