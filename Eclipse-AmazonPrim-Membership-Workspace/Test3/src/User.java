// default package
// Generated Nov 26, 2019 1:29:33 PM by Hibernate Tools 4.0.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "amazoneprime")
public class User implements java.io.Serializable {

	private int uid;
	private String uname;
	private Set<Kids> kidses = new HashSet<Kids>(0);
	private Set<Youwatchlist> youwatchlists = new HashSet<Youwatchlist>(0);
	private Set<Watchanywhere> watchanywheres = new HashSet<Watchanywhere>(0);
	private Set<TvShows> tvShowses = new HashSet<TvShows>(0);
	private Set<Home> homes = new HashSet<Home>(0);
	private Set<Signout> signouts = new HashSet<Signout>(0);
	private Set<Help> helps = new HashSet<Help>(0);
	private Set<Movie> movies = new HashSet<Movie>(0);
	private Set<Accountsetting> accountsettings = new HashSet<Accountsetting>(0);
	private Set<Accountsetting1> accountsetting1s = new HashSet<Accountsetting1>(0);

	public User() {
	}

	public User(int uid) {
		this.uid = uid;
	}

	public User(int uid, String uname, Set<Kids> kidses, Set<Youwatchlist> youwatchlists,
			Set<Watchanywhere> watchanywheres, Set<TvShows> tvShowses, Set<Home> homes, Set<Signout> signouts,
			Set<Help> helps, Set<Movie> movies, Set<Accountsetting> accountsettings,
			Set<Accountsetting1> accountsetting1s) {
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

	@Id

	@Column(name = "uid", unique = true, nullable = false)
	public int getUid() {
		return this.uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	@Column(name = "uname")
	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Kids> getKidses() {
		return this.kidses;
	}

	public void setKidses(Set<Kids> kidses) {
		this.kidses = kidses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Youwatchlist> getYouwatchlists() {
		return this.youwatchlists;
	}

	public void setYouwatchlists(Set<Youwatchlist> youwatchlists) {
		this.youwatchlists = youwatchlists;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Watchanywhere> getWatchanywheres() {
		return this.watchanywheres;
	}

	public void setWatchanywheres(Set<Watchanywhere> watchanywheres) {
		this.watchanywheres = watchanywheres;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<TvShows> getTvShowses() {
		return this.tvShowses;
	}

	public void setTvShowses(Set<TvShows> tvShowses) {
		this.tvShowses = tvShowses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Home> getHomes() {
		return this.homes;
	}

	public void setHomes(Set<Home> homes) {
		this.homes = homes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Signout> getSignouts() {
		return this.signouts;
	}

	public void setSignouts(Set<Signout> signouts) {
		this.signouts = signouts;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Help> getHelps() {
		return this.helps;
	}

	public void setHelps(Set<Help> helps) {
		this.helps = helps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Movie> getMovies() {
		return this.movies;
	}

	public void setMovies(Set<Movie> movies) {
		this.movies = movies;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Accountsetting> getAccountsettings() {
		return this.accountsettings;
	}

	public void setAccountsettings(Set<Accountsetting> accountsettings) {
		this.accountsettings = accountsettings;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Accountsetting1> getAccountsetting1s() {
		return this.accountsetting1s;
	}

	public void setAccountsetting1s(Set<Accountsetting1> accountsetting1s) {
		this.accountsetting1s = accountsetting1s;
	}

}
