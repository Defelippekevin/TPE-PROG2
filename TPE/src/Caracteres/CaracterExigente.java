package Caracteres;


import tpe.Participante;

//PREGUNTAR SI SE PUEDE HACER 
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

	@Override
	public boolean aceptarArtista(Participante p) {
		return p.getGenero().contains(generoMusical) && p.getIdiomas().contains(idioma)
				&& p.getInstrumento().contains(instrumento);
	}

}
