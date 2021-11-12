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

	// La idea es hacerlo al revés
	public ArrayList<String> getGeneros() {
		ArrayList<String> generos = new ArrayList<>();
		generos.addAll(elementos.get(0).getGeneros());
		
		for (ElementoBanda e : elementos) {
			for (int i = 0; i < generos.size(); i++) {
				if(!e.getGeneros().contains(generos.get(i))) {
					generos.remove(i);
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
		return this.getNombre();
	}

	@Override
	public ArrayList<ElementoBanda> seleccionParticipantes(Criterio c) {
		ArrayList<ElementoBanda> seleccionP = new ArrayList<>();
		if (c.cumple(this)) {
			seleccionP.add(this);
		}
		for (ElementoBanda e : elementos) {
			seleccionP.addAll(e.seleccionParticipantes(c));
		}
		return seleccionP;
	}

}
