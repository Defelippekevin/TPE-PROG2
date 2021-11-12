package Sistema;

import java.util.ArrayList;

import Criterios.Criterio;

public class Cancion {
	private String titulo, idioma, letra;
	private ArrayList<String> generosMusicales;
	private ArrayList<String> instrumentosNecesarios;
	private Criterio sePuedeCantar;

	public Cancion(String titulo, String idioma, String letra,Criterio sePuedeCantar) {
		super();
		this.titulo = titulo;
		this.idioma = idioma;
		this.letra = letra;
		this.generosMusicales = new ArrayList<>();
		this.instrumentosNecesarios = new ArrayList<>();
		this.sePuedeCantar = sePuedeCantar;
	}

	//crear el set y los criterios de cantor
	
	public boolean PuedeCantar(Participante p) {
		return sePuedeCantar.cumple(p);
	}
	
	public void setCriterioCantor(Criterio criterioNuevo) {
		this.sePuedeCantar = criterioNuevo;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

	public void agregarGeneroMusical(String genero) {
		generosMusicales.add(genero);
	}

	public void agregarInstrumento(String instrumento) {
		instrumentosNecesarios.add(instrumento);
	}
}
