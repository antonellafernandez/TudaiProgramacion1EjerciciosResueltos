package practica_02;

/* Ejercicio 13: Escribir un programa que mientras que el usuario ingrese un caracter letra minúscula, 
 * pida ingresar un número entero. Si el número ingresado está entre 1 y 5 inclusive deberá imprimir la
 * tabla de multiplicar de dicho número. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica02_Ejercicio13 {
	public static void main(String[] args) {
	
		char c;
		int num, i, resultado;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Ingrese un caracter: ");
			c = entrada.readLine().charAt(0);
			
			if (Character.isLowerCase(c)) {
				System.out.println("Ingrese un número entero: ");
				num = Integer.valueOf(entrada.readLine());
				
				if (num >= 1 && num <= 5) {
					for (i = 1; i <= 10; i++) {
						resultado = i * num;
						System.out.println(i + " * " + num + " = " + resultado);
					}
				}
			
			} else {
				System.out.println("El caracter ingresado no es una letra minúscula.");
			}
		}
		
		catch (Exception exc) {
			System.out.println(exc);
		}
		
	}
}