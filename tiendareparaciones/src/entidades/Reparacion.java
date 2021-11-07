//Facu
package entidades;
import java.util.Scanner;

public class Reparacion {
	private long idReparacion;
	private String duraciontotal;

	// constructor por defecto
	public Reparacion() {
	}
	
	public static Reparacion nuevaReparacion() {
		Reparacion ret = new Reparacion();
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("duracion total de la reparacion: ");
		//String duracionRep2 = "";
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