
package Utils;

/*
 * Clase Validador:
 * Para validar las variables del cliente y empleado, interesa que sea publico y
 * no privado para poder utilizarlo en otros lados del codigo
 * Codificado por facu
 */
public class Validador {

	public static boolean validarId(long id) {
		/* id tiene q ser mayor que 0 */
		if (id > 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean validarNombre(String nombre) {
		boolean checkStatusNombre = false;
		if (nombre != null) {
			/* 1. Condici�n: que la letra inicial sea may�scula */
			boolean letraMayuscula = Character.isUpperCase(nombre.charAt(0));

			/* 2. Condici�n: que el tama�o sea >= 3 y <= 25 */
			int largoNombre = nombre.length();
			boolean tama�oValido = (largoNombre >= 3 && largoNombre <= 25);

			/* 3.Condici�n: que contenga al menos un espacio */
			boolean tieneEspacio = nombre.contains(" ");

			/* Verificamos que las tres condiciones son verdaderas */
			checkStatusNombre = ((letraMayuscula == true) && (letraMayuscula && tama�oValido && tieneEspacio));
		}
		return checkStatusNombre;
	}

	public static boolean validarNif(String nif) {
		boolean checkStatusNif = false;
		if (nif != null) {
			/*
			 * 1. condicion: que el largo del nif sea de 9 caracteres (8 numeros + 1 letra)
			 * y mas de 1
			 */
			int tama�oString = nif.length();
			boolean tama�oValido = (tama�oString >= 1 && tama�oString <= 9);
			/* verificamos que tama�oValido del nif es de 9 */
			checkStatusNif = tama�oValido == true;
		}
		return checkStatusNif;
	}

	public static boolean validarDir(String direccion) {
		/* 1.Condicion: que tenga mas de 1 caracter y igual o menos de 40 */
		if (direccion.length() < 5)
			return false;
		if (direccion.length() > 40)
			return false;
		return true;
	}

	public static boolean validarTel(String telefono) {
		/*
		 * 1.Condicion: el telefono tiene que tener minimo 9 numeros con caracteristica,
		 * un numero extranjero puede tener mas de 9 numeros, por eso no se pone un
		 * limite maximo. Ej: 634 16 54 85
		 */
		if (telefono.length() > 9)
			return false;
		return true;
	}

	public static boolean validarTarjeta(String tarjeta) {
		/* 1.Condicion: contara con 16 caracteres obligatoriamente */
		if (tarjeta.length() == 17)// si pongo 16 solamente se puede poner 15 caracteres
			return false;
		return true;
	}

	public static boolean ValidarCuentaCorriente(String cuentaCorriente) {
		/*
		 * 1.condicion comprobar que las 2 primeros caracteres sean letras(pais y codigo
		 * de verificacion)
		 */

		/* 2.condicion: que contenga 20 numeros luego de los primeros 4 caracteres */

		return true;
	}

	// marto
	public static boolean validarMetodoDePago(char metodoPago) {
		char efectivo = 'e';
		char tarjeta = 't';
		if (metodoPago != efectivo)
			return false;
		if (metodoPago != tarjeta)
			return false;
		return true;
		/*
		 * 1. Condicion: pago en efectivo o tarajeta(un caracter unicamente, E o T)
		 * 
		 */
	}

	// marto
	public static boolean validarPrecio(double precioTotal) {
		if (precioTotal > 0)
			return false;

		return true;

		/*
		 * 1. Condicion: secuencia numerica expresado con puntos y comas 2. no se
		 * permiten caracteres especiales
		 */

	}

	// MARTON
	public static boolean validarModelo(String modelo) {
		boolean checkStatusNombre = false;
		// Condici�n: que el tama�o sea >= 1 y <= 04
		if (modelo != null) {
			int largoNombre = modelo.length();
			boolean tama�oValido = (largoNombre >= 1 && largoNombre <= 40);
		}
		return true;

	}

	//Naiara
	public static boolean validardireccion(String direccionE1) {
		// 1.Condicion: que tenga mas de 1 caracter e igual o menos de 40
		if (direccionE1.length() < 5)
			return false;
		if (direccionE1.length() > 40)
			return false;
		return true;

	}

	//Naiara
	public static boolean validartelefono(String telefonoE1) {

//		  1.Condicion: el telefono tiene que tener minimo 9 numeros con caracteristica,
//		  un numero extranjero puede tener mas de 9 numeros, por eso no se pone un
//		 limite maximo.
		if (telefonoE1.length() > 9)
			return false;
		return true;
	}
}
