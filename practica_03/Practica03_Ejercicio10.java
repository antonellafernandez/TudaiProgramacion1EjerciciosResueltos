package practica_03;

/* Ejercicio 10: Escribir un programa que mientras el usuario ingrese un número entero entre 1 y 10 realice:
 * a. Si el numero ingresado es múltiplo de 3 pida ingresar un caracter, y para el caracter ingresado 
 * imprima a qué tipo de carácter está asociado:
 * * i. “letra minúscula” si el caracter es una letra del abecedario en minúscula;
 * * ii. “letra mayúscula” si el caracter es una letra del abecedario en mayúscula;
 * * iii. “dígito” si el caracter corresponde a un número;
 * * iv. “otro” para los restantes casos de caracteres.
 * b. Si el número ingresado es múltiplo de 5 imprima la tabla de multiplicar del número ingresado. */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica03_Ejercicio10 {
	public static void main(String[] args) {
		int num;
		char c;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			do {
				System.out.println("Ingrese un número entero entre 1 y 10: ");
				num = Integer.valueOf(entrada.readLine());
			
				if (num >= 1 && num <= 10) {
					if (num % 3 == 0) {
						System.out.println("Ingrese un caracter: ");
						c = entrada.readLine().charAt(0);
					
						analizarCaracter(c);
					} else if (num % 5 == 0) {
						imprimirTablaDelN(num);
					}
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
	
	public static void imprimirTablaDelN(int num) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}
}