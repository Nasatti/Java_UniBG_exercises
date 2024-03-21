package Scacchi;

import Scacchi_pedine.Pedina;

public class Cella {
	private Pedina pedina;// null--> libera
	
	public Cella() {
		this.setPedina(null);
	}
	
	public Boolean isEmpty() {
		if(this.pedina==null) {
			return true;
		}
		else return false;
	}

	public Pedina getPedina() {
		return pedina;
	}

	public void setPedina(Pedina pedina) {
		this.pedina = pedina;
	}
}