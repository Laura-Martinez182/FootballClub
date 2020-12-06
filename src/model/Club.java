package model;
public class Club {
	
	private String clubName;
	private int nit;
	private String date;
	private Team teamA;
	private Team teamB;
	private Player player;
	private MainCoach mainCoach;
	private TecAssistant tecAssistant;
	private Employee[] employee;
	private Player[][] changingRoom1 = new Player[7][7];
	private Player[][] changingRoom2 = new Player[7][6];
	private Coach[][] offices = new Coach[6][6];
	
		/**
		*This method creates the club
		*<b>pre: </b> The user has to enter a name, nit, date, and the names of the 2 teams.
		*<b>post: </b> The club has been created.
		*@param clubName it is the name of the club. clubName != null
		*@param nit it is the nit of the club. nit > 0
		*@param date it is the date of fundation of the club. date != null
		*@param teamNameA it is the name of the team A. teamNameA != null
		*@param teamNameB it is the name of the team B. teamName B!= null
		*/
	public Club(String clubName, int nit, String date, String teamNameA, String teamNameB) {
			this.clubName = clubName;
			this.nit = nit;
			this.date = date;
			teamA = new Team(teamNameA);
			teamB = new Team(teamNameB);
			employee = new Employee[60];
			changingRoom1 = new Player[7][7];
			changingRoom2 = new Player[7][6];
			offices = new Coach[6][6];
	}
	
		/**
		*This method saves the name of the club.
		*<b>pre: </b> The user has to enter a string.
		*<b>post: </b> The club's name have been saved.
		*/
	public String getClubName() {
		return clubName;
	}
	
		/**
		*This method change the club's name
		*<b>pre: </b> The user has to enter a string.
		*<b>post: </b> The new name have been saved.
		*@param clubName it is the name of the club. clubName != null
		*/
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
		/**
		*This method saves the NIT of the club.
		*<b>pre: </b> The user has to enter an Int.
		*<b>post: </b> The club's NIT have been saved.
		*/
	public int getNit() {
		return nit;
	}
	
		/**
		*This method change the club's NIT
		*<b>pre: </b> The user has to enter a Int.
		*<b>post: </b> The new NIT have been saved.
		*@param nit it is the nit of the club. nit > 0
		*/
	public void setNit(int nit) {
		this.nit = nit;
	}
	
		/**
		*This method saves the date of fundation of the club.
		*<b>pre: </b> The user has to enter an String.
		*<b>post: </b> The club's date of fundation have been saved.
		*/
	public String getDate() {
		return date;
	}
	
		/**
		*This method change the club's date of fundation
		*<b>pre: </b> The user has to enter a String.
		*<b>post: </b> The new date have been saved.
		*@param date it is the date of fundation of the club. date != null
		*/
	public void setDate(String date) {
		this.date = date;
	}
		
		/**
		*This method gets the team A of the club.
		*<b>pre: </b> The user has to enter info for the asociation type Team.
		*<b>post: </b> The club's team A have been saved.
		*/
	public Team getTeamA(){
		return teamA;
	}
		
		/**
		*This method gets the team B of the club.
		*<b>pre: </b> The user has to enter info for the asociation type Team.
		*<b>post: </b> The club's team B have been saved.
		*/
	public Team getTeamB(){
		return teamB;
	}
		
		/**
		*This method gets the list of employees of the club.
		*<b>pre: </b> The user has to enter info for the asociation type Employee.
		*<b>post: </b> The club's list of employees have been saved.
		*/
	public Employee[] getEmployees() {
		return employee;
	}
	
		/**
		*This method gets the changing room 1 of the club.
		*<b>pre: </b> The user has to enter info for the asociation type Player.
		*<b>post: </b> The club's changing room 1 have been saved.
		*/
	public Player[][] getChangingRoom1() {
		return changingRoom1;
	}
	
		/**
		*This method gets the changing room 2 of the club.
		*<b>pre: </b> The user has to enter info for the asociation type Player.
		*<b>post: </b> The club's changing room 2 have been saved.
		*/
	public Player[][] getChangingRoom2() {
		return changingRoom2;
	}
	
