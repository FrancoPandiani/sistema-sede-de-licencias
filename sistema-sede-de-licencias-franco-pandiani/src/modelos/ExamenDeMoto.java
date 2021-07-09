package modelos;

public class ExamenDeMoto extends Examen {

	private static final int ZERO = 0;
	private static final int TOPE_CILINDRADA = 120;
	private Circuito[] circuitos;
	private Moto moto;

	public ExamenDeMoto(Persona persona, int id, Moto moto, Circuito[] circuitos) {

		super(persona, id);
		this.circuitos = circuitos;
		this.moto = moto;
	}

	@Override
	public boolean aprobado() {
		boolean aprueba = false;

		if (this.moto.getCilindrada() > TOPE_CILINDRADA) {
			aprueba = cantCircuitosAprobados() == circuitos.length;
		}
		return aprueba;
	}

	private int cantCircuitosAprobados() {
		int total = ZERO;

		for (Circuito c : circuitos) {
			if (c.aprobado()) {
				total++;
			}
		}
		return total;
	}

	@Override
	public void mostrarVehiculo() {
		System.out.println(moto);
		
	}

}
