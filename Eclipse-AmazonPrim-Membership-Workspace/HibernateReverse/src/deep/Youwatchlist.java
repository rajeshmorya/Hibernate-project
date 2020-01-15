package deep;
// Generated Nov 26, 2019 3:55:57 PM by Hibernate Tools 5.3.0.Beta2

import java.util.HashSet;
import java.util.Set;

/**
 * Youwatchlist generated by hbm2java
 */
public class Youwatchlist implements java.io.Serializable {

	private int ywlid;
	private User user;
	private String ywlname;
	private Set watchdetails = new HashSet(0);

	public Youwatchlist() {
	}

	public Youwatchlist(int ywlid) {
		this.ywlid = ywlid;
	}

	public Youwatchlist(int ywlid, User user, String ywlname, Set watchdetails) {
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

	public Set getWatchdetails() {
		return this.watchdetails;
	}

	public void setWatchdetails(Set watchdetails) {
		this.watchdetails = watchdetails;
	}

}
