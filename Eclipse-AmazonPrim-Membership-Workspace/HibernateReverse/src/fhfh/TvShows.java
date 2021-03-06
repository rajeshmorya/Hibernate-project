package fhfh;
// Generated Nov 26, 2019 3:59:58 PM by Hibernate Tools 5.3.0.Beta2

import java.util.HashSet;
import java.util.Set;

/**
 * TvShows generated by hbm2java
 */
public class TvShows implements java.io.Serializable {

	private int tvshowid;
	private User user;
	private String tvshowname;
	private Set actionadventures = new HashSet(0);
	private Set throwbacks = new HashSet(0);
	private Set treandings = new HashSet(0);

	public TvShows() {
	}

	public TvShows(int tvshowid) {
		this.tvshowid = tvshowid;
	}

	public TvShows(int tvshowid, User user, String tvshowname, Set actionadventures, Set throwbacks, Set treandings) {
		this.tvshowid = tvshowid;
		this.user = user;
		this.tvshowname = tvshowname;
		this.actionadventures = actionadventures;
		this.throwbacks = throwbacks;
		this.treandings = treandings;
	}

	public int getTvshowid() {
		return this.tvshowid;
	}

	public void setTvshowid(int tvshowid) {
		this.tvshowid = tvshowid;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getTvshowname() {
		return this.tvshowname;
	}

	public void setTvshowname(String tvshowname) {
		this.tvshowname = tvshowname;
	}

	public Set getActionadventures() {
		return this.actionadventures;
	}

	public void setActionadventures(Set actionadventures) {
		this.actionadventures = actionadventures;
	}

	public Set getThrowbacks() {
		return this.throwbacks;
	}

	public void setThrowbacks(Set throwbacks) {
		this.throwbacks = throwbacks;
	}

	public Set getTreandings() {
		return this.treandings;
	}

	public void setTreandings(Set treandings) {
		this.treandings = treandings;
	}

}
