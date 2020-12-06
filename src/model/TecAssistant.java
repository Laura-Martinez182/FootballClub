package model;
public class TecAssistant extends Coach { 

	private String professionalExperience;
	private int expertise;
	
		/**
		*This method creates a technical assistant, which has some attributes of an employee and a coach
		*<b>pre: </b> The user has to enter a name, id, salary, status and years of experience, their professional experience as a player or not and an expertise 
		*<b>post: </b> The tehnical assistant has been saved.
		*@param name it is the name of the technical assitant. name != null
		*@param id it is the identification of the technical assitant. id > 0
		*@param salary it is the salary of the technical assitant. salary != null 
		*@param status  it is the status of the technical assitant.  status = active or inactive
		*@param experience it is the years of experience of the technical assitant. experience != null 
		*@param professionalExperience it is used to know if the technical assistant was a player or not before. professionalExperience = player or not player
		*@param expertise it is the expertise of the technical assistant. 1 < expertise < 4
		*/
	public TecAssistant (String name, int id, double salary, String status, int experience, String professionalExperience, int expertise) {
		super(name, id, salary, status, experience);
		this.professionalExperience = professionalExperience;
		this.expertise = expertise;
	}
		/**
		*This method saves wheter the technical assistant was a player or not before
		*<b>pre: </b> The user has to enter a String for the professional experience.
		*<b>post: </b> The professional experience of the technical assistant have been saved.
		*/
	public String getProfessionalExperience() {
		return professionalExperience;
	}
		/**
		*This method change the professional experience of the technical assistant
		*<b>pre: </b> The user has to enter a String for the professional experience.
		*<b>post: </b> The professional experience of the technical assistant have been uptated.
		*@param professionalExperience  it is used to know if the technical assistant was a player or not before. professionalExperience = player or not player
		*/
	public void setProfessionalExperience(String professionalExperience) {
		this.professionalExperience = professionalExperience;
	}
	
		/**
		*This method saves the expertise of the technical assistant 
		*<b>pre: </b> The user has to enter an Int for the expertise
		*<b>post: </b> The expertise of the technical assistant have been saved.
		*/
	public int getExpertise() {
		return expertise;
	}
	
		/**
		*This method change the expertise of the technical assistant
		*<b>pre: </b> The user has to enter an int for the expertise
		*<b>post: </b> The expertise of the technical assistant have been uptated.
		*@param expertise it is the expertise of the technical assistant. 1 < expertise < 4
		*/
	public void setExpertise(int expertise) {
		this.expertise = expertise;
	}

	public String showTecAssistant() {
        String contents = "";
        contents = "Asistente tecnico:\n";
        contents += "Nombre: " + getName() + "\n";
        contents += "Identificacion: " + getId() + "\n";
		contents += "Salario: " + getSalary() + "\n";
        contents += "Estatus: " + getStatus() + "\n";
        contents += "Experiencia: " + getExperience() + "\n";
		contents += "Experiencia profesional: " + getProfessionalExperience() + "\n";
		contents += "Experticia: " + getExpertise() + "\n";
		return contents;
	} 
}