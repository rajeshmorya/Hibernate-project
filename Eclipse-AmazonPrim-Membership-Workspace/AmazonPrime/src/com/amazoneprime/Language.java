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
@Table(name="language")
public class Language {

	@Id
	@Column(name="languageid")
	private Integer languageid;
	@Column(name="languragename")
	private String languragename;
	
	@OneToOne(targetEntity=AccountSetting.class,cascade=CascadeType.ALL)
	@JoinColumn(name="accountsettingid_fk",referencedColumnName="accountsettingid")
	private AccountSetting  parent;
	
	@OneToMany(targetEntity=Websitelanguage.class, cascade=CascadeType.ALL)
	@JoinColumn(name ="languageid_fk",referencedColumnName="languageid")
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

	public Integer getLanguageid() {
		return languageid;
	}

	public void setLanguageid(Integer languageid) {
		this.languageid = languageid;
	}

	public String getLanguragename() {
		return languragename;
	}

	public void setLanguragename(String languragename) {
		this.languragename = languragename;
	}
	
}
