package com.amazoneprime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="playback")
public class Playback {

	@Id
	@Column(name="playbackid")
	private Integer playbackid;
	@Column(name="playbackname")
	private String playbackname;
	
	@OneToOne(targetEntity=AccountSetting.class,cascade=CascadeType.ALL)
	@JoinColumn(name="accountsettingid_fk",referencedColumnName="accountsettingid")
	private AccountSetting parent;
	public Integer getPlaybackid() {
		return playbackid;
	}
	public void setPlaybackid(Integer playbackid) {
		this.playbackid = playbackid;
	}
	public String getPlaybackname() {
		return playbackname;
	}
	public void setPlaybackname(String playbackname) {
		this.playbackname = playbackname;
	}
	public AccountSetting getParent() {
		return parent;
	}
	public void setParent(AccountSetting parent) {
		this.parent = parent;
	}
}
