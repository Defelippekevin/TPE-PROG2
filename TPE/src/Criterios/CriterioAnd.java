package Criterios;

import Sistema.ElementoBanda;
import Sistema.Participante;

public class CriterioAnd extends Criterio {

	private Criterio c1, c2;

	public CriterioAnd(Criterio c1, Criterio c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public boolean cumple(ElementoBanda p) {
		return c1.cumple(p) && c2.cumple(p);

	}

}
