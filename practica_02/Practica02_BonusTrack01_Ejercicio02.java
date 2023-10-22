package practica_02;

/* Ejercicio 02: La cadena de supermercados carrefive desea aplicar descuentos 
 * según el día que se realiza la compra:
 
 * a. Los días martes, si el importe total de la compra supera los $13.000 el descuento es del 5%, 
 * pero si supera los $20.000 es del 7.5%.
 
 * b. Los jueves, en cambio, el descuento es para todos los tickets cuyo importe supere los $25.000 
 * y será el 10% con un tope de reintegro de $3.000 por ticket.
 
 * c. Si es viernes o sábado, si el número de ticket es par y el importe es a lo sumo de $15.000 
 * se le aplicará un descuento del 8% si el DNI es par.
 
 * Escribir un programa que dado el día, solicite al usuario los restantes datos para calcular 
 * los descuentos en cada caso y lo aplique sobre el valor final a pagar. 
 
 * Debe informar el importe final a pagar en cada caso. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica02_BonusTrack01_Ejercicio02 {
	public static void main(String[] args) {
	
		int dia, numTicket, dni;
		double importe;
		double dtoMartes_13 = 5;
		double dtoMartes_20 = 7.5;
		double dtoJueves = 10;
		double dtoVieSab = 8;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Teniendo en cuenta que Lunes es el día 1.");
			System.out.println("Ingrese número de día en el que fue realizada la compra:");
			dia = Integer.valueOf(entrada.readLine());

			System.out.println("Ingrese importe: ");
			importe = Double.valueOf(entrada.readLine());

			if (dia == 2) {
				if (importe > 20000) {
					importe = importe - importe * dtoMartes_20 / 100;
				} else {
					if (importe > 13000) {
						importe = importe - importe * dtoMartes_13 / 100;
					}
				}
			} else if (dia == 4 && importe > 25000) {
					if (importe * dtoJueves / 100 > 3000) {
						importe = importe - importe * dtoJueves / 100;
					} else {
						importe = importe - 3000;
					}				
			} else if (dia == 5 || dia  == 6) {
				System.out.println("Ingrese número de Ticket: ");
				numTicket = Integer.valueOf(entrada.readLine());
				
				if (numTicket % 2 == 0 && importe <= 15000) {
					System.out.println("Ingrese DNI (sólo números): ");
					dni = Integer.valueOf(entrada.readLine());
					
					if (dni % 2 == 0) {
						importe = importe - importe * dtoVieSab / 100;
					}
				}
			}

			System.out.println("El importe final es de $" + importe);
		}
		
		catch (Exception exc) {
			System.out.println(exc);
		}
		
	}
}