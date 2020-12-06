package ui;
import model.*;
import java.util.Scanner;

public class Menu {
	
	private final static int HIRE_PLAYER = 1;
	private final static int HIRE_MAIN_COACH = 2;
	private final static int HIRE_TEC_ASSISTANT = 3;
	private final static int SHOW_PLAYER = 4;
	private final static int SHOW_MAIN_COACH = 5;
	private final static int SHOW_TEC_ASSISTANT = 6;
	private final static int PRICEMARKET_PLAYER = 7;
	private final static int LEVEL_PLAYER = 8;
	private final static int PRICEMARKET_MAIN_COACH = 9;
	private final static int LEVEL_MAIN_COACH = 10;
	private final static int EXIT = 11;

	
	
	private static Scanner sc = new Scanner(System.in);
	
	private Club club;
	
	public Menu(){
         this.club = readInitialData();
    }
	
		/**
		*This method create Club with the info.
		*<b>pre: </b> The user has to enter the club's name,  nit, date, and the names of the 2 teams.
		*<b>post: </b> The data will be saved.
		*/
	public Club readInitialData() {
        System.out.println("Digite el nombre del club:");
        String clubName = sc.nextLine();
        System.out.println("Digite el NIT del club:");
        int nit = sc.nextInt();
        System.out.println("Digite la fecha de fundación:");
        String date = sc.nextLine();
		System.out.println("Digite el nombre del equipo A :");
        String teamNameA = sc.nextLine();
		System.out.println("Digite el nombre del equipo B:");
        String teamNameB = sc.nextLine();
        sc.nextLine();
		club = new Club(clubName, nit, date, teamNameA, teamNameB);
        return club;

    }
		/**
		*This method shows the options in a menu.
		*<b>pre: </b> The user has to create the club with all the info needed.
		*<b>post: </b> The menu will be shown.
		*/
	public void showMenu() {
		System.out.println("Escoja que desea hacer: ");
        System.out.println("1. Contratar un jugador");
		System.out.println("2. Contratar un entrenador principal");
		System.out.println("3. Contratar un asistente tecnico");
        System.out.println("4. Mostrar informacion de jugador");
        System.out.println("5. Mostrar informacion del entrenador principal");
        System.out.println("6. Mostrar informacion del asistente tecnico");
        System.out.println("7. Calcular el precio de mercado del jugador");
		System.out.println("8. Calcular el nivel como estrella del futbol a un jugador");
		System.out.println("9. Calcular el precio de mercado del entrenador principal");
		System.out.println("10. Calcular el nivel como estrella del futbol a un entrenador principal");

    }
	
		/**
		*This method saves the option choosen by the user.
		*<b>pre: </b> The user has to enter a number between 1 and 10.
		*<b>post: </b> The option will be save.
		*/
	  public int readOption() {
        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }
	
		/**
		*This method creates the new player.
		*<b>pre: </b> The user has to enter a name, id, salary, status, the number of the tshirt, the number of goals made, an average calification and a position.
		*<b>post: </b> The data will be saved, and the new player will be hired.
		*/
	public String readPlayer() {
        System.out.println("Digite su nombre:");
        String name = sc.nextLine();
        System.out.println("Digite su id:");
        int id = sc.nextInt();
        System.out.println("Digite su salario:");
        double salary = sc.nextDouble();
		System.out.println("Digite su estatus: Activo o Inactivo");
		String status = sc.nextLine();
		System.out.println("Digite el numero de camisa:");
        int numberTshirt = sc.nextInt();
		System.out.println("Digite la cantidad de goles hechos:");
        int goalsAmount = sc.nextInt();
		System.out.println("Digite su calificación promedio:");
        double averageCalification = sc.nextDouble();
		System.out.println("Digite el numero que corresponda con su posicion en el campo:\n"
				+ "1. Portero\n"
                + "2. Defensor\n"
                + "3. Volante\n"
				+ "4. Delantero");
        int position = sc.nextInt();
        sc.nextLine();
		
			if (position == 1) {
                return club.hirePlayer(name, id, salary, status, numberTshirt, goalsAmount, averageCalification, "Portero");
            } else if (position == 2) {
               return club.hirePlayer(name, id, salary, status, numberTshirt, goalsAmount, averageCalification, "Defensor");
            } else if (position == 3) {
                return club.hirePlayer(name, id, salary, status, numberTshirt, goalsAmount, averageCalification, "Volante");
            } else if (position == 4) {
                return club.hirePlayer(name, id, salary, status, numberTshirt, goalsAmount, averageCalification, "Delantero");
			}
	}
		/**
		*This method creates the new main coach.
		*<b>pre: </b>  The user has to enter a name, id, salary, status, years of experience, number of teams in charge in all their career and the number of championships that they have won
		*<b>post: </b> The data will be saved, and the new main coach will be hired.
		*/
	
