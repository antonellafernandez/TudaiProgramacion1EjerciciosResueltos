package practica_03;

// Ejercicio 08: Realizar un programa que dado dos números enteros y un carácter, todos ingresados por el usuario, 
// muestre por pantalla el resultado de la operación matemática básica considerando el valor del carácter. 
// Si ingreso el carácter: ‘a’ la suma, ‘b’ la resta, ‘c’ la multiplicación y ‘d’ la división entre ambos números.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica03_Ejercicio08 {
	public static void main(String[] args) {
		int num_1, num_2;
		char letra;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Ingrese el primer número entero: ");
			num_1 = Integer.valueOf(entrada.readLine());
			
			System.out.println("Ingrese el segundo número entero: ");
			num_2 = Integer.valueOf(entrada.readLine());
			
			System.out.println("Ingrese una letra: ");
			System.out.println("(a) Suma");
			System.out.println("(b) Resta");
			System.out.println("(c) Multiplicación");
			System.out.println("(d) División");
			letra = entrada.readLine().charAt(0);
			
			letra = Character.toLowerCase(letra);
			
			switch (letra) {
				case 'a':
					Suma(num_1, num_2); break;
				case 'b':
					Resta(num_1, num_2); break;
				case 'c':
					Multiplicacion(num_1, num_2); break;
				case 'd': {
					if (num_2 == 0) {
						do {
							System.out.println("El divisor ingresado no es válido!");
							System.out.println("Ingrese un divisor distinto de 0: ");
							num_2 = Integer.valueOf(entrada.readLine());
						} while (num_2 == 0);
					}
					
					Division(num_1, num_2); break;
				}
				default: System.out.println("La opción ingresada no es válida.");
			}
			
		} catch (Exception exc) {
			System.out.println(exc);
		} finally {
			System.out.println("El programa ha finalizado.");
		}
	}
	
	public static void Suma(int num_1, int num_2) {
		int suma = num_1 + num_2;
		System.out.println(num_1 + " + " + num_2 + " = " + suma);
	}
	
	public static void Resta(int num_1, int num_2) {
		int resta = num_1 - num_2;
		System.out.println(num_1 + " - " + num_2 + " = " + resta);
	}
	
	public static void Multiplicacion(int num_1, int num_2) {
		int multiplicacion = num_1 * num_2;
		System.out.println(num_1 + " * " + num_2 + " = " + multiplicacion);
	}
	
	public static void Division(double num_1, double num_2) {
		double division = num_1 / num_2;
		System.out.println(num_1 + " / " + num_2 + " = " + division);
	}
}