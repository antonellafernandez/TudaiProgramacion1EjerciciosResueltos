package practica_02;

/* Ejercicio 12: Escribir un programa que mientras el usuario ingrese un carácter letra minúscula, se quede 
 * con la menor y la mayor letra ingresada. Finalmente muestre por pantalla dichas letras. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica02_Ejercicio12 {
	public static void main(String[] args) {
	
		char c;
		char minLetra = 'z';
		char maxLetra = 'a';
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			do {
				System.out.println("Ingrese un carácter: ");
				c = entrada.readLine().charAt(0);
				
				if (Character.isLowerCase(c)) {
					if (c <= minLetra) {
						minLetra = c;
					} else if (c >= maxLetra) {
						maxLetra = c;
					}
				}
				
			} while (Character.isLowerCase(c));
			
			System.out.println("La menor letra ingresada es: " + minLetra);
            System.out.println("La mayor letra ingresada es: " + maxLetra);
		}
		
		catch (Exception exc) {
			System.out.println(exc);
		}
		
	}
}