//hace martins
package entidades;

public class Compra {

	private long idCompra;
	// idEquipo es el identificador del elemento compra
	// valor entero > 0
	// y valor por defecto 0
	private char metodoDePago = null;
	// metodoDePago expresa la modalidad de dicho pago
	// se expresa en caracteres// se puede introducir "e" para efectivo y "t" para tarjeta
	protected double precioTotal;
	// indica el computo total del precio de equipo
	// expresado en numero reales con simbolos de puntuacion
	
	long numeroIdCompra;
	
	public Compra() {
		
	}

	private Compra(long idCompra, char metodoDePago, double precioTotal) {
		numeroIdCompra++
		this.idCompra = numeroIdCompra;
		this.metodoDePago = ;
		this.precioTotal = 0;
		

	}

	// Para registrar una nueva Compra
	public static Compra nuevaCompra() {
		/* instancia para el teclado */
		Compra ret = new Compra();
		Scanner teclado = new Scanner(System.in);

//		boolean idCompraValido = false;
//		long idValidado = idCompra;


		System.out.println("Introduce los siguientes datos para registrar una nueva Compra:" + "\n");

		char metodoDePago;
		boolean metodoDePagoValido = false;
		do {
			System.out.println("metodo de pago: (efectivo o tarjeta)");
			metodoDePago = teclado.nextChar();
			metodoDePagoValido = Validador.validarMetodoDePago(metodoDePago);
		} while (!metodoDePagoValido);
		ret.setMetodoDePago(metodoDePago);

		double precioTotal;
		boolean precioTotalValido = false;
		do {
			System.out.println("precio total: secuencia de numeros con puntos");
			precioTotal = teclado.nextLine();
			precioTotalValido = Validador.validarPrecioTotal(precioTotal);
		} while (!precioTotalValido);
		ret.setPrecioTotaln(PrecioTotal);

	}

	//// Getters , setters and to string
	public long getIdEquipo() {
		return idCompra;
	}

	public void setIdEquipo(long idEquipo) {
		this.idCompra = idEquipo;
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
		return "Compra [idCompra=" + idCompra + ", metodoDePago=" + metodoDePago + ", precioTotal=" + precioTotal + "]";
	}

}
