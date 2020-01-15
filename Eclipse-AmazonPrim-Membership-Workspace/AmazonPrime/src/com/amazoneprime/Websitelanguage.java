package com.amazoneprime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="weblanguage")
public class Websitelanguage {

	@Id
	@Column(name="weblanguageid")
	private Integer weblanguageid;
	@Column(name="weblanguagename")
	private String weblanguagename;
	public Integer getWeblanguageid() {
		return weblanguageid;
	}
	public void setWeblanguageid(Integer weblanguageid) {
		this.weblanguageid = weblanguageid;
	}
	public String getWeblanguagename() {
		return weblanguagename;
	}
	public void setWeblanguagename(String weblanguagename) {
		this.weblanguagename = weblanguagename;
	}
}
