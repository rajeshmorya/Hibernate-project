// default package
// Generated Nov 26, 2019 1:28:02 PM by Hibernate Tools 4.0.1.Final

/**
 * Amazoneseriesdetail generated by hbm2java
 */
public class Amazoneseriesdetail implements java.io.Serializable {

	private int amazoneSeriesid;
	private Aoks aoks;
	private String amazoneSeriesname;

	public Amazoneseriesdetail() {
	}

	public Amazoneseriesdetail(int amazoneSeriesid) {
		this.amazoneSeriesid = amazoneSeriesid;
	}

	public Amazoneseriesdetail(int amazoneSeriesid, Aoks aoks, String amazoneSeriesname) {
		this.amazoneSeriesid = amazoneSeriesid;
		this.aoks = aoks;
		this.amazoneSeriesname = amazoneSeriesname;
	}

	public int getAmazoneSeriesid() {
		return this.amazoneSeriesid;
	}

	public void setAmazoneSeriesid(int amazoneSeriesid) {
		this.amazoneSeriesid = amazoneSeriesid;
	}

	public Aoks getAoks() {
		return this.aoks;
	}

	public void setAoks(Aoks aoks) {
		this.aoks = aoks;
	}

	public String getAmazoneSeriesname() {
		return this.amazoneSeriesname;
	}

	public void setAmazoneSeriesname(String amazoneSeriesname) {
		this.amazoneSeriesname = amazoneSeriesname;
	}

}
