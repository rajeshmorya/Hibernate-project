package deep;
// Generated Nov 26, 2019 3:55:57 PM by Hibernate Tools 5.3.0.Beta2

import java.util.HashSet;
import java.util.Set;

/**
 * Youaccount generated by hbm2java
 */
public class Youaccount implements java.io.Serializable {

	private int youacountid;
	private Accountsetting accountsetting;
	private String youaccountname;
	private Set youdetails = new HashSet(0);
	private Set youpaymenthistories = new HashSet(0);
	private Set primes = new HashSet(0);

	public Youaccount() {
	}

	public Youaccount(int youacountid) {
		this.youacountid = youacountid;
	}

	public Youaccount(int youacountid, Accountsetting accountsetting, String youaccountname, Set youdetails,
			Set youpaymenthistories, Set primes) {
		this.youacountid = youacountid;
		this.accountsetting = accountsetting;
		this.youaccountname = youaccountname;
		this.youdetails = youdetails;
		this.youpaymenthistories = youpaymenthistories;
		this.primes = primes;
	}

	public int getYouacountid() {
		return this.youacountid;
	}

	public void setYouacountid(int youacountid) {
		this.youacountid = youacountid;
	}

	public Accountsetting getAccountsetting() {
		return this.accountsetting;
	}

	public void setAccountsetting(Accountsetting accountsetting) {
		this.accountsetting = accountsetting;
	}

	public String getYouaccountname() {
		return this.youaccountname;
	}

	public void setYouaccountname(String youaccountname) {
		this.youaccountname = youaccountname;
	}

	public Set getYoudetails() {
		return this.youdetails;
	}

	public void setYoudetails(Set youdetails) {
		this.youdetails = youdetails;
	}

	public Set getYoupaymenthistories() {
		return this.youpaymenthistories;
	}

	public void setYoupaymenthistories(Set youpaymenthistories) {
		this.youpaymenthistories = youpaymenthistories;
	}

	public Set getPrimes() {
		return this.primes;
	}

	public void setPrimes(Set primes) {
		this.primes = primes;
	}

}
