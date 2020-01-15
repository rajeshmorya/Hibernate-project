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
@Table(name="youwatchlist")
public class YourWatchList {

	@Id
	@Column(name="ywlid")
	private Integer ywlid;
	@Column(name="ywlname")
	private String ywlname;
	
	@OneToOne(targetEntity=User.class,cascade=CascadeType.ALL)
	@JoinColumn(name="userid_fk",referencedColumnName="uid")
	private User parent;
	
	@OneToMany(fetch=FetchType.LAZY, targetEntity=WatchlistDetail.class, cascade=CascadeType.ALL)
	@JoinColumn(name ="watchlistid_fk", referencedColumnName="ywlid")
	private Set parents;
	
	public Integer getYwlid() {
		return ywlid;
	}
	public void setYwlid(Integer ywlid) {
		this.ywlid = ywlid;
	}
	public String getYwlname() {
		return ywlname;
	}
	public void setYwlname(String ywlname) {
		this.ywlname = ywlname;
	}
	public User getParent() {
		return parent;
	}
	public void setParent(User parent) {
		this.parent = parent;
	}
	public Set getParents() {
		return parents;
	}
	public void setParents(Set parents) {
		this.parents = parents;
	}
}
