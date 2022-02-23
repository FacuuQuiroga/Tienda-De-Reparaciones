package principal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import entidades.BajaEmpleado;
import entidades.Cliente;
import entidades.Envio;
import entidades.Equipo;
import entidades.Servicio;
import utils.Datos;

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
				BajaEmpleado.exportarBajaEmpleadotexto();//Exportacion de la clase BajaEmpleado (fichero de texto)
				subMenuValTarea = false;
				break;
			case 2:
				// Exportar una colección de objetos de esa clase hacia un fichero de texto.
				System.out.println("Guardando datos en ClientesChar.txt...");

				File fOut = new File("ClienteChar.txt");
				FileWriter fw = null;
				BufferedWriter bw = null;

				try {
					fw = new FileWriter(fOut);
					bw = new BufferedWriter(fw);
					for (int i = 0; i < Datos.numClientes; i++) {
						Cliente c = new Cliente();
						c = Datos.CLIENTES[i];
						bw.write(c.data() + "\n");
					}

				} catch (IOException e1) {
					e1.printStackTrace();
				} finally {
					try {
						if (bw != null)
							bw.close();
						if (fw != null)
							fw.close();

					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				subMenuValTarea = false;
				break;
			case 3:
				// Exportar un objeto de esa clase hacia un fichero binario

				BajaEmpleado.exportarBajaEmpleado(); // Exportacion de la clase BajaEmpleado (fichero binario)

				System.out.println("Guardando datos en clientesbyte.dat...");
				File f;
				FileOutputStream fos = null;
				ObjectOutputStream oos = null;

				try {

					f = new File("clienteByte.dat"); // creo el archivo
					fos = new FileOutputStream(f); // se lo paso a fos para escribir
					oos = new ObjectOutputStream(fos);// se lo paso a oos para que pueda escribir

					// oos.writeObject(new Cliente(00006, "facu", "58427904S", "calle rio pilonia",
					// "634164170"));
					oos.writeObject(Datos.CLIENTES[1]);

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						if (oos != null)
							oos.close();
						if (fos != null)
							fos.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}

				subMenuValTarea = false;
				break;
			case 4:
				// Exportar una colección de objetos de esa clase hacia un fichero binario.
				// facu
				System.out.println("Guardando datos en clientesbyte.dat...");
				File f4;
				FileOutputStream fos4 = null;
				ObjectOutputStream oos4 = null;

				try {

					f4 = new File("clienteByte.dat"); // creo el archivo
					fos4 = new FileOutputStream(f4); // se lo paso a fos para escribir
					oos4 = new ObjectOutputStream(fos4);// se lo paso a oos para que pueda escribir
					// oos.writeObject(new Cliente(00006, "facu", "58427904S", "calle rio pilonia",
					// "634164170"));
					// oos.writeObject(new Cliente(00001, "Luis", "43256743G", "Gijon",
					// "942779900"));
					for (int i = 0; i < Datos.numClientes; i++) {
						Cliente c = new Cliente();
						c = Datos.CLIENTES[i];
						oos4.writeObject(c);
					}
					// cargo un cliente mas para pruebas
					oos4.writeObject(new Cliente(00006, "facu", "58427904S", "calle rio pilonia", "634164170"));

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						if (oos4 != null)
							oos4.close();
						if (fos4 != null)
							fos4.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				subMenuValTarea = false;
				break;
			case 5:
				// Importar una colección de objetos de esa clase desde un fichero de texto.
				System.out.println("Cargando datos de ClienteChar.txt...");
				File fIn = new File("ClienteChar.txt");
				FileReader fr = null;
				BufferedReader br = null;

				try {
					fr = new FileReader(fIn);
					br = new BufferedReader(fr);
					String c;

					for (int i = 0; i < 6; i++) {
						c = (String) br.readLine();
						System.out.println(c);
					}

				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						if (br != null)
							br.close();
						if (fr != null)
							fr.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}

				subMenuValTarea = false;
				break;
			case 6:
				// Importar una colección de objetos de esa clase desde un fichero binario
				// facu
				System.out.println("Cargando datos de clienteByte.dat...");
				File ci;
				FileInputStream fis = null;
				ObjectInputStream ois = null;
				try {
					ci = new File("clienteByte.dat");
					fis = new FileInputStream(ci);
					ois = new ObjectInputStream(fis);

					for (int i = 0; i < 6; i++) { // puedo usar Datos.numClientes para el limite pero no contaria el
													// nuevo cliente.
						Cliente c = (Cliente) ois.readObject();
						System.out.println(c.data());
					}
//					Cliente c = (Cliente) ois.readObject();
//					System.out.println(c.data());

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} finally {
					try {
						if (ois != null)
							ois.close();
						if (fis != null)
							fis.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
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
		teclado.close();
	}
}
