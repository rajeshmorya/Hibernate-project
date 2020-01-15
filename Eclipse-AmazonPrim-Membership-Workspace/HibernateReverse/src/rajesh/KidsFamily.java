package rajesh;
// Generated Nov 26, 2019 4:36:19 PM by Hibernate Tools 5.3.0.Beta2

import java.util.HashSet;
import java.util.Set;

/**
 * KidsFamily generated by hbm2java
 */
public class KidsFamily implements java.io.Serializable {

	private int kidsFamilyMovieid;
	private Home home;
	private Kids kids;
	private String kidsFamilyMoviename;
	private Set kidsfamilymoviedetails = new HashSet(0);

	public KidsFamily() {
	}

	public KidsFamily(int kidsFamilyMovieid) {
		this.kidsFamilyMovieid = kidsFamilyMovieid;
	}

	public KidsFamily(int kidsFamilyMovieid, Home home, Kids kids, String kidsFamilyMoviename,
			Set kidsfamilymoviedetails) {
		this.kidsFamilyMovieid = kidsFamilyMovieid;
		this.home = home;
		this.kids = kids;
		this.kidsFamilyMoviename = kidsFamilyMoviename;
		this.kidsfamilymoviedetails = kidsfamilymoviedetails;
	}

	public int getKidsFamilyMovieid() {
		return this.kidsFamilyMovieid;
	}

	public void setKidsFamilyMovieid(int kidsFamilyMovieid) {
		this.kidsFamilyMovieid = kidsFamilyMovieid;
	}

	public Home getHome() {
		return this.home;
	}

	public void setHome(Home home) {
		this.home = home;
	}

	public Kids getKids() {
		return this.kids;
	}

	public void setKids(Kids kids) {
		this.kids = kids;
	}

	public String getKidsFamilyMoviename() {
		return this.kidsFamilyMoviename;
	}

	public void setKidsFamilyMoviename(String kidsFamilyMoviename) {
		this.kidsFamilyMoviename = kidsFamilyMoviename;
	}

	public Set getKidsfamilymoviedetails() {
		return this.kidsfamilymoviedetails;
	}

	public void setKidsfamilymoviedetails(Set kidsfamilymoviedetails) {
		this.kidsfamilymoviedetails = kidsfamilymoviedetails;
	}

}
