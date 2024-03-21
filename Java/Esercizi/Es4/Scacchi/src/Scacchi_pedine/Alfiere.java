package Scacchi_pedine;

import Scacchi.Colore;
import Scacchi.Scacchiera;

public class Alfiere extends Pedina {

	public Alfiere(Colore colore, int riga, int colonna) {
		super(colore, riga, colonna);
	}
	
	@Override
	public void move(Scacchiera s, int rigadest, int colonnadest) {
		// TODO Auto-generated method stub

	}
	
	public String toString() {
		return "ALFIERE " + this.getColore();
	}

}
