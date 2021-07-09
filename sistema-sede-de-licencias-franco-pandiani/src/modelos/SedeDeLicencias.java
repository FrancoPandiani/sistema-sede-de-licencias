package modelos;

import java.util.ArrayList;

public class SedeDeLicencias {
	private static final int CIEN = 100;
	private ArrayList<Examen> examenes;
	private String nombre;

	public SedeDeLicencias(String nombre) {
		this.examenes = new ArrayList<Examen>();
		setNombre(nombre);
	}

	private void setNombre(String nombre) {

		if (nombre.equals("")) {
			throw new IllegalArgumentException("Debe colocar un nombre, intente nuevamente.");
		}

		this.nombre = nombre;

	}

	public void ImprimirExamenes() {

		for (Examen e : examenes) {
			System.out.println(e);
		}
	}

	public void agregarExamen(Examen ex) {
		this.examenes.add(ex);
	}

	public void removerExamen(Examen ex) {
		this.examenes.remove(ex);
	}

	public void obtenerInforme() {
		Informe informe;
		double porcReprobados = porcentajeReprobados();
		double prom = promTiempoAutosAprobados();

		informe = new Informe(porcReprobados, prom);
		System.out.println("Resultado del Informe: \n" + "\n" + informe);
	}

	public double promTiempoAutosAprobados() {
		int acuTiempos = 0;
		int contTiempos = 0;

		for (Examen e : examenes) {
			if (e instanceof ExamenDeAuto && e.aprobado()) {
				acuTiempos += ((ExamenDeAuto) e).getTiempo();
				contTiempos++;
			}
		}
		return (contTiempos > 0 ? (double) acuTiempos / contTiempos : 0);
		// puse este validacion con ternario, para evitar la division por 0;
	}

	public double porcentajeReprobados() {
		int cantReprobados = 0;
		int cantTotal = this.examenes.size();

		for (Examen e : this.examenes) {
			if (!e.aprobado()) {
				cantReprobados++;
			}
		}
		return (cantTotal > 0 ? (double) cantReprobados / cantTotal * CIEN : 0);
		// puse este validacion con ternario, para evitar la division por 0;
	}

	@Override
	public String toString() {
		return "Sede de Licencias: " + this.nombre;
	}

}
