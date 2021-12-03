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
		/* Guardaremos la opci�n del usuario */
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
//Menú
//import java.util.Scanner;
//public class principal {
//
//	@SuppressWarnings("unused")
//	public static void main(String[] args) {
//		@SuppressWarnings("resource")
//		Scanner read = new Scanner(System.in);
//
//		read = new Scanner (System.in);
//		int Seleccion = 0; //Primer Menu 
//
//do {
//		System.out.println("\n 1.Gestión de Clientes");
//		System.out.println("\n 2.Gestión de Equipos);
//		System.out.println("\n 3.Gestión de Servicios);
//		System.out.println("\n 4.Salir");
//		System.out.println("");
//      System.out.print("Ingrese Opción: ");
//		Seleccion = read.nextInt();
//		switch (Seleccion){
//		case 1:
//			int GestionClientes = 0;
//	do {
//				System.out.println(" Gestión de Clientes");
//				System.out.println(" Que va a realizar...");
//				System.out.println("\n 1.Ver Clientes.");
//				System.out.println("\n 2.Nuevo Cliente");
//				System.out.println("\n 3.Buscar Cliente.");
//				System.out.println("\n 4.Volver atrás.");
//				GestionClientes = read.nextInt();
//			switch (GestionClientes){
//			case 1: System.out.println("Seleccionó Ver Clientes."); break;
//			case 2: System.out.println("Seleccionó Nuevo Cliente."); break;
//			case 3: System.out.println("Seleccionó Buscar Cliente."); break;
//			case 4: salir = true; break;
//			default: System.out.println("Seleccionó Volver Atrás.");
//			}
//
//}while (GestionClientes<4) ;
//			break;
//		case 2:
//			int GestionEquipos = 0;
//			System.out.println("Gestión de Equipos");
//			do {
//				System.out.println(" Que va a Realizar...");
//				System.out.println("\n 1.Ver Equipos.");
//				System.out.println("\n 2.Nuevo Equipo");
//				System.out.println("\n 3.Buscar Empleados.");
//				System.out.println("\n 4.Volver atrás.");
//				 System.out.println("");
//               System.out.print("Ingrese Opción: ");
//				GestionEquipos = read.nextInt();
//			switch (GestionEquipos){
//			case 1: System.out.println("Seleccionó Ver Equipos."); break;
//			case 2: System.out.println("Seleccionó Nuevo Equipo."); break;
//			case 3: System.out.println("Seleccionó Buscar Empleados."); break;
//			case 4: salir = true; break;
//			default: System.out.println("Saliendo..."); break;
//			}
//			}while (GestionEquipos <4);
//		}
//	}while (Seleccion <4);
//	break;
//		case 3:
//			int GestionServicios = 0;
//			System.out.println("Gestión de Servicios");
//			do {
//				System.out.println(" Que va a Realizar...");
//				System.out.println("\n 1.Nueva Compra.");
//				System.out.println("\n 2.Nueva Reparación");
//				System.out.println("\n 3.Nuevo Envío.");
//				System.out.println("\n 4.Volver atrás.");
//				 System.out.println("");
//               System.out.print("Ingrese Opción: ");
//				GestionEquipos = read.nextInt();
//			switch (GestionEquipos){
//			case 1: System.out.println("Seleccionó Nueva Compra."); break;
//			case 2: System.out.println("Seleccionó Nueva Reparación."); break;
//			case 3: System.out.println("Seleccionó Nuevo Envío."); break;
//			case 4: salir = true; break;
//			default: System.out.println("Saliendo..."); break;
//			}
//			}while (GestionEquipos <4);
//		}
//	}while (Seleccion <4);
//		}
//}