package modelos;

public abstract class Examen implements Evaluable {

	private Persona persona;
	private int id;

	protected Examen(Persona persona, int id) {

		this.persona = persona;
		this.id = id;
	}
	public abstract void mostrarVehiculo();

	@Override
	public String toString() {
		return "Examen " + this.id + "- Conductor: " + persona.getNombre() + " Dni:" + persona.getDni();
	}

}
