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
@Table(name="watchanywhere")
public class WatchAnywhere {

	@Id
	@Column(name="watchanywhereid")
	private Integer watchanywhereid;
	@Column(name="watchanywherename")
	private String watchanywherename;
	
	@OneToOne(targetEntity=User.class,cascade=CascadeType.ALL)
	@JoinColumn(name="userid_fk",referencedColumnName="uid")
	private User Parent;
	
	@OneToMany(targetEntity=watchanywheredetail.class, cascade=CascadeType.ALL)
	@JoinColumn(name ="watchanywhereid_fk",referencedColumnName="watchanywhereid")
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
	public Integer getWatchanywhereid() {
		return watchanywhereid;
	}
	public void setWatchanywhereid(Integer watchanywhereid) {
		this.watchanywhereid = watchanywhereid;
	}
	public String getWatchanywherename() {
		return watchanywherename;
	}
	public void setWatchanywherename(String watchanywherename) {
		this.watchanywherename = watchanywherename;
	}
}
