package Scacchi_pedine;

import Scacchi.Colore;
import Scacchi.Scacchiera;

public class Pedone extends Pedina {

	private Scacchiera scacchiera;
	
	public Pedone(Colore colore, int riga, int colonna) {
		super(colore, riga, colonna);
	}
	@Override
	public void move(Scacchiera s, int rigadest, int colonnadest) {
		// TODO Auto-generated method stub
		if(this.getColore()==Colore.BIANCO && (rigadest-this.getRiga() == 1) && (colonnadest-this.getColonna() == 0)){
			if(scacchiera.isEmpty(rigadest, colonnadest) || scacchiera.getPedina(rigadest, colonnadest)!=null) {
				scacchiera.removePedina(this.getRiga(), this.getColonna());
				this.setColonna(colonnadest);
				this.setRiga(rigadest);
				scacchiera.addPedina(this.getRiga(), this.getColonna(), this);
			}
		}
	}
	
	public String toString() {
		return "PEDONE" + this.getColore();
	}

}
