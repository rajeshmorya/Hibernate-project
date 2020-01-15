package com.amazoneprime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="signout")
public class SignOut {

	@Id
	@Column(name="signoutid")
	private Integer signoutid;
	@Column(name="signoutname")
	private String signoutname;
	
	@OneToOne(targetEntity=User.class,cascade=CascadeType.ALL)
	@JoinColumn(name="userid_fk",referencedColumnName="uid")
	private User Parent;
	public User getParent() {
		return Parent;
	}
	public void setParent(User parent) {
		Parent = parent;
	}
	public Integer getSignoutid() {
		return signoutid;
	}
	public void setSignoutid(Integer signoutid) {
		this.signoutid = signoutid;
	}
	public String getSignoutname() {
		return signoutname;
	}
	public void setSignoutname(String signoutname) {
		this.signoutname = signoutname;
	}
}
