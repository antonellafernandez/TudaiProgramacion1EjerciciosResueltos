package practica_01;

// Ejercicio 01: La cadena de supermercados Carrefive debe imprimir el encabezado del ticket de 
// compra de los clientes con cierto formato para cumplir las exigencias de la Administración Federal de
// Ingresos PRIVADOS. En el mismo, debe figurar la fecha y hora, número de ticket, CUIT, 
// nombre del cajero, número de caja, dni del cliente y la leyenda “El precio lo pone el cliente”. 

// Un ejemplo se muestra a continuación:

// —-----------------------------------------------------------------
// 04/04/23 - 18:55 Ticket Nro. 3455674

// CUIT: 99-34567833-9

// Cajero: Luis Mercado Caja: 8
// DNI: 33.333.333 “El precio lo pone el cliente”
// —-----------------------------------------------------------------

// Escribir un programa con declaración de constantes y variables que pida al usuario el ingreso 
// de los datos necesarios para imprimir el encabezado del ticket.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica01_BonusTrack01_Ejercicio01 {
	public static void main(String[] args) {
	
		String fecha, hora, nombreCajero, cuit, dniCliente;
		int numTicket, numCaja; 
		
		try {
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
			
			System.out.println("Ingrese fecha de compra (en formato dd/mm/aa): ");
			fecha = String.valueOf(entrada.readLine());
			
			System.out.println("Ingrese hora de compra (en formato hh:mm): ");
			hora = String.valueOf(entrada.readLine());
			
			System.out.println("Ingrese número de ticket: ");
			numTicket = Integer.valueOf(entrada.readLine());
			
			System.out.println("Ingrese CUIT del cliente (en formato XX-XXXXXXXX-X): ");
			cuit = String.valueOf(entrada.readLine());
			
			System.out.println("Ingrese nombre del cajero: ");
			nombreCajero = String.valueOf(entrada.readLine());
			
			System.out.println("Ingrese número de caja: ");
			numCaja = Integer.valueOf(entrada.readLine());
			
			System.out.println("Ingrese DNI del cliente (en formato XX.XXX.XXX): ");
			dniCliente = String.valueOf(entrada.readLine());
			
			System.out.println("------------------------------------------------------------------");
			System.out.println(fecha + " - " + hora + " Ticket Nro. " + numTicket);
			System.out.println("");
			System.out.println("CUIT: " + cuit);
			System.out.println("");
			System.out.println("Cajero: " + nombreCajero + " Caja: " + numCaja);
			System.out.println("DNI: " + dniCliente + " 'El precio lo pone el cliente'");
			System.out.println("------------------------------------------------------------------");
		}
		
		catch (Exception exc) {
			System.out.println(exc);
		}
		
	}
}
