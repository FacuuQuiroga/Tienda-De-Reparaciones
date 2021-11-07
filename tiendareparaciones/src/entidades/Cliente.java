//Facu
package entidades;

import java.util.Scanner;

import Utils.Utilidades;

public class Cliente {

	private long idCliente = 0;
	private String nombre = "Sin nombre";
	private String nif;
	private String direccion = "Sin direccion";
	private String telefono = "Sin telefono disponible";
	private String numeroTarjeta;
	private String cuentaCorriente;

	// Constructores, uno por defecto, uno para registrar un nuevo cliente
	private Cliente() {
		super();
	}

	
	public static Cliente nuevoCliente() {
		Cliente ret = new Cliente();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce los siguientes datos para registrar un Cliente nuevo: ");

		System.out.println("Nombre del cliente");
		String nombreCl = "";
		nombreCl = teclado.nextLine();
		ret.setNombre(nombreCl);

		System.out.println("nif del cliente");
		String nifCl = "";
		nifCl = teclado.nextLine();
		ret.setNif(nifCl);

		System.out.println("direccion del cliente");
		String dirCl = "";
		dirCl = teclado.nextLine();
		ret.setDireccion(dirCl);

		System.out.println("telefono del cliente");
		String telCl = "";
		telCl = teclado.nextLine();
		ret.setTelefono(telCl);

		System.out.println("Numero de tarjeta del cliente");
		String numTarjCl = "";
		numTarjCl = teclado.nextLine();
		ret.setNumeroTarjeta(numTarjCl);

		System.out.println("numero de cuenta del cliente");
		String cuentaCl = "";
		cuentaCl = teclado.nextLine();
		ret.setCuentacorriente(cuentaCl);

		return ret;
	}

	// Getters , setters and to string
	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
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

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public String getCuentacorriente() {
		return cuentaCorriente;
	}

	public void setCuentacorriente(String cuentacorriente) {
		cuentaCorriente = cuentacorriente;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", nif=" + nif + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", numeroTarjeta=" + numeroTarjeta + ", Cuentacorriente=" + cuentaCorriente
				+ "]";
	}

}
