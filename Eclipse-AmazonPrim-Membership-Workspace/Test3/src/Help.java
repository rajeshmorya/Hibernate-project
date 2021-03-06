// default package
// Generated Nov 26, 2019 1:29:33 PM by Hibernate Tools 4.0.1.Final

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
 * Help generated by hbm2java
 */
@Entity
@Table(name = "help", catalog = "amazoneprime")
public class Help implements java.io.Serializable {

	private int helpid;
	private User user;
	private String helpname;
	private Set<Helpdetail> helpdetails = new HashSet<Helpdetail>(0);

	public Help() {
	}

	public Help(int helpid) {
		this.helpid = helpid;
	}

	public Help(int helpid, User user, String helpname, Set<Helpdetail> helpdetails) {
		this.helpid = helpid;
		this.user = user;
		this.helpname = helpname;
		this.helpdetails = helpdetails;
	}

	@Id

	@Column(name = "helpid", unique = true, nullable = false)
	public int getHelpid() {
		return this.helpid;
	}

	public void setHelpid(int helpid) {
		this.helpid = helpid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userid_fk")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "helpname")
	public String getHelpname() {
		return this.helpname;
	}

	public void setHelpname(String helpname) {
		this.helpname = helpname;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "help")
	public Set<Helpdetail> getHelpdetails() {
		return this.helpdetails;
	}

	public void setHelpdetails(Set<Helpdetail> helpdetails) {
		this.helpdetails = helpdetails;
	}

}
