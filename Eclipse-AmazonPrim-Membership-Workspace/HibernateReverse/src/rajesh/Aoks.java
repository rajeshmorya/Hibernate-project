package rajesh;
// Generated Nov 26, 2019 4:36:19 PM by Hibernate Tools 5.3.0.Beta2

import java.util.HashSet;
import java.util.Set;

/**
 * Aoks generated by hbm2java
 */
public class Aoks implements java.io.Serializable {

	private int aoksid;
	private Home home;
	private Kids kids;
	private String aoksname;
	private Set amazoneseriesdetails = new HashSet(0);

	public Aoks() {
	}

	public Aoks(int aoksid) {
		this.aoksid = aoksid;
	}

	public Aoks(int aoksid, Home home, Kids kids, String aoksname, Set amazoneseriesdetails) {
		this.aoksid = aoksid;
		this.home = home;
		this.kids = kids;
		this.aoksname = aoksname;
		this.amazoneseriesdetails = amazoneseriesdetails;
	}

	public int getAoksid() {
		return this.aoksid;
	}

	public void setAoksid(int aoksid) {
		this.aoksid = aoksid;
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

	public String getAoksname() {
		return this.aoksname;
	}

	public void setAoksname(String aoksname) {
		this.aoksname = aoksname;
	}

	public Set getAmazoneseriesdetails() {
		return this.amazoneseriesdetails;
	}

	public void setAmazoneseriesdetails(Set amazoneseriesdetails) {
		this.amazoneseriesdetails = amazoneseriesdetails;
	}

}
