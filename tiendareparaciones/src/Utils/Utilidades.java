package Utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Utilidades {


	/**
	 * Funcion que pide al usuario que introduce un valor para una fecha a partir de
	 * 3 enteros para el dia, mes y anio respectivamente. Si los valores
	 * introducidos no producen una fecha correcta, avisa al usuario y le pide que
	 * los introduzca de nuevo. Si no lo consigue, devolvera null
	 *
	 * @return una fecha de la clase java.sql.Date o null si hay error
	 */
	public static java.sql.Date leerFecha() {
		Date ret = null;
		int dia, mes, anio;
		boolean correcto = false;
		Scanner in;
		do {
			System.out.println("Introduzca un valor para el día (1...31)");
			in = new Scanner(System.in, "ISO-8859-1");
			dia = in.nextInt();
			System.out.println("Introduzca un valor para el mes (1...12)");
			in = new Scanner(System.in, "ISO-8859-1");
			mes = in.nextInt();
			System.out.println("Introduzca un valor para el año");
			in = new Scanner(System.in, "ISO-8859-1");
			anio = in.nextInt();

			try {
				ret = Date.valueOf(LocalDate.of(anio, mes, dia));
				correcto = true;
			} catch (Exception e) {
				System.out.println("Fecha introducida incorrecta.");
				correcto = false;
			}
		} while (!correcto);
		return ret;
	}

	/**
	 * Función que pide al usuario que introduzca 's' o 'S' para Sí o 'n' o 'N'
	 * para No y devuelve true o false en cada caso. Si el usuario no introduce ni
	 * 's' ni 'S' ni 'n' ni 'N' entonces avisa al usuario y le vuelve a pedir a que
	 * lo introduzca de nuevo.
	 *
	 * @return true si el usuario introduce 's' o 'S'; false si el usuario introduce
	 *         'n' o 'N'
	 */
	public static boolean leerBoolean() {
		boolean ret;
		Scanner in;
		char resp;
		do {
			System.out.println("Pulse s para Sí o n para No");
			in = new Scanner(System.in, "ISO-8859-1");
			resp = in.nextLine().charAt(0);
			if (resp != 's' && resp != 'S' && resp != 'n' && resp != 'N') {
				System.out.println("Valor introducido incorrecto.");
			}
		} while (resp != 's' && resp != 'S' && resp != 'n' && resp != 'N');
		if (resp == 's' || resp != 'S') {
			ret = true;
		} else {
			ret = false;
		}
		return ret;
	}

}