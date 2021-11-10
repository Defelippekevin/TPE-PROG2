package Sistema;

import java.util.ArrayList;
import java.util.Comparator;

public class Produccion {

	private ArrayList<Cancion> canciones;
	private ArrayList<Coach> jurados;
	private Comparator criterioBatalla;

	public Produccion() {
		this.canciones = new ArrayList<>();
		this.jurados = new ArrayList<>();
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

	public ElementoBanda batalla(ElementoBanda p1, ElementoBanda p2) {
		//verificar el tema del empate
		if (criterioBatalla.compare(p1, p2) == 1) {
			return p1;
		} else {
			return p2;
		} 
	}

}
