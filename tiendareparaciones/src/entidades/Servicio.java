//Facu
package entidades;

import java.time.LocalDate;
import java.util.Scanner;

import Utils.Utilidades;

public class Servicio {
	protected long idServicio;
	private String notas;
	private LocalDate fecha;
	protected double precioTotal;

	/* constructor por defecto y de nuevo servicio */
	public Servicio(long idServicio, double precioTotal) {
		super();
		/* autocalculo del id */
		long numServicio = 0;
		numServicio++;
		this.idServicio = numServicio;
	}

	public Servicio() {
		this.idServicio = idServicio;
		this.notas = notas;
		this.fecha = fecha;
		this.precioTotal = precioTotal;
		/* autocalculo del id */
		long numServicio = 0;
		numServicio++;
		this.idServicio = numServicio;
	}

	public static Servicio nuevoServicio() {
		Servicio ret = new Servicio(0, 0);
		Scanner teclado = new Scanner(System.in);

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
//	public static Servicio nuevoServicioDeMantenimiento() {
//		Servicio ret = new Servicio();
//		Scanner teclado = new Scanner(System.in);
//
//		System.out.println("id: ");
//		long idServ = 0;
//		idServ = teclado.nextLong();
//		ret.setIdServicios(idServ);
//
//		System.out.println("Notas: ");
//		String notasServ = " ";
//		notasServ = teclado.nextLine();
//		ret.setNotas(notasServ);
//
//		// hay que introducir el precio del servicio ya que por ejemplo un mantenimiento
//		// no se puede calcular el precio.
//		System.out.println("Precio Total: ");
//		double precioTotal = 0.0;
//		precioTotal = teclado.nextDouble();
//		ret.setPrecioTotal(precioTotal);
//
//		System.out.println("introduzca nuevo mant");
//		String mantenimiento. = null;
//		mantenimiento = ;
//		return ret.setMantenimiento(mantenimiento); 
//	}

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

	@Override
	public String toString() {
		return "Servicio [idServicio=" + idServicio + ", notas=" + notas + ", fecha=" + fecha + ", precioTotal="
				+ precioTotal + "]";
	}

}
