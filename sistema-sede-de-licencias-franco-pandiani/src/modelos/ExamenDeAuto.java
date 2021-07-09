package modelos;

public class ExamenDeAuto extends Examen {

	private static final int SEGUNDOS_MIN = 90;
	private Circuito circuito;
	private Auto auto;

	public ExamenDeAuto(Persona persona, int id, Circuito circuito, Auto auto) {
		super(persona, id);
		this.circuito = circuito;
		this.auto = auto;
	}

	public int getTiempo() {
		return this.circuito.getTiempoEnSegundos();
	}

	@Override
	public boolean aprobado() {
		return this.circuito.aprobado() && this.circuito.getTiempoEnSegundos() < SEGUNDOS_MIN;
	}

	@Override
	public void mostrarVehiculo() {
		System.out.println(auto);
		
	}

}
