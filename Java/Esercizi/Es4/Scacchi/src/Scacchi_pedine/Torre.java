package Scacchi_pedine;

import Scacchi.Colore;
import Scacchi.Scacchiera;

public class Torre extends Pedina {

	
	public Torre(Colore colore, int riga, int colonna) {
		super(colore, riga, colonna);
	}
	@Override
	public void move(Scacchiera s, int rigadest, int colonnadest) {
		// TODO Auto-generated method stub

	}
	
	public String toString() {
		return "TORRE " + this.getColore();
	}

}
