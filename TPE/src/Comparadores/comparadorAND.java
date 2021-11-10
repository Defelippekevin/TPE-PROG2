package Comparadores;

import java.util.Comparator;

import Sistema.ElementoBanda;

public class comparadorAND implements Comparator<ElementoBanda> {

	private Comparator comp1;
	private Comparator comp2;

	public comparadorAND(Comparator comp1, Comparator comp2) {
		super();
		this.comp1 = comp1;
		this.comp2 = comp2;
	}

	@Override
	public int compare(ElementoBanda o1, ElementoBanda o2) {
		int resultado = comp1.compare(o1, o2);
		if (resultado == 0) {
			return comp2.compare(o1, o2);
		}
		return resultado;
	}

}
