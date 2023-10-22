package practica_03;

/* Ejercicio 04: Escribir un diseño de programa que mientras que el usuario ingrese un número distinto de 0, 
 * pida ingresar otros dos números e imprima el resultado de la multiplicación entre los dos últimos
 * números ingresados. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica03_Ejercicio04 {
	public static void main(String[] args) {
		int num, num_1, num_2;
		
		try {
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
			
			do {
				System.out.println("Ingrese un número entero (0 para Salir): ");
				num = Integer.valueOf(entrada.readLine());
				
				if (num != 0) {
					System.out.println("Ingrese el primer número: ");
					num_1 = Integer.valueOf(entrada.readLine());
					System.out.println("Ingrese el segundo número: ");
					num_2 = Integer.valueOf(entrada.readLine());
					
					System.out.println(num_1 + " * " + num_2 + " = " + multiplicarNros(num_1, num_2));
				} else {
					System.out.println("Ha ingresado 0!");
				}
			} while (num != 0);
			
		} catch (Exception exc) {
			System.out.println(exc);
		} finally {
			System.out.println("El programa ha finalizado.");
		}
	}

	public static int multiplicarNros(int num_1, int num_2) {
		int retorno = 0;
		
		try {
			retorno = num_1 * num_2;
			
		} catch (Exception exc) {
			System.out.println(exc);
		}
		
		return retorno;
	}
}