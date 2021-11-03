package Criterios;

import tpe.Participante;

public class CriterioEdad extends Criterio {
	
	private int edad;
	
	

	public CriterioEdad(int edad) {
		super();
		this.edad = edad;
	}



	@Override
	public boolean Cumple(Participante p) {
		return p.getEdad()>edad;
	}

}