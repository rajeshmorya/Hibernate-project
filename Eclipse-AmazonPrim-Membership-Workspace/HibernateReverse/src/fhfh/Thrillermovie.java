package fhfh;
// Generated Nov 26, 2019 3:59:58 PM by Hibernate Tools 5.3.0.Beta2

import java.util.HashSet;
import java.util.Set;

/**
 * Thrillermovie generated by hbm2java
 */
public class Thrillermovie implements java.io.Serializable {

	private int thrillermovieid;
	private Home home;
	private Movie movie;
	private String thrillermoviename;
	private Set thrillermoviedetails = new HashSet(0);

	public Thrillermovie() {
	}

	public Thrillermovie(int thrillermovieid) {
		this.thrillermovieid = thrillermovieid;
	}

	public Thrillermovie(int thrillermovieid, Home home, Movie movie, String thrillermoviename,
			Set thrillermoviedetails) {
		this.thrillermovieid = thrillermovieid;
		this.home = home;
		this.movie = movie;
		this.thrillermoviename = thrillermoviename;
		this.thrillermoviedetails = thrillermoviedetails;
	}

	public int getThrillermovieid() {
		return this.thrillermovieid;
	}

	public void setThrillermovieid(int thrillermovieid) {
		this.thrillermovieid = thrillermovieid;
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

	public String getThrillermoviename() {
		return this.thrillermoviename;
	}

	public void setThrillermoviename(String thrillermoviename) {
		this.thrillermoviename = thrillermoviename;
	}

	public Set getThrillermoviedetails() {
		return this.thrillermoviedetails;
	}

	public void setThrillermoviedetails(Set thrillermoviedetails) {
		this.thrillermoviedetails = thrillermoviedetails;
	}

}
