package Utils;

public class Menu {
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
