/**
* @author Facu
*/
package entidades;

import java.time.LocalDate;
import java.util.Scanner;

import Utils.Utilidades;

public class Servicio {
	protected long idServicio;
	private String notas;
	private LocalDate fecha;
	protected double precioTotal;
	/* Para relacion 1-N con Cliente */
	private Cliente cliente;

	/* Para el autocalculo del id */
	long numServicio = 0;

	/* constructores */
	public Servicio() {
		numServicio++;
		this.idServicio = numServicio;
	}

	public Servicio(long idServicio, String notas, LocalDate fecha, double precioTotal) {
		/* autocalculo del id */
		numServicio++;
		this.notas = notas;
		this.fecha = fecha;
		this.precioTotal = precioTotal;
		this.idServicio = numServicio;
	}

	/* Para heredar a mantenimiento */
	public Servicio(Mantenimiento servMantenimiento) {
		/* autocalculo del id */
		numServicio++;
		this.idServicio = numServicio;
		this.precioTotal = precioTotal;
	}

	/* Para heredar a Compra */
	public Servicio(Compra servCompra) {
		/* autocalculo del id */
		numServicio++;
		this.idServicio = numServicio;
		this.precioTotal = precioTotal;
	}

	/* Para heredar a Envio */
	public Servicio(Envio servEnvio) {
		/* autocalculo del id */
		numServicio++;
		this.idServicio = numServicio;
	}

	public static Servicio nuevoServicioCompra() {
		/* instancia del teclado */
		Scanner teclado = new Scanner(System.in);
		/* nueva instancia de Servicio */
		Servicio ret = new Servicio();

		System.out.println("Notas: ");
		String notasServ = " ";
		notasServ = teclado.nextLine();
		ret.setNotas(notasServ);

		/*
		 * hay que introducir el precio del servicio ya que por ejemplo un mantenimiento
		 * no se puede calcular el precio.
		 */
		System.out.println("Precio Total: ");
		double precioTotal = 0.0;
		precioTotal = teclado.nextDouble();
		ret.setPrecioTotal(precioTotal);
		/*
		 * hay que esperar a que luis explique como se inicializa, ahora mismo devuelve
		 * null con o sin esta linea
		 */
//		LocalDate fechaToday = null;
//		fechaToday = Utilidades.Fechas();
//		ret.setFechaToday(fechaToday);

		return ret;
	}

	public static Servicio nuevoServicioReparacion() {
		/* instancia del teclado */
		Scanner teclado = new Scanner(System.in);
		/* nueva instancia de Servicio */
		Servicio ret = new Servicio();

		System.out.println("Notas: ");
		String notasServ = " ";
		notasServ = teclado.nextLine();
		ret.setNotas(notasServ);

		/*
		 * hay que introducir el precio del servicio ya que por ejemplo un mantenimiento
		 * no se puede calcular el precio.
		 */
		System.out.println("Precio Total: ");
		double precioTotal = 0.0;
		precioTotal = teclado.nextDouble();
		ret.setPrecioTotal(precioTotal);
		/*
		 * hay que esperar a que luis explique como se inicializa, ahora mismo devuelve
		 * null con o sin esta linea
		 */
//		LocalDate fechaToday = null;
//		fechaToday = Utilidades.Fechas();
//		ret.setFechaToday(fechaToday);

		return ret;
	}
	
	/* Getters, setters y to string */
	public long getIdServicios() {
		return idServicio;
	}

	public void setIdServicios(long idServ) {
		this.idServicio = idServ;
	}

	public String getNotas() {
		return notas;
	}

	public void setNotas(String notas) {
		this.notas = notas;
	}

	public long getIdServicio() {
		return idServicio;
	}

	public void setIdServicio(long idServicio) {
		this.idServicio = idServicio;
	}

	public LocalDate getFechaToday() {
		return fecha;
	}

	public void setFechaToday(LocalDate fechaToday) {
		this.fecha = fecha;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public long getNumServicio() {
		return numServicio;
	}

	public void setNumServicio(long numServicio) {
		this.numServicio = numServicio;
	}

	@Override
	public String toString() {
		return "Servicio [idServicio=" + idServicio + ", notas=" + notas + ", fecha=" + fecha + ", precioTotal="
				+ precioTotal + "]";
	}

}
