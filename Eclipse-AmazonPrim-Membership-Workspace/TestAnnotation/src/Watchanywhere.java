// default package
// Generated Nov 26, 2019 1:40:31 PM by Hibernate Tools 4.0.1.Final

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
 * Watchanywhere generated by hbm2java
 */
@Entity
@Table(name = "watchanywhere", catalog = "amazoneprime")
public class Watchanywhere implements java.io.Serializable {

	private int watchanywhereid;
	private User user;
	private String watchanywherename;
	private Set<Watchanywheredetail> watchanywheredetails = new HashSet<Watchanywheredetail>(0);

	public Watchanywhere() {
	}

	public Watchanywhere(int watchanywhereid) {
		this.watchanywhereid = watchanywhereid;
	}

	public Watchanywhere(int watchanywhereid, User user, String watchanywherename,
			Set<Watchanywheredetail> watchanywheredetails) {
		this.watchanywhereid = watchanywhereid;
		this.user = user;
		this.watchanywherename = watchanywherename;
		this.watchanywheredetails = watchanywheredetails;
	}

	@Id

	@Column(name = "watchanywhereid", unique = true, nullable = false)
	public int getWatchanywhereid() {
		return this.watchanywhereid;
	}

	public void setWatchanywhereid(int watchanywhereid) {
		this.watchanywhereid = watchanywhereid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userid_fk")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "watchanywherename")
	public String getWatchanywherename() {
		return this.watchanywherename;
	}

	public void setWatchanywherename(String watchanywherename) {
		this.watchanywherename = watchanywherename;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "watchanywhere")
	public Set<Watchanywheredetail> getWatchanywheredetails() {
		return this.watchanywheredetails;
	}

	public void setWatchanywheredetails(Set<Watchanywheredetail> watchanywheredetails) {
		this.watchanywheredetails = watchanywheredetails;
	}

}
