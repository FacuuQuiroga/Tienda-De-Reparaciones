//Facu: ville termino las relaciones de esta clase, yo la empece 
package entidades;

import java.util.Scanner;

public class Empleado {

	private long idEmpleado;
	private String nombre;
	private String apellido;
	private String direccion;
	private String telefono;
	private String nif;
	private String[] bajas; // colección de elementos

	public Empleado() {
	}

	public Empleado(long idEmpleado, String nombre, String apellido, String direccion, String telefono, String nif) {
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.nif = nif;
	}

	// método nuevoClase

	public static Empleado nuevoClase() {
		Empleado empleado = new Empleado();

		Scanner teclado = new Scanner(System.in);

		System.out.println("id: ");
		long idEmpl = 0;
		idEmpl = teclado.nextLong();
		empleado.setIdEmpleado(idEmpl);

		System.out.println("Nombre: ");
		String nombreEmpl = " ";
		nombreEmpl = teclado.nextLine();
		empleado.setNombre(nombreEmpl);

		System.out.println("Apellidos: ");
		String apellidos = " ";
		apellidos = teclado.nextLine();
		empleado.setApellido(apellidos);

		System.out.println("Direccion: ");
		String direccion = " ";
		direccion = teclado.nextLine();
		empleado.setDireccion(direccion);

		System.out.println("Teléfono: ");
		String telefono = " ";
		telefono = teclado.nextLine();
		empleado.setTelefono(telefono);

		System.out.println("Nif: ");
		String nif = " ";
		nif = teclado.nextLine();
		empleado.setNif(nif);

		System.out.println(empleado.toString());

		return empleado;
	}

	// getters and setters

	public long getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(long idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String[] getBajas() {
		return bajas;
	}

	public void setBajas(String[] bajas) {
		this.bajas = bajas;
	}

	// to string

	@Override
	public String toString() {
		return " El empleado con id [idEmpleado=" + idEmpleado + ",es: Nombre=" + nombre + "y de apellido" + apellido
				+ ",con direccion en:" + direccion + ",su telefono es:" + telefono + "y su nif es:" + nif + "]";
	}

}
