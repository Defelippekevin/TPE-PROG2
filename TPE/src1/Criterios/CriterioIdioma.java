package Criterios;

import tpe.Participante;

public class CriterioIdioma extends Criterio {
	private String idioma;

	public CriterioIdioma(String idioma) {
		super();
		this.idioma = idioma;
	}

	@Override
	public boolean cumple(Participante p) {
		return p.getIdiomas().contains(idioma);
	}

}
