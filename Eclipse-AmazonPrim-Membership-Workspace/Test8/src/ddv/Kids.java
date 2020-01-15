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
 * Kids generated by hbm2java
 */
@Entity
@Table(name = "kids", catalog = "amazoneprime")
public class Kids implements java.io.Serializable {

	private int kidsid;
	private User user;
	private String kidsname;
	private Set kidsFamilies = new HashSet(0);
	private Set kidsFamilytvs = new HashSet(0);
	private Set aokses = new HashSet(0);

	public Kids() {
	}

	public Kids(int kidsid) {
		this.kidsid = kidsid;
	}

	public Kids(int kidsid, User user, String kidsname, Set kidsFamilies, Set kidsFamilytvs, Set aokses) {
		this.kidsid = kidsid;
		this.user = user;
		this.kidsname = kidsname;
		this.kidsFamilies = kidsFamilies;
		this.kidsFamilytvs = kidsFamilytvs;
		this.aokses = aokses;
	}

	@Id

	@Column(name = "kidsid", unique = true, nullable = false)
	public int getKidsid() {
		return this.kidsid;
	}

	public void setKidsid(int kidsid) {
		this.kidsid = kidsid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userid_fk")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "kidsname")
	public String getKidsname() {
		return this.kidsname;
	}

	public void setKidsname(String kidsname) {
		this.kidsname = kidsname;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "kids")
	public Set getKidsFamilies() {
		return this.kidsFamilies;
	}

	public void setKidsFamilies(Set kidsFamilies) {
		this.kidsFamilies = kidsFamilies;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "kids")
	public Set getKidsFamilytvs() {
		return this.kidsFamilytvs;
	}

	public void setKidsFamilytvs(Set kidsFamilytvs) {
		this.kidsFamilytvs = kidsFamilytvs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "kids")
	public Set getAokses() {
		return this.aokses;
	}

	public void setAokses(Set aokses) {
		this.aokses = aokses;
	}

}
