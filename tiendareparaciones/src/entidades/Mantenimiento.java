/*Facu*/
package entidades;

import java.util.Scanner;

public class Mantenimiento extends Servicio {
	/*
	 * no podran ser mas de 24 horas, se contaran unicamente las horas de trabajo
	 * real, no las de espera de un repuesto por ejemplo, ni del tiempo en el que se
	 * tiene el dispositivo a reparar
	 */
	private double horasTrabajadas;

	/* constructores */
	public Mantenimiento() {
		super();
	}

	public Mantenimiento(long idServicio, double precioTotal) {
		super(idServicio, precioTotal);
	}

	public static Mantenimiento nuevoMantenimiento() {
		Mantenimiento ret = new Mantenimiento();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Cuantas horas duro el mantenimiento?");
		double horasServ = 0.0;
		horasServ = teclado.nextDouble();
		ret.setHorasTrabajadas(horasServ);

		return ret;
	}

	/* Getters and setters */
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