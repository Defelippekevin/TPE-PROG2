package tpe;

import java.util.ArrayList;

public class Participante {
	private String nombre, apellido;
	private int edad;
	private ArrayList<String> generosPreferidos;
	private ArrayList<String> idiomas;
	private ArrayList<String> instrumentos;

	public Participante(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.generosPreferidos = new ArrayList<>();
		this.idiomas = new ArrayList<>();
		this.instrumentos = new ArrayList<>();
	}

	public void agregarIdioma(String idioma) {
		if (!idiomas.contains(idioma)) {
			idiomas.add(idioma);
		}
	}

	public void agregarInstrumento(String instrumento) {
		if (!instrumentos.contains(instrumento)) {
			instrumentos.add(instrumento);
		}
	}

	public void agregarGeneroMusical(String generos) {
		if (!generosPreferidos.contains(generos)) {
			generosPreferidos.add(generos);
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String cantar(Cancion c) {

		return c.getLetra();

	}

	public ArrayList<String> getIdiomas() {

		ArrayList<String> copiaIdiomas = new ArrayList<>(idiomas);

		return copiaIdiomas;
	}

	public ArrayList<String> getGenero() {

		ArrayList<String> copiaGenero = new ArrayList<>(generosPreferidos);

		return copiaGenero;
	}

	public ArrayList<String> getInstrumento() {

		ArrayList<String> copiaInstrumento = new ArrayList<>(instrumentos);

		return copiaInstrumento;
	}

	public String toString() {
		return this.getNombre();
	}

}
