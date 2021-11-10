package Comparadores;

import java.util.Comparator;

import Sistema.ElementoBanda;

public class batallaIdiomas implements Comparator<ElementoBanda> {

	@Override
	public int compare(ElementoBanda o1, ElementoBanda o2) {
		return o1.getIdiomas().size() - o2.getIdiomas().size();
	}

}
