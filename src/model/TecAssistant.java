package model;
public class TecAssistant extends Coach { 

	private String professionalExperience;
	
	public TecAssistant (String name, int id, double salary, String status, int experience, String professionalExperience) {
		super(name, id, salary, status, experience):
		this.professionalExperience = professionalExperience;
	}
	
	public String getProfessionalExperience() {
		return professionalExperience;
	}
	
	public void setProfessionalExperience(String professionalExperience) {
		this.professionalExperience = professionalExperience;
	}