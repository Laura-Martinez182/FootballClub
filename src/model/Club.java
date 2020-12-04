package model;
public class Club {
	
	private String clubName;
	private int nit;
	private String date;
	private Team teamA;
	private Team teamB;
	private Employee employees;
	private Player[][] changingRoom1 = new Player[7][7];
	private Player[][] changingRoom2 = new Player[7][6];
	private Coach[][] offices = new Coach[6][6];
	
	
	public Club(String clubName, int nit, String date) {
			this.clubName = clubName;
			this.nit = nit;
			this.date = date;
	}
	
	public String getClubName() {
		return clubName;
	}
	
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	
	public int getNit() {
		return nit;
	}
	
	public void setNit(int nit) {
		this.nit = nit;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}







}
