// default package
// Generated Nov 26, 2019 1:29:33 PM by Hibernate Tools 4.0.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Movie generated by hbm2java
 */
@Entity
@Table(name = "movie", catalog = "amazoneprime")
public class Movie implements java.io.Serializable {

	private int moviesid;
	private User user;
	private String moviesname;
	private Set<Thrillermovie> thrillermovies = new HashSet<Thrillermovie>(0);
	private Set<Dramamovie> dramamovies = new HashSet<Dramamovie>(0);
	private Set<Comedymovie> comedymovies = new HashSet<Comedymovie>(0);

	public Movie() {
	}

	public Movie(int moviesid) {
		this.moviesid = moviesid;
	}

	public Movie(int moviesid, User user, String moviesname, Set<Thrillermovie> thrillermovies,
			Set<Dramamovie> dramamovies, Set<Comedymovie> comedymovies) {
		this.moviesid = moviesid;
		this.user = user;
		this.moviesname = moviesname;
		this.thrillermovies = thrillermovies;
		this.dramamovies = dramamovies;
		this.comedymovies = comedymovies;
	}

	@Id

	@Column(name = "moviesid", unique = true, nullable = false)
	public int getMoviesid() {
		return this.moviesid;
	}

	public void setMoviesid(int moviesid) {
		this.moviesid = moviesid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userid_fk")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "moviesname")
	public String getMoviesname() {
		return this.moviesname;
	}

	public void setMoviesname(String moviesname) {
		this.moviesname = moviesname;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "movie")
	public Set<Thrillermovie> getThrillermovies() {
		return this.thrillermovies;
	}

	public void setThrillermovies(Set<Thrillermovie> thrillermovies) {
		this.thrillermovies = thrillermovies;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "movie")
	public Set<Dramamovie> getDramamovies() {
		return this.dramamovies;
	}

	public void setDramamovies(Set<Dramamovie> dramamovies) {
		this.dramamovies = dramamovies;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "movie")
	public Set<Comedymovie> getComedymovies() {
		return this.comedymovies;
	}

	public void setComedymovies(Set<Comedymovie> comedymovies) {
		this.comedymovies = comedymovies;
	}

}