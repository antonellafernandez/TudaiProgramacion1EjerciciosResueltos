package practica_02;

/* Ejercicio 08: Escribir un programa que mientras que el usuario ingrese un número entero 
 * distinto de 0, pida ingresar otro número entero y lo imprima. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica02_Ejercicio08 {
	public static void main(String[] args) {
		
		int num;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			do {
				System.out.println("Ingrese un número entero: ");
				num = Integer.valueOf(entrada.readLine());
				
				System.out.println("El número es " + num);
			} while (num != 0);
		}
		
		catch (Exception exc) {
			System.out.println(exc);
		}
		
	}
}