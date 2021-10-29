//Facu
package entidades;

public class Cliente {

	private long identificadorCliente = 0;
	private String nombreCliente = "Sin nombre";
	private String nifCliente;
	private String direccionCliete = "Sin direccion";
	private String telefonoCliente = "Sin telefono disponible";
	private String nroTarjetaCredito;
	private String nroCuentaBanco;

	// Getters and setters

	public long getIdentificadorCliente() {
		return identificadorCliente;
	}

	public void setIdentificadorCliente(long identificadorCliente) {
		this.identificadorCliente = identificadorCliente;
	}

	public String getNifCliente() {
		return nifCliente;
	}

	public void setNifCliente(String nifCliente) {
		this.nifCliente = nifCliente;
	}

	public String getDireccionCliete() {
		return direccionCliete;
	}

	public void setDireccionCliete(String direccionCliete) {
		this.direccionCliete = direccionCliete;
	}

	public String getTelefonoCliente() {
		return telefonoCliente;
	}

	public void setTelefonoCliente(String telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getNroTarjetaCredito() {
		return nroTarjetaCredito;
	}

	public void setNroTarjetaCredito(String nroTarjetaCredito) {
		this.nroTarjetaCredito = nroTarjetaCredito;
	}

	public String getNroCuentaBanco() {
		return nroCuentaBanco;
	}

	public void setNroCuentaBanco(String nroCuentaBanco) {
		this.nroCuentaBanco = nroCuentaBanco;
	}

//ToString
	@Override
	public String toString() {
		return "El Cliente [identificadorCliente=" + identificadorCliente + ", nifCliente=" + nifCliente
				+ ", direccionCliete=" + direccionCliete + ", telefonoCliente=" + telefonoCliente + ", nombreCliente="
				+ nombreCliente + ", nroTarjetaCredito=" + nroTarjetaCredito + ", nroCuentaBanco=" + nroCuentaBanco
				+ "]";
	}

}
