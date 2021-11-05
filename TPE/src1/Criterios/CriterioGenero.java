package Criterios;

import tpe.Participante;

public class CriterioGenero extends Criterio {

	private String genero;

	public CriterioGenero(String genero) {
		super();
		this.genero = genero;
	}

	@Override
	public boolean cumple(Participante p) {
		return p.getGeneros().contains(genero);
	}

}
