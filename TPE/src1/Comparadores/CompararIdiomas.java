package Comparadores;

import java.util.Comparator;

import tpe.Participante;

public class CompararIdiomas implements Comparator<Participante> {

	@Override
	public int compare(Participante o1, Participante o2) {
		
		int resultado = -1;
		if(o1.getIdiomas().contains(o2.getIdiomas())) {
			resultado = 0;
		}
		return resultado;
	}

}
