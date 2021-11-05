package tpe;

import java.util.ArrayList;

public class Produccion {
	private ArrayList<Cancion> canciones;
	private ArrayList<Coach> jurados;

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

	/*
	 * public ArrayList<Participante> organizarBatalla(Criterio c){
	 * 
	 * }
	 */

}
