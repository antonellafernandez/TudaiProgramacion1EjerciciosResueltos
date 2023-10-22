package practica_01;

// Ejercicio 06: Escribir un programa que pida se ingresen datos necesarios para
// emitir una factura por la compra de dos artículos de librería (tipo factura, número, 
// nombre cliente, producto 1, importe 1, producto 2, importe 2, importe total). 
// Como salida debe imprimir por pantalla la factura en un formato similar al del siguiente ejemplo:

// Factura		C		N249
// Nombre: Juan Perez
// Producto				Importe
// Lápiz 				15.5
// Papel 				20.6
// Importe total 		36.1

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica01_Ejercicio06 {
	public static void main(String[] args) {
		
		String tipoFactura, numFactura, cliente, producto_1, producto_2;
		double importe_1, importe_2, importeTotal;
		
		try {
			
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Ingrese tipo y número de factura: ");
			tipoFactura = entrada.readLine();
			numFactura = entrada.readLine();
			
			System.out.println("Ingrese nombre del cliente: ");
			cliente = entrada.readLine();
			
			System.out.println("Ingrese el nombre del primer artículo, seguido de su importe: ");
			producto_1 = entrada.readLine();
			importe_1 = Double.valueOf(entrada.readLine());
			
			System.out.println("Ingrese el nombre del segundo artículo, seguido de su importe: ");
			producto_2 = entrada.readLine();
			importe_2 = Double.valueOf(entrada.readLine());
			
			importeTotal = importe_1 + importe_2;
			
			System.out.println("Factura     " + tipoFactura + "     " + numFactura);
			System.out.println("Nombre: " + cliente);
			System.out.println("Producto - Importe");
			System.out.println(producto_1 + " - $" + importe_1);
			System.out.println(producto_2 + " - $" + importe_2);
			System.out.println("Importe total - $" + importeTotal);
			
		}
		
		catch (Exception exc) {
			System.out.println(exc);
		}
		
	}
}
