/*Facu*/
package entidades;

import java.util.Scanner;

public class Reparacion extends Mantenimiento {
	private long idReparacion;
	private String duraciontotal;

	/* Constructores */
	public Reparacion() {
		long numReparacion = 0;
		numReparacion++;
		this.idReparacion = numReparacion;
	}

	public Reparacion(long idReparaciones, String duracionTotal) {
		this.idReparacion = idReparaciones;
		this.duraciontotal = duracionTotal;
		long numReparacion = 0;
		numReparacion++;
		this.idReparacion = numReparacion;
		
	}

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
