//hace martin
package entidades;

public class Compra {

	private long idCompra = 0;
	// idEquipo es el identificador del elemento compra
	// valor entero > 0
	// y valor por defecto 0
	private char metodoDePago = 'A';
	// metodoDePago expresa la modalidad de dicho pago
	// se expresa en caracteres
	protected double precioTotal = 0; //martin
	// indica el computo total del precio de equipo
	// expresado en numero reales con simbolos de puntuacion
	
	public Compra() {
		
	}

	private Compra(long idCompra, char metodoDePago, double precioTotal) {
		long idCompra = 0;
		numCompra++;
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
//		do {
//			idClienteValido = Validador.validarId(idValidado);
//		}while (!idCompraValida);

		System.out.println("Introduce los siguientes datos para registrar una nueva Compra:" + "\n");
		String compraCl = "";
		/* para validar el nombre sea correcto, declarado en la clase Validador */
		boolean nombreValido = false;
		do {
			System.out.println("Compra: (secuencia en numeros)");
			compraCl = teclado.nextLine();
			nombreValido = Validador.validarNombre(nombreCl);
		} while (!compraValida);
		ret.setCompra(compraCl);

		char metodoDePago = "A";
		boolean nifValido = false;
		do {
			System.out.println("metodo de pago: (efectivo o tarjeta)");
			metodoDePago = teclado.nextLine();
			metodoDePagoValido = Validador.validarNif(nifCl);
		} while (!metodoValido);
		ret.setPago(metodoDePago);

		double precioTotalCl = null;
		boolean precioTotalClValido = false;
		do {
			System.out.println("precio total: secuencia de numeros con puntos y comas");
			precioTotalCl = teclado.nextLine();
			precioTotalClValido = Validador.validarDir(precioTotalCl);
		} while (!precioTotalClValido);
		ret.setPrecioTotaln(PrecioTotalCl);

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
