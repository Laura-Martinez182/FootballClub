package model;
public class Team {
	
	private final static int SIZE_COACH = 1;
	private final static int SIZE_ASSIS = 3;
	private final static int SIZE_PLAYERS = 25;
	private final static int SIZE_LINEUPS = 5;
	
	private String teamName;
	private MainCoach[] coach;
	private TecAssistant[] assistant;
	private Player[] players;
	private Lineups lineups;
	
		/**
		*This method creates a team
		*<b>pre: </b> The user has to enter a string for the name.
		*<b>post: </b> The team has been saved.
		*@param teamName it is the name of the team. teamName != null
		*/
	public Team (String teamName) {
		this.teamName = teamName;
		coach = new MainCoach[SIZE_COACH];
		assistant = new TecAssisstant[SIZE_ASSIS];
		players = new Player[SIZE_PLAYERS];
		lineups = new Lineups[SIZE_LINEUPS]; 
	}
		
		/**
		*This method saves the name of a team
		*<b>pre: </b> The user has to enter a string for the name.
		*<b>post: </b> The team's name has been saved.
		*/
	public String getTeamName() {
		return teamName;
	}
	
		/**
		*This method change the name of a team
		*<b>pre: </b> The user has to enter a string for the name.
		*<b>post: </b> The team's new name has been saved.
		*@param teamName it is the name of the team. teamName != null
		*/
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	


}