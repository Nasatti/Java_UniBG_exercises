package Scacchi_pedine;

import Scacchi.Colore;
import Scacchi.Scacchiera;

public abstract class Pedina {
	private final Colore colore;
	private int riga;
	private int colonna;
	
	public Pedina(Colore colore, int riga, int colonna) {
		this.colore = colore;
		this.setRiga(riga);
		this.setColonna(colonna);
	}

	public abstract void move(Scacchiera s, int rigadest, int colonnadest);
	
	public Colore getColore() {
		return colore;
	}

	public int getRiga() {
		return riga;
	}

	public void setRiga(int riga) {
		this.riga = riga;
	}

	public int getColonna() {
		return colonna;
	}

	public void setColonna(int colonna) {
		this.colonna = colonna;
	}
}
