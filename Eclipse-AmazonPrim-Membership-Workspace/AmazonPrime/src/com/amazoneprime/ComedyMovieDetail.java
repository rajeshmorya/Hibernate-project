package com.amazoneprime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="comedymoviedetail")
public class ComedyMovieDetail {

	@Id
	@Column(name="comedyMoviedetailid")
	private Integer comedyMoviedetailid;
	@Column(name="comedyMoviedetailname")
	private String comedyMoviedetailname;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="comedymovieid_fk",referencedColumnName="comedymovieid")
	private ComedyMovies parent;

	public ComedyMovies getParent() {
		return parent;
	}

	public void setParent(ComedyMovies parent) {
		this.parent = parent;
	}

	public Integer getComedyMoviedetailid() {
		return comedyMoviedetailid;
	}

	public void setComedyMoviedetailid(Integer comedyMoviedetailid) {
		this.comedyMoviedetailid = comedyMoviedetailid;
	}

	public String getComedyMoviedetailname() {
		return comedyMoviedetailname;
	}

	public void setComedyMoviedetailname(String comedyMoviedetailname) {
		this.comedyMoviedetailname = comedyMoviedetailname;
	}
}
