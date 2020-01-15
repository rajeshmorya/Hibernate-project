// default package
// Generated Nov 26, 2019 1:10:25 PM by Hibernate Tools 4.0.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Help generated by hbm2java
 */
public class Help implements java.io.Serializable {

	private int helpid;
	private User user;
	private String helpname;
	private Set<Helpdetail> helpdetails = new HashSet<Helpdetail>(0);

	public Help() {
	}

	public Help(int helpid) {
		this.helpid = helpid;
	}

	public Help(int helpid, User user, String helpname, Set<Helpdetail> helpdetails) {
		this.helpid = helpid;
		this.user = user;
		this.helpname = helpname;
		this.helpdetails = helpdetails;
	}

	public int getHelpid() {
		return this.helpid;
	}

	public void setHelpid(int helpid) {
		this.helpid = helpid;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getHelpname() {
		return this.helpname;
	}

	public void setHelpname(String helpname) {
		this.helpname = helpname;
	}

	public Set<Helpdetail> getHelpdetails() {
		return this.helpdetails;
	}

	public void setHelpdetails(Set<Helpdetail> helpdetails) {
		this.helpdetails = helpdetails;
	}

}
