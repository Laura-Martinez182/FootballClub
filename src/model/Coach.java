package model;
public abstract class Coach extends Employee{ 
	
	private int experience;
	
	public Coach (String name, int id, double salary, String status, int experience) {
		super(experience, name, id, salary, status);
		this.experience = experience;
	}
	
	public int getExperience() {
		return experience;
	}
	
	public void setExperience(int experience) {
		this.experience = experience;
	}