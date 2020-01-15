package com.arteck;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class customers {

	@Id
	@Column(name="cid")
	private Integer customerid;
	@Column(name="cname")
	private String customername;
	
	@ManyToOne(fetch=FetchType.LAZY, targetEntity=vendors.class, cascade=CascadeType.ALL)
	//@JoinColumn(name = "cid_id", referencedColumnName="cid")
	private vendors parentobject;
	
	public vendors getParentobject() {
		return parentobject;
	}
	public void setParentobject(vendors parentobject) {
		this.parentobject = parentobject;
	}
	public Integer getCustomerid() {
		return customerid;
	}
	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
}
