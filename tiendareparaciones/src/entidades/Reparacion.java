/*Facu*/
package entidades;

import java.util.Scanner;

public class Reparacion extends Mantenimiento {
	/* id reparacion se autocalcula solo */
	private long idReparacion;
	private String duraciontotal;

	/* Para el autocalculo del id */
	long numReparacion = 0;

	/* Constructores */
	// por defecto
	public Reparacion() {
		numReparacion++;
		this.idReparacion = numReparacion;
	}

	// Para herencia de Mantenimiento
	public Reparacion(double horasTrabajadas) {
		super(horasTrabajadas);

	}

	/* Para crear un nuevo registro de reparacion */
	public static Reparacion nuevaReparacion() {
		Reparacion ret = new Reparacion();
		Scanner teclado = new Scanner(System.in);

		System.out.println("duracion total de la reparacion: ");
		String duracionRep = teclado.nextLine();
		ret.setDuraciontotal(duracionRep);

		return ret;
	}

	// getters, setters y to string*/
	public long getIdReparacion() {
		return idReparacion;
	}

	public void setIdReparacion(long idReparacion) {
		this.idReparacion = idReparacion;
	}

	public String getDuraciontotal() {
		return duraciontotal;
	}

	public void setDuraciontotal(String duraciontotal) {
		this.duraciontotal = duraciontotal;
	}

	@Override
	public String toString() {
		return "Reparacion [idReparacion=" + idReparacion + ", duraciontotal=" + duraciontotal + "]";
	}

}
