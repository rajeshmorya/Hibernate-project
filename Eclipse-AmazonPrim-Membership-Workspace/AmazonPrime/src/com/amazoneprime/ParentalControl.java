package com.amazoneprime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="parentalcontrol")
public class ParentalControl {

	@Id
	@Column(name="parentalid")
	private Integer parentalid;
	@Column(name="parentalname")
	private String parentalname;
	
	@OneToOne(targetEntity=AccountSetting.class,cascade=CascadeType.ALL)
	@JoinColumn(name="accountsettingid_fk",referencedColumnName="accountsettingid")
	private AccountSetting parent;

	public Integer getParentalid() {
		return parentalid;
	}

	public void setParentalid(Integer parentalid) {
		this.parentalid = parentalid;
	}

	public String getParentalname() {
		return parentalname;
	}

	public void setParentalname(String parentalname) {
		this.parentalname = parentalname;
	}
	public AccountSetting getParent() {
		return parent;
	}
	public void setParent(AccountSetting parent) {
		this.parent = parent;
	}
}
