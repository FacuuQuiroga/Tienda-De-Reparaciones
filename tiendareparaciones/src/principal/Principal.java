package principal;

import java.sql.Date;
import java.util.Scanner;

import Utils.Utilidades;
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
		boolean menuValidoCliente = false;
		boolean menuValidoEquipos = false;
		boolean menuValidoServicios = false;

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
				System.out.println("Opcion no valida, porfavor intenta una de las opciones disponibles.");
			}

			switch (menu) {
			case 1:
				/* Gestion del cliente */
				do {
					menuClientes();
					menu = teclado.nextInt();
					menuValidoCliente = (menu < 1 || menu > 5 ? false : true);
					if (!menuValidoCliente) {
						System.out.println("Opcion no valida, porfavor intenta una de las opciones disponibles.");

					}

					switch (menu) {
					case 1:
						/* Ver Clientes */
						break;
					case 2:
						/* nuevo Cliente */
						Cliente cliente = Cliente.nuevoCliente();
						System.out.println(cliente);
						break;
					case 3:
						/* buscar Clientes */

						break;
					}

				} while (!menuValidoCliente);

				break;
			case 2:
				/* Gestion de Equipos */
				menuEquipos();
				
				break;
			case 3:
				/* Gestion de Servicios */
				menuServicios();
				break;
			}

		} while (!menuValido);
	}

	public static void mostrarMenuPrincipal() {

		System.out.println("Que desea hacer?" + "\n");
		System.out.println("1- Gestion del Clientes");
		System.out.println("2- Gestion de Servicios");
		System.out.println("3- Gestion de Equipos");
		System.out.println("5- Salir");
	}

	public static void menuClientes() {

		System.out.println("Que desea hacer?" + "\n");
		System.out.println("1- Ver Cliente/s");
		System.out.println("2- Nuevo Cliente");
		System.out.println("3- Buscar Cliente");
		System.out.println("4- Atras");
	}

	public static void menuEquipos() {
		System.out.println("Que desea hacer?" + "\n");
		System.out.println("1- Ver Equipo/s");
		System.out.println("2- Nuevo Equipo");
		System.out.println("3- Buscar Equipo/s");
		System.out.println("4- Atras");
	}

	public static void menuServicios() {
		System.out.println("Que desea hacer?" + "\n");
		System.out.println("1- Nueva Compra");
		System.out.println("2- Nueva Reparacion");
		System.out.println("3- Nuevo Envio");
		System.out.println("4- Atras");
	}
}