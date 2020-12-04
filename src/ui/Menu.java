package ui;
import model.*;
import java.util.Scanner;

public class Menu {
	
	private final static int = ;
	private final static int = ;
	private final static int = ;
	private final static int = ;
	private final static int = ;
	
	private static Scanner sc = new Scanner(System.in);
	
	private Club club;
	
	public Menu(){
         this.club = readInitialData();
    }
	
	public Club readInitialData() {
        System.out.println("Digite el nombre del club: ");
        String clubName = sc.nextLine();
        System.out.println("Digite el NIT del club: ");
        int nit = sc.nextInt();
        System.out.println("Digite su edad");
        String date = sc.nextLine();
        sc.nextLine();
		club = new Club(clubName, nit, date);
        return club;

    }

		
	public void showMenu() {
		System.out.println("Escoja que desea hacer: ");
        System.out.println("1.");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("5. ");

    }
	
	  public int readOption() {
        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void doOeration(int choice) {
        switch (choice) {
            case :
                System.out.println();
                break;
            case :
                System.out.println();
                break;
            case :
                System.out.println();
                break;
            case :
                 System.out.println();
                break;
            case EXIT:
                System.out.println("****Has finalizado el programa****");
                break;
            default:
                System.out.println("");
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
        } while (option != );
    }

}