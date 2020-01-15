package com.amazoneprime;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="watchhistory")
public class WatchHistory {

	@Id
	@Column(name="watchhistoryid")
	private Integer watchhistoryid;
	@Column(name="watchhistoryname")
	private String watchhistoryname;
	
	@OneToOne(targetEntity=AccountSetting.class,cascade=CascadeType.ALL)
	@JoinColumn(name="accountsettingid_fk",referencedColumnName="accountsettingid")
	private AccountSetting  parent;
	
	@OneToMany(targetEntity=Watchhistorydetail.class, cascade=CascadeType.ALL)
	@JoinColumn(name ="watchhistoryid_fk",referencedColumnName="watchhistoryid")
	private Set children;

	public Set getChildren() {
		return children;
	}

	public void setChildren(Set children) {
		this.children = children;
	}

	public AccountSetting getParent() {
		return parent;
	}

	public void setParent(AccountSetting parent) {
		this.parent = parent;
	}

	public Integer getWatchhistoryid() {
		return watchhistoryid;
	}

	public void setWatchhistoryid(Integer watchhistoryid) {
		this.watchhistoryid = watchhistoryid;
	}

	public String getWatchhistoryname() {
		return watchhistoryname;
	}

	public void setWatchhistoryname(String watchhistoryname) {
		this.watchhistoryname = watchhistoryname;
	}
}
