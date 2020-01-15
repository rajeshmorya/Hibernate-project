package com.amazoneprime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subtitledetail")
public class Subtitledetail {

	@Id
	@Column(name="subtitleid")
	private Integer subtitleid;
	@Column(name="subtitlename")
	private String subtitlename;
	
	public Integer getSubtitleid() {
		return subtitleid;
	}
	public void setSubtitleid(Integer subtitleid) {
		this.subtitleid = subtitleid;
	}
	public String getSubtitlename() {
		return subtitlename;
	}
	public void setSubtitlename(String subtitlename) {
		this.subtitlename = subtitlename;
	}
	
}
