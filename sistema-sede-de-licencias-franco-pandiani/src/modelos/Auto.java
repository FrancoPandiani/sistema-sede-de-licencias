package modelos;

public class Auto extends Vehiculo {

	private static final int ZERO = 0;
	private static final int SEIS = 6;

	private int cantPuertas;
	private MarcaAutoEnum marcaAuto;
	

	public Auto(int cantPuertas, String color, MarcaAutoEnum marcaAuto, String patente, int cilindrada) {

		super(color, patente, cilindrada);
		setCantPuertas(cantPuertas);
		this.marcaAuto = marcaAuto;

	}

	private void setCantPuertas(int cantPuertas) {

		if (cantPuertas < ZERO || cantPuertas > SEIS) {
			throw new IllegalArgumentException();
		}
		this.cantPuertas = cantPuertas;

	}

	@Override
	public String toString() {
		return "Auto Marca: "+ this.marcaAuto +" / Color:"+super.getColor()+" / Patente:"+super.getPatente()+ " / Cantidad de puertas: "+this.cantPuertas;
	}
	
}
