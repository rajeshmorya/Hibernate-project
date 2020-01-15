package com.amazoneprime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="primevideopin")
public class PrimeVideopin {

	@Id
	@Column(name="primevideopinid")
	private Integer primevideopinid;
	@Column(name="primevideopinname")
	private String primevideopinname;
	
	@OneToOne(targetEntity=ParentalControl.class,cascade=CascadeType.ALL)
	@JoinColumn(name="parentalid_fk",referencedColumnName="parentalid")
	private ParentalControl parent;
	public Integer getPrimevideopinid() {
		return primevideopinid;
	}
	public void setPrimevideopinid(Integer primevideopinid) {
		this.primevideopinid = primevideopinid;
	}
	public String getPrimevideopinname() {
		return primevideopinname;
	}
	public void setPrimevideopinname(String primevideopinname) {
		this.primevideopinname = primevideopinname;
	}
	public ParentalControl getParent() {
		return parent;
	}
	public void setParent(ParentalControl parent) {
		this.parent = parent;
	}
	
}
