// default package
// Generated Nov 26, 2019 1:35:49 PM by Hibernate Tools 4.0.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Playback generated by hbm2java
 */
public class Playback implements java.io.Serializable {

	private int playbackid;
	private Accountsetting accountsetting;
	private String playbackname;
	private Set<Autoplay> autoplays = new HashSet<Autoplay>(0);

	public Playback() {
	}

	public Playback(int playbackid) {
		this.playbackid = playbackid;
	}

	public Playback(int playbackid, Accountsetting accountsetting, String playbackname, Set<Autoplay> autoplays) {
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

	public Set<Autoplay> getAutoplays() {
		return this.autoplays;
	}

	public void setAutoplays(Set<Autoplay> autoplays) {
		this.autoplays = autoplays;
	}

}
