package model;
public class Player extends Employee {
	
	private int numberTshirt;
	private int goalsAmount;
	private double averageCalification;
	
	public Player (String name, int id, double salary, String status, int numberTshirt, int goalsAmount, double averageCalification) {
		super(experience, name, id, salary, status);
		this.numberTshirt = numberTshirt;
		this.goalsAmount = goalsAmount;
		this.averageCalification = averageCalification;
	}
	
	public int getNumberTshirt(){
		return numberTshirt;
	}
	
	public void setNumberTshirt(int numberTshirt){
		this.numberTshirt = numberTshirt;
	}
	
	public int getGoalsAmount() {
		return goalsAmount;
	}
	
	public void setGoalsAmount(int goalsAmount) {
		this.goalsAmount = goalsAmount;
	}
	
	public double getAverageCalification() {
		return averageCalification;
	}
	
	public void setAverageCalification(double averageCalification) {
		this.averageCalification = averageCalification;
	}