package Criterios;

import Sistema.ElementoBanda; 


public class CriterioIdioma extends Criterio {
	private String idioma;

	public CriterioIdioma(String idioma) {
		super();
		this.idioma = idioma;
	}

	@Override
	public boolean cumple(ElementoBanda p) {
		return p.getIdiomas().contains(idioma);
	}

}
