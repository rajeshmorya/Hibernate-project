package fhfh;
// Generated Nov 26, 2019 3:59:58 PM by Hibernate Tools 5.3.0.Beta2

/**
 * Weblanguage generated by hbm2java
 */
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

	public int getWeblanguageid() {
		return this.weblanguageid;
	}

	public void setWeblanguageid(int weblanguageid) {
		this.weblanguageid = weblanguageid;
	}

	public Language getLanguage() {
		return this.language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public String getWeblanguagename() {
		return this.weblanguagename;
	}

	public void setWeblanguagename(String weblanguagename) {
		this.weblanguagename = weblanguagename;
	}

}
