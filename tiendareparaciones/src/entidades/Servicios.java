// hace Facu
package entidades;

import java.time.LocalDate;

public class Servicios {
	private long idServicios = 0;
	private String notas = "Sin notas";
	private LocalDate fecha;  
	private double precioTotal;

	// Getters and setters
	public long getIdServicios() {
		return idServicios;
	}

	public void setIdServicios(long idServicios) {
		this.idServicios = idServicios;
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
		return "Servicios [idServicios=" + idServicios + ", notas=" + notas + ", fecha=" + fecha + ", precioTotal=" + precioTotal + "]";
	}

}
