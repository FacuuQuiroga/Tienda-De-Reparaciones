//Facu
package entidades;

public class Empleado {
	private long idEmpleado;
	private String nombre;
	private String apellido;
	private String direccion;
	private String telefono;
	private String nif;

	public Empleado() {
	}

	// getters and setters

	public long getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(long idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
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

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	// to string
	@Override
	public String toString() {
		return " El empleado con id [idEmpleado=" + idEmpleado + ",es: Nombre=" + nombre + "y de apellido" + apellido
				+ ",con direccion en:" + direccion + ",su telefono es:" + telefono + "y su nif es:" + nif + "]";
	}

}
