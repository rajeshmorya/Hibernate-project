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
 * Helpdetail generated by hbm2java
 */
@Entity
@Table(name = "helpdetail", catalog = "amazoneprime")
public class Helpdetail implements java.io.Serializable {

	private int helpdetailid;
	private Help help;
	private String helpdetailname;

	public Helpdetail() {
	}

	public Helpdetail(int helpdetailid) {
		this.helpdetailid = helpdetailid;
	}

	public Helpdetail(int helpdetailid, Help help, String helpdetailname) {
		this.helpdetailid = helpdetailid;
		this.help = help;
		this.helpdetailname = helpdetailname;
	}

	@Id

	@Column(name = "helpdetailid", unique = true, nullable = false)
	public int getHelpdetailid() {
		return this.helpdetailid;
	}

	public void setHelpdetailid(int helpdetailid) {
		this.helpdetailid = helpdetailid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "helpid_fk")
	public Help getHelp() {
		return this.help;
	}

	public void setHelp(Help help) {
		this.help = help;
	}

	@Column(name = "helpdetailname")
	public String getHelpdetailname() {
		return this.helpdetailname;
	}

	public void setHelpdetailname(String helpdetailname) {
		this.helpdetailname = helpdetailname;
	}

}
