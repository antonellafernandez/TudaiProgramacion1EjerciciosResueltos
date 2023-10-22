package practica_02;

/* Ejercicio 17: Escribir un programa que dado un valor ingresado por el usuario menor que 10 y mayor a 1, 
 * muestre por pantalla una cuenta regresiva de números desde dicho valor hasta el 0 inclusive. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica02_Ejercicio17 {
	public static void main(String[] args) {
		
		int num;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Ingrese un número entre 1 y 10: ");
			num = Integer.valueOf(entrada.readLine());
			
			if (num > 1 && num < 10) {
				for (int i = num; i >= 0; i --) {
					System.out.println(i);
				}
			} else {
				System.out.println("El número ingresado no es válido");
			}
		}
		
		catch (Exception exc) {
			System.out.println(exc);
		}
	}
}