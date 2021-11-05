package Sistema;

import Caracteres.CaracterExigente;
import Caracteres.CaracterSimple;

public class Main {

	public static void main(String[] args) {

		Produccion prod = new Produccion();

		Coach c = new Coach("Mario", new CaracterSimple());

		Coach c2 = new Coach("Mario", new CaracterExigente("Flauta", "Rock", "Ingles"));

		Participante p1 = new Participante("Diego", 28);

		Participante p2 = new Participante("Jose", 28);

		Participante p3 = new Participante("YAyo", 28);

		Participante p4 = new Participante("Larry", 28);

		GrupoMusical banda1 = new GrupoMusical("La banda del lechga");

		banda1.agregarElemento(p1);
		banda1.agregarElemento(p2);
		banda1.agregarElemento(p3);
		banda1.agregarElemento(p4);

		p1.agregarIdioma("Ingles");
		p1.agregarIdioma("Español");
		p1.agregarGeneroMusical("Rock");
		p1.agregarGeneroMusical("HEAVY METAL");

		p2.agregarIdioma("Ingles");
		p2.agregarIdioma("Español");
		p2.agregarIdioma("Portugues");
		p2.agregarGeneroMusical("Rock");
		p2.agregarInstrumento("Flauta");

		p3.agregarGeneroMusical("Rock");
		p3.agregarGeneroMusical("JAZZ");

		p4.agregarGeneroMusical("Rock");
		p4.agregarGeneroMusical("JAZZ");

		c.agregarAlEquipo(p1);
		c.agregarAlEquipo(p2);
		c2.agregarAlEquipo(p2);

		System.out.println(banda1.getGeneros());

	}

}
