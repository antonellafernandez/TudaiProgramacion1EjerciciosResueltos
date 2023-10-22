package practica_03;

/* Ejercicio 09: Escribir un programa que mientras el usuario ingrese un número entero entre 1 y 10, 
 * pida ingresar un carácter, y por cada carácter ingresado imprima:
 * a. “letra minúscula” si el carácter es una letra del abecedario en minúscula;
 * b. “letra mayúscula” si el carácter es una letra del abecedario en mayúscula;
 * c. “dígito” si el caracter corresponde a un número;
 * d. “otro” para los restantes casos de caracteres. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica03_Ejercicio09 {
	public static void main(String[] args) {
		int num;
		char c;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			do {
				System.out.println("Ingrese un número entero entre 1 y 10: ");
				num = Integer.valueOf(entrada.readLine());
			
				if (num >= 1 && num <= 10) {
					System.out.println("Ingrese un caracter: ");
					c = entrada.readLine().charAt(0);
					
					analizarCaracter(c);
				} else {
				System.out.println("El programa ha finalizado.");
				}
			} while (num >= 1 && num <= 10);
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}
	
	public static void analizarCaracter(char c) {
		if (Character.isLowerCase(c)) {
			System.out.println("letra minúscula");
		} else if (Character.isUpperCase(c)) {
			System.out.println("letra mayúscula");
		} else if (Character.isDigit(c)) {
			System.out.println("dígito");
		} else {
			System.out.println("otro");
		}
	}
}