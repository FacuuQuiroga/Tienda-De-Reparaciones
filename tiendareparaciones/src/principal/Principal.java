package principal;

import java.util.Scanner;

import entidades.Cliente;
import entidades.Mantenimiento;
import entidades.Servicio;

public class Principal {

	public static void main(String[] args) {
		/* IMPORTATE PAL TECLADO */
		Scanner teclado;
		teclado = new Scanner(System.in);
		//////////////////////////////////////////////////////////////

		boolean salir = false;
		int opcion; // Guardaremos la opción del usuario
		do {
			System.out.println("Programa de gestion de servicios de una tienda de reparaciones");
			System.out.println("Que desea hacer? \n");
			System.out.println("1- Registrar cliente");
			System.out.println("2- Registrar Servicio");
			System.out.println("3- Otros");
			System.out.println("9- Salir");
			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				/* Registro del cliente */
				Cliente facu = Cliente.nuevoCliente();
				System.out.println(facu);
				return;
			case 2:
				/* Registro de nuevo Servicio */
				System.out.println("Que tipo de servicio es?");
				System.out.println("1-Compra");
				System.out.println("2-Mantenimiento");
				int auxServ = teclado.nextInt();
				if (auxServ == 2) {
					Servicio facu2 = Mantenimiento.nuevoServicio();
					System.out.println(facu2);
				}
				return;
			case 3:
				System.out.println("otros otros");

				return;
			case 4:
				System.out.println("Boton secreto activado, se procede a la explotacion del pc");
				System.out.println("PUM!");
				break;
			case 9:
				if (salir == false) {
					salir = true;
				}
			default:
				System.out.println("Guardando... nada que guardar,ta luego!");
			}
		} while (!salir);
	}
}