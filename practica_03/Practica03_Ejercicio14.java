package practica_03;

/* Ejercicio 14: Escribir un programa que mientras el usuario ingresa un carácter distinto del carácter ‘*’, 
 * invoque a un método que imprima si es carácter dígito o carácter letra minúscula, y si es letra
 * minúscula imprimir si es vocal o consonante. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica03_Ejercicio14 {
	public static void main(String[] args) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		char c;
		
		try {
			do {
				System.out.println("Ingrese un caracter (sin tildes): ");
				c = entrada.readLine().charAt(0);
				
				if (c == '*') {
					System.out.println("El programa ha finalizado.");
				} else {
					validarDigitoLetra(c);
				}
				
			} while (c != '*');
			
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}
	
	public static void validarDigitoLetra(char c) {
		if (Character.isDigit(c)) {
			System.out.println("El caracter ingresado es dígito");
		} else if (Character.isLowerCase(c)) {
			System.out.println("El caracter ingresado es letra minúscula");
			
			switch (c) {
			case 'a': case 'e': case 'i': case 'o': case 'u': System.out.println("El caracter ingresado es vocal"); break;
			default: System.out.println("El caracter ingresado es consonante"); break;
			}
		} else {
			System.out.println("El caracter ingresado no es válido");
		}
	}
}