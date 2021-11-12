package Sistema;

import Comparadores.batallaIdiomas;
import Criterios.Criterio;
import Criterios.CriterioAnd;
import Criterios.CriterioEdad;
import Criterios.CriterioGenero;
import Criterios.CriterioIdioma;
import Criterios.CriterioInstrumentos;
import Criterios.CriterioSimple;

public class Main {

	public static void main(String[] args) {

		
		
		Produccion prod = new Produccion(new batallaIdiomas());

		Coach coach1 = new Coach("Mario", new CriterioSimple());

		Coach coach2 = new Coach("Elisa", new CriterioAnd(new CriterioEdad(30),new CriterioIdioma("Ingles")));

		Participante p1 = new Participante("Diego", 20);

		Participante p2 = new Participante("Jose", 50);

		Participante p3 = new Participante("YAyo", 60);

		Participante p4 = new Participante("Larry", 52);
		
		Participante p5 = new Participante("MOE", 51);

		Participante p6 = new Participante("AXEL ROSE", 75);
		
		Participante p7 = new Participante("INDIO SOLARI", 78);
		
		GrupoMusical banda1 = new GrupoMusical("BANDA 1");
		
		GrupoMusical banda2 = new GrupoMusical("BANDA 2");
		
		GrupoMusical banda3 = new GrupoMusical("BANDA 3");

		banda1.agregarElemento(p1);
		banda1.agregarElemento(p2);
		banda1.agregarElemento(p3);
		banda2.agregarElemento(p4);
		banda2.agregarElemento(p5);
		banda3.agregarElemento(p6);
		banda3.agregarElemento(p7);
		

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
		
		p6.agregarIdioma("Ingles");
		p6.agregarIdioma("Español");
		p6.agregarIdioma("Portugues");
		p6.agregarGeneroMusical("HEAVY METAL");
		p6.agregarGeneroMusical("FOLKLORE");
		p6.agregarGeneroMusical("REGGEATON");
		p6.agregarInstrumento("Flauta");
		p6.agregarInstrumento("Guitarra");
		
		p7.agregarIdioma("Ingles");
		p7.agregarIdioma("Español");
		p7.agregarIdioma("Portugues");
		p7.agregarGeneroMusical("HEAVY METAL");
		p7.agregarGeneroMusical("FOLKLORE");
		p7.agregarGeneroMusical("REGGEATON");
		p7.agregarInstrumento("Flauta");
		p7.agregarInstrumento("Guitarra");
		p7.agregarInstrumento("Banjo");
	
		banda1.agregarElemento(banda2);

		coach1.agregarAlEquipo(banda1);
		
		coach2.agregarAlEquipo(banda3);
		
		//System.out.println(banda2.getGeneros());
		//System.out.println(banda1.getIdiomas());
		//System.out.println(banda1.getInstrumentos());
		
		//CONSULTAR PORQUE EXPLOTA CUANDO INTEGRAS BANDA VACIA
		System.out.println(banda1.getEdad());
		
		
		//PREGUNTAR PORQUE NO AGREGA AL ARRAY
		
		Criterio cEdad = new CriterioEdad(51); 
		Criterio cGenero = new CriterioGenero("Rock");
		Criterio cIdioma = new CriterioIdioma("Ingles");
		Criterio cInst = new CriterioInstrumentos("Guitarra");
		
		Criterio cAnd1 = new CriterioAnd(cEdad, cGenero);
		Criterio cAnd2 = new CriterioAnd(cIdioma, cInst);
		Criterio cFinal = new CriterioAnd(cAnd1,cAnd2);
		
		
		//System.out.println(coach.seleccionarParticipantes(cEdad));
		//System.out.println(prod.ganador(p1, p2));
		
		System.out.println("PROMEDIO DE EDAD BANDA 1: " + banda1.getEdad());
		
		System.out.println("GENEROS PREFENCIA DE BANDA 1: " + banda1.getGeneros());
		
		System.out.println("INSTRUMENTOS PREFENCIA DE BANDA 1: " + banda1.getInstrumentos());
		
		System.out.println("IDIOMAS DE PREFENCIA de BANDA 1: " + banda1.getIdiomas());
		
		System.out.println("GENEROS BANDA 3: " + banda3.getGeneros());
		
		System.out.println("LISTA DE INSTRUMENTOS DEL COACH 1: " + coach1.organizarInstrumentos());
		
		System.out.println("LISTA DE GENEROS DEL COACH 1: " + coach1.organizarGeneros());
		
		System.out.println("LISTA DE IDIOMAS DEL COACH 1: " + coach1.organizarIdiomas());
		
		System.out.println("PROMEDIO DE EDAD BANDAS COACH 1: " + coach1.promedioEdadParticipantes());
		
		System.out.println("LISTA DE INSTRUMENTOS DEL COACH 2: " + coach2.organizarInstrumentos());
		
		System.out.println("LISTA DE GENEROS DEL COACH 2: " + coach2.organizarGeneros());
		
		System.out.println("LISTA DE IDIOMAS DEL COACH 2: " + coach2.organizarIdiomas());
		
		System.out.println("PROMEDIO DE EDAD BANDAS COACH 2: " + coach2.promedioEdadParticipantes());
	
		System.out.println("COACH 1 FILTRO IDIOMA: " + coach1.seleccionarParticipantes(cIdioma));
		
		System.out.println("COACH 2 FILTRO IDIOMA: " + coach2.seleccionarParticipantes(cIdioma));
		
	}

}
