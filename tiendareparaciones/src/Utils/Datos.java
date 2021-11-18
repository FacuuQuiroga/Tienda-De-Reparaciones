package Utils;

import entidades.Cliente;
import entidades.Reparacion;

/*Almacenará diferentes arrays de datos válidos para ser manejados desde una función
principal. Cada clase dispondrá de un array propio con varios elementos válidos de esa clase, y que
será static y final. 
*/
public class Datos {
	/*
	 * public Cliente(String nombre, String nif, String direccion, String telefono)
	 * Facu.
	 */
	
	public static final Cliente CLIENTES[] = { 
			new Cliente("Luis", "43256743G", "Gijon", "942779900"),
			new Cliente("Ana", "12345678T", "Madrid", "912331188"),
			new Cliente("Bruno", "84738925N", "Barcelona", "932432245"),
			new Cliente("Carla", "57390576B", "Santander", "975073211"),
			new Cliente("Ramona", "71263894K", "Valencia", "942779900") };
	public static final int numClientes = CLIENTES.length;
	
	/*
	 * public Reparacion(double horasTrabajadas)
	 * Facu.
	 */
	
	public static final Reparacion REPARACIONES[] = {
			new Reparacion(2.27),
			new Reparacion(3.40),
			new Reparacion(1.04),
			new Reparacion(5.30)};
	public static final int numReparaciones = CLIENTES.length;
}
