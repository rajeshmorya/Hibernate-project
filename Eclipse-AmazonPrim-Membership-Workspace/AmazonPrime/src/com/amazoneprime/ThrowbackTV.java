package com.amazoneprime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="throwback")
public class ThrowbackTV {

	@Id
	@Column(name="throwbackTVid")
	private Integer throwbackTVid;
	@Column(name="throwbackTVname")
	private String throwbackTVname;
	
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
	public Integer getThrowbackTVid() {
		return throwbackTVid;
	}
	public void setThrowbackTVid(Integer throwbackTVid) {
		this.throwbackTVid = throwbackTVid;
	}
	public String getThrowbackTVname() {
		return throwbackTVname;
	}
	public void setThrowbackTVname(String throwbackTVname) {
		this.throwbackTVname = throwbackTVname;
	}
	
}
