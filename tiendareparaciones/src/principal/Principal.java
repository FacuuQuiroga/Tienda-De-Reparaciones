package principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado;/// IMPORTATE PAL TECLADO
		teclado = new Scanner(System.in);/// IMPORTANTE PAL TECLADO
		//////////////////////////////////////////////////////////////
		
		System.out.println ("Programa de gestion de servicios de una tienda de reparaciones");
		System.out.println("Que desea hacer? \n");
		System.out.println("1- Registrar cliente");
		System.out.println("2- Registrar Servicio");
		System.out.println("3- Otros");
		System.out.println("9- Salir");

		int auxMenu = teclado.nextInt();
		
		switch (auxMenu) {
			case 1:
				System.out.println("Registro del cliente: ");
				break;
			case 2:
				System.out.println("Registro de nuevo Servicio");
				System.out.println("Que tipo de servicio es?");
				System.out.println("1-Compra");
				System.out.println("2-Mantenimiento");
				break;
			case 3:
				System.out.println("otros otros");
				break;
			case 4:
				System.out.println("Boton secreto activado, se procede a la explotacion del pc");
				System.out.println("PUM!");
				break;
			default:
				System.out.println("Introduce solo numeros entre 0 y 3");
				
		}

	}
	
}
