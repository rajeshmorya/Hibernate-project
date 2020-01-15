package com.amazoneprime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="action_adventuretvdetail")
public class Action_adventureTVDetail {

	@Id
	@Column(name="action_adventureTVDetailid")
	private Integer action_adventureTVDetailid;
	@Column(name="action_adventureTVDetailname")
	private String action_adventureTVDetailname;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="actionAdventureid_fk",referencedColumnName="actionAdventureid")
	private Action_AdventureTV parent;

	public Action_AdventureTV getParent() {
		return parent;
	}

	public void setParent(Action_AdventureTV parent) {
		this.parent = parent;
	}

	public Integer getAction_adventureTVDetailid() {
		return action_adventureTVDetailid;
	}

	public void setAction_adventureTVDetailid(Integer action_adventureTVDetailid) {
		this.action_adventureTVDetailid = action_adventureTVDetailid;
	}

	public String getAction_adventureTVDetailname() {
		return action_adventureTVDetailname;
	}

	public void setAction_adventureTVDetailname(String action_adventureTVDetailname) {
		this.action_adventureTVDetailname = action_adventureTVDetailname;
	}
}
