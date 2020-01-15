package com.amazoneprime;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="watchDetail")
public class WatchlistDetail {

	@Id
	@Column(name="watchlistid")
	private Integer watchlistdetailid;
	@Column(name="listname")
	private String listitemname;

	public Integer getWatchlistdetailid() {
		return watchlistdetailid;
	}

	public void setWatchlistdetailid(Integer watchlistdetailid) {
		this.watchlistdetailid = watchlistdetailid;
	}

	public String getListitemname() {
		return listitemname;
	}

	public void setListitemname(String listitemname) {
		this.listitemname = listitemname;
	}
	
}
