package ddv;
// Generated Nov 26, 2019 5:43:21 PM by Hibernate Tools 5.0.6.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Comedymoviedetail generated by hbm2java
 */
@Entity
@Table(name = "comedymoviedetail", catalog = "amazoneprime")
public class Comedymoviedetail implements java.io.Serializable {

	private int comedyMoviedetailid;
	private Comedymovie comedymovie;
	private String comedyMoviedetailname;

	public Comedymoviedetail() {
	}

	public Comedymoviedetail(int comedyMoviedetailid) {
		this.comedyMoviedetailid = comedyMoviedetailid;
	}

	public Comedymoviedetail(int comedyMoviedetailid, Comedymovie comedymovie, String comedyMoviedetailname) {
		this.comedyMoviedetailid = comedyMoviedetailid;
		this.comedymovie = comedymovie;
		this.comedyMoviedetailname = comedyMoviedetailname;
	}

	@Id

	@Column(name = "comedyMoviedetailid", unique = true, nullable = false)
	public int getComedyMoviedetailid() {
		return this.comedyMoviedetailid;
	}

	public void setComedyMoviedetailid(int comedyMoviedetailid) {
		this.comedyMoviedetailid = comedyMoviedetailid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "comedymovieid_fk")
	public Comedymovie getComedymovie() {
		return this.comedymovie;
	}

	public void setComedymovie(Comedymovie comedymovie) {
		this.comedymovie = comedymovie;
	}

	@Column(name = "comedyMoviedetailname")
	public String getComedyMoviedetailname() {
		return this.comedyMoviedetailname;
	}

	public void setComedyMoviedetailname(String comedyMoviedetailname) {
		this.comedyMoviedetailname = comedyMoviedetailname;
	}

}