	public String readMainCoach() {
        System.out.println("Digite su nombre:");
        String name = sc.nextLine();
        System.out.println("Digite su id:");
        int id = sc.nextInt();
        System.out.println("Digite su salario:");
        double salary = sc.nextDouble();
		System.out.println("Digite su estatus: Activo o Inactivo");
		String status = sc.nextLine();
		System.out.println("Digite sus años de experiencia:");
        int experience = sc.nextInt();
		System.out.println("Digite la cantidad de equipos que ha tenido a cargo a lo largo de su carrera:");
        int teamsInCharge = sc.nextInt();
		System.out.println("Digite el numero de campeonatos ganados:");
        int championships = sc.nextInt();
        sc.nextLine();
        return club.hireMainCoach(name, id, salary, status, experience, teamsInCharge, championships);
    }
		/**
		*This method create the new technical assistant.
		*<b>pre: </b>  he user has to enter a name, id, salary, status and years of experience, their professional experience as a player or not and an expertise 
		*<b>post: </b> The data will be saved, and the new technical assistant will be hired.
		*/
	public String readTecAssistant() {
        System.out.println("Digite su nombre:");
        String name = sc.nextLine();
        System.out.println("Digite su id:");
        int id = sc.nextInt();
        System.out.println("Digite su salario:");
        double salary = sc.nextDouble();
		System.out.println("Digite su estatus: Activo o Inactivo");
		String status = sc.nextLine();
		System.out.println("Digite sus años de experiencia:");
        int experience = sc.nextInt();
		System.out.println("Digite su experiencia profesional: jugador o no jugador");
        String professionalExperience = sc.nextLine();
		System.out.println("Digite el numero que corresponda con su experticia:\n"
				+ "1. Ofensivo\n"
                + "2. Defensivo\n"
                + "3. Posesion\n"   
				+ "4. Jugadas de laboratorio");
        int expertise = sc.nextInt();
        sc.nextLine();
		
			if (expertise == 1) {
               return club.hireTecAssitant(name, id, salary, status, experience, professionalExperience, "Ofensivo");
            } else if (expertise == 2) {
               return club.hireTecAssitant(name, id, salary, status, experience, professionalExperience, "Defensivo");
            } else if (expertise == 3) {
               return club.hireTecAssitant(name, id, salary, status, experience, professionalExperience, "Posesion");
            } else if (expertise == 4) {
                return club.hireTecAssitant(name, id, salary, status, experience, professionalExperience, "Jugadas de laboratorio");
			}
	}
		/**
		*This method does what the user has choosen.
		*<b>pre: </b> The user has to choose an option
		*<b>post: </b> It will do what the user want 
		*@param choice it is the choice of the user.  1 < choice < 11
		*/
	public void doOeration(int choice) {
        switch (choice) {
            case HIRE_PLAYER:
                System.out.println(readPlayer());
                break;
            case HIRE_MAIN_COACH:
                System.out.println(readMainCoach());
                break;
            case HIRE_TEC_ASSISTANT:
                System.out.println(readTecAssistant());
                break;
            case SHOW_PLAYER:
                 System.out.println(Player.showPlayer());
			case SHOW_MAIN_COACH:
                 System.out.println(mainCoach.showMainCoach());
			case SHOW_TEC_ASSISTANT:
                 System.out.println(tecAssistant.showTecAssistant());
			case PRICEMARKET_PLAYER:
                 System.out.println(Player.getMarketPrice());
			case LEVEL_PLAYER :
                 System.out.println(Player.getLevel());
			case PRICEMARKET_MAIN_COACH:
                 System.out.println(mainCoach.getMarketPriceCoach());
			case LEVEL_MAIN_COACH :
                 System.out.println(mainCoach.levelCoach());
                break;
            case EXIT:
                System.out.println("****Has finalizado el programa****");
                break;
            default:
                System.out.println("Intente nuevamente, ingrese una opcion valida");
        }
	}
	
	
	/**
	*This method groups all the methods needed to make the program work.
	*<b>pre: </b> All the preconditions for the others methods altogether.
	*<b>post: </b> It saves the results of all the methods to show them in the Main.
	*/

    public void startProgram() {
        int option;
        do {
            showMenu();
            option = readOption();
            doOeration(option);
        } while (option != 11);
    }

}