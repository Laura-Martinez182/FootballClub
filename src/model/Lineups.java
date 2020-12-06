package model;
public class Lineups {
	
	private String date;
	private int tactic;
	private int[][] formation = new int [10][7];
	
		/**
		*This method creates a lineup
		*<b>pre: </b> The user has to enter a date, a tactic and a formation
		*<b>post: </b> The lineup has been saved.
		*@param date it is the date of the lineup. date != null
		*@param tactic it is the tactic for the game. 1 < tactic < 4 
		*@param formation it is the formation for the game 
		*/
	public Lineups (String date, int tactic, int[][] formation) {
		this.date = date;
		this.formation = formation;
		this.tactic = tactic;
	}
	
	
		/**
		*This method saves the date of the lineup
		*<b>pre: </b> The user has to enter a String for the date
		*<b>post: </b> The date of the lineup have been saved.
		*/
	public String getDate() {
		return date;
	}
	
		/**
		*This method change the date of the lineup
		*<b>pre: </b> The user has to enter a String for the date
		*<b>post: </b> The date of the lineup have been uptated.
		*@param date it is the date of the lineup. date != null
		*/
	public void setDate(String date) {
		this.date = date;
	}
	
		/**
		*This method saves the tactic of the lineup
		*<b>pre: </b> The user has to enter an int for the tactic
		*<b>post: </b> The tactic of the lineup have been saved.
		*/
	public int getTactic() {
		return tactic;
	}
		/**
		*This method change the tactic of the lineup
		*<b>pre: </b> The user has to enter an int for the tactic
		*<b>post: </b> The tactic of the lineup have been uptated.
		*@param tactic it is the tactic for the game. 1 < tactic < 4 
		*/
	public void setTactic(int tactic) {
		this.tactic = tactic;
	}
	
	/**
		*This method gets the formation of the lineup
		*<b>pre: </b> The user has to enter an int for the formation
		*<b>post: </b> The formation of the lineup have been saved.
		*/
	public int[][] getFormation(){
		return formation;
	}

}