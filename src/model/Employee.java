package model;
public class Employee {
	
	private String name;
	private int id;
	private double salary;
	private String status;
	
	
	public Employee (String name, int id, double salary, String status) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.status = status;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
	return id;	
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}