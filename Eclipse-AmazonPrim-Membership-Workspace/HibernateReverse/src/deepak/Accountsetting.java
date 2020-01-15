package deepak;
// Generated Nov 26, 2019 4:44:51 PM by Hibernate Tools 5.3.0.Beta2

import java.util.HashSet;
import java.util.Set;

/**
 * Accountsetting generated by hbm2java
 */
public class Accountsetting implements java.io.Serializable {

	private int accountsettingid;
	private User user;
	private String accountSettingname;
	private Set watchhistories = new HashSet(0);
	private Set youdevices = new HashSet(0);
	private Set parentalcontrols = new HashSet(0);
	private Set languages = new HashSet(0);
	private Set subtitles = new HashSet(0);
	private Set playbacks = new HashSet(0);
	private Set youaccounts = new HashSet(0);

	public Accountsetting() {
	}

	public Accountsetting(int accountsettingid) {
		this.accountsettingid = accountsettingid;
	}

	public Accountsetting(int accountsettingid, User user, String accountSettingname, Set watchhistories,
			Set youdevices, Set parentalcontrols, Set languages, Set subtitles, Set playbacks, Set youaccounts) {
		this.accountsettingid = accountsettingid;
		this.user = user;
		this.accountSettingname = accountSettingname;
		this.watchhistories = watchhistories;
		this.youdevices = youdevices;
		this.parentalcontrols = parentalcontrols;
		this.languages = languages;
		this.subtitles = subtitles;
		this.playbacks = playbacks;
		this.youaccounts = youaccounts;
	}

	public int getAccountsettingid() {
		return this.accountsettingid;
	}

	public void setAccountsettingid(int accountsettingid) {
		this.accountsettingid = accountsettingid;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getAccountSettingname() {
		return this.accountSettingname;
	}

	public void setAccountSettingname(String accountSettingname) {
		this.accountSettingname = accountSettingname;
	}

	public Set getWatchhistories() {
		return this.watchhistories;
	}

	public void setWatchhistories(Set watchhistories) {
		this.watchhistories = watchhistories;
	}

	public Set getYoudevices() {
		return this.youdevices;
	}

	public void setYoudevices(Set youdevices) {
		this.youdevices = youdevices;
	}

	public Set getParentalcontrols() {
		return this.parentalcontrols;
	}

	public void setParentalcontrols(Set parentalcontrols) {
		this.parentalcontrols = parentalcontrols;
	}

	public Set getLanguages() {
		return this.languages;
	}

	public void setLanguages(Set languages) {
		this.languages = languages;
	}

	public Set getSubtitles() {
		return this.subtitles;
	}

	public void setSubtitles(Set subtitles) {
		this.subtitles = subtitles;
	}

	public Set getPlaybacks() {
		return this.playbacks;
	}

	public void setPlaybacks(Set playbacks) {
		this.playbacks = playbacks;
	}

	public Set getYouaccounts() {
		return this.youaccounts;
	}

	public void setYouaccounts(Set youaccounts) {
		this.youaccounts = youaccounts;
	}

}
