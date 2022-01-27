package principal;

import java.util.Scanner;
import Utils.Utilidades;
import entidades.Cliente;
import entidades.Envio;
import entidades.Equipo;
import entidades.Servicio;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean subMenuValido = false;

		boolean menuValido = false;
		int menu = -1;
		int subMenu = -1;
		Utils.Menu.mostrarMenuPrincipal();

		do {
			menu = teclado.nextInt();

			switch (menu) {
			case 1:
				menuClientes();
				Utils.Menu.mostrarMenuPrincipal();
				break;

			case 2:
				menuServicios();
				Utils.Menu.mostrarMenuPrincipal();
				break;

			case 3:
				menuEquipos();
				Utils.Menu.mostrarMenuPrincipal();
				break;

			case 0:
				menuValido = true;

			default:
				System.out.println("Opcion Invalida, intente de nuevo");
				Utils.Menu.mostrarMenuPrincipal();
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
			Utils.Menu.mostrarMenuClientes();
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
				// buscar clientes
				// Utils.Buscador.buscarClientes;
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
		Utils.Menu.mostrarMenuEquipos();
		subMenuEquipos = teclado.nextInt();

		do {
			switch (subMenuEquipos) {
			case 1:
				Equipo[] equiposDb = Utils.Datos.EQUIPOS;
				System.out.println("Hay " + Utils.Datos.numClientes + " Equipos en el sistema.");

				for (Equipo e : equiposDb)
					System.out.println("Nombre: " + e.getModelo() + ". Identificador del equipo: " + e.getIdEquipo()
							+ "Precio del equipo: " + e.getPrecio());
				break;
			case 2:
				System.out.println("Nuevo equipo");
				Equipo e = new Equipo();
				e = Equipo.nuevoEquipo();
				System.out.println(e);
				break;
			case 3:
				System.out.println("Buscar equipos");
				// Utils.Buscador.buscarEquipos;
				break;
			case 0:
				subMenuValidoEquipos = true;
			default:
				System.out.println("Opcion Invalida, intente de nuevo");
				break;
			}

		} while (!subMenuValidoEquipos);
	}

	public static void menuServicios() {
		Scanner teclado = new Scanner(System.in);
		int subMenuServicios = -1;
		boolean subMenuValidoServicios = false;
		Utils.Menu.mostrarMenuServicios();
		subMenuServicios = teclado.nextInt();

		// primero hay que seleccionar al cliente para hacer la llamada al constructor
		// que tiene cliente llamado nuevoServicio

		do {
			switch (subMenuServicios) {
			case 1:
				/* Nueva Compra */
				String c = "c";
				Servicio servicioCompra = Servicio.nuevoServicio(c);
				break;
			case 2:

				/* Nueva Reparacion */
				String m = "m";
				Servicio servicioReparacion = Servicio.nuevoServicio(m);
				break;

			case 3:
				System.out.println("nuevo Envio");
				Envio en = new Envio();
				en = Envio.nuevoEnvio();
				break;
			case 0:
				subMenuValidoServicios = true;
			default:
				System.out.println("Opcion Invalida, intente de nuevo");
				break;
			}
		} while (!subMenuValidoServicios);
	}

}
