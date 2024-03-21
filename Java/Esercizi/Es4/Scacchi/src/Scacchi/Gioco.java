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
	
	public boolean muoviPedina(int rigaor, int colonnaor, int rigadest, int colonnadest) {
		if(this.scacchiera.isEmpty(rigaor,  colonnaor)) return false;
		else {
			scacchiera.getPedina(rigadest, colonnaor).move(scacchiera, rigadest, colonnadest);
			return true;
		}
	}
}
