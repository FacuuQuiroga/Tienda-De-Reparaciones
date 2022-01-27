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
	protected Cliente idCliente;
	protected Mantenimiento m = null;
	protected Compra c = null;
	protected Envio e = null;

	/* constructores */
	public Servicio() {
		super();
	}

	public Servicio(long idServicio, Cliente idCl, String notas, LocalDate fecha, double precioTotal) {
		this.notas = notas;
		this.fecha = fecha;
		this.precioTotal = precioTotal;
		this.idServicio = idServicio;
		this.idCliente = idCl;
	}

	/* Para mantenimiento */
	public Servicio(long idServicio, Cliente idCl, String notas, LocalDate fecha, double precioTota,
			Mantenimiento mant) {
		this.notas = notas;
		this.fecha = fecha;
		this.precioTotal = precioTotal;
		this.idServicio = idServicio;
		this.m = mant;
		this.idCliente = idCl;

	}

	/* Para Compra */
	public Servicio(long idServicio, Cliente idCl, String notas, LocalDate fecha, double precioTota, Compra compra) {
		this.notas = notas;
		this.fecha = fecha;
		this.precioTotal = precioTotal;
		this.idServicio = idServicio;
		this.c = compra;
		this.idCliente = idCl;

	}

	/* Para Envio */
	public Servicio(long idServicio, Cliente idCl, String notas, LocalDate fecha, double precioTota, Envio envio) {
		this.notas = notas;
		this.fecha = fecha;
		this.precioTotal = precioTotal;
		this.idServicio = idServicio;
		this.e = envio;
		this.idCliente = idCl;

	}

	public static Servicio nuevoServicio(String s) {
		/* instancia del teclado */
		Scanner teclado = new Scanner(System.in);

		// preguntar al usuario si quiere usar un cliente ya registrado o crear uno
		// nuevo y guardar el id del Cliente en la variable idCliente en servicios.

		/* nueva instancia de Servicio */
		Servicio ret = new Servicio();

		// comprobamos si el servicio es una compra o un mantenimiento.
		if (s == "c") {
			Compra c = new Compra();
			c = Compra.nuevaCompra();
		} else if (s == "m") {
			Mantenimiento m = new Mantenimiento();
			m = Mantenimiento.nuevoMantenimiento();
		}

		System.out.println("Desea agregar notas?: ");

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
	public long getIdServicio() {
		return idServicio;
	}

	public void setIdServicio(long idServicio) {
		this.idServicio = idServicio;
	}

	public String getNotas() {
		return notas;
	}

	public void setNotas(String notas) {
		this.notas = notas;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public Cliente getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Cliente idCliente) {
		this.idCliente = idCliente;
	}

	public Mantenimiento getM() {
		return m;
	}

	public void setM(Mantenimiento m) {
		this.m = m;
	}

	public Compra getC() {
		return c;
	}

	public void setC(Compra c) {
		this.c = c;
	}

	public Envio getE() {
		return e;
	}

	public void setE(Envio e) {
		this.e = e;
	}

	@Override
	public String toString() {
		return "Servicio [idServicio=" + idServicio + ", notas=" + notas + ", fecha=" + fecha + ", precioTotal="
				+ precioTotal + ", idCliente=" + idCliente + ", m=" + m + ", c=" + c + ", e=" + e + "]";
	}

}
