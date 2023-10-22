package practica_03;

/* Ejercicio 17: Escribir un programa que mientras que el usuario ingrese un carácter letra minúscula, 
 * pida ingresar un número entero. Si el número ingresado está entre 1 y 5 inclusive deberá imprimir la
 * tabla de multiplicar de dicho número. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica03_Ejercicio17 {
	public static void main(String[] args) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		char c;
		int num;
		
		try {
			
			do {
				System.out.println("Ingrese un caracter: ");
				c = entrada.readLine().charAt(0);
				
				if (Character.isLowerCase(c)) {
					
					do {
						
						System.out.println("Ingrese un número entero: ");
						num = Integer.valueOf(entrada.readLine());
						
						if (num >= 1 && num <= 5) {
							imprimirTablaMultiplicarNum(num);
						} else {
							System.out.println("El número ingresado no es válido.");
						}
						
					} while (num > 1 && num < 5);
					
				} else {
					System.out.println("El caracter ingresado no es válido.");
				}
				
			} while (Character.isLowerCase(c));
			
		} catch (Exception exc) {
			System.out.println(exc);
		} finally {
			System.out.println("El programa ha finalizado.");
		}
	}
	
	public static void imprimirTablaMultiplicarNum(int num) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}
}