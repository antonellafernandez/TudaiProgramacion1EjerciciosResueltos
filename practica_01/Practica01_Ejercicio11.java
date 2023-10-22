package practica_01;

// Ejercicio 11: Escribir un programa que permita el ingreso de un número entero
// por teclado e imprima el resultado de determinar:
// a. si es múltiplo de 6 y de 7,
// b. si es mayor a 30 y múltiplo de 2, o es menor igual a 30,
// c. si el cociente de la división de dicho número por 5 es mayor que 10.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica01_Ejercicio11 {
	public static void main(String[] args) {
		
		int num;
		
		try {
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
			
			System.out.println("Ingrese un número entero: ");
			num = Integer.valueOf(entrada.readLine());
			
			// Si es múltiplo de 6 y de 7
			if (num % 6 == 0 && num % 7 == 0) {
				System.out.println(num + " es múltiplo de 6 y de 7");
			} else {
				System.out.println(num + " no es múltiplo al menos de 6 o de 7");
			}
			
			// Si es mayor a 30 y múltiplo de 2, o es menor igual a 30
			if (num > 30 && num % 2 == 0) { 
				System.out.println(num + " es mayor a 30 y múltiplo de 2");
			} else {
				if (num > 30 && num % 2 != 0) {
					System.out.println(num + " es mayor a 30 y no es múltiplo de 2");
				} else {
					if (num <= 30) {
						System.out.println(num + " es menor o igual a 30");
					}
				}
			}
			
			// si el cociente de la división de dicho número por 5 es mayor que 10
			if (num / 5 > 10) {
				System.out.println("El cociente de la división de " + num + " por 5 es mayor que 10");
			}
		}
		
		catch (Exception exc) {
			System.out.println(exc);
		}
		
	}
}
