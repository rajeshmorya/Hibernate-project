package com.amazoneprime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="aoks")
public class AmazoneOriginalKidsSeries {

	@Id
	@Column(name="aoksid")
	private Integer aoksid;
	@Column(name="aoksname")
	private String aoksname;
	
	@OneToOne(targetEntity=Kids.class,cascade=CascadeType.ALL)
	@JoinColumn(name="kidsid_fk",referencedColumnName="kidsid")
	private Kids Parent;
	
	@OneToOne(targetEntity=Home.class,cascade=CascadeType.ALL)
	@JoinColumn(name="homeid_fk",referencedColumnName="homeid")
	private Home Parent_home;
	
	public Home getParent_home() {
		return Parent_home;
	}
	public void setParent_home(Home parent_home) {
		Parent_home = parent_home;
	}
	public Kids getParent() {
		return Parent;
	}
	public void setParent(Kids parent) {
		Parent = parent;
	}
	public Integer getAoksid() {
		return aoksid;
	}
	public void setAoksid(Integer aoksid) {
		this.aoksid = aoksid;
	}
	public String getAoksname() {
		return aoksname;
	}
	public void setAoksname(String aoksname) {
		this.aoksname = aoksname;
	}
}
