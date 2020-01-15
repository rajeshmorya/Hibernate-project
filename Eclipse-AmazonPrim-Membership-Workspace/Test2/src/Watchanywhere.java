// default package
// Generated Nov 26, 2019 1:28:02 PM by Hibernate Tools 4.0.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Watchanywhere generated by hbm2java
 */
public class Watchanywhere implements java.io.Serializable {

	private int watchanywhereid;
	private User user;
	private String watchanywherename;
	private Set<Watchanywheredetail> watchanywheredetails = new HashSet<Watchanywheredetail>(0);

	public Watchanywhere() {
	}

	public Watchanywhere(int watchanywhereid) {
		this.watchanywhereid = watchanywhereid;
	}

	public Watchanywhere(int watchanywhereid, User user, String watchanywherename,
			Set<Watchanywheredetail> watchanywheredetails) {
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

	public Set<Watchanywheredetail> getWatchanywheredetails() {
		return this.watchanywheredetails;
	}

	public void setWatchanywheredetails(Set<Watchanywheredetail> watchanywheredetails) {
		this.watchanywheredetails = watchanywheredetails;
	}

}
