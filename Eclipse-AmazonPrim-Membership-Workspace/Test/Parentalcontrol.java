// default package
// Generated Nov 26, 2019 1:10:25 PM by Hibernate Tools 4.0.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Parentalcontrol generated by hbm2java
 */
public class Parentalcontrol implements java.io.Serializable {

	private int parentalid;
	private Accountsetting accountsetting;
	private String parentalname;
	private Set<Primevideopin> primevideopins = new HashSet<Primevideopin>(0);

	public Parentalcontrol() {
	}

	public Parentalcontrol(int parentalid) {
		this.parentalid = parentalid;
	}

	public Parentalcontrol(int parentalid, Accountsetting accountsetting, String parentalname,
			Set<Primevideopin> primevideopins) {
		this.parentalid = parentalid;
		this.accountsetting = accountsetting;
		this.parentalname = parentalname;
		this.primevideopins = primevideopins;
	}

	public int getParentalid() {
		return this.parentalid;
	}

	public void setParentalid(int parentalid) {
		this.parentalid = parentalid;
	}

	public Accountsetting getAccountsetting() {
		return this.accountsetting;
	}

	public void setAccountsetting(Accountsetting accountsetting) {
		this.accountsetting = accountsetting;
	}

	public String getParentalname() {
		return this.parentalname;
	}

	public void setParentalname(String parentalname) {
		this.parentalname = parentalname;
	}

	public Set<Primevideopin> getPrimevideopins() {
		return this.primevideopins;
	}

	public void setPrimevideopins(Set<Primevideopin> primevideopins) {
		this.primevideopins = primevideopins;
	}

}
