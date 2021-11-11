//Facu
package entidades;

import java.util.Scanner;

public class Reparacion extends Mantenimiento {
	private long idReparacion;
	private String duraciontotal;
			
	// Constructor
	public Reparacion() {
	}
	
	public Reparacion(long idReparaciones, String duracionTotal){
		this.idReparacion = idReparaciones;
		this.duraciontotal = duracionTotal;
		super.nuevoMantenimiento();
	}
	

	public static Reparacion nuevaReparacion() {
		Reparacion ret = new Reparacion();
		Scanner teclado = new Scanner(System.in);

		System.out.println("duracion total de la reparacion: ");
		// String duracionRep2 = "";
		String duracionRep = teclado.nextLine();
		ret.setDuraciontotal(duracionRep);

		return ret;
	}

	// getters and setters
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

	// to string
	@Override
	public String toString() {
		return "Reparacion [idReparacion=" + idReparacion + ", duraciontotal=" + duraciontotal + "]";
	}

}
