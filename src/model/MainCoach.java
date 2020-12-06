package model;
public class MainCoach extends Coach{ 

	private int teamsInCharge;
	private int championships;
		
		/**
		*This method creates a Main coach, which has some attributes of an employee and a coach
		*<b>pre: </b> The user has to enter a name, id, salary, status, years of experience, number of teams in charge in all their career and the number of championships that they have won
		*<b>post: </b> The main coach has been saved.
		*@param name it is the name of the main coach. name != null
		*@param id it is the identification of the main coach. id > 0
		*@param salary it is the salary of the main coach. salary != null 
		*@param status  it is the status of the main coach.  status = active or inactive
		*@param experience it is the years of experience of the main coach. experience != null 
		*@param teamsInCharge it is the number of teams in charge in the career of the main coach. teamsInCharge != null
		*@param championships it is the number of championships that the main coach has won with the team. championships != null
		*/
	public MainCoach (String name, int id, double salary, String status, int experience, int teamsInCharge, int championships) {
		super(name, id, salary, status, experience);
		this.teamsInCharge = teamsInCharge;
		this.championships = championships;
	}
	
		/**
		*This method saves the teams in charge of a main coach
		*<b>pre: </b> The user has to enter an Int for the amount of teams in charge.
		*<b>post: </b> The main coach's numbers of teams in charge have been saved.
		*/
	public int getTeamsInCharge() {
		return teamsInCharge;
	}
	
		/**
		*This method change the amount of teams in charge of a main coach
		*<b>pre: </b> The user has to enter an Int for the amount of teams in charge.
		*<b>post: </b> The main coach's new amount of teams in charge have been saved.
		*@param teamsInCharge it is the number of teams in charge in the career of the main coach. teamsInCharge != null
		*/
	public void setTeamsInCharge(int teamsInCharge) {
		this.teamsInCharge = teamsInCharge;
	}
	
		/**
		*This method saves the number of championships that the main coach has won 
		*<b>pre: </b> The user has to enter an Int for the amount of championships
		*<b>post: </b> The main coach's championships victorys have been saved.
		*/
	public int getChampionships() {
		return championships;
	}
	
		/**
		*This method change the number of championships that the main coach has won 
		*<b>pre: </b> The user has to enter an Int for the amount of championships
		*<b>post: </b> The main coach's new amount of championships have been saved.
		*@param championships it is the number of championships that the main coach has won with the team. championships != null
		*/
	public void setChampionships(int championships) {
		this.championships = championships;
	}
	
		/**
		*This method calculates the price in the market of the main coach 
		*<b>pre: </b> The user has to enter a salary, years of experience and the number of championships that they have won.
		*<b>post: </b> The main coach's price in the market have been saved.
		*/
	public int getMarketPriceCoach() {
		int marketPriceCoach = 0;
		marketPriceCoach += (getSalary()*10) + (getExperience()*100) + (getChampionships()*50);
		return marketPriceCoach;
	}
		/**
		*This method calculates the level as a football star of the main coach 
		*<b>pre: </b> The user has to enter the number of championships that they have won.
		*<b>post: </b> The main coach's level as a football star have been saved.
		*/
	public int levelCoach() {
		int levelCoach = 0;
		levelCoach += 5 + (getChampionships()/10);
		return levelCoach;
	}

	public String showMainCoach() {
        String contents = "";
        contents = "Entrenador principal:\n";
        contents += "Nombre: " + getName() + "\n";
        contents += "Identificacion: " + getId() + "\n";
		contents += "Salario: " + getSalary() + "\n";
        contents += "Estatus: " + getStatus() + "\n";
        contents += "Experiencia: " + getExperience() + "\n";
		contents += "Numero de equipos a cargo: " + getTeamsInCharge() + "\n";
		contents += "Campeonatos ganados: " + getChampionships() + "\n";
		return contents;
	}

}