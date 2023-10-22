package practica_01;

// Ejercicio 03: Escribir un programa que declare una constante de tipo int 
// y pida el ingreso de un valor por teclado. Luego muestre el valor ingresado.
// ¿Qué pasa en este caso? ¿Se puede o surge algún problema?

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica01_Ejercicio03 {
	public static void main(String[] args) {
		
		final int CONST;
		
		try {
			
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Ingrese un valor entero: ");
			CONST = Integer.valueOf(entrada.readLine());
			System.out.println("Entero ingresado : " + CONST);
			
			}
		
			catch (Exception exc) {
				System.out.println(exc);
				}
		
		}
}