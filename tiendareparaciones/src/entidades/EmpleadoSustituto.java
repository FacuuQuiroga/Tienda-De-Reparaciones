//hace ville
package entidades;

import java.util.Scanner;

public class EmpleadoSustituto extends Empleado {

	private String edad;
	private boolean colectivo;
	private BajaEmpleado baja; // carga de un objeto completo

	public EmpleadoSustituto() {
	}

	public EmpleadoSustituto(long idEmpleado, String nombre, String apellido, String direccion, String telefono,
			String nif, String edad, boolean colectivo) {
		super(idEmpleado, nombre, apellido, direccion, telefono, nif);
		this.edad = edad;
		this.colectivo = colectivo;
	}

	// método nuevoClase

	public static EmpleadoSustituto nuevoClase() {

		EmpleadoSustituto empleadoSus = new EmpleadoSustituto();

		Scanner teclado = new Scanner(System.in);

		System.out.println("edad: ");
		String edad = "0";
		edad = teclado.nextLine();
		empleadoSus.setEdad(edad);

		System.out.println("colectivo: ");
		boolean colectivo = false;
		colectivo = teclado.nextBoolean();
		empleadoSus.setColectivo(colectivo);

		System.out.println(empleadoSus.toString());

		return empleadoSus;
	}

	// getters y setters

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public boolean isColectivo() {
		return colectivo;
	}

	public void setColectivo(boolean colectivo) {
		this.colectivo = colectivo;
	}

	public BajaEmpleado getBaja() {
		return baja;
	}

	public void setBaja(BajaEmpleado baja) {
		this.baja = baja;
	}

	// toString

	@Override
	public String toString() {
		return "EmpleadoSustituto [edad=" + edad + ", colectivo=" + colectivo + ", baja=" + baja + "]";
	}

}
