// default package
// Generated Nov 26, 2019 2:40:40 PM by Hibernate Tools 5.3.0.Beta2

import java.util.HashSet;
import java.util.Set;

/**
 * Watchanywhere generated by hbm2java
 */
public class Watchanywhere implements java.io.Serializable {

	private int watchanywhereid;
	private User user;
	private String watchanywherename;
	private Set watchanywheredetails = new HashSet(0);

	public Watchanywhere() {
	}

	public Watchanywhere(int watchanywhereid) {
		this.watchanywhereid = watchanywhereid;
	}

	public Watchanywhere(int watchanywhereid, User user, String watchanywherename, Set watchanywheredetails) {
		this.watchanywhereid = watchanywhereid;
		this.user = user;
		this.watchanywherename = watchanywherename;
		this.watchanywheredetails = watchanywheredetails;
	}

	public int getWatchanywhereid() {
		return this.watchanywhereid;
	}

	public void setWatchanywhereid(int watchanywhereid) {
		this.watchanywhereid = watchanywhereid;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getWatchanywherename() {
		return this.watchanywherename;
	}

	public void setWatchanywherename(String watchanywherename) {
		this.watchanywherename = watchanywherename;
	}

	public Set getWatchanywheredetails() {
		return this.watchanywheredetails;
	}

	public void setWatchanywheredetails(Set watchanywheredetails) {
		this.watchanywheredetails = watchanywheredetails;
	}

}
