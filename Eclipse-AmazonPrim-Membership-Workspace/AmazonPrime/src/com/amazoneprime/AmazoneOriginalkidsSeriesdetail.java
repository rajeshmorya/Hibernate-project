package com.amazoneprime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="amazoneseriesdetail")
public class AmazoneOriginalkidsSeriesdetail {

	@Id
	@Column(name="amazoneSeriesid")
	private Integer amazoneSeriesid;
	@Column(name="amazoneSeriesname")
	private String amazoneSeriesname;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="aoksid_fk",referencedColumnName="aoksid")
	private AmazoneOriginalKidsSeries parent;

	public AmazoneOriginalKidsSeries getParent() {
		return parent;
	}

	public void setParent(AmazoneOriginalKidsSeries parent) {
		this.parent = parent;
	}

	public Integer getAmazoneSeriesid() {
		return amazoneSeriesid;
	}

	public void setAmazoneSeriesid(Integer amazoneSeriesid) {
		this.amazoneSeriesid = amazoneSeriesid;
	}

	public String getAmazoneSeriesname() {
		return amazoneSeriesname;
	}

	public void setAmazoneSeriesname(String amazoneSeriesname) {
		this.amazoneSeriesname = amazoneSeriesname;
	}
}
