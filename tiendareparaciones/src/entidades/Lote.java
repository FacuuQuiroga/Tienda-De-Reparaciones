//hace martin
package entidades;

public class Lote {

	private long idLote = 0;
	//idEquipo es el identificador del elemento lote
	//valor entero > 0
	//y valor por defecto 0
	private double descuento = 0;
	//indica el computo que se calcula de un porcentaje de lote
	//expresado en numero reales con simbolos de puntuacion
	protected double precioTotal = 0;
	//indica el computo total del calcula entre descuento y precio de equipo
	//expresado en numero reales con simbolos de puntuacion

////Getters , setters and to string
	public long getIdLote() {
		return idLote;
	}

	public void setIdLote(long idLote) {
		this.idLote = idLote;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
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
		return "Lote [idLote=" + idLote + ", descuento=" + descuento + ", precioTotal=" + precioTotal + "]";
	}

}
