package deep;
// Generated Nov 26, 2019 3:55:57 PM by Hibernate Tools 5.3.0.Beta2

import java.util.HashSet;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User implements java.io.Serializable {

	private int uid;
	private String uname;
	private Set kidses = new HashSet(0);
	private Set youwatchlists = new HashSet(0);
	private Set watchanywheres = new HashSet(0);
	private Set tvShowses = new HashSet(0);
	private Set homes = new HashSet(0);
	private Set signouts = new HashSet(0);
	private Set helps = new HashSet(0);
	private Set movies = new HashSet(0);
	private Set accountsettings = new HashSet(0);
	private Set accountsetting1s = new HashSet(0);

	public User() {
	}

	public User(int uid) {
		this.uid = uid;
	}

	public User(int uid, String uname, Set kidses, Set youwatchlists, Set watchanywheres, Set tvShowses, Set homes,
			Set signouts, Set helps, Set movies, Set accountsettings, Set accountsetting1s) {
		this.uid = uid;
		this.uname = uname;
		this.kidses = kidses;
		this.youwatchlists = youwatchlists;
		this.watchanywheres = watchanywheres;
		this.tvShowses = tvShowses;
		this.homes = homes;
		this.signouts = signouts;
		this.helps = helps;
		this.movies = movies;
		this.accountsettings = accountsettings;
		this.accountsetting1s = accountsetting1s;
	}

	public int getUid() {
		return this.uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public Set getKidses() {
		return this.kidses;
	}

	public void setKidses(Set kidses) {
		this.kidses = kidses;
	}

	public Set getYouwatchlists() {
		return this.youwatchlists;
	}

	public void setYouwatchlists(Set youwatchlists) {
		this.youwatchlists = youwatchlists;
	}

	public Set getWatchanywheres() {
		return this.watchanywheres;
	}

	public void setWatchanywheres(Set watchanywheres) {
		this.watchanywheres = watchanywheres;
	}

	public Set getTvShowses() {
		return this.tvShowses;
	}

	public void setTvShowses(Set tvShowses) {
		this.tvShowses = tvShowses;
	}

	public Set getHomes() {
		return this.homes;
	}

	public void setHomes(Set homes) {
		this.homes = homes;
	}

	public Set getSignouts() {
		return this.signouts;
	}

	public void setSignouts(Set signouts) {
		this.signouts = signouts;
	}

	public Set getHelps() {
		return this.helps;
	}

	public void setHelps(Set helps) {
		this.helps = helps;
	}

	public Set getMovies() {
		return this.movies;
	}

	public void setMovies(Set movies) {
		this.movies = movies;
	}

	public Set getAccountsettings() {
		return this.accountsettings;
	}

	public void setAccountsettings(Set accountsettings) {
		this.accountsettings = accountsettings;
	}

	public Set getAccountsetting1s() {
		return this.accountsetting1s;
	}

	public void setAccountsetting1s(Set accountsetting1s) {
		this.accountsetting1s = accountsetting1s;
	}

}
