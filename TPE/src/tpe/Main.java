package tpe;

import Caracteres.CaracterExigente;
import Caracteres.CaracterSimple;
import Comparadores.CompararIdiomas;

public class Main {

	public static void main(String[] args) {

		Produccion prod = new Produccion();

		Coach c = new Coach("Mario", new CaracterSimple());

		Coach c2 = new Coach("Mario", new CaracterExigente("Flauta", "Rock", "Ingles"));

		Participante p1 = new Participante("Diego", "Perez", 28);

		Participante p2 = new Participante("Jose", "Jorge", 28);

		p2.agregarGeneroMusical("Rock");
		p2.agregarInstrumento("Flauta");

		p1.agregarIdioma("Ingles");
		p1.agregarIdioma("Español");

		p2.agregarIdioma("Ingles");
		p2.agregarIdioma("Español");
		p2.agregarIdioma("Portugues");

		c.agregarAlEquipo(p1);
		c.agregarAlEquipo(p2);

		
		c2.agregarAlEquipo(p2);
		
		System.out.println(c.organizarIdiomas());
		
		System.out.println(c2.imprimirParticipantes());
		
		//esto es una prueba para git Martin
		
	}

}
