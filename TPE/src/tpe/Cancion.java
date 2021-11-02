package tpe;

import java.util.ArrayList;

public class Cancion {
	private String titulo, idioma, letra;
	private ArrayList<String> generosMusicales;
	private ArrayList<String> instrumentosNecesarios;

	public Cancion(String titulo, String idioma, String letra) {
		super();
		this.titulo = titulo;
		this.idioma = idioma;
		this.letra = letra;
		this.generosMusicales = new ArrayList<>();
		this.instrumentosNecesarios = new ArrayList<>();
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

}
