//hace martin
package entidades;

public class Compra {

	private long idCompra = 0;
	//idEquipo es el identificador del elemento compra
	//valor entero > 0
	//y valor por defecto 0
	private char metodoDePago = 'A';
	//metodoDePago expresa la modalidad de dicho pago
	//se expresa en caracteres
	protected double precioTotal = 0;
	//indica el computo total del precio de equipo
	//expresado en numero reales con simbolos de puntuacion

////Getters , setters and to string
	public long getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(long idEquipo) {
		this.idEquipo = idEquipo;
	}

	public char getMetodoDePago() {
		return metodoDePago;
	}

	public void setMetodoDePago(char metodoDePago) {
		this.metodoDePago = metodoDePago;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	// to string
	@Override
	public String toString() {
		return "Compra [idEquipo=" + idEquipo + ", metodoDePago=" + metodoDePago + ", precioTotal=" + precioTotal + "]";
	}

}


