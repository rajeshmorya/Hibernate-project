package hhh;
// Generated Nov 26, 2019 4:14:27 PM by Hibernate Tools 5.3.0.Beta2

/**
 * Autoplay generated by hbm2java
 */
public class Autoplay implements java.io.Serializable {

	private int autoplayid;
	private Playback playback;
	private String autoplayname;

	public Autoplay() {
	}

	public Autoplay(int autoplayid) {
		this.autoplayid = autoplayid;
	}

	public Autoplay(int autoplayid, Playback playback, String autoplayname) {
		this.autoplayid = autoplayid;
		this.playback = playback;
		this.autoplayname = autoplayname;
	}

	public int getAutoplayid() {
		return this.autoplayid;
	}

	public void setAutoplayid(int autoplayid) {
		this.autoplayid = autoplayid;
	}

	public Playback getPlayback() {
		return this.playback;
	}

	public void setPlayback(Playback playback) {
		this.playback = playback;
	}

	public String getAutoplayname() {
		return this.autoplayname;
	}

	public void setAutoplayname(String autoplayname) {
		this.autoplayname = autoplayname;
	}

}
