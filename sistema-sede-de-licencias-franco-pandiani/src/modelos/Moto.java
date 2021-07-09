package modelos;

public class Moto extends Vehiculo {

	private MarcaMotoEnum marcaMoto;

	public Moto(String color, String patente, int cilindrada, MarcaMotoEnum marcaMoto) {

		super(color, patente, cilindrada);

		this.marcaMoto = marcaMoto;
	}

	@Override
	public String toString() {
		return "Moto:" + marcaMoto + " / Color:" + super.getColor() + " / Patente:" + super.getPatente();
	}

}
