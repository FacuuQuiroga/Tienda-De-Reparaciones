//hace villlllllle
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

	// método nuevoClase

	public static BajaEmpleado nuevoClase() {
		BajaEmpleado baja = new BajaEmpleado();

		Scanner teclado = new Scanner(System.in);

		System.out.println("id: ");
		long id = 0;
		id = teclado.nextLong();
		baja.setIdBaja(id);

		System.out.println("Fecha fin: ");
		LocalDate fechaFin = null;
		fechaFin = LocalDate.of(teclado.nextInt(), teclado.nextInt(), teclado.nextInt());
		baja.setFechaFin(fechaFin);

		System.out.println("Motivo baja: ");
		String motivo;
		motivo = teclado.nextLine();
		baja.setMotivoBaja(motivo);

		System.out.println(baja.toString());

		return baja;
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
