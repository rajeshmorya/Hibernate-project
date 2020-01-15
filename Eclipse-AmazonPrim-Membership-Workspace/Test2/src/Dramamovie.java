// default package
// Generated Nov 26, 2019 1:28:02 PM by Hibernate Tools 4.0.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Dramamovie generated by hbm2java
 */
public class Dramamovie implements java.io.Serializable {

	private int dramamoviesid;
	private Home home;
	private Movie movie;
	private String dramamoviesname;
	private Set<Dramamoviedetail> dramamoviedetails = new HashSet<Dramamoviedetail>(0);

	public Dramamovie() {
	}

	public Dramamovie(int dramamoviesid) {
		this.dramamoviesid = dramamoviesid;
	}

	public Dramamovie(int dramamoviesid, Home home, Movie movie, String dramamoviesname,
			Set<Dramamoviedetail> dramamoviedetails) {
		this.dramamoviesid = dramamoviesid;
		this.home = home;
		this.movie = movie;
		this.dramamoviesname = dramamoviesname;
		this.dramamoviedetails = dramamoviedetails;
	}

	public int getDramamoviesid() {
		return this.dramamoviesid;
	}

	public void setDramamoviesid(int dramamoviesid) {
		this.dramamoviesid = dramamoviesid;
	}

	public Home getHome() {
		return this.home;
	}

	public void setHome(Home home) {
		this.home = home;
	}

	public Movie getMovie() {
		return this.movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public String getDramamoviesname() {
		return this.dramamoviesname;
	}

	public void setDramamoviesname(String dramamoviesname) {
		this.dramamoviesname = dramamoviesname;
	}

	public Set<Dramamoviedetail> getDramamoviedetails() {
		return this.dramamoviedetails;
	}

	public void setDramamoviedetails(Set<Dramamoviedetail> dramamoviedetails) {
		this.dramamoviedetails = dramamoviedetails;
	}

}
