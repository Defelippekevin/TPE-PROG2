package Comparadores;

import java.util.Comparator;

import Sistema.ElementoBanda;

public class batallaInstrumento implements Comparator<ElementoBanda> {

	@Override
	public int compare(ElementoBanda o1, ElementoBanda o2) {
		// TODO Auto-generated method stub
		return o1.getInstrumentos().size() - o2.getInstrumentos().size();
	}

}
