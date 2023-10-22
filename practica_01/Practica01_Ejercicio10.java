package practica_01;

// Ejercicio 10: Escribir un programa que permita el ingreso de dos números
// enteros por teclado e imprima:
// a. si el primero es mayor al segundo.
// b. si ambos son múltiplos de 2.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica01_Ejercicio10 {
	public static void main(String[] args) {
		
		int num_1, num_2;
		
		try {
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
			
			System.out.println("Ingrese dos números enteros: ");
			num_1 = Integer.valueOf(entrada.readLine());
			num_2 = Integer.valueOf(entrada.readLine());
			
			if (num_1 > num_2) {
				System.out.println(num_1 + " es mayor que " + num_2);
			}
			
			if (num_1 % 2 == 0 && num_2 % 2 == 0) {
				System.out.println("Ambos números son múltiplos de 2");
			} else {
					System.out.println("Al menos uno de los números no es múltiplo de 2");
			}
		}
		
		catch (Exception exc) {
			System.out.println(exc);
		}
		
	}
}
