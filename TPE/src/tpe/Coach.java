package tpe;

import java.util.ArrayList;
import java.util.Collections;
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
	
	public double promedioEdadParticipantes() {
		double edad=0.0;
		int contador=0;
		
		for(int i=0;i<participantes.size();i++) {
			edad += participantes.get(i).getEdad();
			contador++;
			
		}
		
		return edad / contador;
	}
	
	

	/*
	public Participante seleccionarParticipante(Criterio c) { // Preguntar el miercoles

		for (int i = 0; i < participantes.size(); i++) {
			if (c.Cumple(participantes.get(i))) {
				return participantes.get(i);
			}
		}

		return null;
	}
	
	*/

	
	public ArrayList<Participante> seleccionarParticipantes(Criterio c) { // QUEDA ESTA IMPLEMENTACION, QUEDA MEJOR 
																		 // DE CARA A LA 2DA PARTE DEL TPE

		ArrayList<Participante> participantesCumplen = new ArrayList<>();
		for (int i = 0; i < participantes.size(); i++) {
			if (c.Cumple(participantes.get(i))) {
				participantesCumplen.add(participantes.get(i));

			}
		}
		return participantesCumplen;
	}
	

	public ArrayList<String> organizarIdiomas() {
		ArrayList<String> elementos = new ArrayList<>();
		for (Participante p : participantes) {
			for(int i=0;i<p.getIdiomas().size();i++) {
				if(!elementos.contains(p.getIdiomas().get(i))){
					elementos.add(p.getIdiomas().get(i));
				}
			}
			
		}
		return elementos;
	}

	
	public ArrayList<String> organizarInstrumentos() {
		ArrayList<String> elementos = new ArrayList<>();
		for (Participante p : participantes) {
			for(int i=0;i<p.getInstrumento().size();i++) {
				if(!elementos.contains(p.getInstrumento().get(i))){
					elementos.add(p.getInstrumento().get(i));
				}
			}
			
		}
		return elementos;
	}
	
	public ArrayList<String> organizarGeneros() {
		ArrayList<String> elementos = new ArrayList<>();
		for (Participante p : participantes) {
			for(int i=0;i<p.getGenero().size();i++) {
				if(!elementos.contains(p.getGenero().get(i))){
					elementos.add(p.getGenero().get(i));
				}
			}
			
		}
		Collections.sort(elementos);
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
