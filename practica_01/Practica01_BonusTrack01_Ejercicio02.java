package practica_01;

// Ejercicio 02: En Carrefive, los días martes y jueves hay “PROMO”. En los días martes,
// si el importe total de la compra supera los $13.000 el descuento es del 5%,
// pero si supera los $20.000 es del 7.5%. Los jueves, en cambio, el descuento es para todos
// los tickets cuyo importe supere los $25.000 y será el 10% con un tope de reintegro de $3.000 por ticket.
// Escribir un programa que dado el día de la semana que se hace la compra y el importe del ticket,
// verifique si aplica hacer el descuento o no. Puede suponer un dato numérico para cada día.

// Ejemplo: 1 para el martes y 2 para el jueves.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica01_BonusTrack01_Ejercicio02 {
	public static void main(String[] args) {

		int dia;
		double importe;
		double dtoMartes_13 = 5;
		double dtoMartes_20 = 7.50;
		double dtoJueves = 10;

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
			} else {
				if ((dia == 4) && (importe > 25000)) {
					if (importe * dtoJueves / 100 > 3000) {
						importe = importe - importe * dtoJueves / 100;
					} else {
						importe = importe - 3000;
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