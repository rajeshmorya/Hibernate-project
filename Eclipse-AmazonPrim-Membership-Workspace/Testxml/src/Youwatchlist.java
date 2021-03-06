// default package
// Generated Nov 26, 2019 1:35:49 PM by Hibernate Tools 4.0.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Youwatchlist generated by hbm2java
 */
public class Youwatchlist implements java.io.Serializable {

	private int ywlid;
	private User user;
	private String ywlname;
	private Set<Watchdetail> watchdetails = new HashSet<Watchdetail>(0);

	public Youwatchlist() {
	}

	public Youwatchlist(int ywlid) {
		this.ywlid = ywlid;
	}

	public Youwatchlist(int ywlid, User user, String ywlname, Set<Watchdetail> watchdetails) {
		this.ywlid = ywlid;
		this.user = user;
		this.ywlname = ywlname;
		this.watchdetails = watchdetails;
	}

	public int getYwlid() {
		return this.ywlid;
	}

	public void setYwlid(int ywlid) {
		this.ywlid = ywlid;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getYwlname() {
		return this.ywlname;
	}

	public void setYwlname(String ywlname) {
		this.ywlname = ywlname;
	}

	public Set<Watchdetail> getWatchdetails() {
		return this.watchdetails;
	}

	public void setWatchdetails(Set<Watchdetail> watchdetails) {
		this.watchdetails = watchdetails;
	}

}
