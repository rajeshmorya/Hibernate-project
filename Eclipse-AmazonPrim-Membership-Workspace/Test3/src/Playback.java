// default package
// Generated Nov 26, 2019 1:29:33 PM by Hibernate Tools 4.0.1.Final

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
 * Playback generated by hbm2java
 */
@Entity
@Table(name = "playback", catalog = "amazoneprime")
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

	@Id

	@Column(name = "playbackid", unique = true, nullable = false)
	public int getPlaybackid() {
		return this.playbackid;
	}

	public void setPlaybackid(int playbackid) {
		this.playbackid = playbackid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "accountsettingid_fk")
	public Accountsetting getAccountsetting() {
		return this.accountsetting;
	}

	public void setAccountsetting(Accountsetting accountsetting) {
		this.accountsetting = accountsetting;
	}

	@Column(name = "playbackname")
	public String getPlaybackname() {
		return this.playbackname;
	}

	public void setPlaybackname(String playbackname) {
		this.playbackname = playbackname;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "playback")
	public Set<Autoplay> getAutoplays() {
		return this.autoplays;
	}

	public void setAutoplays(Set<Autoplay> autoplays) {
		this.autoplays = autoplays;
	}

}
