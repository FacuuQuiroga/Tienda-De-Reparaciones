//Facundo Quiroga

package entidades;

public class Cliente {
// todo a modo de ejemplo, hay que revisarlo
	private long identificadorCliente = 0;
	private long nifCliente = 0;
	private String direccionCliete = "Sin direccion";
	private long telefonoCliente = 0;
	private String nombreCliente = "Sin nombre";
	private long nroTarjetaCredito = 0;
	private long nroCuentaBanco = 0;
	
	/////////////////////////////////////////////////////

	public long getIdentificadorCliente() {
		return identificadorCliente;
	}

	public void setIdentificadorCliente(long identificadorCliente) {
		this.identificadorCliente = identificadorCliente;
	}

	public long getNifCliente() {
		return nifCliente;
	}

	public void setNifCliente(long nifCliente) {
		this.nifCliente = nifCliente;
	}

	public String getDireccionCliete() {
		return direccionCliete;
	}

	public void setDireccionCliete(String direccionCliete) {
		this.direccionCliete = direccionCliete;
	}

	public long getTelefonoCliente() {
		return telefonoCliente;
	}

	public void setTelefonoCliente(long telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public long getNroTarjetaCredito() {
		return nroTarjetaCredito;
	}

	public void setNroTarjetaCredito(long nroTarjetaCredito) {
		this.nroTarjetaCredito = nroTarjetaCredito;
	}

	public long getNroCuentaBanco() {
		return nroCuentaBanco;
	}

	public void setNroCuentaBanco(long nroCuentaBanco) {
		this.nroCuentaBanco = nroCuentaBanco;
	}

	@Override
	public String toString() {
		return "Cliente [identificadorCliente=" + identificadorCliente + ", nifCliente=" + nifCliente
				+ ", direccionCliete=" + direccionCliete + ", telefonoCliente=" + telefonoCliente + ", nombreCliente="
				+ nombreCliente + ", nroTarjetaCredito=" + nroTarjetaCredito + ", nroCuentaBanco=" + nroCuentaBanco
				+ "]";
	}

}
