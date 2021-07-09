package modelos;

public class Informe {

	private static final String MSG_PROMEDIO = "Promedio de tiempo de autos aprobados: \n";
	private static final String SEGUNDOS = " Segundos \n";
	private double porcReprobados;
	private double promAutosAprobados;

	public Informe(double porcReprobados, double promAutosAprobados) {

		this.porcReprobados = porcReprobados;
		this.promAutosAprobados = promAutosAprobados;

	}

	@Override
	public String toString() {

		return "Porcentaje  de Vehiculos Reprobados: \n" + porcReprobados + "% \n" + "\n" + MSG_PROMEDIO
				+ promAutosAprobados + SEGUNDOS;
	}

}
