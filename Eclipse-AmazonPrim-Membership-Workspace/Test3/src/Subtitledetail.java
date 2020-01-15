// default package
// Generated Nov 26, 2019 1:29:33 PM by Hibernate Tools 4.0.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Subtitledetail generated by hbm2java
 */
@Entity
@Table(name = "subtitledetail", catalog = "amazoneprime")
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

	@Id

	@Column(name = "subtitleid", unique = true, nullable = false)
	public int getSubtitleid() {
		return this.subtitleid;
	}

	public void setSubtitleid(int subtitleid) {
		this.subtitleid = subtitleid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subtitleid_fk")
	public Subtitle getSubtitle() {
		return this.subtitle;
	}

	public void setSubtitle(Subtitle subtitle) {
		this.subtitle = subtitle;
	}

	@Column(name = "subtitlename")
	public String getSubtitlename() {
		return this.subtitlename;
	}

	public void setSubtitlename(String subtitlename) {
		this.subtitlename = subtitlename;
	}

}
