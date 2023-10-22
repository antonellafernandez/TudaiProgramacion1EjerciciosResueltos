package practica_03;

/* Ejercicio 13: Realizar un programa que, dada una opción entera (1,2,3,4), permita realizar operaciones 
 * entre tres números reales (r1, r2, r3) ingresados desde teclado. Para la opción:
 * 1. Calcular la raíz cuadrada de (r1 - r3)
 * 2. Calcular el promedio de r1, r2 y r3
 * 3. Calcular cociente de la raíz cuadrada de (r3 - r2) dividida por r1
 * 4. Calcular el cociente del promedio de los tres valores dividido por la raíz cuadrada de r2
 * Observación: La raíz cuadrada de un número se calcula con la sentencia: Math.sqrt(numero). 
 * Hacer uso del diseño descendente y de la modularización para la solución. 
 * Tener en cuenta posibles errores o excepciones como la división por cero. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica03_Ejercicio13 {
	public static void main(String[] args) {
		double r1, r2, r3, raiz;
		int opcion;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Ingrese el primer número real: ");
			r1 = Double.valueOf(entrada.readLine());
			
			System.out.println("Ingrese el segundo número real: ");
			r2 = Double.valueOf(entrada.readLine());
			
			System.out.println("Ingrese el tercer número real: ");
			r3 = Double.valueOf(entrada.readLine());
			
			System.out.println("Ingrese opción (1, 2, 3, 4): ");
			opcion = Integer.valueOf(entrada.readLine());
			
			switch (opcion) {
				case 1:
					System.out.println("La raíz de (" + r1 + " - " + r3 + ") es igual a " + calcularRaizCuadrada(r1, r3)); break;
				case 2:
					System.out.println("El promedio de la suma entre " + r1 + ", " + ", " + r2 + " y " + r3 + " es igual a " + calcularPromedio(r1, r2, r3)); break;
				case 3:
					raiz = calcularRaizCuadrada(r3, r2);
					Cociente(raiz, r1); break;
				case 4:
					if (r2 == 0) {
						System.out.println("No se puede dividir por cero!");
					} else {
						System.out.println("El cociente es " + Cociente(calcularPromedio(r1, r2, r3), Math.sqrt(r2)));
					}; break;
				default: System.out.println("La opción ingresada no es válida.");
			}
		} catch (Exception exc){
			System.out.println(exc);
		} finally {
			System.out.println("El programa ha finalizado.");
		}
	}
	
	public static double calcularRaizCuadrada(double num_1, double num_2) {
		double raiz = 0;
		
		if ((num_1 - num_2) < 0) {
			System.out.println("No se puede calcular la raíz cuadrada de un número negativo.");
		} else {
			raiz = Math.sqrt(num_1 - num_2);
		}
		
		return raiz;
	}
	
	public static double calcularPromedio(double num_1, double num_2, double num_3) {
		double promedio = (num_1 + num_2 + num_3) / 3;
		return promedio;
	}
	
	public static double Cociente(double num_1, double num_2) {
		double cociente = 0;
		
		if (num_2 == 0) {
			System.out.println("No se puede dividir por cero!");
		} else {
			cociente = num_1 / num_2;
			System.out.println("El cociente es " + cociente);
		}
		
		return cociente;
	}
}