package Sistema;

import java.util.Comparator;

import Comparadores.batallaEdad;
import Comparadores.batallaGeneros;
import Comparadores.batallaIdiomas;
import Comparadores.batallaInstrumento;
import Comparadores.comparadorAND;
import Criterios.Criterio;
import Criterios.CriterioAnd;
import Criterios.CriterioEdad;
import Criterios.CriterioGenero;
import Criterios.CriterioIdioma;
import Criterios.CriterioInstrumentos;
import Criterios.CriterioSimple;

public class Main {

	public static void main(String[] args) {

		Produccion produccion = new Produccion(new batallaIdiomas());

		Coach coach1 = new Coach("Mario", new CriterioSimple());

		Coach coach2 = new Coach("Elisa", new CriterioAnd(new CriterioEdad(30), new CriterioIdioma("Ingles")));

		Participante p1 = new Participante("Diego", 20);

		Participante p2 = new Participante("Jose", 20);

		Participante p3 = new Participante("YAyo", 20);

		Participante p4 = new Participante("Larry", 20);

		Participante p5 = new Participante("MOE", 20);

		Participante p6 = new Participante("AXEL ROSE", 75);

		Participante p7 = new Participante("INDIO SOLARI", 78);
		
		Participante p8 = new Participante("COSME FULANITO", 18);

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
		p1.agregarIdioma("Portugues");
		p1.agregarGeneroMusical("Rock");
		p1.agregarGeneroMusical("HEAVY METAL");
		p1.agregarGeneroMusical("Lirico");
		p1.agregarInstrumento("Guitarra");

		p2.agregarIdioma("Ingles");
		p2.agregarIdioma("Español");
		p2.agregarIdioma("Portugues");
		p2.agregarGeneroMusical("Rock");
		p2.agregarGeneroMusical("JAZZ");
		p2.agregarGeneroMusical("Lirico");
		p2.agregarInstrumento("Flauta");
		p2.agregarInstrumento("Guitarra");

		p3.agregarGeneroMusical("Rock");
		p3.agregarGeneroMusical("JAZZ");
		p3.agregarIdioma("Ingles");
		p3.agregarInstrumento("Guitarra");

		p4.agregarGeneroMusical("Rock");
		p4.agregarGeneroMusical("JAZZ");
		p4.agregarInstrumento("Arpa");
		p4.agregarInstrumento("Teclado");
		p4.agregarInstrumento("Bateria");

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
		p7.agregarInstrumento("Teclado");
		
		p8.agregarIdioma("Ingles");

		banda1.agregarElemento(banda2);

		coach1.agregarAlEquipo(banda1);
		
		//COSME FULANITO NO PUEDE SER AGREGADO POR CRITERIO DEL COACH
		
		coach2.agregarAlEquipo(p8);
		
		coach2.agregarAlEquipo(banda3);
		
		//System.out.println(coach2.seleccionarParticipantes(new CriterioSimple()));


		Criterio cEdad = new CriterioEdad(18);
		Criterio cGenero = new CriterioGenero("Rock");
		Criterio cIdioma = new CriterioIdioma("Ingles");
		Criterio cInst = new CriterioInstrumentos("Guitarra");

		Criterio cAnd1 = new CriterioAnd(cEdad, cGenero);
		Criterio cAnd2 = new CriterioAnd(cIdioma, cInst);
		Criterio cFinal = new CriterioAnd(cAnd1, cAnd2);

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

		// Criterio basado en los requerimientos de WelcomeToTheJungle

		Criterio criterioCancion = new CriterioAnd(cAnd2, cGenero);

		System.out.println("PUEDEN CANTAR : " + coach2.seleccionarParticipantes(criterioCancion));

		System.out.println("MAYORES DE EDAD COACH 2 : " + coach2.seleccionarParticipantes(cEdad));

		// ------------------------------------------------

		Criterio temaMusical = new CriterioIdioma("Ingles");
		Criterio temaInstrumento = new CriterioInstrumentos("Guitarra");
		Criterio temaGenero = new CriterioGenero("Rock");

		Criterio combinadoCancion = new CriterioAnd(temaMusical, temaInstrumento);
		Criterio combinadoTotal = new CriterioAnd(combinadoCancion, temaGenero);

		Cancion WelcomeToTheJungle = new Cancion("Welcome To the Jungles", "Ingles", "Letra", combinadoTotal);
		WelcomeToTheJungle.agregarInstrumento("Guitarra");
		WelcomeToTheJungle.agregarInstrumento("Teclado");
		WelcomeToTheJungle.agregarGeneroMusical("Bateria");
		WelcomeToTheJungle.agregarGeneroMusical("Rock");

		System.out.println("PUEDE BANDA UNO CANTAR WELCOME TO THE JUNGLE? " + WelcomeToTheJungle.puedeCantar(banda1));

		// ----------------------------------------------------------------
		// BATALLA EN CASO DE EMPATE
		Comparator batallaEdad = new batallaEdad();
		Comparator batallaGenero = new batallaGeneros();
		Comparator batallaIdiomas = new batallaIdiomas();
		Comparator batallaInstrumento = new batallaInstrumento();
		Comparator compCombinado = new comparadorAND(batallaEdad, batallaGenero);
		Comparator compCombinado2 = new comparadorAND(compCombinado, batallaIdiomas);
		produccion.setCriterioBatalla(compCombinado);
		System.out.println("BATALLA PRIMER ENFRENTAMIENTO: " + p1.getNombre() + " VS " + p2.getNombre() + " Resultado: "
				+ produccion.ganador(p1, p2));
		produccion.setCriterioBatalla(compCombinado2);
		System.out.println("BATALLA DESEMPATE: " + p1.getNombre() + " VS " + p2.getNombre() + " Resultado: "
				+ produccion.ganador(p1, p2));

		// ----------------------------------------------------------------
		// COACH ORDENAR LOS POSIBLES GANADORES

		System.out.println("MEJOR PARTICIPANTE COACH 1: " + coach1.ordenPorAptitud(compCombinado));
		System.out.println("MEJOR PARTICIPANTE COACH 2: " + coach2.ordenPorAptitud(compCombinado));

		// ----------------------------------------------------------------
		// Batalla mejores participantes

		ElementoBanda pmejor1 = coach1.ordenPorAptitud(batallaEdad).get(0);
		ElementoBanda pmejor2 = coach2.ordenPorAptitud(batallaEdad).get(0);
		System.out.println("Batalla mejores participantes: " + pmejor1.getNombre() + " VS " + pmejor2.getNombre() + " "
				+ " RESULTADO: " + produccion.ganador(pmejor1, pmejor2));

	}

}
