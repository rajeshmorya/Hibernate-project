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
@Table(name="youaccount")
public class YourAccount {

	@Id
	@Column(name="youacountid")
	private Integer youaccountid;
	@Column(name="youaccountname")
	private String youaccountname;
	
	@OneToOne(targetEntity=AccountSetting.class,cascade=CascadeType.ALL)
	@JoinColumn(name="accountsettingid_fk",referencedColumnName="accountsettingid")
	private AccountSetting parent;
	
	@OneToMany(fetch=FetchType.LAZY, targetEntity=YourDetail.class, cascade=CascadeType.ALL)
	@JoinColumn(name="youaccount_fk", referencedColumnName="youacountid")
	private Set children;
	
	@OneToMany(fetch=FetchType.LAZY, targetEntity=Prime.class, cascade=CascadeType.ALL)
	@JoinColumn(name="youaccount_fk1", referencedColumnName="youacountid")
	private Set children1;
	
	@OneToMany(fetch=FetchType.LAZY, targetEntity=YourPaymenHistory.class, cascade=CascadeType.ALL)
	@JoinColumn(name="youaccount_fk1", referencedColumnName="youacountid")
	private Set children2;
	public Integer getYouaccountid() {
		return youaccountid;
	}
	public void setYouaccountid(Integer youaccountid) {
		this.youaccountid = youaccountid;
	}
	public String getYouaccountname() {
		return youaccountname;
	}
	public void setYouaccountname(String youaccountname) {
		this.youaccountname = youaccountname;
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
	public Set getChildren1() {
		return children1;
	}
	public void setChildren1(Set children1) {
		this.children1 = children1;
	}
	public Set getChildren2() {
		return children2;
	}
	public void setChildren2(Set children2) {
		this.children2 = children2;
	}
	
}
