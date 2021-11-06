package Sistema;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import Criterios.Criterio;

public class GrupoMusical extends ElementoBanda {

	private ArrayList<ElementoBanda> elementos;

	public GrupoMusical(String nombre) {
		super(nombre);
		this.elementos = new ArrayList<>();
	}

	public void agregarElemento(ElementoBanda e) {
		elementos.add(e);
	}

	@Override
	public ArrayList<String> getGeneros() {
		ArrayList<String> generos = new ArrayList<>();
		generos.addAll(elementos.get(0).getGeneros());
		for (ElementoBanda e : elementos) {
			for (int i = 0; i < e.getGeneros().size(); i++) {
				if (generos.contains(e.getGeneros().get(i))) {
					generos.add(e.getGeneros().get(i));
				}
			}
		}
		return generos;
	}

	@Override
	public ArrayList<String> getInstrumentos() {
		ArrayList<String> instrumentos = new ArrayList<>();
		for (ElementoBanda e : elementos) {
			instrumentos.addAll(e.getInstrumentos());
		}
		Set<String> sinRep = new HashSet<String>(instrumentos);
		instrumentos.clear();
		instrumentos.addAll(sinRep);
		return instrumentos;
	}

	@Override
	public ArrayList<String> getIdiomas() {
		ArrayList<String> idiomasS = new ArrayList<>();
		for (ElementoBanda e : elementos) {
			idiomasS.addAll(e.getIdiomas());
		}
		Set<String> sinRep = new HashSet<String>(idiomasS);
		idiomasS.clear();
		idiomasS.addAll(sinRep);
		return idiomasS;
	}

	@Override
	public double getEdad() {
		double total = 0.0;
		int cantidadP = 0;
		for (ElementoBanda e : elementos) {
			total += e.getEdad();
			cantidadP++;
		}
		return total / cantidadP;
	}

	public boolean tieneElementos() {
		return !elementos.isEmpty();
	}

	@Override
	public ElementoBanda getCopia(Criterio c) {
		GrupoMusical grupoCopia = new GrupoMusical(this.getNombre());
		for (ElementoBanda e : elementos) {
			ElementoBanda copiaHijo = e.getCopia(c);
			if (copiaHijo != null) {
				grupoCopia.agregarElemento(e.getCopia(c));
			}
		}
		if (grupoCopia.tieneElementos()) {
			return grupoCopia;
		} else {
			return null;
		}
	}

	public String toString() {
		String nombre = "";
		for (ElementoBanda e : elementos) {
			nombre += " " + e.getNombre();
		}
		return this.getNombre() + nombre;
	}

}
