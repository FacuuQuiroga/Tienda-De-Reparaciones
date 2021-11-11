
package Utils;

public class Validador {

	// para validar las variables del cliente y empleado, interesa que sea publico y
	// no privado para poder utilizarlo en otros lados del codigo
	// Codificado por facu
	public static boolean validarNombre(String nombre) {
		boolean checkStatusNombre = false;

		if (nombre != null) {
			// 1. Condición: que la letra inicial sea mayúscula
			boolean letraMayuscula = Character.isUpperCase(nombre.charAt(0));

			// 2. Condición: que el tamaño sea >= 3 y <= 25
			int largoNombre = nombre.length();
			boolean tamañoValido = (largoNombre >= 3 && largoNombre <= 25);

			// 3.Condición: que contenga al menos un espacio
			boolean tieneEspacio = nombre.contains(" ");

			// Verificamos que las tres condiciones son verdaderas
			checkStatusNombre = ((letraMayuscula == true) && (letraMayuscula && tamañoValido && tieneEspacio));
		}
		return checkStatusNombre;
	}

	public static boolean validarNif(String nif) {
		boolean checkStatusNif = false;
		if (nif != null) {
			// 1. condicion: que el largo del nif sea de 9 caracteres (8 numeros + 1 letra)
			// y mas de 1
			int tamañoString = nif.length();
			boolean tamañoValido = (tamañoString >= 1 && tamañoString <= 9);
			// verificamos que tamañoValido del nif es de 9
			checkStatusNif = tamañoValido == true;
		}
		return checkStatusNif;
	}

	public static boolean validarDireccion(String direccion) {

		return false;
	}
}
