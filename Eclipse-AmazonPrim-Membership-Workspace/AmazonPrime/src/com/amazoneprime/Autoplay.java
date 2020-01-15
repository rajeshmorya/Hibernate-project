package com.amazoneprime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="autoplay")
public class Autoplay {

	@Id
	@Column(name="autoplayid")
	private Integer autoplayid;
	@Column(name="autoplayname")
	private String autoplayname;
	
	@OneToOne(targetEntity=Playback.class,cascade=CascadeType.ALL)
	@JoinColumn(name="playbackid_fk",referencedColumnName="playbackid")
	private Playback parent1;

	public Integer getAutoplayid() {
		return autoplayid;
	}

	public void setAutoplayid(Integer autoplayid) {
		this.autoplayid = autoplayid;
	}

	public String getAutoplayname() {
		return autoplayname;
	}

	public void setAutoplayname(String autoplayname) {
		this.autoplayname = autoplayname;
	}
	public Playback getParent1() {
		return parent1;
	}
	public void setParent1(Playback parent1) {
		this.parent1 = parent1;
	}
}
