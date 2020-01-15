package com.amazoneprime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="kidsFamilyMovieDetail")
public class Kids_familyMovieDetail {

	@Id
	@Column(name="kids_familyMovieDetailid")
	private Integer kids_familyMovieDetailid;
	@Column(name="kids_familyMovieDetailname")
	private String kids_familyMovieDetailname;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="kids_familyMovieid_fk",referencedColumnName="kids_familyMovieid")
	private Kids_familyMovie parent;
	public Integer getKids_familyMovieDetailid() {
		return kids_familyMovieDetailid;
	}
	public void setKids_familyMovieDetailid(Integer kids_familyMovieDetailid) {
		this.kids_familyMovieDetailid = kids_familyMovieDetailid;
	}
	public String getKids_familyMovieDetailname() {
		return kids_familyMovieDetailname;
	}
	public void setKids_familyMovieDetailname(String kids_familyMovieDetailname) {
		this.kids_familyMovieDetailname = kids_familyMovieDetailname;
	}
	public Kids_familyMovie getParent() {
		return parent;
	}
	public void setParent(Kids_familyMovie parent) {
		this.parent = parent;
	}
}
