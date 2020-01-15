package com.amazoneprime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="dramamoviedetail")
public class DramaMovieDetail {

	@Id
	@Column(name="dramamoviedetailid")
	private Integer dramamoviedetailid;
	@Column(name="dramamoviedetailname")
	private String dramamoviedetailname;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="dramamoviesid_fk",referencedColumnName="dramamoviesid")
	private DramaMovie parent;

	public DramaMovie getParent() {
		return parent;
	}

	public void setParent(DramaMovie parent) {
		this.parent = parent;
	}

	public Integer getDramamoviedetailid() {
		return dramamoviedetailid;
	}

	public void setDramamoviedetailid(Integer dramamoviedetailid) {
		this.dramamoviedetailid = dramamoviedetailid;
	}

	public String getDramamoviedetailname() {
		return dramamoviedetailname;
	}

	public void setDramamoviedetailname(String dramamoviedetailname) {
		this.dramamoviedetailname = dramamoviedetailname;
	}
}
