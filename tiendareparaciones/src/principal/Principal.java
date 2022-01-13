package principal;

import java.util.Scanner;
import Utils.Utilidades;
import entidades.Cliente;
import entidades.Servicio;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean subMenuValido = false;

		boolean menuValido = false;
		int menu = -1;
		int subMenu = -1;
		mostrarMenuPrincipal();

		do {
			menu = teclado.nextInt();

			switch (menu) {
			case 1:
				menuClientes();
				mostrarMenuPrincipal();
				break;

			case 2:
				menuServicios();
				mostrarMenuPrincipal();
				break;

			case 3:
				menuEquipos();
				mostrarMenuPrincipal();
				break;

			case 0:
				menuValido = true;

			default:
				System.out.println("Opcion Invalida, intente de nuevo");
				mostrarMenuPrincipal();
				break;
			}
		} while (!menuValido);
		System.out.println("Guardando datos y cerrando el programa, Taluego.");

	}

	public static void menuClientes() {
		Scanner teclado = new Scanner(System.in);
		int subMenuClientes = -1;
		boolean subMenuValidoClientes = false;

		do {
			mostrarMenuClientes();
			subMenuClientes = teclado.nextInt();

			switch (subMenuClientes) {
			case 1:
				/* Ver Clientes */
				// imprimimos cuantos hay en la clase Datos.
				Cliente[] clientesDb = Utils.Datos.CLIENTES;

				System.out.println("Hay " + Utils.Datos.numClientes + " clientes en el sistema.");
				// for para imprimir cada cliente
				for (Cliente i : clientesDb)
					System.out.println("Nombre: " + i.getNombre() + ". Identificador del cliente: " + i.getIdCliente());
				break;
			case 2:
				System.out.println("nuevo Clientes");
				Cliente c = new Cliente();
				c = Cliente.nuevoCliente();
				System.out.println(c);
				break;
			case 3:
				System.out.println("buscar Clientes");
				break;
			case 0:
				subMenuValidoClientes = true;
			default:
				System.out.println("Opcion Invalida, intente de nuevo");

			}
		} while (!subMenuValidoClientes);

	}

	public static void menuEquipos() {
		Scanner teclado = new Scanner(System.in);
		int subMenuEquipos = -1;
		boolean subMenuValidoEquipos = false;
		mostrarMenuEquipos();
		subMenuEquipos = teclado.nextInt();

		do {
			switch (subMenuEquipos) {
			case 1:
				System.out.println("ver equipos");
				break;
			case 2:
				System.out.println("nuevo equipo");
				break;
			case 3:
				System.out.println("buscar equipos");
				break;
			case 0:
				subMenuValidoEquipos = true;
			default:
				System.out.println("Opcion Invalida, intente de nuevo");

			}

		} while (!subMenuValidoEquipos);
	}

	public static void menuServicios() {
		Scanner teclado = new Scanner(System.in);
		int subMenuServicios = -1;
		boolean subMenuValidoServicios = false;
		mostrarMenuServicios();
		subMenuServicios = teclado.nextInt();

		// primero hay que seleccionar al cliente para hacer la llamada al constructor
		// que tiene cliente llamado nuevoServicio

		do {
			switch (subMenuServicios) {
			case 1:
				/* Nueva Compra */
				Servicio servicioCompra = Servicio.nuevoServicioCompra();
				break;
			case 2:

				/* Nueva Reparacion */
				Servicio servicioReparacion = Servicio.nuevoServicioReparacion();
				break;

			case 3:
				System.out.println("nuevo Envio");
				break;
			case 0:
				subMenuValidoServicios = true;
			default:
				System.out.println("Opcion Invalida, intente de nuevo");
			}
		} while (!subMenuValidoServicios);
	}

	public static void mostrarMenuPrincipal() {

		System.out.println("Que desea hacer?" + "\n");
		System.out.println("1- Gestion del Clientes");
		System.out.println("2- Gestion de Servicios");
		System.out.println("3- Gestion de Equipos");
		System.out.println("5- Salir");
	}

	public static void mostrarMenuClientes() {

		System.out.println("Que desea hacer?" + "\n");
		System.out.println("1- Ver Cliente/s");
		System.out.println("2- Nuevo Cliente");
		System.out.println("3- Buscar Cliente");
		System.out.println("4- Atras");
	}

	public static void mostrarMenuEquipos() {
		System.out.println("Que desea hacer?" + "\n");
		System.out.println("1- Ver Equipo/s");
		System.out.println("2- Nuevo Equipo");
		System.out.println("3- Buscar Equipo/s");
		System.out.println("4- Atras");
	}

	public static void mostrarMenuServicios() {
		System.out.println("Que desea hacer?" + "\n");
		System.out.println("1- Nueva Compra");
		System.out.println("2- Nueva Reparacion");
		System.out.println("3- Nuevo Envio");
		System.out.println("4- Atras");
	}
}
