//Facu
package entidades;

public class Servicios {
	private long idServicios = 0;
	private String notas = "Sin notas";
	private String fecha; // Hay que ver como se usa el LocalDate
	private boolean envio;
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

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public boolean isEnvio() {
		return envio;
	}

	public void setEnvio(boolean envio) {
		this.envio = envio;
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
		return "Servicios [idServicios=" + idServicios + ", notas=" + notas + ", fecha=" + fecha + ", envio=" + envio
				+ ", precioTotal=" + precioTotal + "]";
	}

}
