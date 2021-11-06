package Criterios;

import Sistema.ElementoBanda;
import Sistema.Participante;

public class CriterioEdad extends Criterio {

	private int edad;

	public CriterioEdad(int edad) {
		super();
		this.edad = edad;
	}

	@Override
	public boolean cumple(ElementoBanda p) {
		return p.getEdad() > edad;
	}

}
