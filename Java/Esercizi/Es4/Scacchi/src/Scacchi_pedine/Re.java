package Scacchi_pedine;

import Scacchi.Scacchiera;
import Scacchi.Colore;

public class Re extends Pedina {

	public Re(Colore colore, int riga, int colonna) {
		super(colore, riga, colonna);
	}
	@Override
	public void move(Scacchiera s, int rigadest, int colonnadest) {
		// TODO Auto-generated method stub

	}
	
	public String toString() {
		return "RE " + this.getColore();
	}

}
