//hace Martintin
package entidades;

import java.util.Scanner;

import Utils.Validador;

public class Equipo {

	private long idEquipo = 0;
	// idEquipo es el identificador del elemento equipo
	// valor entero > 0
	// y valor por defecto 0
	private double precio = 0;
	// precio expresado en numeros reales
	private String modelo = "Sin modelo disponible";
	// modelo es la expresion que identifica el modelo de equipo
	// expresado en cadenas de caracteres
	
	long numeroIdEquipo;
	
	public Equipo() {
		
	}
	
	
	
	public Equipo(long idEquipo, double precio, String modelo) {
		numeroIdEquipo++;
		this.idEquipo = numeroIdEquipo;
		this.precio = precio;
		this.modelo = modelo;
		
	}

	public static Equipo nuevoEquipo() {
		Equipo ret = new Equipo();
		Scanner teclado = new Scanner(System.in);

		double precio;
		boolean precioValido = false;
		do {
			System.out.println("precio: ");
			precio = teclado.nextDouble();
			ret.setPrecio(precio);
			precioValido = Validador.validarPrecio(precio);

		} while (!precioValido);
		ret.setPrecio(precio);

		String modelo;
		boolean modeloValido = false;
		do {
			System.out.println("modelo: ");
			modelo = teclado.nextLine();
			ret.setModelo(modelo);
			precioValido = Validador.validarModelo(modelo);

		} while (!modeloValido);
		ret.setPrecio(precio);

		return ret;
	}

////Getters , setters and to string
	public long getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(long idEquipo) {
		this.idEquipo = idEquipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	// to string
	@Override
	public String toString() {
		return "Equipo [idEquipo=" + idEquipo + ", precio=" + precio + ", modelo=" + modelo + "]";
	}

}
