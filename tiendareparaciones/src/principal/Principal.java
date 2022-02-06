package principal;

import java.util.Scanner;

import entidades.Cliente;
import entidades.Envio;
import entidades.Equipo;
import entidades.Servicio;
import utils.Utilidades;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean subMenuValido = false;

		boolean menuValido = false;
		int menu = -1;

		do {
			utils.Menu.mostrarMenuPrincipal();
			menu = teclado.nextInt();

			menuValido = (menu < 0 || menu > 4 ? false : true);
			if (!menuValido) {
				System.out.println("Opcion invalida, intente de nuevo empanao");
			}

			switch (menu) {
			case 1:
				menuClientes();
				menuValido = false;

				break;
			case 2:
				menuServicios();
				menuValido = false;

				break;
			case 3:
				menuEquipos();
				menuValido = false;

				break;
			case 4:
				menuTarea4();
				menuValido = false;
				break;

			case 0:
				menuValido = true;
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
			utils.Menu.mostrarMenuClientes();
			subMenuClientes = teclado.nextInt();

			subMenuValidoClientes = (subMenuClientes < 0 || subMenuClientes > 3 ? false : true);
			if (!subMenuValidoClientes) {
				System.out.println("introduce una opcion valida");
			}

			switch (subMenuClientes) {
			case 1:
				/* Ver Clientes */
				// imprimimos cuantos hay en la clase Datos.

				Cliente[] clientesDb = utils.Datos.CLIENTES;
				System.out.println(
						"-------------------------------------------------------------------------------------");
				System.out.println("Hay " + utils.Datos.numClientes + " clientes en el sistema.");
				System.out.println(
						"-------------------------------------------------------------------------------------");
				// for para imprimir cada cliente
				for (Cliente i : clientesDb)
					System.out.println("ID: " + i.getIdCliente() + " Nombre: " + i.getNombre() + " NIF:" + i.getNif());
				System.out.println(
						"-------------------------------------------------------------------------------------");
				subMenuValidoClientes = false;
				break;
			case 2:
				System.out.println("nuevo Clientes");
				Cliente c = new Cliente();
				c = Cliente.nuevoCliente();
				System.out.println(c);
				subMenuValidoClientes = false;
				break;
			case 3:
				System.out.println("buscar Clientes");
				// buscar clientes
				// Utils.Buscador.buscarClientes;
				subMenuValidoClientes = false;
				break;
			case 0:
				subMenuValidoClientes = true;
				System.out.println("Volviendo...\n");
				return;
			}
		} while (!subMenuValidoClientes);

	}

	public static void menuEquipos() {
		Scanner teclado = new Scanner(System.in);
		int subMenuEquipos = -1;
		boolean subMenuValidoEquipos = false;

		do {
			utils.Menu.mostrarMenuEquipos();
			subMenuEquipos = teclado.nextInt();

			// Validador de opcion
			subMenuValidoEquipos = (subMenuEquipos < 0 || subMenuEquipos > 3 ? false : true);
			if (!subMenuValidoEquipos) {
				System.out.println("introduce una opcion valida");
			}

			switch (subMenuEquipos) {
			case 1:
				Equipo[] equiposDb = utils.Datos.EQUIPOS;
				System.out.println(
						"-------------------------------------------------------------------------------------");
				System.out.println("Hay " + utils.Datos.numClientes + " Equipos en el sistema.");
				System.out.println(
						"-------------------------------------------------------------------------------------");
				for (Equipo e : equiposDb)
					System.out.println("ID: " + e.getIdEquipo() + " Nombre: " + e.getModelo() + " Precio del equipo: "
							+ e.getPrecio() + "€");
				System.out.println(
						"-------------------------------------------------------------------------------------");
				subMenuValidoEquipos = false;
				break;
			case 2:
				System.out.println("Nuevo equipo");
				Equipo e = new Equipo();
				e = Equipo.nuevoEquipo();
				System.out.println(e);
				subMenuValidoEquipos = false;
				break;
			case 3:
				System.out.println("Buscar equipos");
				// Utils.Buscador.buscarEquipos;
				subMenuValidoEquipos = false;
				break;
			case 0:
				subMenuValidoEquipos = true;
				System.out.println("Volviendo...");
				return;
			}
		} while (!subMenuValidoEquipos);
	}

	public static void menuServicios() {
		Scanner teclado = new Scanner(System.in);
		int subMenuServicios = -1;
		boolean subMenuValidoServicios = false;

		// primero hay que seleccionar al cliente para hacer la llamada al constructor
		// que tiene cliente llamado nuevoServicio

		do {
			utils.Menu.mostrarMenuServicios();
			subMenuServicios = teclado.nextInt();

			// Validador de opcion
			subMenuValidoServicios = (subMenuServicios < 0 || subMenuServicios > 3 ? false : true);
			if (!subMenuValidoServicios) {
				System.out.println("introduce una opcion valida");
			}

			switch (subMenuServicios) {
			case 1:
				/* Nueva Compra */
				String c = "c";
				Servicio servicioCompra = Servicio.nuevoServicio(c);
				subMenuValidoServicios = false;
				break;
			case 2:
				/* Nueva Reparacion */
				String m = "m";
				Servicio servicioReparacion = Servicio.nuevoServicio(m);
				subMenuValidoServicios = false;
				break;
			case 3:
				System.out.println("nuevo Envio");
				Envio en = new Envio();
				en = Envio.nuevoEnvio();
				subMenuValidoServicios = false;
				break;
			case 0:
				subMenuValidoServicios = true;
				System.out.println("Volviendo...");
				return;
			}
		} while (!subMenuValidoServicios);

	}

	private static void menuTarea4() {
		Scanner teclado = new Scanner(System.in);
		int subMenuTarea = -1;
		boolean subMenuValTarea = false;

		do {
			utils.Menu.mostrarTarea4();
			subMenuTarea = teclado.nextInt();

			// Validador de opcion
			subMenuValTarea = (subMenuTarea < 0 || subMenuTarea > 7 ? false : true);
			if (!subMenuValTarea) {
				System.out.println("introduce una opcion valida");
			}

			switch (subMenuTarea) {
			case 1:
				// Exportar un objeto de esa clase (todos sus datos imprescindibles para una
				// carga ligera) hacia un fichero de texto (con el formato/orden marcado en el
				// método data()).
				subMenuValTarea = false;
				break;
			case 2:
				// Exportar una colección de objetos de esa clase hacia un fichero de texto.
				subMenuValTarea = false;
				break;
			case 3:
				// Exportar un objeto de esa clase hacia un fichero binario
				subMenuValTarea = false;
				break;
			case 4:
				// Exportar una colección de objetos de esa clase hacia un fichero binario.
				subMenuValTarea = false;
				break;
			case 5:
				// Importar una colección de objetos de esa clase desde un fichero de texto.
				subMenuValTarea = false;
				break;
			case 6:
				// Importar una colección de objetos de esa clase desde un fichero binario
				subMenuValTarea = false;
				break;
			case 7:
//				Buscar un elemento de esa clase por su id en un fichero de texto que dispone de una colección de
//				elementos organizados línea a línea acordemente al formato/orden del método data(). En el caso
//				de que sí se encuentre el id se creará un nuevo objeto completo y, mediante la forma de carga ligera,
//				se cargaran los datos sobre el objeto y se devolverá éste al final de la función. En el caso de no
//				encontrar el id en el fichero, el objeto devuelto será nulo
				subMenuValTarea = false;
				break;
			case 0:
				subMenuValTarea = true;
				System.out.println("Volviendo...");
				return;
			}
		} while (!subMenuValTarea);
	}
}
