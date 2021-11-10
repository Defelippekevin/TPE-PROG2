package Caracteres;

import Sistema.ElementoBanda;


//BORRAR CARACTER USAR CRITERIOS
public class CaracterExigente extends Caracter {

	private String instrumento;
	private String generoMusical;
	private String idioma;

	public CaracterExigente(String instrumento, String generoMusical, String idioma) {
		super();
		this.instrumento = instrumento;
		this.generoMusical = generoMusical;
		this.idioma = idioma;
	}

	public boolean aceptarArtista(ElementoBanda p) {
		return p.getGeneros().contains(generoMusical) && p.getIdiomas().contains(idioma)
				&& p.getInstrumentos().contains(instrumento);
	}

}
