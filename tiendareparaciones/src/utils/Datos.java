package utils;

import entidades.Cliente;
import entidades.Equipo;
import entidades.Reparacion;

/*Almacenar� diferentes arrays de datos v�lidos para ser manejados desde una funci�n
principal. Cada clase dispondr� de un array propio con varios elementos v�lidos de esa clase, y que
ser� static y final. 
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
	 * public Reparacion(long id, double horasTrabajadas)
	 * Facu.
	 */
	
	public static final Reparacion REPARACIONES[] = {
			new Reparacion(000000000001, "2.27"),
			new Reparacion(000000000002, "3.40"), 
			new Reparacion(000000000003, "1.04"),
			new Reparacion(000000000004, "5.30") };
	public static final int numReparaciones = CLIENTES.length;
	
	/**
	 * public Equipo(long idEquipo, double precio, String modelo)
	 * Facu.
	 */
	public static final Equipo EQUIPOS[] = { 
			new Equipo(0000001, 12.23, "cosas missticas"),
			new Equipo(0000002, 360.99,"Ipad-o Pro"),
			new Equipo(0000003, 1000.99, "MacBookoto Pro 10.5"),
			new Equipo(0000004, 599.99,"Xbot Serie T")};
	public static final int numEquipos = EQUIPOS.length;
}
