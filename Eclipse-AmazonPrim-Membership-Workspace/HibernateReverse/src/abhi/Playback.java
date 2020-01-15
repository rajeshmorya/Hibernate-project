package abhi;
// Generated Nov 26, 2019 4:53:06 PM by Hibernate Tools 5.3.0.Beta2

import java.util.HashSet;
import java.util.Set;

/**
 * Playback generated by hbm2java
 */
public class Playback implements java.io.Serializable {

	private int playbackid;
	private Accountsetting accountsetting;
	private String playbackname;
	private Set autoplays = new HashSet(0);

	public Playback() {
	}

	public Playback(int playbackid) {
		this.playbackid = playbackid;
	}

	public Playback(int playbackid, Accountsetting accountsetting, String playbackname, Set autoplays) {
		this.playbackid = playbackid;
		this.accountsetting = accountsetting;
		this.playbackname = playbackname;
		this.autoplays = autoplays;
	}

	public int getPlaybackid() {
		return this.playbackid;
	}

	public void setPlaybackid(int playbackid) {
		this.playbackid = playbackid;
	}

	public Accountsetting getAccountsetting() {
		return this.accountsetting;
	}

	public void setAccountsetting(Accountsetting accountsetting) {
		this.accountsetting = accountsetting;
	}

	public String getPlaybackname() {
		return this.playbackname;
	}

	public void setPlaybackname(String playbackname) {
		this.playbackname = playbackname;
	}

	public Set getAutoplays() {
		return this.autoplays;
	}

	public void setAutoplays(Set autoplays) {
		this.autoplays = autoplays;
	}

}
