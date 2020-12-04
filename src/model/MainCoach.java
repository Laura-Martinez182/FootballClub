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
	
	public int getChampionships() {
		return championships;
	}
	
	public void setChampionships(int championships) {
		this.championships = championships;
	}
	
	public int getMarketPriceCoach() {
		int marketPriceCoach == 0;
		marketPriceCoach += (getsalary()*10) + (getExperience()*100) + (getChampionships()*50);
		return marketPriceCoach;
	}
	
	public int levelCoach() {
		int levelCoach == 0;
		levelCoach += 5 + (getChampionships()/10);
		return levelCoach;
	}