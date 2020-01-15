package com.amazoneprime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="thrillermoviedetail")
public class ThrillerMovieDetail {

	@Id
	@Column(name="thrillermoviedetailid")
	private Integer thrillermoviedetailid;
	@Column(name="thrillermoviedetailname")
	private String thrillermoviedetailname;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="thrillermovieid_fk",referencedColumnName="thrillermovieid")
	private ThrillerMovie parent;

	public ThrillerMovie getParent() {
		return parent;
	}

	public void setParent(ThrillerMovie parent) {
		this.parent = parent;
	}

	public Integer getThrillermoviedetailid() {
		return thrillermoviedetailid;
	}

	public void setThrillermoviedetailid(Integer thrillermoviedetailid) {
		this.thrillermoviedetailid = thrillermoviedetailid;
	}

	public String getThrillermoviedetailname() {
		return thrillermoviedetailname;
	}

	public void setThrillermoviedetailname(String thrillermoviedetailname) {
		this.thrillermoviedetailname = thrillermoviedetailname;
	}
}
