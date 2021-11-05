package Sistema;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

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

}
