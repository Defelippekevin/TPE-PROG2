package tpe;

import java.util.ArrayList;
import java.util.Comparator;

import Caracteres.Caracter;
import Criterios.Criterio;

public class Coach {
	private String nombre;
	private Caracter caracter;
	private ArrayList<Participante> participantes;

	public Coach(String nombre, Caracter caracter) {
		super();
		this.nombre = nombre;
		this.caracter = caracter;
		this.participantes = new ArrayList<>();
	}

	public void agregarAlEquipo(Participante p) {
		if (caracter.aceptarArtista(p)) {
			participantes.add(p);
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Caracter getCaracter() {
		return caracter;
	}

	public void setCaracter(Caracter caracter) {
		this.caracter = caracter;
	}

	public Participante seleccionarParticipante(Criterio c) { // Preguntar el miercoles

		for (int i = 0; i < participantes.size(); i++) {
			if (c.Cumple(participantes.get(i))) {
				return participantes.get(i);
			}
		}

		return null;
	}

	public ArrayList<Participante> seleccionarParticipantes(Criterio c) { // Preguntar el miercoles

		ArrayList<Participante> participantesCumplen = new ArrayList<>();
		for (int i = 0; i < participantes.size(); i++) {
			if (c.Cumple(participantes.get(i))) {
				participantesCumplen.add(participantes.get(i));

			}
		}

		return participantesCumplen;
	}

	public ArrayList<String> organizarElementos(Comparator comp1) {
		ArrayList<String> elementos = new ArrayList<>();
		for (Participante p : participantes) {
			if (!elementos.contains(p.getIdiomas())) {
				elementos.addAll(p.getIdiomas());
			}
		}
		return elementos;
	}

	public ArrayList<Participante> imprimirParticipantes() {
		ArrayList<Participante> parti = new ArrayList<>();
		for (Participante p : participantes) {
			parti.add(p);
		}
		return parti;
	}

	// tenemos una lista de participantes, que tienen listas de idiomas... como
	// traer los diferentes.

}
