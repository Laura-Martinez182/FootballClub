package model;
public class Team {
	
	private final static int SIZE_COACH = 1;
	private final static int SIZE_ASSIS = 3;
	private final static int SIZE_PLAYERS = 25;
	
	private String teamName;
	private MainCoach[] coach;
	private TecAssisstant[] assistant;
	private Player[] players;
	private Lineups lineups;
	
	public Team (String teamName) {
		this.teamName = teamName;
		coach = new MainCoach[SIZE_COACH];
		assistant = new TecAssisstant[SIZE_ASSIS];
		players = new Player[SIZE_PLAYERS];
		lineups = new Lineups[]; //MIRAR SI ESO ESTA BIEN 
	}
	
	public String getTeamName() {
		return teamName;
	}
	
	public void setTeamName (String teamName) {
		this.teamName = teamName;
	}
	