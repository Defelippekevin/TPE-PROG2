package Comparadores;

import java.util.Comparator;

import Sistema.ElementoBanda;

public class batallaEdad implements Comparator<ElementoBanda>  {

	@Override
	public int compare(ElementoBanda o1, ElementoBanda o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getEdad() - o2.getEdad());
	}

}
