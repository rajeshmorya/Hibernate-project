package hhh;
// Generated Nov 26, 2019 4:14:27 PM by Hibernate Tools 5.3.0.Beta2

import java.util.HashSet;
import java.util.Set;

/**
 * Home generated by hbm2java
 */
public class Home implements java.io.Serializable {

	private int homeid;
	private User user;
	private String homename;
	private Set kidsFamilies = new HashSet(0);
	private Set dramamovies = new HashSet(0);
	private Set throwbacks = new HashSet(0);
	private Set actionadventures = new HashSet(0);
	private Set comedymovies = new HashSet(0);
	private Set aokses = new HashSet(0);
	private Set treandings = new HashSet(0);
	private Set thrillermovies = new HashSet(0);
	private Set kidsFamilytvs = new HashSet(0);

	public Home() {
	}

	public Home(int homeid) {
		this.homeid = homeid;
	}

	public Home(int homeid, User user, String homename, Set kidsFamilies, Set dramamovies, Set throwbacks,
			Set actionadventures, Set comedymovies, Set aokses, Set treandings, Set thrillermovies, Set kidsFamilytvs) {
		this.homeid = homeid;
		this.user = user;
		this.homename = homename;
		this.kidsFamilies = kidsFamilies;
		this.dramamovies = dramamovies;
		this.throwbacks = throwbacks;
		this.actionadventures = actionadventures;
		this.comedymovies = comedymovies;
		this.aokses = aokses;
		this.treandings = treandings;
		this.thrillermovies = thrillermovies;
		this.kidsFamilytvs = kidsFamilytvs;
	}

	public int getHomeid() {
		return this.homeid;
	}

	public void setHomeid(int homeid) {
		this.homeid = homeid;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getHomename() {
		return this.homename;
	}

	public void setHomename(String homename) {
		this.homename = homename;
	}

	public Set getKidsFamilies() {
		return this.kidsFamilies;
	}

	public void setKidsFamilies(Set kidsFamilies) {
		this.kidsFamilies = kidsFamilies;
	}

	public Set getDramamovies() {
		return this.dramamovies;
	}

	public void setDramamovies(Set dramamovies) {
		this.dramamovies = dramamovies;
	}

	public Set getThrowbacks() {
		return this.throwbacks;
	}

	public void setThrowbacks(Set throwbacks) {
		this.throwbacks = throwbacks;
	}

	public Set getActionadventures() {
		return this.actionadventures;
	}

	public void setActionadventures(Set actionadventures) {
		this.actionadventures = actionadventures;
	}

	public Set getComedymovies() {
		return this.comedymovies;
	}

	public void setComedymovies(Set comedymovies) {
		this.comedymovies = comedymovies;
	}

	public Set getAokses() {
		return this.aokses;
	}

	public void setAokses(Set aokses) {
		this.aokses = aokses;
	}

	public Set getTreandings() {
		return this.treandings;
	}

	public void setTreandings(Set treandings) {
		this.treandings = treandings;
	}

	public Set getThrillermovies() {
		return this.thrillermovies;
	}

	public void setThrillermovies(Set thrillermovies) {
		this.thrillermovies = thrillermovies;
	}

	public Set getKidsFamilytvs() {
		return this.kidsFamilytvs;
	}

	public void setKidsFamilytvs(Set kidsFamilytvs) {
		this.kidsFamilytvs = kidsFamilytvs;
	}

}