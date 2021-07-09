package modelos;

public abstract class Vehiculo {
	private static final String MSG_ERROR_CILINDRADA = "La cilindrada tiene que ser mayor a 0";
	private static final String MSG_ERROR_COLOR = "Debe colocar un color en el vehiculo, Intente nuevamente";
	private static final String MSG_ERROR_PATENTE = "Debe colocar una patente";
	private String color;
	private String patente;
	private int cilindrada;

	protected Vehiculo(String color, String patente, int cilindrada) {

		setColor(color);
		setPatente(patente);
		setCilindrada(cilindrada);
	}

	private void setCilindrada(int cilindrada) {

		if (cilindrada < 0) {
			throw new IllegalArgumentException(MSG_ERROR_CILINDRADA);
		}
		this.cilindrada = cilindrada;

	}

	protected void setColor(String color) {

		if (color.equals("")) {
			throw new IllegalArgumentException(MSG_ERROR_COLOR);
		}

		this.color = color;
	}

	protected void setPatente(String patente) {

		if (patente.equals("")) {
			throw new IllegalArgumentException(MSG_ERROR_PATENTE);
		}
		this.patente = patente;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public String getPatente() {
		return this.patente;
	}

	public String getColor() {
		return this.color;
	}
}
