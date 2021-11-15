package Sistema;

import java.util.ArrayList; 
import java.util.Collections;
import java.util.Comparator;
import Criterios.Criterio;

public class Coach {
	private String nombre;
	private Criterio criterioComportamiento;
	private ArrayList<ElementoBanda> participantes;

	public Coach(String nombre, Criterio criterioComportamiento) {
		super();
		this.nombre = nombre;

		this.criterioComportamiento = criterioComportamiento;
		this.participantes = new ArrayList<>();
	}

	public void agregarAlEquipo(ElementoBanda p) {
		if (criterioComportamiento.cumple(p) && p != null) {
			participantes.add(p);
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Criterio getComportamiento() {
		return criterioComportamiento;
	}

	public void setComportamiento(Criterio nuevoComportamiento) {
		this.criterioComportamiento = nuevoComportamiento;
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
		for (ElementoBanda e : participantes) {
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

	public ArrayList<ElementoBanda> ordenPorAptitud(Comparator<ElementoBanda> comp) {
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
		Collections.sort(elementos);
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
		Collections.sort(elementos);
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
