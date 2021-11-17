package principal;

import java.util.Scanner;

import entidades.Cliente;
import entidades.Mantenimiento;
import entidades.Reparacion;
import entidades.Servicio;

public class Principal {

	public static void main(String[] args) {
		/* IMPORTATE PAL TECLADO */
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("Programa de gestion de servicios de una tienda de reparaciones");
		/* Guardaremos la opción del usuario */
		int menu = 0;
		/* para validar la opcion introducida */
		boolean menuValido = false;

		do {
			mostrarMenuPrincipal();
			menu = teclado.nextInt();
			/*
			 * Para validar que lo que introduzca el usuiario sea una opcion correcta. Es un
			 * if y else comprimido, con un operador ternario, si el operador ternario es
			 * correcto, se ejecuta false, si no es correcto, devuelve true
			 */
			menuValido = (menu < 1 || menu > 5 ? false : true);

			if (!menuValido) {
				System.out.println("Opcion Incorrecta");
			}

			switch (menu) {
			case 1:
				/* Registro del cliente */
				Cliente facu = Cliente.nuevoCliente();
				System.out.println(facu);
				break;
			case 3:
				/* Registro de nuevo Servicio */
				System.out.println("Que tipo de servicio es?");
				System.out.println("1-Compra");
				System.out.println("2-Mantenimiento");
				int auxServ = teclado.nextInt();
				if (auxServ == 1) {
					System.out.println("registrar una compra( a implementar)");
				} else {
					Servicio facuM = Mantenimiento.nuevoServicio();
					System.out.println(facuM);
				}
				break;
			case 4:
				System.out.println("registrar nueva reparacion ( a implementar)");
				break;
			}

		} while (!menuValido);
	}

	public static void mostrarMenuPrincipal() {

		System.out.println("Que desea hacer?" + "\n");
		System.out.println("1- Registrar cliente");
		System.out.println("2- Para ver Servicio");
		System.out.println("3- Registrar Servicio");
		System.out.println("4- Registrar nueva reparacion");
		System.out.println("5- Salir");
	}
}