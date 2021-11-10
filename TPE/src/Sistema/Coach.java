package Sistema;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Caracteres.Caracter;
import Criterios.Criterio;

public class Coach {
	private String nombre;
	private Caracter caracter;
	private ArrayList<ElementoBanda> participantes;

	public Coach(String nombre, Caracter caracter) {
		super();
		this.nombre = nombre;
		this.caracter = caracter;
		this.participantes = new ArrayList<>();
	}

	public void agregarAlEquipo(ElementoBanda p) {
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

	public double promedioEdadParticipantes() {
		double edad = 0.0;
		int contador = 0;
		for (int i = 0; i < participantes.size(); i++) {
			edad += participantes.get(i).getEdad();
			contador++;
		}
		return edad / contador;
	}

	public ArrayList<ElementoBanda> seleccionarParticipantes(Criterio c) {
		ArrayList<ElementoBanda> participantesCumplen = new ArrayList<>();
		for(ElementoBanda e:participantes) {
			participantesCumplen.addAll(e.seleccionParticipantes(c));
		}
		return participantesCumplen;
	}

	public ArrayList<ElementoBanda> copiaRestrigida(Criterio c) {
		ArrayList<ElementoBanda> participantesCumplen = new ArrayList<>();
		for (ElementoBanda e : participantes) {
			participantesCumplen.add(e.getCopia(c));
		}
		return participantesCumplen;
	}

	public ArrayList<ElementoBanda> ordenPorAptitud(Comparator comp) {
		ArrayList<ElementoBanda> participantesMasAptos = new ArrayList<>(participantes);
		Collections.sort(participantesMasAptos, comp);
		Collections.reverse(participantesMasAptos);
		return participantesMasAptos;

	}

	public ArrayList<String> organizarIdiomas() {
		ArrayList<String> elementos = new ArrayList<>();
		for (ElementoBanda p : participantes) {
			for (int i = 0; i < p.getIdiomas().size(); i++) {
				if (!elementos.contains(p.getIdiomas().get(i))) {
					elementos.add(p.getIdiomas().get(i));
				}
			}

		}
		return elementos;
	}

	public ArrayList<String> organizarInstrumentos() {
		ArrayList<String> elementos = new ArrayList<>();
		for (ElementoBanda p : participantes) {
			for (int i = 0; i < p.getInstrumentos().size(); i++) {
				if (!elementos.contains(p.getInstrumentos().get(i))) {
					elementos.add(p.getInstrumentos().get(i));
				}
			}

		}
		return elementos;
	}

	public ArrayList<String> organizarGeneros() {
		ArrayList<String> elementos = new ArrayList<>();
		for (ElementoBanda p : participantes) {
			for (int i = 0; i < p.getGeneros().size(); i++) {
				if (!elementos.contains(p.getGeneros().get(i))) {
					elementos.add(p.getGeneros().get(i));
				}
			}

		}
		Collections.sort(elementos);
		return elementos;
	}

	public ArrayList<ElementoBanda> imprimirParticipantes() {
		ArrayList<ElementoBanda> parti = new ArrayList<>();
		for (ElementoBanda p : participantes) {
			parti.add(p);
		}
		return parti;
	}

}
