// default package
// Generated Nov 26, 2019 1:40:31 PM by Hibernate Tools 4.0.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Watchhistory generated by hbm2java
 */
@Entity
@Table(name = "watchhistory", catalog = "amazoneprime")
public class Watchhistory implements java.io.Serializable {

	private int watchhistoryid;
	private Accountsetting accountsetting;
	private String watchhistoryname;
	private Set<Watchhistorydetail> watchhistorydetails = new HashSet<Watchhistorydetail>(0);

	public Watchhistory() {
	}

	public Watchhistory(int watchhistoryid) {
		this.watchhistoryid = watchhistoryid;
	}

	public Watchhistory(int watchhistoryid, Accountsetting accountsetting, String watchhistoryname,
			Set<Watchhistorydetail> watchhistorydetails) {
		this.watchhistoryid = watchhistoryid;
		this.accountsetting = accountsetting;
		this.watchhistoryname = watchhistoryname;
		this.watchhistorydetails = watchhistorydetails;
	}

	@Id

	@Column(name = "watchhistoryid", unique = true, nullable = false)
	public int getWatchhistoryid() {
		return this.watchhistoryid;
	}

	public void setWatchhistoryid(int watchhistoryid) {
		this.watchhistoryid = watchhistoryid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "accountsettingid_fk")
	public Accountsetting getAccountsetting() {
		return this.accountsetting;
	}

	public void setAccountsetting(Accountsetting accountsetting) {
		this.accountsetting = accountsetting;
	}

	@Column(name = "watchhistoryname")
	public String getWatchhistoryname() {
		return this.watchhistoryname;
	}

	public void setWatchhistoryname(String watchhistoryname) {
		this.watchhistoryname = watchhistoryname;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "watchhistory")
	public Set<Watchhistorydetail> getWatchhistorydetails() {
		return this.watchhistorydetails;
	}

	public void setWatchhistorydetails(Set<Watchhistorydetail> watchhistorydetails) {
		this.watchhistorydetails = watchhistorydetails;
	}

}
