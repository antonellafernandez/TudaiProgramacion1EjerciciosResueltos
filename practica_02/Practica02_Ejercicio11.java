package practica_02;

/* Ejercicio 11: Escribir un programa que mientras el usuario ingrese un caracter letra minúscula, 
acumule la cantidad de vocales que ingresó. Finalmente muestre por pantalla dicha cantidad. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica02_Ejercicio11 {
	public static void main(String[] args) {
		
		char c;
		int contador = 0;
		String input;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			do {
				System.out.println("Ingrese un caracter: ");
				input = String.valueOf(entrada.readLine());
                c = input.charAt(0);
			
				switch (c) {
				case 'a': case 'e': case 'i': case 'o': case 'u': contador = contador + 1; break;
				}
			} while (Character.isLowerCase(c));
			
			System.out.println("Se han contado " + contador + " vocales");
		}
		
		catch (Exception exc) {
			System.out.println(exc);
		}
		
	}
}