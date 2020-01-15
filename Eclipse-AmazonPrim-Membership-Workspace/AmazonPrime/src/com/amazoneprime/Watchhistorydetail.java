package com.amazoneprime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="watchhistorydetail")
public class Watchhistorydetail {

	@Id
	@Column(name="watchhistorydetailid")
	private Integer watchhistorydetailid;
	@Column(name="watchhistorydetailname")
	private String watchhistorydetailname;
	public Integer getWatchhistorydetailid() {
		return watchhistorydetailid;
	}
	public void setWatchhistorydetailid(Integer watchhistorydetailid) {
		this.watchhistorydetailid = watchhistorydetailid;
	}
	public String getWatchhistorydetailname() {
		return watchhistorydetailname;
	}
	public void setWatchhistorydetailname(String watchhistorydetailname) {
		this.watchhistorydetailname = watchhistorydetailname;
	}
}
