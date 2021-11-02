package Criterios;

import tpe.Participante;

public class CriterioOr extends Criterio {
	
	private Criterio c1,c2;
	

	public CriterioOr(Criterio c1, Criterio c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public boolean Cumple(Participante p) {
		
		return c1.Cumple(p) || c2.Cumple(p);
	}

}
