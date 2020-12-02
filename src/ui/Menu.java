package ui;
import model.*;
import java.util.Scanner;

public class Menu {
	
	private final static int ADD_USER = 1;
	private final static int SHOW_USER = 2;
	private final static int ADD_PLAYLIST = 3;
	private final static int SHOW_PLAYLIST = 4;
	private final static int EXIT = 5;
	
	private static Scanner sc = new Scanner(System.in);
	
	private Club club;