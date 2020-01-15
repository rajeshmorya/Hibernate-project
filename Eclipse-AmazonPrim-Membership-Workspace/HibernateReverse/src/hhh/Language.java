package hhh;
// Generated Nov 26, 2019 4:14:27 PM by Hibernate Tools 5.3.0.Beta2

import java.util.HashSet;
import java.util.Set;

/**
 * Language generated by hbm2java
 */
public class Language implements java.io.Serializable {

	private int languageid;
	private Accountsetting accountsetting;
	private String languragename;
	private Set weblanguages = new HashSet(0);

	public Language() {
	}

	public Language(int languageid) {
		this.languageid = languageid;
	}

	public Language(int languageid, Accountsetting accountsetting, String languragename, Set weblanguages) {
		this.languageid = languageid;
		this.accountsetting = accountsetting;
		this.languragename = languragename;
		this.weblanguages = weblanguages;
	}

	public int getLanguageid() {
		return this.languageid;
	}

	public void setLanguageid(int languageid) {
		this.languageid = languageid;
	}

	public Accountsetting getAccountsetting() {
		return this.accountsetting;
	}

	public void setAccountsetting(Accountsetting accountsetting) {
		this.accountsetting = accountsetting;
	}

	public String getLanguragename() {
		return this.languragename;
	}

	public void setLanguragename(String languragename) {
		this.languragename = languragename;
	}

	public Set getWeblanguages() {
		return this.weblanguages;
	}

	public void setWeblanguages(Set weblanguages) {
		this.weblanguages = weblanguages;
	}

}