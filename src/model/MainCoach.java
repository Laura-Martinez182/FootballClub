package model;
public class MainCoach extends Coach{ 

	private int teamsInCharge;
	private int championships;
		
	
	public MainCoach (String name, int id, double salary, String status, int experience, int teamsInCharge, int championships) {
		super(name, id, salary, status, experience);
		this.teamsInCharge = teamsInCharge;
		this.championships = championships;
	}
	
	public int getTeamsInCharge() {
		return teamsInCharge;
	}
	
	public void setTeamsInCharge(int teamsInCharge) {
		this.teamsInCharge = teamsInCharge;
	}