package dbb;
// Generated Nov 26, 2019 4:03:20 PM by Hibernate Tools 5.3.0.Beta2

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
	private Set dramamoviedetails = new HashSet(0);

	public Dramamovie() {
	}

	public Dramamovie(int dramamoviesid) {
		this.dramamoviesid = dramamoviesid;
	}

	public Dramamovie(int dramamoviesid, Home home, Movie movie, String dramamoviesname, Set dramamoviedetails) {
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

	public Set getDramamoviedetails() {
		return this.dramamoviedetails;
	}

	public void setDramamoviedetails(Set dramamoviedetails) {
		this.dramamoviedetails = dramamoviedetails;
	}

}