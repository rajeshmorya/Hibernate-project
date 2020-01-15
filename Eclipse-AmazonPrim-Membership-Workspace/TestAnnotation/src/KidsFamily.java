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
 * KidsFamily generated by hbm2java
 */
@Entity
@Table(name = "kids_family", catalog = "amazoneprime")
public class KidsFamily implements java.io.Serializable {

	private int kidsFamilyMovieid;
	private Kids kids;
	private Home home;
	private String kidsFamilyMoviename;
	private Set<Kidsfamilymoviedetail> kidsfamilymoviedetails = new HashSet<Kidsfamilymoviedetail>(0);

	public KidsFamily() {
	}

	public KidsFamily(int kidsFamilyMovieid) {
		this.kidsFamilyMovieid = kidsFamilyMovieid;
	}

	public KidsFamily(int kidsFamilyMovieid, Kids kids, Home home, String kidsFamilyMoviename,
			Set<Kidsfamilymoviedetail> kidsfamilymoviedetails) {
		this.kidsFamilyMovieid = kidsFamilyMovieid;
		this.kids = kids;
		this.home = home;
		this.kidsFamilyMoviename = kidsFamilyMoviename;
		this.kidsfamilymoviedetails = kidsfamilymoviedetails;
	}

	@Id

	@Column(name = "kids_familyMovieid", unique = true, nullable = false)
	public int getKidsFamilyMovieid() {
		return this.kidsFamilyMovieid;
	}

	public void setKidsFamilyMovieid(int kidsFamilyMovieid) {
		this.kidsFamilyMovieid = kidsFamilyMovieid;
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

	@Column(name = "kids_familyMoviename")
	public String getKidsFamilyMoviename() {
		return this.kidsFamilyMoviename;
	}

	public void setKidsFamilyMoviename(String kidsFamilyMoviename) {
		this.kidsFamilyMoviename = kidsFamilyMoviename;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "kidsFamily")
	public Set<Kidsfamilymoviedetail> getKidsfamilymoviedetails() {
		return this.kidsfamilymoviedetails;
	}

	public void setKidsfamilymoviedetails(Set<Kidsfamilymoviedetail> kidsfamilymoviedetails) {
		this.kidsfamilymoviedetails = kidsfamilymoviedetails;
	}

}
