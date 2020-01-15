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
 * Weblanguage generated by hbm2java
 */
@Entity
@Table(name = "weblanguage", catalog = "amazoneprime")
public class Weblanguage implements java.io.Serializable {

	private int weblanguageid;
	private Language language;
	private String weblanguagename;

	public Weblanguage() {
	}

	public Weblanguage(int weblanguageid) {
		this.weblanguageid = weblanguageid;
	}

	public Weblanguage(int weblanguageid, Language language, String weblanguagename) {
		this.weblanguageid = weblanguageid;
		this.language = language;
		this.weblanguagename = weblanguagename;
	}

	@Id

	@Column(name = "weblanguageid", unique = true, nullable = false)
	public int getWeblanguageid() {
		return this.weblanguageid;
	}

	public void setWeblanguageid(int weblanguageid) {
		this.weblanguageid = weblanguageid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "languageid_fk")
	public Language getLanguage() {
		return this.language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	@Column(name = "weblanguagename")
	public String getWeblanguagename() {
		return this.weblanguagename;
	}

	public void setWeblanguagename(String weblanguagename) {
		this.weblanguagename = weblanguagename;
	}

}
