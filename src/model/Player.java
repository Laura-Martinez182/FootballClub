package model;
public class Player extends Employee {
	
	private int numberTshirt;
	private int goalsAmount;
	private double averageCalification;
	private int position;
	
		/**
		*This method creates a player
		*<b>pre: </b> The user has to enter a name, id, salary, status, the number of the tshirt, the number of goals made, an average calification and a position.
		*<b>post: </b> The player has been saved.
		*@param name it is the name of the player. name != null
		*@param id it is the identification of the player. id > 0
		*@param salary it is the salary of the player. salary != null 
		*@param status  it is the status of the player.  status = active or inactive
		*@param numberTshirt it is the number of the tshirt of the player. numberTshirt > 0
		*@param goalsAmount it is the cantity of goals that the player has made. goalsAmount != null
		*@param averageCalification it is the average calification of the player. averageCalification != null
		*@param position it is the position in the field of the player. 1 < position < 4 
		*/
	public Player (String name, int id, double salary, String status, int numberTshirt, int goalsAmount, double averageCalification, int position) {
		super(name, id, salary, status);
		this.numberTshirt = numberTshirt;
		this.goalsAmount = goalsAmount;
		this.averageCalification = averageCalification;
		this.position = position;
	}
	
		/**
		*This method saves the number of the tshirt of the player  
		*<b>pre: </b> The user has to enter an int for the number of the tshirt
		*<b>post: </b> The number of the tshirt of the player have been saved.
		*/
	public int getNumberTshirt(){
		return numberTshirt;
	}
	
		/**
		*This method change the number of the tshirt of the player 
		*<b>pre: </b> The user has to enter an int for the number of the tshirt
		*<b>post: </b> The number of the tshirt of the player have been uptated.
		*@param numberTshirt it is the number of the tshirt of the player. numberTshirt > 0
		*/
	public void setNumberTshirt(int numberTshirt){
		this.numberTshirt = numberTshirt;
	}
	
		/**
		*This method saves the number of goals made by the player  
		*<b>pre: </b> The user has to enter an int for the number of goals
		*<b>post: </b> The number of goals made by the player have been saved.
		*/
	public int getGoalsAmount() {
		return goalsAmount;
	}
	
		/**
		*This method uptate the number of goals made by the player  
		*<b>pre: </b> The user has to enter an int for the number of goals
		*<b>post: </b> The number of goals made by the player have been uptated.
		*@param goalsAmount it is the cantity of goals that the player has made. goalsAmount != null
		*/
	public void setGoalsAmount(int goalsAmount) {
		this.goalsAmount = goalsAmount;
	}
		/**
		*This method saves the average calification of the player
		*<b>pre: </b> The user has to enter a double for the average calification 
		*<b>post: </b> The average calification have been saved.
		*/
	public double getAverageCalification() {
		return averageCalification;
	}
	
		/**
		*This method uptate the average calification of the player
		*<b>pre: </b> The user has to enter a double for the average calification 
		*<b>post: </b> The average calification have been uptated.
		*@param averageCalification it is the average calification of the player. averageCalification != null
		*/
	public void setAverageCalification(double averageCalification) {
		this.averageCalification = averageCalification;
	}
	
		/**
		*This method saves the position of the player in the field
		*<b>pre: </b> The user has to enter an int for the position 
		*<b>post: </b> The position have been saved.
		*/
	public int getPosition(){
		return position;
	}
	
		/**
		*This method uptate the position of the player in the field
		*<b>pre: </b> The user has to enter an int for the position 
		*<b>post: </b> The position have been uptated.
		*@param position it is the position in the field of the player. 1 < position < 4 
		*/
	public void setPosition(int position) {
		this.position = position;
	}
	
		/**
		*This method calculates the price in the market of the players
		*<b>pre: </b> The user has to enter the position, the salary, and the average calification.
		*<b>post: </b> The player's price in the market have been saved.
		*/
	public int getMarketPrice() {
		int marketPrice = 0;
		if (position == 1) {
			marketPrice += (getSalary()*12) + (getAverageCalification()*150);
		}else if (position == 2) {
			marketPrice += (getSalary()*13) + (getAverageCalification()*125) + (getGoalsAmount()*100);
		}else if (position == 3) {
			marketPrice += (getSalary()*14) + (getAverageCalification()*135) + (getGoalsAmount()*125);
		}else if (position == 4) {
			marketPrice += (getSalary()*15) + (getAverageCalification()*145) + (getGoalsAmount()*150);
		}
		return marketPrice;
	}
		/**
		*This method calculates the level as a football star of the player
		*<b>pre: </b> The user has to enter the position and the average calification
		*<b>post: </b> The player's level as a football star have been saved.
		*/
	public int getLevel() {
		int level = 0;
		if (position == 1) {
			level += getAverageCalification()*0.9;
		}else if (position == 2) {
			level += (getAverageCalification()*0.9) + (getGoalsAmount()/100);
		}else if (position == 3) {
			level += (getAverageCalification()*0.9) + (getGoalsAmount()/90);
		}else if (position == 4) {
			level += (getAverageCalification()*0.9) + (getGoalsAmount()/80);
		}
		return level;
	}


	public String showPlayer() {
        String contents = "";
        contents = "Jugador:\n";
        contents += "Nombre: " + getName() + "\n";
        contents += "Identificacion: " + getId() + "\n";
		contents += "Salario: " + getSalary() + "\n";
        contents += "Estatus: " + getStatus() + "\n";
        contents += "Numero de la camiseta: " + getNumberTshirt() + "\n";
		contents += "Cantidad de goles: " + getGoalsAmount() + "\n";
		contents += "Calificacion promedio: " + getAverageCalification() + "\n";
		contents += "Posicion: " + getPosition() + "\n";
		return contents;
	}

}