//Facu
package entidades;

public class Cliente {

	private long idCliente = 0;
	private String nombre = "Sin nombre";
	private String nif;
	private String direccion = "Sin direccion";
	private String telefono = "Sin telefono disponible";
	private String numeroTarjeta;
	private String Cuentacorriente;

	// Getters , setters and to string
	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public String getCuentacorriente() {
		return Cuentacorriente;
	}

	public void setCuentacorriente(String cuentacorriente) {
		Cuentacorriente = cuentacorriente;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", nif=" + nif + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", numeroTarjeta=" + numeroTarjeta + ", Cuentacorriente=" + Cuentacorriente
				+ "]";
	}

}
