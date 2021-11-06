package Criterios;

import Sistema.ElementoBanda;
import Sistema.Participante;

public class CriterioGenero extends Criterio {

	private String genero;

	public CriterioGenero(String genero) {
		super();
		this.genero = genero;
	}

	@Override
	public boolean cumple(ElementoBanda p) {
		return p.getGeneros().contains(genero);
	}

}
