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
 * Dramamoviedetail generated by hbm2java
 */
@Entity
@Table(name = "dramamoviedetail", catalog = "amazoneprime")
public class Dramamoviedetail implements java.io.Serializable {

	private int dramamoviedetailid;
	private Dramamovie dramamovie;
	private String dramamoviedetailname;

	public Dramamoviedetail() {
	}

	public Dramamoviedetail(int dramamoviedetailid) {
		this.dramamoviedetailid = dramamoviedetailid;
	}

	public Dramamoviedetail(int dramamoviedetailid, Dramamovie dramamovie, String dramamoviedetailname) {
		this.dramamoviedetailid = dramamoviedetailid;
		this.dramamovie = dramamovie;
		this.dramamoviedetailname = dramamoviedetailname;
	}

	@Id

	@Column(name = "dramamoviedetailid", unique = true, nullable = false)
	public int getDramamoviedetailid() {
		return this.dramamoviedetailid;
	}

	public void setDramamoviedetailid(int dramamoviedetailid) {
		this.dramamoviedetailid = dramamoviedetailid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dramamoviesid_fk")
	public Dramamovie getDramamovie() {
		return this.dramamovie;
	}

	public void setDramamovie(Dramamovie dramamovie) {
		this.dramamovie = dramamovie;
	}

	@Column(name = "dramamoviedetailname")
	public String getDramamoviedetailname() {
		return this.dramamoviedetailname;
	}

	public void setDramamoviedetailname(String dramamoviedetailname) {
		this.dramamoviedetailname = dramamoviedetailname;
	}

}
