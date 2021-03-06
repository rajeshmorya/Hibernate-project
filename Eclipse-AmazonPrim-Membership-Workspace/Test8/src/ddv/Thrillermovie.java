package ddv;
// Generated Nov 26, 2019 5:43:21 PM by Hibernate Tools 5.0.6.Final

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
 * Thrillermovie generated by hbm2java
 */
@Entity
@Table(name = "thrillermovie", catalog = "amazoneprime")
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

	@Id

	@Column(name = "thrillermovieid", unique = true, nullable = false)
	public int getThrillermovieid() {
		return this.thrillermovieid;
	}

	public void setThrillermovieid(int thrillermovieid) {
		this.thrillermovieid = thrillermovieid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "homeid_fk")
	public Home getHome() {
		return this.home;
	}

	public void setHome(Home home) {
		this.home = home;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "moviesid_fk")
	public Movie getMovie() {
		return this.movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	@Column(name = "thrillermoviename")
	public String getThrillermoviename() {
		return this.thrillermoviename;
	}

	public void setThrillermoviename(String thrillermoviename) {
		this.thrillermoviename = thrillermoviename;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "thrillermovie")
	public Set getThrillermoviedetails() {
		return this.thrillermoviedetails;
	}

	public void setThrillermoviedetails(Set thrillermoviedetails) {
		this.thrillermoviedetails = thrillermoviedetails;
	}

}
