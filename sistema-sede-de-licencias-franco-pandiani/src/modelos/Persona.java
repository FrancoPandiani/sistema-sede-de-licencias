package modelos;

public class Persona {

	private static final String MSG_ERROR_VACIO = "Este campo no puede estar vacio";
	private String dni;
	private String nombre;
	private String email;

	public Persona(String dni, String nombre, String email) {

		setDni(dni);
		setNombre(nombre);
		setEmail(email);
	}

	private void setDni(String dni) {
		if (dni.equals("")) {
			throw new IllegalArgumentException(MSG_ERROR_VACIO);
		}
		this.dni = dni;
	}

	private void setNombre(String nombre) {
		if (nombre.equals("")) {
			throw new IllegalArgumentException(MSG_ERROR_VACIO);
		}
		this.nombre = nombre;
	}

	private void setEmail(String email) {
		if (email.equals("")) {
			throw new IllegalArgumentException(MSG_ERROR_VACIO);
		}
		this.email = email;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getDni() {
		return this.dni;
	}

	@Override
	public String toString() {
		return "Cliente: " + this.nombre + " / Dni:" + dni + " / Email: " + email;
	}

}
