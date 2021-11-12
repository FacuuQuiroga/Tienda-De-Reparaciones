/*Facu*/
package entidades;

import java.util.Scanner;
import Utils.Validador;

public class Cliente {

	/* id de cliente, sirve para identificarlo, se autocalcula. */
	private long idCliente = 0;
	/*
	 * nombre representa el nombre de el nuevo cliente, no acepta numeros ni
	 * caracteres especiales, max 25 caracteres.
	 */
	private String nombre = "Sin nombre";
	/*
	 * nif del cliente, no puede repetirse entre clientes, podria ser clave
	 * secundaria, es obligatorio
	 */
	private String nif;
	private String direccion = "Sin direccion";
	private String telefono = "Sin telefono disponible";
	private String numeroTarjeta;
	private String cuentaCorriente;

	/* Constructores, uno por defecto, uno para registrar un nuevo cliente */
	private Cliente() {
		super();
		/* para autocalculo del idCliente */
		long numPersona = 0;
		numPersona++;
		this.idCliente = numPersona;
	}

	public static Cliente nuevoCliente() {
		/* instancia para el teclado */
		Cliente ret = new Cliente();
		Scanner teclado = new Scanner(System.in);
		

//		boolean idClienteValido = false;
//		long idValidado = idCliente;
//		do {
//			idClienteValido = Validador.validarId(idValidado);
//		}while (!idClienteValido);

		System.out.println("Introduce los siguientes datos para registrar un Cliente nuevo:" + "\n");
		String nombreCl = "";
		/* para validar el nombre sea correcto, declarado en la clase Validador */
		boolean nombreValido = false;
		do {
			System.out.println(
					"Nombre del cliente: (la primera letra en mayuscula y separando los nombres y apellidos con espacios)");
			nombreCl = teclado.nextLine();
			nombreValido = Validador.validarNombre(nombreCl);
		} while (!nombreValido);
		ret.setNombre(nombreCl);

		String nifCl = "";
		boolean nifValido = false;
		do {
			System.out.println("Nif del cliente: (unicamente 8 numeros y 1 letra)");
			nifCl = teclado.nextLine();
			nifValido = Validador.validarNif(nifCl);
		} while (!nifValido);
		ret.setNif(nifCl);

		String direccionCl = null;
		boolean direccionClValido = false;
		do {
			System.out.println("direccion del cliente: (maximo 40 caracteres y minimo 5)");
			direccionCl = teclado.nextLine();
			direccionClValido = Validador.validarDir(direccionCl);
		} while (!direccionClValido);
		ret.setDireccion(direccionCl);

		String telCl = null;
		boolean telClValido = false;
		do {
			System.out.println("telefono del cliente: (maximo 9 numeros: xxx xx xx xx");
			telCl = teclado.nextLine();
			telClValido = Validador.validarTel(telCl);
		} while (!telClValido);
		ret.setTelefono(telCl);

		String numTarjCl = null;
		boolean numTarjValido = false;
		do {
			System.out.println("Numero de tarjeta del cliente: (16 caracteres incluido el codigo del pais)");
			numTarjCl = teclado.nextLine();
			numTarjValido = Validador.validarTarjeta(numTarjCl);
		} while (!numTarjValido);
		ret.setNumeroTarjeta(numTarjCl);

		String cuentaCorrienteCl = null;
		boolean cuentaCorrienteValida = false;
		do {
			System.out.println("Numero de cuenta del cliente: ");
			cuentaCorrienteCl = teclado.nextLine();
			cuentaCorrienteValida = Validador.ValidarCuentaCorriente(cuentaCorrienteCl);
		}while(!cuentaCorrienteValida);		
		ret.setCuentacorriente(cuentaCorrienteCl);

		return ret;
	}

	/* Getters , setters y to string */
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
