// default package
// Generated Nov 26, 2019 1:10:25 PM by Hibernate Tools 4.0.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Actionadventure generated by hbm2java
 */
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

	public int getActionAdventureid() {
		return this.actionAdventureid;
	}

	public void setActionAdventureid(int actionAdventureid) {
		this.actionAdventureid = actionAdventureid;
	}

	public TvShows getTvShows() {
		return this.tvShows;
	}

	public void setTvShows(TvShows tvShows) {
		this.tvShows = tvShows;
	}

	public Home getHome() {
		return this.home;
	}

	public void setHome(Home home) {
		this.home = home;
	}

	public String getActionAdventurename() {
		return this.actionAdventurename;
	}

	public void setActionAdventurename(String actionAdventurename) {
		this.actionAdventurename = actionAdventurename;
	}

	public Set<ActionAdventuretvdetail> getActionAdventuretvdetails() {
		return this.actionAdventuretvdetails;
	}

	public void setActionAdventuretvdetails(Set<ActionAdventuretvdetail> actionAdventuretvdetails) {
		this.actionAdventuretvdetails = actionAdventuretvdetails;
	}

}
