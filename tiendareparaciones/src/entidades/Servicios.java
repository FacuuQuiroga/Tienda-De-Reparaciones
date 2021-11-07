//Facu
package entidades;

import java.time.LocalDate;
import java.util.Scanner;

import Utils.Utilidades;

public class Servicios {
	protected long idServicio;
	private String notas;	
	private LocalDate fecha;
	protected double precioTotal;
	private Mantenimiento mantenimiento;
	// constructor por defecto y de nuevo servicio
	
	public Servicios() {
	}


	public static Servicios nuevoServicio() {
		Servicios ret = new Servicios();
		Scanner teclado = new Scanner(System.in);

		System.out.println("id: ");
		long idServ = 0;
		idServ = teclado.nextLong();
		ret.setIdServicios(idServ);

		System.out.println("Notas: ");
		String notasServ = " ";
		notasServ = teclado.nextLine();
		ret.setNotas(notasServ);

		// hay que introducir el precio del servicio ya que por ejemplo un mantenimiento
		// no se puede calcular el precio.
		System.out.println("Precio Total: ");
		double precioTotal = 0.0;
		precioTotal = teclado.nextDouble();
		ret.setPrecioTotal(precioTotal);
		

		// ret.getFecha(); // hay que esperar a que luis explique como se inicializa,
		// ahora mismo devuelve null con o sin esta linea

		return ret;
	}
//	public static Servicio nuevoServicioConMantenimiento() {
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
//		System.out.println("introduzca nuebo mant");
//		String mantenimiento. = null;
//		mantenimiento = ;
//		return ret.setMantenimiento(mantenimiento); 
//	}

	public Mantenimiento getMantenimiento() {
		return mantenimiento;
	}


	public void setMantenimiento(Mantenimiento mantenimiento) {
		this.mantenimiento = mantenimiento;
	}


	// Getters and setters
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

	// To String
	@Override
	public String toString() {
		return "Servicios [idServicios=" + idServicio + ", notas=" + notas + ", fecha=" + fecha + ", precioTotal="
				+ precioTotal + "]";
	}

}