package practica_05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// Ejercicio 29: Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra precargado, 
// solicite al usuario el ingreso de dos números enteros (posiciones del arreglo) y ordene de forma
// creciente el arreglo entre dos posiciones correspondientes a los números ingresados.

public class Practica05_Ejercicio29 {
	final static int MAX = 10;
	public static void main(String[] args) {
		int[] arreglo = {9, 0, 8, 1, 7, 2, 6, 3, 5, 4};
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Ingrese la posición de inicio para ordenar el arreglo: ");
			int inicio = Integer.valueOf(entrada.readLine());
			
			System.out.println("Ingrese la posición de fin para ordenar el arreglo: ");
			int fin = Integer.valueOf(entrada.readLine());
			
			ordenarSecuencia(arreglo, inicio, fin);
			mostrarArreglo(arreglo);
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}
	
	public static void ordenarSecuencia(int[] arreglo, int inicio, int fin) {
		for (int i = inicio; i < fin - 1; i++) {
			for (int j = inicio; j < fin - i - 1; j++)
			if (arreglo[j] >= arreglo[j+1]) {
				int auxiliar = arreglo[j];
				arreglo[j] = arreglo[j+1];
				arreglo[j+1] = auxiliar;
			}
		}
	}
	
	public static void mostrarArreglo(int[] arreglo) {
		System.out.println("El arreglo final es: ");
		System.out.print("{");
		for (int i = 0; i < MAX; i++) {
			if (i == MAX - 1) {
				System.out.print(arreglo[i]);
			} else {
				System.out.print(arreglo[i] + ", ");
			}
		}
		System.out.println("}");
	}
}