		/**
		*This method gets the offices of the club.
		*<b>pre: </b> The user has to enter info for the asociation type Coach.
		*<b>post: </b> The club's offices have been saved.
		*/
	public Coach[][] getOffices() {
		return offices;
	}
	
		/**
		*This method lets the club hire players. 
		*<b>pre: </b> The user has to enter a name, id, salary, status, number of the tshirt, goals amount, an average calification and the position.
		*<b>post: </b> The new player have been saved.
		*@param name it is the name of the player. name != null
		*@param id it is identification of the player. id > 0
		*@param salary it is the salary of the player. salary > 0
		*@param status it is the status of the player. status = active or inactive
		*@param numberTshirt it is the number of the tshirt of the player. numberTshirt > 0
		*@param goalsAmount it is the cantity of goals that the player has made. goalsAmount != null
		*@param averageCalification it is the average calification of the player. averageCalification != null
		*@param position it is the position in the field of the player. 1 < position < 4 
		*/
	
	public String hirePlayer(String name, int id, double salary, String status, int numberTshirt, int goalsAmount, double averageCalification, String position) {
		String msg = "No se pudo contratar al jugador";
		boolean done = false;
		for (int i = 0; i < 60 && !done; i++) {
			if (employee[i] == null) {
				employee[i] = new Player(name, id, salary, status, numberTshirt, goalsAmount, averageCalification, position);
				done = true;
				msg = "Se contrato al jugador";
			}
		}
		return msg;
	}
			
		/**
		*This method lets the club hire main coaches. 
		*<b>pre: </b> The user has to enter a name, id, salary, status, experience, teams in charge in their career, and the championships where they won.
		*<b>post: </b> The new main coach have been saved.
		*@param name it is the name of the main coach. name != null
		*@param id it is identification of the main coach. id > 0
		*@param salary it is the salary of the main coach. salary > 0
		*@param status it is the status of the main coach. status = active or inactive
		*@param experience it is the years of experience of the main coach. experience != null 
		*@param teamsInCharge it is the number of teams in charge in the career of the main coach. teamsInCharge != null
		*@param championships it is the number of championships that the main coach has won with the team. championships != null
		*/			
	public String hireMainCoach(String name, int id, double salary, String status, int experience, int teamsInCharge, int championships) {
		String msg = "No se pudo contratar al entrenador principal";
		boolean done = false;
		for (int i = 0; i < 60 && !done; i++) {
			if (employee[i] == null) {
				employee[i] = new MainCoach(name, id, salary, status, experience, teamsInCharge, championships);
				done = true;
				msg = "Se contrato al entrenador principal";
			}
		}
		return msg;
	}	
	
		/**
		*This method lets the club hire technicals assistants. 
		*<b>pre: </b> The user has to enter a name, id, salary, status, experience, their professional experience as a player or not and an expertise 
		*<b>post: </b> The new technical assistant have been saved.
		*@param name it is the name of the technical assistant. name != null
		*@param id it is identification of the technical assistant. id > 0
		*@param salary it is the salary of the technical assistant. salary > 0
		*@param status it is the status of the technical assistant. status = active or inactive
		*@param experience it is the years of experience of the technical assistant. experience != null 
		*@param professionalExperience it is used to know if the technical assistant was a player or not before. professionalExperience = player or not player
		*@param expertise it is the expertise of the technical assistant. 1 < expertise < 4
		*/	
	public String hireTecAssitant(String name, int id, double salary, String status, int experience, String professionalExperience, String expertise) {
		String msg = "No se pudo contratar al asistente tecnico";
		boolean done = false;
		for (int i = 0; i < 60 && !done; i++) {
			if (employee[i] == null) {
			employee[i] = new TecAssistant(name, id, salary, status, experience, professionalExperience);
				done = true;
				msg = "Se contrato al asistente tecnico";
			}
		}
		return msg;
	}	

}
