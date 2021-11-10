package Comparadores;

import java.util.Comparator;

import Sistema.ElementoBanda;

public class batallaGeneros implements Comparator<ElementoBanda> {

	@Override
	public int compare(ElementoBanda o1, ElementoBanda o2) {
		// TODO Auto-generated method stub
		return o1.getGeneros().size() - o2.getGeneros().size();
	}

}
