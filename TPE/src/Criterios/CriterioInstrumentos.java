package Criterios;

import tpe.Participante;

public class CriterioInstrumentos extends Criterio {
	
	private String instrumento;
	
	
	public CriterioInstrumentos(String instrumento) {
		super();
		this.instrumento = instrumento;
	}


	@Override
	public boolean Cumple(Participante p) {
		return p.getInstrumento().contains(instrumento);
	}

}
