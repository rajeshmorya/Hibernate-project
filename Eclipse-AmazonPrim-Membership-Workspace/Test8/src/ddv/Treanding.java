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
 * Treanding generated by hbm2java
 */
@Entity
@Table(name = "treanding", catalog = "amazoneprime")
public class Treanding implements java.io.Serializable {

	private int treandingtvid;
	private Home home;
	private TvShows tvShows;
	private String treandingtvname;
	private Set treandingtvdetails = new HashSet(0);

	public Treanding() {
	}

	public Treanding(int treandingtvid) {
		this.treandingtvid = treandingtvid;
	}

	public Treanding(int treandingtvid, Home home, TvShows tvShows, String treandingtvname, Set treandingtvdetails) {
		this.treandingtvid = treandingtvid;
		this.home = home;
		this.tvShows = tvShows;
		this.treandingtvname = treandingtvname;
		this.treandingtvdetails = treandingtvdetails;
	}

	@Id

	@Column(name = "treandingtvid", unique = true, nullable = false)
	public int getTreandingtvid() {
		return this.treandingtvid;
	}

	public void setTreandingtvid(int treandingtvid) {
		this.treandingtvid = treandingtvid;
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
	@JoinColumn(name = "tvshowid_fk")
	public TvShows getTvShows() {
		return this.tvShows;
	}

	public void setTvShows(TvShows tvShows) {
		this.tvShows = tvShows;
	}

	@Column(name = "treandingtvname")
	public String getTreandingtvname() {
		return this.treandingtvname;
	}

	public void setTreandingtvname(String treandingtvname) {
		this.treandingtvname = treandingtvname;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "treanding")
	public Set getTreandingtvdetails() {
		return this.treandingtvdetails;
	}

	public void setTreandingtvdetails(Set treandingtvdetails) {
		this.treandingtvdetails = treandingtvdetails;
	}

}
