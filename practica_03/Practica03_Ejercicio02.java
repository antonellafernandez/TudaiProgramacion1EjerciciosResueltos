package practica_03;

/* Ejercicio 02: Escribir un diseño de programa que mientras que el usuario
 * ingrese un carácter dígito o carácter letra minúscula, imprima
 * dicho carácter, y si es carácter letra minúscula, imprima si es vocal
 * o consonante. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica03_Ejercicio02 {
	public static void main(String[] args) {
		char c;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			do {
				System.out.println("Ingrese un carácter: ");
				c = entrada.readLine().charAt(0);
				
				if (Character.isDigit(c)) {
					System.out.println("El caracter ingresado es: " + c);
				} else if (Character.isLowerCase(c)) {
					System.out.println("El caracter ingresado es: " + verificarVocalConsonante(c));
				} else {
					System.out.println("El caracter ingresado no es válido");
				}
			} while (Character.isDigit(c) || Character.isLowerCase(c));
		}
		
		catch (Exception exc) {
			System.out.println(exc);
		}
	}
	
	public static String verificarVocalConsonante(char letra) {
		String retorno = "vocal";
		
		try {
			switch (letra) {
			case 'a': case 'e': case 'i': case 'o': case 'u': retorno = "vocal"; break;
			default: retorno = "consonante";
			}
		}
		
		catch (Exception exc) {
			System.out.println(exc);
		}
		
		return retorno;
	}		
}