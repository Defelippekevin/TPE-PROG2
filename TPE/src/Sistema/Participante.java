package Sistema;

import java.util.ArrayList;
import java.util.Comparator;

import Criterios.Criterio;

public class Participante extends ElementoBanda {

	private String apellido;
	private double edad;
	private ArrayList<String> generosPreferidos;
	private ArrayList<String> idiomas;
	private ArrayList<String> instrumentos;

	public Participante(String nombre, double edad) {
		super(nombre);
		this.generosPreferidos = new ArrayList<>();
		this.idiomas = new ArrayList<>();
		this.instrumentos = new ArrayList<>();
		this.edad = edad;
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

	public double getEdad() {
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

	public ArrayList<String> getGeneros() {

		ArrayList<String> copiaGenero = new ArrayList<>(generosPreferidos);
		return copiaGenero;
	}

	public ArrayList<String> getInstrumentos() {
		ArrayList<String> copiaInstrumento = new ArrayList<>(instrumentos);
		return copiaInstrumento;
	}

	public String toString() {
		return this.getNombre();
	}

	@Override
	public ElementoBanda getCopia(Criterio c) {
		if (c.cumple(this)) {
			return new Participante(this.getNombre(), this.getEdad());
		}
		return null;
	}

	@Override
	public ArrayList<ElementoBanda> seleccionParticipantes(Criterio c) {
		ArrayList<ElementoBanda> participanteApto = new ArrayList<>();
		if (c.cumple(this)) {
			participanteApto.add(this);
		}
		return participanteApto;
	}

	@Override
	public ArrayList<ElementoBanda> seleccionParticipantesOrdenados() {
		ArrayList<ElementoBanda> elementos = new ArrayList<>();
		elementos.add(this);
		return elementos;
	}

}
