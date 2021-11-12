package Sistema;

import java.util.ArrayList;
import java.util.Comparator;

public class Produccion {

	private ArrayList<Cancion> canciones;
	private ArrayList<Coach> jurados;
	private Comparator criterioBatalla;

	public Produccion(Comparator criterioBatalla) {
		this.canciones = new ArrayList<>();
		this.jurados = new ArrayList<>();
		this.criterioBatalla= criterioBatalla;
	}

	public void addCancion(Cancion c) {
		canciones.add(c);
	}

	public void addJurado(Coach c) {
		jurados.add(c);
	}

	public void setCriterioBatalla(Comparator comp) {
		this.criterioBatalla = comp;
	}

	public int batalla(ElementoBanda p1, ElementoBanda p2) {
		return criterioBatalla.compare(p1, p2);
/*
		if (resultado == 0) {
			return resultado;
		} else if (resultado > 0) {
			return 1;
		} else {
			return -1;
		}
		*/
	}
	
	
	public String ganador(ElementoBanda p1, ElementoBanda p2) {
		int resultado = batalla(p1,p2);
		if(resultado >0) {
			return p1.getNombre();
		}else if( resultado <0) {
			return p2.getNombre();
		}
		return "Empate";
	}
	
	

}
