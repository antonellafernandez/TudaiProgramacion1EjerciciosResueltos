package practica_02;

/* Ejercicio 07: Escribir un programa que mientras el usuario ingresa un caracter
distinto del carácter ‘*’, muestre por pantalla si es carácter dígito, o si es carácter vocal minúscula. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica02_Ejercicio07 {
	public static void main(String[] args) {
		
		char charIngreso;
		charIngreso = '!';
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			while (charIngreso != '*') {
				System.out.println("Ingrese un carácter: ");
				charIngreso = (char) entrada.read();
				
				if (Character.isDigit(charIngreso)) {
					System.out.println("El carácter ingresado es dígito");
				} else if (charIngreso == 'a' || charIngreso == 'e' || charIngreso == 'i' || charIngreso == 'o' || charIngreso == 'u') {
					System.out.println("El carácter ingresado es vocal minúscula");
				}
			}
		}
		
		catch (Exception exc) {
			System.out.println(exc);
		}
		
	}
}