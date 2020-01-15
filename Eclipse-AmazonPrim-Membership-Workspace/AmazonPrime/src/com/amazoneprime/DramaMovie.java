package com.amazoneprime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="dramamovie")
public class DramaMovie {

	@Id
	@Column(name="dramamoviesid")
	private Integer dramamoviesid;
	@Column(name="dramamoviesname")
	private String dramamoviesname;
	
	@OneToOne(targetEntity=Movies.class,cascade=CascadeType.ALL)
	@JoinColumn(name="moviesid_fk",referencedColumnName="moviesid")
	private Movies Parent;
	
	@OneToOne(targetEntity=Home.class,cascade=CascadeType.ALL)
	@JoinColumn(name="homeid_fk",referencedColumnName="homeid")
	private Home Parent_Home;
	
	public Home getParent_Home() {
		return Parent_Home;
	}
	public void setParent_Home(Home parent_Home) {
		Parent_Home = parent_Home;
	}
	public Movies getParent() {
		return Parent;
	}
	public void setParent(Movies parent) {
		Parent = parent;
	}
	public Integer getDramamoviesid() {
		return dramamoviesid;
	}
	public void setDramamoviesid(Integer dramamoviesid) {
		this.dramamoviesid = dramamoviesid;
	}
	public String getDramamoviesname() {
		return dramamoviesname;
	}
	public void setDramamoviesname(String dramamoviesname) {
		this.dramamoviesname = dramamoviesname;
	}
}
