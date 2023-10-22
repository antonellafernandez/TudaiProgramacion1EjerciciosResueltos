package practica_01;

// Ejercicio 03: Viendo el éxito de las promociones implementadas por la competencia, 
// el supermercado Soberano decidió aplicar la misma idea. En Soberano, hay un descuento del 8% si se cumplen las
// siguientes condiciones: es viernes o sábado, el número de ticket es par, el importe es a lo sumo de $15.000 
// y el DNI del cliente termina en un número impar. 

// Escribir un programa que dado el día, el número de ticket, el importe y el DNI verifique si debe
// aplicar el descuento o no. Puede suponer un dato numérico para el día como en el inciso anterior.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica01_BonusTrack01_Ejercicio03 {
	public static void main(String[] args) {
		
		String dia;
		int numTicket, dniCliente;
		final int DTO = 8;
		float importe;
		
		try {
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
			
			System.out.println("Ingrese el día de compra: ");
			dia = String.valueOf(entrada.readLine());
			dia = dia.toUpperCase();

			System.out.println("Ingrese el número de ticket: ");
			numTicket = Integer.valueOf(entrada.readLine());
			
			System.out.println("Ingrese importe: ");
			importe = Float.valueOf(entrada.readLine());
			
			System.out.println("Ingrese el DNI del cliente (sólo números, sin puntos): ");
			dniCliente = Integer.valueOf(entrada.readLine());
			
			if ((dia.equals("VIERNES") || dia.equals("SÁBADO")) && (numTicket % 2 == 0) && (importe <= 15000) && (dniCliente % 2 != 0)) {
				importe = importe - importe * DTO / 100;
			}
			
			System.out.println("Importe: $" + importe);
		}
	
		catch (Exception exc) {
			System.out.println(exc);
		}
	
	}
}