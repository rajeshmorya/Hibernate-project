package com.amazoneprime;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="youdevice")
public class YourDevice {
	
	@Id
	@Column(name="yourdeviceid")
	private Integer yourdeviceid;
	@Column(name="yourdecicename")
	private String yourdevicename;
	
	@OneToOne(targetEntity=AccountSetting.class,cascade=CascadeType.ALL)
	@JoinColumn(name="accountsettingid_fk",referencedColumnName="accountsettingid")
	private AccountSetting  parent;
	
	@OneToMany(targetEntity=RegisterDevice.class, cascade=CascadeType.ALL)
	@JoinColumn(name ="yourdeviceid_fk",referencedColumnName="yourdeviceid")
	private Set children;
	
	public Integer getYourdeviceid() {
		return yourdeviceid;
	}
	public void setYourdeviceid(Integer yourdeviceid) {
		this.yourdeviceid = yourdeviceid;
	}
	public String getYourdevicename() {
		return yourdevicename;
	}
	public void setYourdevicename(String yourdevicename) {
		this.yourdevicename = yourdevicename;
	}
	public AccountSetting getParent() {
		return parent;
	}
	public void setParent(AccountSetting parent) {
		this.parent = parent;
	}
	public Set getChildren() {
		return children;
	}
	public void setChildren(Set children) {
		this.children = children;
	}
}
