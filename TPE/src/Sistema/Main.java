package Sistema;

import Caracteres.CaracterExigente;
import Comparadores.batallaIdiomas;
import Criterios.CriterioSimple;
import Criterios.Criterio;
import Criterios.CriterioAnd;
import Criterios.CriterioEdad;
import Criterios.CriterioGenero;
import Criterios.CriterioIdioma;
import Criterios.CriterioInstrumentos;

public class Main {

	public static void main(String[] args) {

		
		
		Produccion prod = new Produccion(new batallaIdiomas());

		Coach coach = new Coach("Mario", new CriterioSimple());

		Coach c2 = new Coach("Mario", new CriterioAnd(new CriterioEdad(30),new CriterioIdioma("Ingles")));

		Participante p1 = new Participante("Diego", 20);

		Participante p2 = new Participante("Jose", 50);

		Participante p3 = new Participante("YAyo", 60);

		Participante p4 = new Participante("Larry", 52);
		
		Participante p5 = new Participante("MOE", 51);

		GrupoMusical banda1 = new GrupoMusical("BANDA 1");
		
		GrupoMusical banda2 = new GrupoMusical("BANDA 2");
		

		banda1.agregarElemento(p1);
		banda1.agregarElemento(p2);
		banda1.agregarElemento(p3);
		banda2.agregarElemento(p4);
		banda2.agregarElemento(p5);

		p1.agregarIdioma("Ingles");
		p1.agregarIdioma("Español");
		p1.agregarIdioma("chino");
		p1.agregarGeneroMusical("Rock");
		p1.agregarGeneroMusical("HEAVY METAL");
		p1.agregarInstrumento("Guitarra");

		p2.agregarIdioma("Ingles");
		p2.agregarIdioma("Español");
		p2.agregarIdioma("Portugues");
		p2.agregarGeneroMusical("Rock");
		p2.agregarInstrumento("Flauta");
		p2.agregarInstrumento("Guitarra");
		
		p3.agregarGeneroMusical("Rock");
		p3.agregarGeneroMusical("JAZZ");
		p3.agregarIdioma("Ingles");
		p3.agregarInstrumento("Guitarra");
		
		p4.agregarGeneroMusical("Rock");
		p4.agregarGeneroMusical("JAZZ");
		p4.agregarInstrumento("Arpa");
		
		p5.agregarGeneroMusical("Rock");

	
		banda1.agregarElemento(banda2);

		coach.agregarAlEquipo(banda1);
		
		System.out.println(banda2.getGeneros());
		//System.out.println(banda1.getIdiomas());
		//System.out.println(banda1.getInstrumentos());
		
		//CONSULTAR PORQUE EXPLOTA CUANDO INTEGRAS BANDA VACIA
		System.out.println(banda1.getEdad());
		
		
		//PREGUNTAR PORQUE NO AGREGA A LARRY
		
		Criterio cEdad = new CriterioEdad(51); 
		Criterio cGenero = new CriterioGenero("Rock");
		Criterio cIdioma = new CriterioIdioma("Ingles");
		Criterio cInst = new CriterioInstrumentos("Guitarra");
		
		Criterio cAnd1 = new CriterioAnd(cEdad, cGenero);
		Criterio cAnd2 = new CriterioAnd(cIdioma, cInst);
		Criterio cFinal = new CriterioAnd(cAnd1,cAnd2);
		
		
		//System.out.println(coach.seleccionarParticipantes(cEdad));
		
		
		System.out.println(prod.ganador(p1, p2));
		
		
	}

}
