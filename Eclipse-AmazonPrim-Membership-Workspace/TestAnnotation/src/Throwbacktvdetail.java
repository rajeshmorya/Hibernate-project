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
 * Throwbacktvdetail generated by hbm2java
 */
@Entity
@Table(name = "throwbacktvdetail", catalog = "amazoneprime")
public class Throwbacktvdetail implements java.io.Serializable {

	private int throwbacktvdetailid;
	private Throwback throwback;
	private String throwbacktvdetailname;

	public Throwbacktvdetail() {
	}

	public Throwbacktvdetail(int throwbacktvdetailid) {
		this.throwbacktvdetailid = throwbacktvdetailid;
	}

	public Throwbacktvdetail(int throwbacktvdetailid, Throwback throwback, String throwbacktvdetailname) {
		this.throwbacktvdetailid = throwbacktvdetailid;
		this.throwback = throwback;
		this.throwbacktvdetailname = throwbacktvdetailname;
	}

	@Id

	@Column(name = "throwbacktvdetailid", unique = true, nullable = false)
	public int getThrowbacktvdetailid() {
		return this.throwbacktvdetailid;
	}

	public void setThrowbacktvdetailid(int throwbacktvdetailid) {
		this.throwbacktvdetailid = throwbacktvdetailid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "throwbackTVid_fk")
	public Throwback getThrowback() {
		return this.throwback;
	}

	public void setThrowback(Throwback throwback) {
		this.throwback = throwback;
	}

	@Column(name = "throwbacktvdetailname")
	public String getThrowbacktvdetailname() {
		return this.throwbacktvdetailname;
	}

	public void setThrowbacktvdetailname(String throwbacktvdetailname) {
		this.throwbacktvdetailname = throwbacktvdetailname;
	}

}
