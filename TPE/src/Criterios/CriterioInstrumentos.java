package Criterios;

import Sistema.Participante;

public class CriterioInstrumentos extends Criterio {

	private String instrumento;

	public CriterioInstrumentos(String instrumento) {
		super();
		this.instrumento = instrumento;
	}

	@Override
	public boolean cumple(Participante p) {
		return p.getInstrumentos().contains(instrumento);
	}

}
