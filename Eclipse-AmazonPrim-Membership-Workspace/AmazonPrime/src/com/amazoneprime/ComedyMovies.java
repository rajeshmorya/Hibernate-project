package com.amazoneprime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="comedymovie")
public class ComedyMovies {

	@Id
	@Column(name="comedymovieid")
	private Integer comedymovieid;
	@Column(name="comedymoviename")
	private String comedymoviename;
	
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
	public Integer getComedymovieid() {
		return comedymovieid;
	}
	public void setComedymovieid(Integer comedymovieid) {
		this.comedymovieid = comedymovieid;
	}
	public String getComedymoviename() {
		return comedymoviename;
	}
	public void setComedymoviename(String comedymoviename) {
		this.comedymoviename = comedymoviename;
	}
}
