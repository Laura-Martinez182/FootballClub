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
	
	
	public Club(String clubName, int nit, String date, 