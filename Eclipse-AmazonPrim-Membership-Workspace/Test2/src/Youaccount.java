// default package
// Generated Nov 26, 2019 1:28:02 PM by Hibernate Tools 4.0.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Youaccount generated by hbm2java
 */
public class Youaccount implements java.io.Serializable {

	private int youacountid;
	private Accountsetting accountsetting;
	private String youaccountname;
	private Set<Youdetail> youdetails = new HashSet<Youdetail>(0);
	private Set<Youpaymenthistory> youpaymenthistories = new HashSet<Youpaymenthistory>(0);
	private Set<Prime> primes = new HashSet<Prime>(0);

	public Youaccount() {
	}

	public Youaccount(int youacountid) {
		this.youacountid = youacountid;
	}

	public Youaccount(int youacountid, Accountsetting accountsetting, String youaccountname, Set<Youdetail> youdetails,
			Set<Youpaymenthistory> youpaymenthistories, Set<Prime> primes) {
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

	public Set<Youdetail> getYoudetails() {
		return this.youdetails;
	}

	public void setYoudetails(Set<Youdetail> youdetails) {
		this.youdetails = youdetails;
	}

	public Set<Youpaymenthistory> getYoupaymenthistories() {
		return this.youpaymenthistories;
	}

	public void setYoupaymenthistories(Set<Youpaymenthistory> youpaymenthistories) {
		this.youpaymenthistories = youpaymenthistories;
	}

	public Set<Prime> getPrimes() {
		return this.primes;
	}

	public void setPrimes(Set<Prime> primes) {
		this.primes = primes;
	}

}
