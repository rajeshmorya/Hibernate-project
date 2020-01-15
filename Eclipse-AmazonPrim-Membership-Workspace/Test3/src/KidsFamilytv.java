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
 * KidsFamilytv generated by hbm2java
 */
@Entity
@Table(name = "kids_familytv", catalog = "amazoneprime")
public class KidsFamilytv implements java.io.Serializable {

	private int kidsFamilytvid;
	private Kids kids;
	private Home home;
	private String kidsFamilytvname;
	private Set<KidsFamilytvdetail> kidsFamilytvdetails = new HashSet<KidsFamilytvdetail>(0);

	public KidsFamilytv() {
	}

	public KidsFamilytv(int kidsFamilytvid) {
		this.kidsFamilytvid = kidsFamilytvid;
	}

	public KidsFamilytv(int kidsFamilytvid, Kids kids, Home home, String kidsFamilytvname,
			Set<KidsFamilytvdetail> kidsFamilytvdetails) {
		this.kidsFamilytvid = kidsFamilytvid;
		this.kids = kids;
		this.home = home;
		this.kidsFamilytvname = kidsFamilytvname;
		this.kidsFamilytvdetails = kidsFamilytvdetails;
	}

	@Id

	@Column(name = "kids_familytvid", unique = true, nullable = false)
	public int getKidsFamilytvid() {
		return this.kidsFamilytvid;
	}

	public void setKidsFamilytvid(int kidsFamilytvid) {
		this.kidsFamilytvid = kidsFamilytvid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "kidsid_fk")
	public Kids getKids() {
		return this.kids;
	}

	public void setKids(Kids kids) {
		this.kids = kids;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "homeid_fk")
	public Home getHome() {
		return this.home;
	}

	public void setHome(Home home) {
		this.home = home;
	}

	@Column(name = "kids_familytvname")
	public String getKidsFamilytvname() {
		return this.kidsFamilytvname;
	}

	public void setKidsFamilytvname(String kidsFamilytvname) {
		this.kidsFamilytvname = kidsFamilytvname;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "kidsFamilytv")
	public Set<KidsFamilytvdetail> getKidsFamilytvdetails() {
		return this.kidsFamilytvdetails;
	}

	public void setKidsFamilytvdetails(Set<KidsFamilytvdetail> kidsFamilytvdetails) {
		this.kidsFamilytvdetails = kidsFamilytvdetails;
	}

}
