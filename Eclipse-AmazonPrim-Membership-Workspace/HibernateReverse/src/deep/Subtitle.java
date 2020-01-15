package deep;
// Generated Nov 26, 2019 3:55:57 PM by Hibernate Tools 5.3.0.Beta2

import java.util.HashSet;
import java.util.Set;

/**
 * Subtitle generated by hbm2java
 */
public class Subtitle implements java.io.Serializable {

	private int subtitleid;
	private Accountsetting accountsetting;
	private String subtitlename;
	private Set subtitledetails = new HashSet(0);

	public Subtitle() {
	}

	public Subtitle(int subtitleid) {
		this.subtitleid = subtitleid;
	}

	public Subtitle(int subtitleid, Accountsetting accountsetting, String subtitlename, Set subtitledetails) {
		this.subtitleid = subtitleid;
		this.accountsetting = accountsetting;
		this.subtitlename = subtitlename;
		this.subtitledetails = subtitledetails;
	}

	public int getSubtitleid() {
		return this.subtitleid;
	}

	public void setSubtitleid(int subtitleid) {
		this.subtitleid = subtitleid;
	}

	public Accountsetting getAccountsetting() {
		return this.accountsetting;
	}

	public void setAccountsetting(Accountsetting accountsetting) {
		this.accountsetting = accountsetting;
	}

	public String getSubtitlename() {
		return this.subtitlename;
	}

	public void setSubtitlename(String subtitlename) {
		this.subtitlename = subtitlename;
	}

	public Set getSubtitledetails() {
		return this.subtitledetails;
	}

	public void setSubtitledetails(Set subtitledetails) {
		this.subtitledetails = subtitledetails;
	}

}
