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
@Table(name="subtitle")
public class Subtitle {

	@Id
	@Column(name="subtitleid")
	private Integer subtitleid;
	@Column(name="subtitlename")
	private String subtitlename;
	
	@OneToOne(targetEntity=AccountSetting.class,cascade=CascadeType.ALL)
	@JoinColumn(name="accountsettingid_fk",referencedColumnName="accountsettingid")
	private AccountSetting parent;
	
	@OneToMany(fetch=FetchType.LAZY, targetEntity=Subtitledetail.class, cascade=CascadeType.ALL)
	@JoinColumn(name ="subtitleid_fk", referencedColumnName="subtitleid")
	private Set children;
	
	public Integer getSubtitleid() {
		return subtitleid;
	}

	public void setSubtitleid(Integer subtitleid) {
		this.subtitleid = subtitleid;
	}

	public String getSubtitlename() {
		return subtitlename;
	}

	public void setSubtitlename(String subtitlename) {
		this.subtitlename = subtitlename;
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
