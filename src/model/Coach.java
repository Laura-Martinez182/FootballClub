package model;
public abstract class Coach extends Employee{ 
	
	private int experience;
	
		/**
		*This method creates a coach, which has some attributes of an coach
		*<b>pre: </b> The user has to enter a name, id, salary, status and years of experience
		*<b>post: </b> The coach has been saved.
		*@param name it is the name of the coach. name != null
		*@param id it is the identification of the coach. id > 0
		*@param salary it is the salary of the coach. salary != null 
		*@param status  it is the status of the coach.  status = active or inactive
		*@param experience it is the years of experience of the coach. experience != null 
		*/
	public Coach (String name, int id, double salary, String status, int experience) {
		super(name, id, salary, status);
		this.experience = experience;
	}
	
		/**
		*This method saves the years of experience of a coach
		*<b>pre: </b> The user has to enter an Int for the experience.
		*<b>post: </b> The coach's years of experience have been saved.
		*/
	
	public int getExperience() {
		return experience;
	}
	
		/**
		*This method change the years of experience of a coach
		*<b>pre: </b> The user has to enter an Int for the years of experience.
		*<b>post: </b> The coach's new years of experience have been saved.
		*@param experience it is the years of experience of the coach. experience != null 
		*/
	public void setExperience(int experience) {
		this.experience = experience;
	}

}