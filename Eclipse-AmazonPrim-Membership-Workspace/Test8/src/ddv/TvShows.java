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
 * TvShows generated by hbm2java
 */
@Entity
@Table(name = "tv_shows", catalog = "amazoneprime")
public class TvShows implements java.io.Serializable {

	private int tvshowid;
	private User user;
	private String tvshowname;
	private Set actionadventures = new HashSet(0);
	private Set throwbacks = new HashSet(0);
	private Set treandings = new HashSet(0);

	public TvShows() {
	}

	public TvShows(int tvshowid) {
		this.tvshowid = tvshowid;
	}

	public TvShows(int tvshowid, User user, String tvshowname, Set actionadventures, Set throwbacks, Set treandings) {
		this.tvshowid = tvshowid;
		this.user = user;
		this.tvshowname = tvshowname;
		this.actionadventures = actionadventures;
		this.throwbacks = throwbacks;
		this.treandings = treandings;
	}

	@Id

	@Column(name = "tvshowid", unique = true, nullable = false)
	public int getTvshowid() {
		return this.tvshowid;
	}

	public void setTvshowid(int tvshowid) {
		this.tvshowid = tvshowid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userid_fk")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "tvshowname")
	public String getTvshowname() {
		return this.tvshowname;
	}

	public void setTvshowname(String tvshowname) {
		this.tvshowname = tvshowname;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tvShows")
	public Set getActionadventures() {
		return this.actionadventures;
	}

	public void setActionadventures(Set actionadventures) {
		this.actionadventures = actionadventures;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tvShows")
	public Set getThrowbacks() {
		return this.throwbacks;
	}

	public void setThrowbacks(Set throwbacks) {
		this.throwbacks = throwbacks;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tvShows")
	public Set getTreandings() {
		return this.treandings;
	}

	public void setTreandings(Set treandings) {
		this.treandings = treandings;
	}

}
