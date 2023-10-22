package practica_02;

/* Ejercicio 06: Escribir un programa que mientras el usuario ingrese un número entero menor que 100 y mayor a 1, 
 * muestre por pantalla si el número es múltiplo de 2 y múltiplo de 3 simultáneamente. 
 
 * ¿Los valores mencionados en el enunciado deberían ser constantes?.
 
 * De a poco habría que definirlos como constantes. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica02_Ejercicio06 {
	public static void main(String[] args) {
	
		int num = 4;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			while (num > 1 && num < 100) {
				System.out.println("Ingrese un número: ");
				num = Integer.valueOf(entrada.readLine());
				
				if (num == 1 || num == 100) {
					System.out.println("El programa ha finalizado");
				} else {
					if (num % 2 == 0 && num % 3 == 0) {
						System.out.println(num + " es múltiplo de 2 y múltiplo de 3 simultáneamente");
					} else {
						System.out.println(num + " al menos no es múltiplo de 2 o múltiplo de 3");
					}
				}
			}				
		}
		
		catch (Exception exc) {
			System.out.println(exc);
		}
		
	}
}