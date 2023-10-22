package practica_02;

/* Ejercicio 14: Pedir por consola el ingreso de 10 números enteros positivos. Contar cuántas veces 
 * se ingresaron números pares y mostrarlo por pantalla. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica02_Ejercicio14 {
	public static void main(String[] args) {
	
		int num;
		int contador = 0;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			for (int i = 1; i <= 10; i++) {
				System.out.println("Ingrese un número entero positivo: ");
				num = Integer.valueOf(entrada.readLine());
			
				if (num < 1) {
					System.out.println("El número ingresado no es válido");
					i = i - 1;
				} else {
					if (num % 2 == 0) {
						contador = contador + 1;
					}
				}
			}
			
			System.out.println("Se ingresaron números pares " + contador + " veces");
		}
		
		catch (Exception exc) {
			System.out.println(exc);
		}
		
	}
}