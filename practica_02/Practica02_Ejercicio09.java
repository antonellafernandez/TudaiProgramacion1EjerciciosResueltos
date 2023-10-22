package practica_02;

/* Ejercicio 09: Escribir un programa que mientras que el usuario ingrese un carácter dígito o carácter 
 * letra minúscula, imprima si es carácter dígito o carácter letra minúscula, 
 * y si es letra minúscula imprimir si es vocal o consonante. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica02_Ejercicio09 {
	public static void main(String[] args) {
		
		char c;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Ingrese un carácter: ");
			c = (char) entrada.read();
			
			if (Character.isLowerCase(c)) {
				System.out.println("El carácter ingresado es letra minúscula");
				
				switch (c) {
				case 'a': case 'e': case 'i': case 'o': case 'u':
					System.out.println("El carácter ingresado es vocal"); break;	
				default: System.out.println("El carácter ingresado es consonante");
				}
			} else if (Character.isDigit(c)) {
				System.out.println("El carácter ingresado es dígito");
			}
		}
		
		catch (Exception exc) {
			System.out.println(exc);
		}
		
	}
}