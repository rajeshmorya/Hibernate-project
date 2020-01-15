package com.amazoneprime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="Home")
public class Home {

	@Id
	@Column(name="homeid")
	private Integer homeid;
	@Column(name="homename")
	private String homename;
	
	@OneToOne(targetEntity=User.class,cascade=CascadeType.ALL)
	@JoinColumn(name="userid_fk",referencedColumnName="uid")
	private User Parent;
	
	public User getParent() {
		return Parent;
	}
	public void setParent(User parent) {
		Parent = parent;
	}
	public Integer getHomeid() {
		return homeid;
	}
	public void setHomeid(Integer homeid) {
		this.homeid = homeid;
	}
	public String getHomename() {
		return homename;
	}
	public void setHomename(String homename) {
		this.homename = homename;
	}
}
