package Criterios;

import Sistema.ElementoBanda;


public class CriterioInstrumentos extends Criterio {

	private String instrumento;

	public CriterioInstrumentos(String instrumento) {
		super();
		this.instrumento = instrumento;
	}

	@Override
	public boolean cumple(ElementoBanda p) {
		return p.getInstrumentos().contains(instrumento);
	}

}
