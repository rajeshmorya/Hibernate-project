package com.amazoneprime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="treanding")
public class TreandingTV {

	@Id
	@Column(name="treandingtvid")
	private Integer treandingtvid;
	@Column(name="treandingtvname")
	private String treandingtvname;
	
	@OneToOne(targetEntity=Tv_shows.class,cascade=CascadeType.ALL)
	@JoinColumn(name="tvshowid_fk",referencedColumnName="tvshowid")
	private Tv_shows Parent;
	
	@OneToOne(targetEntity=Home.class,cascade=CascadeType.ALL)
	@JoinColumn(name="homeid_fk",referencedColumnName="homeid")
	private Home Parent_Home;
	
	public Home getParent_Home() {
		return Parent_Home;
	}
	public void setParent_Home(Home parent_Home) {
		Parent_Home = parent_Home;
	}
	public Tv_shows getParent() {
		return Parent;
	}
	public void setParent(Tv_shows parent) {
		Parent = parent;
	}
	public Integer getTreandingtvid() {
		return treandingtvid;
	}
	public void setTreandingtvid(Integer treandingtvid) {
		this.treandingtvid = treandingtvid;
	}
	public String getTreandingtvname() {
		return treandingtvname;
	}
	public void setTreandingtvname(String treandingtvname) {
		this.treandingtvname = treandingtvname;
	}
}
