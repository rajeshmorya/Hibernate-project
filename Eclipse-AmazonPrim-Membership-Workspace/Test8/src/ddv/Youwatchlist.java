package ddv;
// Generated Nov 26, 2019 5:43:21 PM by Hibernate Tools 5.0.6.Final

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Youwatchlist generated by hbm2java
 */
@Entity
@Table(name = "youwatchlist", catalog = "amazoneprime")
public class Youwatchlist implements java.io.Serializable {

	private int ywlid;
	private User user;
	private String ywlname;
	private Set watchdetails = new HashSet(0);

	public Youwatchlist() {
	}

	public Youwatchlist(int ywlid) {
		this.ywlid = ywlid;
	}

	public Youwatchlist(int ywlid, User user, String ywlname, Set watchdetails) {
		this.ywlid = ywlid;
		this.user = user;
		this.ywlname = ywlname;
		this.watchdetails = watchdetails;
	}

	@Id

	@Column(name = "ywlid", unique = true, nullable = false)
	public int getYwlid() {
		return this.ywlid;
	}

	public void setYwlid(int ywlid) {
		this.ywlid = ywlid;
	}

	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity=User.class)
	@JoinColumn(name = "userid_fk")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "ywlname")
	public String getYwlname() {
		return this.ywlname;
	}

	public void setYwlname(String ywlname) {
		this.ywlname = ywlname;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "youwatchlist",targetEntity=Watchdetail.class)
	public Set getWatchdetails() {
		return this.watchdetails;
	}

	public void setWatchdetails(Set watchdetails) {
		this.watchdetails = watchdetails;
	}

}