// default package
// Generated Nov 26, 2019 1:35:49 PM by Hibernate Tools 4.0.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Comedymovie generated by hbm2java
 */
public class Comedymovie implements java.io.Serializable {

	private int comedymovieid;
	private Home home;
	private Movie movie;
	private String comedymoviename;
	private Set<Comedymoviedetail> comedymoviedetails = new HashSet<Comedymoviedetail>(0);

	public Comedymovie() {
	}

	public Comedymovie(int comedymovieid) {
		this.comedymovieid = comedymovieid;
	}

	public Comedymovie(int comedymovieid, Home home, Movie movie, String comedymoviename,
			Set<Comedymoviedetail> comedymoviedetails) {
		this.comedymovieid = comedymovieid;
		this.home = home;
		this.movie = movie;
		this.comedymoviename = comedymoviename;
		this.comedymoviedetails = comedymoviedetails;
	}

	public int getComedymovieid() {
		return this.comedymovieid;
	}

	public void setComedymovieid(int comedymovieid) {
		this.comedymovieid = comedymovieid;
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

	public String getComedymoviename() {
		return this.comedymoviename;
	}

	public void setComedymoviename(String comedymoviename) {
		this.comedymoviename = comedymoviename;
	}

	public Set<Comedymoviedetail> getComedymoviedetails() {
		return this.comedymoviedetails;
	}

	public void setComedymoviedetails(Set<Comedymoviedetail> comedymoviedetails) {
		this.comedymoviedetails = comedymoviedetails;
	}

}
