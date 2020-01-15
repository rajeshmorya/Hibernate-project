package com.amazoneprime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="prime")
public class Prime {

	@Id
	@Column(name="primeid")
	private Integer primeid;
	@Column(name="primename")
	private String primename;
	public Integer getPrimeid() {
		return primeid;
	}
	public void setPrimeid(Integer primeid) {
		this.primeid = primeid;
	}
	public String getPrimename() {
		return primename;
	}
	public void setPrimename(String primename) {
		this.primename = primename;
	}
}
