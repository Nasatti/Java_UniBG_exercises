package Scacchi;

public class Gioco {
	
	private Giocatore[] giocatore;
	private Scacchiera scacchiera;
	private int turno; 
	
	public Gioco() {
		this.giocatore=new Giocatore[2];
		this.scacchiera = new Scacchiera();
		this.turno = 0;
	}
	
	public void stampaSato() {
		System.out.println(scacchiera.toString());
	}
}
