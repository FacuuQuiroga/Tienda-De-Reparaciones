//hace Martintinitin
package entidades;

public class Equipo {

	private long idEquipo = 0;
	//idEquipo es el identificador del elemento equipo
	//valor entero > 0
	//y valor por defecto 0
	private double precio = 0;
	//precio expresado en numeros reales
	private String modelo = "Sin modelo disponible";
	//modelo es la expresion que identifica el modelo de equipo
	//expresado en cadenas de caracteres

////Getters , setters and to string
	public long getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(long idEquipo) {
		this.idEquipo = idEquipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	// to string
	@Override
	public String toString() {
		return "Equipo [idEquipo=" + idEquipo + ", precio=" + precio + ", modelo=" + modelo + "]";
	}

}
