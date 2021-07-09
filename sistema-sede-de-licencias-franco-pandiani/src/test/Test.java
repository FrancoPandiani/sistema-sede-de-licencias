package test;

import modelos.Auto;
import modelos.Circuito;
import modelos.ExamenDeAuto;
import modelos.ExamenDeMoto;
import modelos.MarcaAutoEnum;
import modelos.MarcaMotoEnum;
import modelos.Moto;
import modelos.Persona;
import modelos.SedeDeLicencias;

public class Test {

	private static final int DOS = 2;
	private static final int TRES = 3;
	private static final String PROCESANDO = "**** PROCESANDO ELEMENTOS ****";
	private static final String OK = " - OK";
	private static final String INICIO = "**** INICIALIZANDO ELEMENTOS ****";
	private static final String SEPARADOR = "---------------------------------";
	private static final String FIN = "PROGRAMA FINALIZADO.";
	
	
	public static void main(String[] args) {

		imprimir(SEPARADOR);
		imprimir(INICIO);
		imprimir(SEPARADOR);

		try {
			SedeDeLicencias sede1 = new SedeDeLicencias("Roca");
			Persona[] personas = new Persona[TRES];
			Auto[] autos = new Auto[DOS];
			Circuito[] circuitos = new Circuito[TRES];
			Moto moto1 = new Moto("Roja", "ASD711", 125, MarcaMotoEnum.YAMAHA);

			imprimirEntidad(sede1);
			imprimir(SEPARADOR);
			personas = inicializarPersonas();
			imprimirEntidades(personas);
			imprimir(SEPARADOR);
			imprimirEntidad(moto1);
			imprimir(SEPARADOR);
			autos = inicializarAutos();
			imprimirEntidades(autos);
			imprimir(SEPARADOR);
			circuitos = inicializarCircuitos();
			imprimirEntidades(circuitos);
			imprimir(SEPARADOR);
			inicializarExamenes(sede1, personas, autos, circuitos, moto1);
			sede1.ImprimirExamenes();
			imprimir(SEPARADOR);
			imprimir(PROCESANDO);
			imprimir(SEPARADOR);
			sede1.obtenerInforme();
			imprimir(SEPARADOR);

		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		imprimir(FIN);
	}

	private static void imprimir(String cadena) {
		System.out.println(cadena);

	}

	private static void imprimirEntidad(Object objeto) {

		System.out.println(objeto + OK);

	}

	private static void imprimirEntidades(Object[] objetos) {

		for (Object o : objetos) {
			System.out.println(o + OK);
		}

	}

	private static Circuito[] inicializarCircuitos() {

		Circuito c1 = new Circuito(45, 1, 1);
		Circuito c2 = new Circuito(58, 2, 2);
		Circuito c3 = new Circuito(66, 3, 3);
		final Circuito[] circuitos = { c1, c2, c3 };

		return circuitos;

	}

	private static Auto[] inicializarAutos() {

		Auto a1 = new Auto(5, "Azul", MarcaAutoEnum.FORD, "TER-722", 12);
		Auto a2 = new Auto(6, "Verde", MarcaAutoEnum.PEUGEOT, "NUZ-223", 12);
		final Auto[] autos = { a1, a2 };

		return autos;

	}

	private static Persona[] inicializarPersonas() {

		Persona p1 = new Persona("36.721.045", "Franco", "francopandiani92@gmail.com");
		Persona p2 = new Persona("22.977.896", "Pedro", "guzman@gmail.com");
		Persona p3 = new Persona("39.677.849", "Jorge", "silvestri@gmail.com");
		final Persona[] personas = { p1, p2, p3 };

		return personas;

	}

	private static void inicializarExamenes(SedeDeLicencias sede, Persona[] personas, Auto[] autos,
			Circuito[] circuitos, Moto moto1) {

		sede.agregarExamen(new ExamenDeAuto(personas[0], 1, circuitos[0], autos[0]));
		sede.agregarExamen(new ExamenDeMoto(personas[1], 2, moto1, circuitos));
		sede.agregarExamen(new ExamenDeAuto(personas[2], 3, circuitos[1], autos[1]));
	}
}
