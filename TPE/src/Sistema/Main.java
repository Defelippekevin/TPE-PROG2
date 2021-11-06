package Sistema;

import Caracteres.CaracterExigente;
import Caracteres.CaracterSimple;
import Criterios.Criterio;
import Criterios.CriterioAnd;
import Criterios.CriterioEdad;
import Criterios.CriterioGenero;
import Criterios.CriterioIdioma;
import Criterios.CriterioInstrumentos;

public class Main {

	public static void main(String[] args) {

		Produccion prod = new Produccion();

		Coach coach = new Coach("Mario", new CaracterSimple());

		Coach c2 = new Coach("Mario", new CaracterExigente("Flauta", "Rock", "Ingles"));

		Participante p1 = new Participante("Diego", 20);

		Participante p2 = new Participante("Jose", 50);

		Participante p3 = new Participante("YAyo", 60);

		Participante p4 = new Participante("Larry", 20);

		GrupoMusical banda1 = new GrupoMusical("BANDA 1");
		
		GrupoMusical banda2 = new GrupoMusical("BANDA 2");
		

		banda1.agregarElemento(p1);
		banda1.agregarElemento(p2);
		banda1.agregarElemento(p3);
		banda2.agregarElemento(p4);

		p1.agregarIdioma("Ingles");
		p1.agregarIdioma("Español");
		p1.agregarGeneroMusical("Rock");
		p1.agregarGeneroMusical("HEAVY METAL");
		p1.agregarInstrumento("Guitarra");

		p2.agregarIdioma("Ingles");
		p2.agregarIdioma("Español");
		p2.agregarIdioma("Portugues");
		p2.agregarGeneroMusical("JAZZ");
		p2.agregarInstrumento("Flauta");
		p2.agregarInstrumento("Guitarra");
		
		p3.agregarGeneroMusical("Rock");
		p3.agregarGeneroMusical("JAZZ");
		p3.agregarIdioma("Ingles");
		p3.agregarInstrumento("Guitarra");
		
		p4.agregarGeneroMusical("Rock");
		p4.agregarGeneroMusical("JAZZ");
		p4.agregarInstrumento("Arpa");

	
		banda1.agregarElemento(banda2);

		coach.agregarAlEquipo(banda1);
		
		//System.out.println(banda1.getGeneros());
		//System.out.println(banda1.getIdiomas());
		//System.out.println(banda1.getInstrumentos());
		//CONSULTAR PORQUE EXPLOTA CUANDO INTEGRAS BANDA VACIA
		//System.out.println(banda1.getEdad());
		
		
		//PREGUNTAR PORQUE NO AGREGA A LARRY
		
		Criterio cEdad = new CriterioEdad(18); 
		Criterio cGenero = new CriterioGenero("Rock");
		Criterio cIdioma = new CriterioIdioma("Ingles");
		Criterio cInst = new CriterioInstrumentos("Guitarra");
		
		Criterio cAnd1 = new CriterioAnd(cEdad, cGenero);
		Criterio cAnd2 = new CriterioAnd(cIdioma, cInst);
		Criterio cFinal = new CriterioAnd(cAnd1,cAnd2);
		
		System.out.println(coach.seleccionarParticipantes2(cFinal));
		
	}

}
