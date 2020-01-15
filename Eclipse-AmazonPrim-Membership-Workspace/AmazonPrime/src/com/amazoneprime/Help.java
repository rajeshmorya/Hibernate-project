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
@Table(name="help")
public class Help {

	@Id
	@Column(name="helpid")
	private Integer helpid;
	@Column(name="helpname")
	private String helpname;
	
	@OneToOne(targetEntity=User.class,cascade=CascadeType.ALL)
	@JoinColumn(name="userid_fk",referencedColumnName="uid")
	private User Parent;
	
	@OneToMany(targetEntity=HelpDetail.class, cascade=CascadeType.ALL)
	@JoinColumn(name ="helpid_fk",referencedColumnName="helpid")
	private Set children;
	
	public Set getChildren() {
		return children;
	}
	public void setChildren(Set children) {
		this.children = children;
	}
	public User getParent() {
		return Parent;
	}
	public void setParent(User parent) {
		Parent = parent;
	}
	public Integer getHelpid() {
		return helpid;
	}
	public void setHelpid(Integer helpid) {
		this.helpid = helpid;
	}
	public String getHelpname() {
		return helpname;
	}
	public void setHelpname(String helpname) {
		this.helpname = helpname;
	}
}
