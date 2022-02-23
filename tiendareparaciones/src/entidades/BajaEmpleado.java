//Naiara
package entidades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;

import java.util.Scanner;

import utils.Datos;

public class BajaEmpleado implements Serializable {
	private long idBaja;
	private LocalDate fechaInicio = LocalDate.now();
	private LocalDate fechaFin;
	private String motivoBaja;

	/**
	 * Carga ligera: Implementar en esta clase la relación (1-N) que tiene con la
	 * clase Empleado
	 */

	private long idEmpleado; // (clave foránea)

	public BajaEmpleado() {
	}

//	public BajaEmpleado(long idBaja) {
//		this.idBaja = idBaja;
//
//	}

	public BajaEmpleado(long idBaja, LocalDate fechaFin, String motivoBaja, long idEmpleado) {
		this.idBaja = idBaja;
		this.fechaFin = fechaFin;
		this.motivoBaja = motivoBaja;
		this.idEmpleado = idEmpleado;
	}

	/* Para relacion 1-N con Servicio */
	public Empleado newEmpleado() {
		Empleado ret = new Empleado();
//		e.setBajaEmpleado(this);
		ret = Empleado.newEmpleado();
		return ret;
	}

	// metodo nuevoClase

	public static BajaEmpleado newBajaEmpleado() {
		BajaEmpleado ret = new BajaEmpleado();
		Scanner teclado = new Scanner(System.in);
		long id = 0;
		id = teclado.nextLong();
		ret.setIdBaja(id);

		LocalDate fechaFin = null;
		fechaFin = LocalDate.of(teclado.nextInt(), teclado.nextInt(), teclado.nextInt());
		ret.setFechaFin(fechaFin);

		System.out.println("Motivo baja: ");
		String motivo;
		motivo = teclado.nextLine();
		ret.setMotivoBaja(motivo);
		return ret;
	}

	// getters y setters

	public long getIdBaja() {
		return idBaja;
	}

	public void setIdBaja(long idBaja) {
		this.idBaja = idBaja;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getMotivoBaja() {
		return motivoBaja;
	}

	public void setMotivoBaja(String motivoBaja) {
		this.motivoBaja = motivoBaja;
	}

	public long getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(long idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	// toString

	@Override
	public String toString() {
		return "BajaEmpleado [idBaja=" + idBaja + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin
				+ ", motivoBaja=" + motivoBaja + ", idEmpleado=" + idEmpleado + "]";
	}

	public static void exportarBajaEmpleado() {
		String path = "Baja.dat";
		BajaEmpleado nuevabaja = new BajaEmpleado();
		ObjectOutputStream oos = null;
		try {
			oos.writeObject(Datos.BAJAEMPLEADOS[1]);
			FileOutputStream fichero = new FileOutputStream("Baja.dat");

			ObjectOutputStream baja = new ObjectOutputStream(fichero);

			baja.writeObject(nuevabaja);
			// fichero.flush();

			fichero.close();
			// baja.flush();
			baja.close();

			ObjectInputStream bajaLeer = new ObjectInputStream(new FileInputStream("Baja.dat"));
			BajaEmpleado aux = (BajaEmpleado) bajaLeer.readObject();

			System.out.println(aux.idBaja + "Nueva Baja");

			bajaLeer.close();

		} catch (FileNotFoundException e) {

			System.out.println("Se ha producido una FileNotFoundException" + e.getMessage());

		} catch (IOException e) {

			System.out.println("Se ha producido una IOException" + e.getMessage());

		} catch (Exception e) {

			System.out.println("Se ha producido una Exception" + e.getMessage());
		}

	}

	public static void exportarBajaEmpleadotexto() {
		BajaEmpleado nuevabaja = new BajaEmpleado();
		ObjectOutputStream oos = null;
		try {
			oos.writeObject(Datos.BAJAEMPLEADOS[1]);
			File archivo = new File("Baja.txt");
			FileReader lector = new FileReader(archivo);
			BufferedReader br = new BufferedReader(lector);

			String linea;
			while ((linea = br.readLine()) != null) {
				nuevabaja.setIdBaja(Integer.parseInt(linea));

			}
			System.out.println(nuevabaja.idBaja + "Baja");

		} catch (FileNotFoundException e) {

			System.out.println("Se ha producido una FileNotFoundException" + e.getMessage());

		} catch (IOException e) {

			System.out.println("Se ha producido una IOException" + e.getMessage());

		} catch (Exception e) {

			System.out.println("Se ha producido una Exception" + e.getMessage());
		}
	}

}
