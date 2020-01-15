// default package
// Generated Nov 26, 2019 1:40:31 PM by Hibernate Tools 4.0.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Kidsfamilymoviedetail generated by hbm2java
 */
@Entity
@Table(name = "kidsfamilymoviedetail", catalog = "amazoneprime")
public class Kidsfamilymoviedetail implements java.io.Serializable {

	private int kidsFamilyMovieDetailid;
	private KidsFamily kidsFamily;
	private String kidsFamilyMovieDetailname;

	public Kidsfamilymoviedetail() {
	}

	public Kidsfamilymoviedetail(int kidsFamilyMovieDetailid) {
		this.kidsFamilyMovieDetailid = kidsFamilyMovieDetailid;
	}

	public Kidsfamilymoviedetail(int kidsFamilyMovieDetailid, KidsFamily kidsFamily, String kidsFamilyMovieDetailname) {
		this.kidsFamilyMovieDetailid = kidsFamilyMovieDetailid;
		this.kidsFamily = kidsFamily;
		this.kidsFamilyMovieDetailname = kidsFamilyMovieDetailname;
	}

	@Id

	@Column(name = "kids_familyMovieDetailid", unique = true, nullable = false)
	public int getKidsFamilyMovieDetailid() {
		return this.kidsFamilyMovieDetailid;
	}

	public void setKidsFamilyMovieDetailid(int kidsFamilyMovieDetailid) {
		this.kidsFamilyMovieDetailid = kidsFamilyMovieDetailid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "kids_familyMovieid_fk")
	public KidsFamily getKidsFamily() {
		return this.kidsFamily;
	}

	public void setKidsFamily(KidsFamily kidsFamily) {
		this.kidsFamily = kidsFamily;
	}

	@Column(name = "kids_familyMovieDetailname")
	public String getKidsFamilyMovieDetailname() {
		return this.kidsFamilyMovieDetailname;
	}

	public void setKidsFamilyMovieDetailname(String kidsFamilyMovieDetailname) {
		this.kidsFamilyMovieDetailname = kidsFamilyMovieDetailname;
	}

}
