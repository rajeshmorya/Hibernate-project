package hhh;
// Generated Nov 26, 2019 4:14:27 PM by Hibernate Tools 5.3.0.Beta2

/**
 * ActionAdventuretvdetail generated by hbm2java
 */
public class ActionAdventuretvdetail implements java.io.Serializable {

	private int actionAdventureTvdetailid;
	private Actionadventure actionadventure;
	private String actionAdventureTvdetailname;

	public ActionAdventuretvdetail() {
	}

	public ActionAdventuretvdetail(int actionAdventureTvdetailid) {
		this.actionAdventureTvdetailid = actionAdventureTvdetailid;
	}

	public ActionAdventuretvdetail(int actionAdventureTvdetailid, Actionadventure actionadventure,
			String actionAdventureTvdetailname) {
		this.actionAdventureTvdetailid = actionAdventureTvdetailid;
		this.actionadventure = actionadventure;
		this.actionAdventureTvdetailname = actionAdventureTvdetailname;
	}

	public int getActionAdventureTvdetailid() {
		return this.actionAdventureTvdetailid;
	}

	public void setActionAdventureTvdetailid(int actionAdventureTvdetailid) {
		this.actionAdventureTvdetailid = actionAdventureTvdetailid;
	}

	public Actionadventure getActionadventure() {
		return this.actionadventure;
	}

	public void setActionadventure(Actionadventure actionadventure) {
		this.actionadventure = actionadventure;
	}

	public String getActionAdventureTvdetailname() {
		return this.actionAdventureTvdetailname;
	}

	public void setActionAdventureTvdetailname(String actionAdventureTvdetailname) {
		this.actionAdventureTvdetailname = actionAdventureTvdetailname;
	}

}