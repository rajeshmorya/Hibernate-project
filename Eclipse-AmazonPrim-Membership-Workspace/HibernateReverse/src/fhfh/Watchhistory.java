package fhfh;
// Generated Nov 26, 2019 3:59:58 PM by Hibernate Tools 5.3.0.Beta2

import java.util.HashSet;
import java.util.Set;

/**
 * Watchhistory generated by hbm2java
 */
public class Watchhistory implements java.io.Serializable {

	private int watchhistoryid;
	private Accountsetting accountsetting;
	private String watchhistoryname;
	private Set watchhistorydetails = new HashSet(0);

	public Watchhistory() {
	}

	public Watchhistory(int watchhistoryid) {
		this.watchhistoryid = watchhistoryid;
	}

	public Watchhistory(int watchhistoryid, Accountsetting accountsetting, String watchhistoryname,
			Set watchhistorydetails) {
		this.watchhistoryid = watchhistoryid;
		this.accountsetting = accountsetting;
		this.watchhistoryname = watchhistoryname;
		this.watchhistorydetails = watchhistorydetails;
	}

	public int getWatchhistoryid() {
		return this.watchhistoryid;
	}

	public void setWatchhistoryid(int watchhistoryid) {
		this.watchhistoryid = watchhistoryid;
	}

	public Accountsetting getAccountsetting() {
		return this.accountsetting;
	}

	public void setAccountsetting(Accountsetting accountsetting) {
		this.accountsetting = accountsetting;
	}

	public String getWatchhistoryname() {
		return this.watchhistoryname;
	}

	public void setWatchhistoryname(String watchhistoryname) {
		this.watchhistoryname = watchhistoryname;
	}

	public Set getWatchhistorydetails() {
		return this.watchhistorydetails;
	}

	public void setWatchhistorydetails(Set watchhistorydetails) {
		this.watchhistorydetails = watchhistorydetails;
	}

}
