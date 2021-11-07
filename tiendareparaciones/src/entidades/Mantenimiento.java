//Facu
package entidades;
import java.util.Scanner;

public class Mantenimiento extends Servicio{
	private double horasTrabajadas;
	
	// constructores 	
	public Mantenimiento() {
		super();
	}
	
	public Mantenimiento(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	public static Mantenimiento nuevoMantenimiento() {
		Scanner teclado = new Scanner(System.in);
		
		Mantenimiento ret = new Mantenimiento();
		System.out.println("Cuantas horas duro el mantenimiento?");
		double horasServ = 0.0;
		horasServ = teclado.nextDouble();
		ret.setHorasTrabajadas(horasServ);
				
		return ret;
	}

	// Getters and setters
	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	@Override
	public String toString() {
		return "Mantenimiento [horasTrabajadas=" + horasTrabajadas + ", idServicio=" + idServicio + ", precioTotal="
				+ precioTotal + "]";
	}

}
