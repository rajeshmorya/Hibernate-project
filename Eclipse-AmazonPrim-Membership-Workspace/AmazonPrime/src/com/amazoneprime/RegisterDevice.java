package com.amazoneprime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="registerDevice")
public class RegisterDevice {

	@Id
	@Column(name="registerid")
	private Integer registerid;
	@Column(name="registername")
	private String registername;
	
	
	
	public Integer getRegisterid() {
		return registerid;
	}
	public void setRegisterid(Integer registerid) {
		this.registerid = registerid;
	}
	public String getRegistername() {
		return registername;
	}
	public void setRegistername(String registername) {
		this.registername = registername;
	}
	
	
}
