package Scacchi;

import Scacchi_pedine.Alfiere;
import Scacchi_pedine.Cavallo;
import Scacchi_pedine.Pedone;
import Scacchi_pedine.Torre;

public class Scacchiera {

	private Cella[][] cella;
		
	public Scacchiera() {
		cella = new Cella[8][8];

		for(int i = 0; i < 8; i++) {
			cella[i]=new Cella[8];
			for(int j = 0; j < 8; j++) {
					cella[i][j] = new Cella();
			}
		}
			
		cella[0][0].setPedina(new Torre(Colore.BIANCO, 0, 0));
		cella[0][1].setPedina(new Cavallo(Colore.BIANCO, 0, 1));
		cella[0][2].setPedina(new Alfiere(Colore.BIANCO, 0, 2));
		cella[1][0].setPedina(new Pedone(Colore.BIANCO, 1, 0));
			
	}
		
	public String toString() {//builder --> soluzione elegante per creare una stringa da ritornare
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				if(cella[i][j].isEmpty()) builder.append("\t");
				else builder.append(cella[i][j].getPedina().toString());
			}
			builder.append("\n");
		}
		return builder.toString();
	}
}
