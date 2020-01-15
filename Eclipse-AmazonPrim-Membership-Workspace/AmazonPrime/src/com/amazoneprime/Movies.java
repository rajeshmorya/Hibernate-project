package com.amazoneprime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="movie")
public class Movies {

	@Id
	@Column(name="moviesid")
	private Integer moviesid;
	@Column(name="moviesname")
	private String moviesname;
	
	@OneToOne(targetEntity=User.class,cascade=CascadeType.ALL)
	@JoinColumn(name="userid_fk",referencedColumnName="uid")
	private User Parent;
	
	public User getParent() {
		return Parent;
	}
	public void setParent(User parent) {
		Parent = parent;
	}
	public Integer getMoviesid() {
		return moviesid;
	}
	public void setMoviesid(Integer moviesid) {
		this.moviesid = moviesid;
	}
	public String getMoviesname() {
		return moviesname;
	}
	public void setMoviesname(String moviesname) {
		this.moviesname = moviesname;
	}
}
