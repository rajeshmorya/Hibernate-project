// default package
// Generated Nov 26, 2019 1:35:49 PM by Hibernate Tools 4.0.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Youdevice generated by hbm2java
 */
public class Youdevice implements java.io.Serializable {

	private int yourdeviceid;
	private Accountsetting accountsetting;
	private String yourdecicename;
	private Set<Registerdevice> registerdevices = new HashSet<Registerdevice>(0);

	public Youdevice() {
	}

	public Youdevice(int yourdeviceid) {
		this.yourdeviceid = yourdeviceid;
	}

	public Youdevice(int yourdeviceid, Accountsetting accountsetting, String yourdecicename,
			Set<Registerdevice> registerdevices) {
		this.yourdeviceid = yourdeviceid;
		this.accountsetting = accountsetting;
		this.yourdecicename = yourdecicename;
		this.registerdevices = registerdevices;
	}

	public int getYourdeviceid() {
		return this.yourdeviceid;
	}

	public void setYourdeviceid(int yourdeviceid) {
		this.yourdeviceid = yourdeviceid;
	}

	public Accountsetting getAccountsetting() {
		return this.accountsetting;
	}

	public void setAccountsetting(Accountsetting accountsetting) {
		this.accountsetting = accountsetting;
	}

	public String getYourdecicename() {
		return this.yourdecicename;
	}

	public void setYourdecicename(String yourdecicename) {
		this.yourdecicename = yourdecicename;
	}

	public Set<Registerdevice> getRegisterdevices() {
		return this.registerdevices;
	}

	public void setRegisterdevices(Set<Registerdevice> registerdevices) {
		this.registerdevices = registerdevices;
	}

}
