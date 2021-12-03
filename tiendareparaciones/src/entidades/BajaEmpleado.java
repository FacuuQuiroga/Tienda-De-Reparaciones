//Naiara
package entidades;

import java.time.LocalDate;

import java.util.Scanner;

public class BajaEmpleado {

	private long idBaja;
	private LocalDate fechaInicio = LocalDate.now();
	private LocalDate fechaFin;
	private String motivoBaja;

	public BajaEmpleado() {
	}

	public BajaEmpleado(long idBaja, LocalDate fechaFin, String motivoBaja) {
		this.idBaja = idBaja;
		this.fechaFin = fechaFin;
		this.motivoBaja = motivoBaja;
	}
	
	/* Para relacion 1-N con Servicio */
	public Empleado nuevoEmpleado() {
		Empleado ret = new Empleado();
		e.setBajaEmpleado(this);
		e = Empleado.nuevoEmpleado();
		return ret;
	}
	// metodo nuevoClase

	public static BajaEmpleado newBajaEmpleado() {
		BajaEmpleado ret = new BajaEmpleado();

		Scanner teclado = new Scanner(System.in);
//		long id = 0;
//		id = teclado.nextLong();
//		baja.setIdBaja(id);

//		LocalDate fechaFin = null;
//		fechaFin = LocalDate.of(teclado.nextInt(), teclado.nextInt(), teclado.nextInt());
//		ret.setFechaToday(fechaFin);
		
		System.out.println("Motivo baja: ");
		String motivo;
		motivo = teclado.nextLine();
		baja.setMotivoBaja(motivo);
		return ret;
	}

	// getters y setters

	public long getIdBaja() {
		return idBaja;
	}

	public void setIdBaja(long idBaja) {
		this.idBaja = idBaja;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getMotivoBaja() {
		return motivoBaja;
	}

	public void setMotivoBaja(String motivoBaja) {
		this.motivoBaja = motivoBaja;
	}

	// toString

	@Override
	public String toString() {
		return "BajaEmpleado [idBaja=" + idBaja + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin
				+ ", motivoBaja=" + motivoBaja + "]";
	}

}
