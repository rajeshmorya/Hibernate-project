package dbb;
// Generated Nov 26, 2019 4:03:20 PM by Hibernate Tools 5.3.0.Beta2

import java.util.HashSet;
import java.util.Set;

/**
 * Actionadventure generated by hbm2java
 */
public class Actionadventure implements java.io.Serializable {

	private int actionAdventureid;
	private Home home;
	private TvShows tvShows;
	private String actionAdventurename;
	private Set actionAdventuretvdetails = new HashSet(0);

	public Actionadventure() {
	}

	public Actionadventure(int actionAdventureid) {
		this.actionAdventureid = actionAdventureid;
	}

	public Actionadventure(int actionAdventureid, Home home, TvShows tvShows, String actionAdventurename,
			Set actionAdventuretvdetails) {
		this.actionAdventureid = actionAdventureid;
		this.home = home;
		this.tvShows = tvShows;
		this.actionAdventurename = actionAdventurename;
		this.actionAdventuretvdetails = actionAdventuretvdetails;
	}

	public int getActionAdventureid() {
		return this.actionAdventureid;
	}

	public void setActionAdventureid(int actionAdventureid) {
		this.actionAdventureid = actionAdventureid;
	}

	public Home getHome() {
		return this.home;
	}

	public void setHome(Home home) {
		this.home = home;
	}

	public TvShows getTvShows() {
		return this.tvShows;
	}

	public void setTvShows(TvShows tvShows) {
		this.tvShows = tvShows;
	}

	public String getActionAdventurename() {
		return this.actionAdventurename;
	}

	public void setActionAdventurename(String actionAdventurename) {
		this.actionAdventurename = actionAdventurename;
	}

	public Set getActionAdventuretvdetails() {
		return this.actionAdventuretvdetails;
	}

	public void setActionAdventuretvdetails(Set actionAdventuretvdetails) {
		this.actionAdventuretvdetails = actionAdventuretvdetails;
	}

}