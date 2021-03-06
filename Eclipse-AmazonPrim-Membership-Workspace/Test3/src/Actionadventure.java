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
 * Actionadventure generated by hbm2java
 */
@Entity
@Table(name = "actionadventure", catalog = "amazoneprime")
public class Actionadventure implements java.io.Serializable {

	private int actionAdventureid;
	private TvShows tvShows;
	private Home home;
	private String actionAdventurename;
	private Set<ActionAdventuretvdetail> actionAdventuretvdetails = new HashSet<ActionAdventuretvdetail>(0);

	public Actionadventure() {
	}

	public Actionadventure(int actionAdventureid) {
		this.actionAdventureid = actionAdventureid;
	}

	public Actionadventure(int actionAdventureid, TvShows tvShows, Home home, String actionAdventurename,
			Set<ActionAdventuretvdetail> actionAdventuretvdetails) {
		this.actionAdventureid = actionAdventureid;
		this.tvShows = tvShows;
		this.home = home;
		this.actionAdventurename = actionAdventurename;
		this.actionAdventuretvdetails = actionAdventuretvdetails;
	}

	@Id

	@Column(name = "actionAdventureid", unique = true, nullable = false)
	public int getActionAdventureid() {
		return this.actionAdventureid;
	}

	public void setActionAdventureid(int actionAdventureid) {
		this.actionAdventureid = actionAdventureid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tvshowid_fk")
	public TvShows getTvShows() {
		return this.tvShows;
	}

	public void setTvShows(TvShows tvShows) {
		this.tvShows = tvShows;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "homeid_fk")
	public Home getHome() {
		return this.home;
	}

	public void setHome(Home home) {
		this.home = home;
	}

	@Column(name = "actionAdventurename")
	public String getActionAdventurename() {
		return this.actionAdventurename;
	}

	public void setActionAdventurename(String actionAdventurename) {
		this.actionAdventurename = actionAdventurename;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "actionadventure")
	public Set<ActionAdventuretvdetail> getActionAdventuretvdetails() {
		return this.actionAdventuretvdetails;
	}

	public void setActionAdventuretvdetails(Set<ActionAdventuretvdetail> actionAdventuretvdetails) {
		this.actionAdventuretvdetails = actionAdventuretvdetails;
	}

}
