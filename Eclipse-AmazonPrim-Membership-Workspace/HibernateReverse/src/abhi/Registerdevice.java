package abhi;
// Generated Nov 26, 2019 4:53:06 PM by Hibernate Tools 5.3.0.Beta2

/**
 * Registerdevice generated by hbm2java
 */
public class Registerdevice implements java.io.Serializable {

	private int registerid;
	private Youdevice youdevice;
	private String registername;

	public Registerdevice() {
	}

	public Registerdevice(int registerid) {
		this.registerid = registerid;
	}

	public Registerdevice(int registerid, Youdevice youdevice, String registername) {
		this.registerid = registerid;
		this.youdevice = youdevice;
		this.registername = registername;
	}

	public int getRegisterid() {
		return this.registerid;
	}

	public void setRegisterid(int registerid) {
		this.registerid = registerid;
	}

	public Youdevice getYoudevice() {
		return this.youdevice;
	}

	public void setYoudevice(Youdevice youdevice) {
		this.youdevice = youdevice;
	}

	public String getRegistername() {
		return this.registername;
	}

	public void setRegistername(String registername) {
		this.registername = registername;
	}

}
