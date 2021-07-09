package modelos;

public class Circuito implements Evaluable {
	
	private static final String MSG_NUM_CIRCUITO = "El numero del circuito debe ser mayor a 0";
	private static final String MSG_ERROR_SEGUNDOS = "Los segundos deben ser mayor a 0";
	private static final String MSG_ERROR_FALTAS = "Las faltas deben ser mayor a 0";
	private static final int ZERO = 0;
	private static final int MAX_FALTAS = 2;
	private int tiempoEnSegundos;
	private int numeroDeFaltas;
	private int numero;
	
	public Circuito(int tiempoEnSegundos, int numeroDeFaltas,int numero) {
		
		setTiempoEnSegundos(tiempoEnSegundos);
		setNumeroDeFaltas(numeroDeFaltas);
		setNumero(numero);
	}

	private void setNumero(int numero) {
		if (numero < ZERO) {
			throw new IllegalArgumentException(MSG_NUM_CIRCUITO);
		}
		this.numero=numero;
		
	}

	private void setNumeroDeFaltas(int numeroDeFaltas) {
		if (numeroDeFaltas < ZERO) {
			throw new IllegalArgumentException(MSG_ERROR_FALTAS);
		}
		this.numeroDeFaltas = numeroDeFaltas;
		
	}

	private void setTiempoEnSegundos(int tiempoEnSegundos) {
		if (tiempoEnSegundos < ZERO) {
			throw new IllegalArgumentException(MSG_ERROR_SEGUNDOS);
		}
		this.tiempoEnSegundos = tiempoEnSegundos;
		
	}
	public int getTiempoEnSegundos() {
		return this.tiempoEnSegundos;
	}

	@Override
	public boolean aprobado() {
		
		return this.numeroDeFaltas<= MAX_FALTAS;
	}

	@Override
	public String toString() {
		return "Circuito "+this.numero+" [Tiempo en segundos= " + tiempoEnSegundos + " / NumeroDeFaltas=" + numeroDeFaltas + "]";
	}
	
	
}
