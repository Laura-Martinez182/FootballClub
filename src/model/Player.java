package model;
public class Player extends Employee {
	
	private int numberTshirt;
	private int goalsAmount;
	private double averageCalification;
	private int position;
	
	public Player (String name, int id, double salary, String status, int numberTshirt, int goalsAmount, double averageCalification, int position) {
		super(name, id, salary, status);
		this.numberTshirt = numberTshirt;
		this.goalsAmount = goalsAmount;
		this.averageCalification = averageCalification;
		this.position = position;
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
	
	public int getPosition(){
		return position;
	}
	
	public void setPosition(int position) {
		this.position = position;
	}
	
	public int getMarketPrice(int position) {
		int marketPrice == 0;
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
	
	public int getLevel(int position) {
		int level == 0;
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