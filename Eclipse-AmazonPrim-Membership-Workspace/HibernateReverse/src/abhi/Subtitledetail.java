package abhi;
// Generated Nov 26, 2019 4:53:06 PM by Hibernate Tools 5.3.0.Beta2

/**
 * Subtitledetail generated by hbm2java
 */
public class Subtitledetail implements java.io.Serializable {

	private int subtitleid;
	private Subtitle subtitle;
	private String subtitlename;

	public Subtitledetail() {
	}

	public Subtitledetail(int subtitleid) {
		this.subtitleid = subtitleid;
	}

	public Subtitledetail(int subtitleid, Subtitle subtitle, String subtitlename) {
		this.subtitleid = subtitleid;
		this.subtitle = subtitle;
		this.subtitlename = subtitlename;
	}

	public int getSubtitleid() {
		return this.subtitleid;
	}

	public void setSubtitleid(int subtitleid) {
		this.subtitleid = subtitleid;
	}

	public Subtitle getSubtitle() {
		return this.subtitle;
	}

	public void setSubtitle(Subtitle subtitle) {
		this.subtitle = subtitle;
	}

	public String getSubtitlename() {
		return this.subtitlename;
	}

	public void setSubtitlename(String subtitlename) {
		this.subtitlename = subtitlename;
	}

}
