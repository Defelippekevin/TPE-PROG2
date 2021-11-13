package Sistema;

import java.util.ArrayList;
import java.util.Comparator;

import Criterios.Criterio;

public abstract class ElementoBanda {

	protected String nombre;
	
		
	public ElementoBanda(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public abstract ArrayList<String> getGeneros();
	
	public abstract ArrayList<String> getInstrumentos();
	
	public abstract ArrayList<String> getIdiomas();
	
	public abstract ElementoBanda getCopia(Criterio c);
	
	public abstract ArrayList<ElementoBanda> seleccionParticipantes(Criterio c);
	
	public abstract double getEdad();
	
	public abstract ArrayList<ElementoBanda> seleccionParticipantesOrdenados();

	public String getNombre() {
		return nombre;
	}


	
	
}
