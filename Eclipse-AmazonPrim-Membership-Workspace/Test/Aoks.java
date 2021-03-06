// default package
// Generated Nov 26, 2019 1:10:25 PM by Hibernate Tools 4.0.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Aoks generated by hbm2java
 */
public class Aoks implements java.io.Serializable {

	private int aoksid;
	private Kids kids;
	private Home home;
	private String aoksname;
	private Set<Amazoneseriesdetail> amazoneseriesdetails = new HashSet<Amazoneseriesdetail>(0);

	public Aoks() {
	}

	public Aoks(int aoksid) {
		this.aoksid = aoksid;
	}

	public Aoks(int aoksid, Kids kids, Home home, String aoksname, Set<Amazoneseriesdetail> amazoneseriesdetails) {
		this.aoksid = aoksid;
		this.kids = kids;
		this.home = home;
		this.aoksname = aoksname;
		this.amazoneseriesdetails = amazoneseriesdetails;
	}

	public int getAoksid() {
		return this.aoksid;
	}

	public void setAoksid(int aoksid) {
		this.aoksid = aoksid;
	}

	public Kids getKids() {
		return this.kids;
	}

	public void setKids(Kids kids) {
		this.kids = kids;
	}

	public Home getHome() {
		return this.home;
	}

	public void setHome(Home home) {
		this.home = home;
	}

	public String getAoksname() {
		return this.aoksname;
	}

	public void setAoksname(String aoksname) {
		this.aoksname = aoksname;
	}

	public Set<Amazoneseriesdetail> getAmazoneseriesdetails() {
		return this.amazoneseriesdetails;
	}

	public void setAmazoneseriesdetails(Set<Amazoneseriesdetail> amazoneseriesdetails) {
		this.amazoneseriesdetails = amazoneseriesdetails;
	}

}
