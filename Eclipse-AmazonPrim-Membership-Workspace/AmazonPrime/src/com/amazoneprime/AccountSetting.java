package com.amazoneprime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="AccountSetting")
public class AccountSetting {

	@Id
	@Column(name="accountsettingid")
	private Integer accountSettingid;
	@Column(name="accountSettingname")
	private String accountSettingname;
	
	@OneToOne(targetEntity=User.class,cascade=CascadeType.ALL)
	@JoinColumn(name="userid_fk",referencedColumnName="uid")
	private User Parent;
	
	public Integer getAccountSettingid() {
		return accountSettingid;
	}
	public void setAccountSettingid(Integer accountSettingid) {
		this.accountSettingid = accountSettingid;
	}
	public String getAccountSettingname() {
		return accountSettingname;
	}
	public void setAccountSettingname(String accountSettingname) {
		this.accountSettingname = accountSettingname;
	}
	public User getParent() {
		return Parent;
	}
	public void setParent(User parent) {
		Parent = parent;
	}
}
