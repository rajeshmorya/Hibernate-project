package deep;
// Generated Nov 26, 2019 3:55:57 PM by Hibernate Tools 5.3.0.Beta2

/**
 * Comedymoviedetail generated by hbm2java
 */
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

	public int getComedyMoviedetailid() {
		return this.comedyMoviedetailid;
	}

	public void setComedyMoviedetailid(int comedyMoviedetailid) {
		this.comedyMoviedetailid = comedyMoviedetailid;
	}

	public Comedymovie getComedymovie() {
		return this.comedymovie;
	}

	public void setComedymovie(Comedymovie comedymovie) {
		this.comedymovie = comedymovie;
	}

	public String getComedyMoviedetailname() {
		return this.comedyMoviedetailname;
	}

	public void setComedyMoviedetailname(String comedyMoviedetailname) {
		this.comedyMoviedetailname = comedyMoviedetailname;
	}

}
