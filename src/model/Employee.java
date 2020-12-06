package model;
public class Employee {
	
	private String name;
	private int id;
	private double salary;
	private String status;
	
		/**
		*This method creates an employee
		*<b>pre: </b> The user has to enter a name, id, salary, and a status.
		*<b>post: </b> The employee has been saved.
		*@param name it is the name of the employee. name != null
		*@param id it is the identification of the employee. id > 0
		*@param salary it is the salary of the employee. salary != null 
		*@param status  it is the status of the employee.  status = active or inactive
		*/
	public Employee (String name, int id, double salary, String status) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.status = status;
	}
	
	
		/**
		*This method saves the name of an employee
		*<b>pre: </b> The user has to enter a string for the name.
		*<b>post: </b> The employee's name has been saved.
		*/
	public String getName() {
		return name;
	}
		/**
		*This method change the name of an employee
		*<b>pre: </b> The user has to enter a string for the name.
		*<b>post: </b> The employee's new name has been saved.
		*@param name it is the name of the employee. name != null
		*/
	public void setName(String name) {
		this.name = name;
	}
	
		/**
		*This method saves the identification of an employee
		*<b>pre: </b> The user has to enter an Int for the id.
		*<b>post: </b> The employee's id has been saved.
		*/
	
	public int getId() {
	return id;	
	}
		/**
		*This method change the id of an employee
		*<b>pre: </b> The user has to enter an Int for the id.
		*<b>post: </b> The employee's new id has been saved.
		*@param id it is the id of the employee. id > 0
		*/
	public void setId(int id) {
		this.id = id;
	}
	
		/**
		*This method saves the salary of an employee
		*<b>pre: </b> The user has to enter a double for the salary.
		*<b>post: </b> The employee'salary has been saved.
		*/
	public double getSalary() {
		return salary;
	}
	
	
		/**
		*This method change the salary of an employee
		*<b>pre: </b> The user has to enter a double for the salary.
		*<b>post: </b> The employee's new salary has been saved.
		*@param salary it is the salary of the employee. id > 0
		*/
	public void setSalary(double salary) {
		this.salary = salary;
	}
		
		/**
		*This method saves the status of an employee
		*<b>pre: </b> The user has to enter a String for the status either active or inactive.
		*<b>post: </b> The employee's status has been saved.
		*/
	public String getStatus() {
		return status;
	}
	
		/**
		*This method change the status of an employee
		*<b>pre: </b> The user has to enter a String for the status.
		*<b>post: </b> The employee's new status has been saved.
		*@param status it is the status of the employee. status = active or inactive
		*/
	public void setStatus(String status) {
		this.status = status;
	}




}