// default package
// Generated Nov 26, 2019 1:29:33 PM by Hibernate Tools 4.0.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Primevideopin generated by hbm2java
 */
@Entity
@Table(name = "primevideopin", catalog = "amazoneprime")
public class Primevideopin implements java.io.Serializable {

	private int primevideopinid;
	private Parentalcontrol parentalcontrol;
	private String primevideopinname;

	public Primevideopin() {
	}

	public Primevideopin(int primevideopinid) {
		this.primevideopinid = primevideopinid;
	}

	public Primevideopin(int primevideopinid, Parentalcontrol parentalcontrol, String primevideopinname) {
		this.primevideopinid = primevideopinid;
		this.parentalcontrol = parentalcontrol;
		this.primevideopinname = primevideopinname;
	}

	@Id

	@Column(name = "primevideopinid", unique = true, nullable = false)
	public int getPrimevideopinid() {
		return this.primevideopinid;
	}

	public void setPrimevideopinid(int primevideopinid) {
		this.primevideopinid = primevideopinid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parentalid_fk")
	public Parentalcontrol getParentalcontrol() {
		return this.parentalcontrol;
	}

	public void setParentalcontrol(Parentalcontrol parentalcontrol) {
		this.parentalcontrol = parentalcontrol;
	}

	@Column(name = "primevideopinname")
	public String getPrimevideopinname() {
		return this.primevideopinname;
	}

	public void setPrimevideopinname(String primevideopinname) {
		this.primevideopinname = primevideopinname;
	}

}
