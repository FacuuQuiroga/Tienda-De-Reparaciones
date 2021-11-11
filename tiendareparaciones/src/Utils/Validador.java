
package Utils;

public class Validador {

	// para validar las variables del cliente y empleado, interesa que sea publico y
	// no privado para poder utilizarlo en otros lados del codigo
	// Codificado por facu
	public static boolean validarNombre(String nombre) {
		boolean checkStatusNombre = false;

		if (nombre != null) {
			// 1. Condici�n: que la letra inicial sea may�scula
			boolean letraMayuscula = Character.isUpperCase(nombre.charAt(0));

			// 2. Condici�n: que el tama�o sea >= 3 y <= 25
			int largoNombre = nombre.length();
			boolean tama�oValido = (largoNombre >= 3 && largoNombre <= 25);

			// 3.Condici�n: que contenga al menos un espacio
			boolean tieneEspacio = nombre.contains(" ");

			// Verificamos que las tres condiciones son verdaderas
			checkStatusNombre = ((letraMayuscula == true) && (letraMayuscula && tama�oValido && tieneEspacio));
		}
		return checkStatusNombre;
	}

	public static boolean validarNif(String nif) {
		boolean checkStatusNif = false;
		if (nif != null) {
			// 1. condicion: que el largo del nif sea de 9 caracteres (8 numeros + 1 letra)
			// y mas de 1
			int tama�oString = nif.length();
			boolean tama�oValido = (tama�oString >= 1 && tama�oString <= 9);
			// verificamos que tama�oValido del nif es de 9
			checkStatusNif = tama�oValido == true;
		}
		return checkStatusNif;
	}

	public static boolean validarDireccion(String direccion) {

		return false;
	}
}
