package deepak;
// Generated Nov 26, 2019 4:44:51 PM by Hibernate Tools 5.3.0.Beta2

/**
 * Dramamoviedetail generated by hbm2java
 */
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

	public int getDramamoviedetailid() {
		return this.dramamoviedetailid;
	}

	public void setDramamoviedetailid(int dramamoviedetailid) {
		this.dramamoviedetailid = dramamoviedetailid;
	}

	public Dramamovie getDramamovie() {
		return this.dramamovie;
	}

	public void setDramamovie(Dramamovie dramamovie) {
		this.dramamovie = dramamovie;
	}

	public String getDramamoviedetailname() {
		return this.dramamoviedetailname;
	}

	public void setDramamoviedetailname(String dramamoviedetailname) {
		this.dramamoviedetailname = dramamoviedetailname;
	}

}
