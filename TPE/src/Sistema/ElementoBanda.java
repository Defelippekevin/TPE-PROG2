package Sistema;

import java.util.ArrayList;

public abstract class ElementoBanda {

	protected String nombre;
	
		
	public ElementoBanda(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	
	public abstract ArrayList<String> getGeneros();
	public abstract ArrayList<String> getInstrumentos();
	public abstract ArrayList<String> getIdiomas();
}
