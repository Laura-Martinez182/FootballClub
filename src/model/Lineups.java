package model;
public class Lineups {
	
	private String date;
	private Tatic tactic;
	private int[][] formation = new int [10][7];
	
	public Lineups (String date, int[][] formation) {
		this.date = date;
		this.formation = formation;
		tactic = tactic;
	}
	
	
	public void possession() {
        tactic = Tactic.POSSESSION;
    }

    public void counterAttack() {
		tactic = Tactic.COUNTERATTACK;
    }

    public void highpressure() {
        tactic = Tactic.HIGHPRESSURE;
    }

    public void forDefault() {
       tactic = Tactic.FORDEFAULT;
    }
