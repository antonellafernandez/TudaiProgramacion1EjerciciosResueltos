package practica_05;

// Ejercicio 28: Hacer un programa que dado un arreglo ordenado creciente de enteros de tamaño 10 
// que se encuentra precargado, solicite al usuario un número entero y elimine la primera ocurrencia de
// número (un número igual) en el arreglo (si existe). Informar si no existe en el arreglo.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica05_Ejercicio28 {
	final static int MAX = 10;
	public static void main(String[] args) {
		int[] arreglo = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Ingrese un número entero distinto de cero: ");
			int num = Integer.valueOf(entrada.readLine());
			
			while (num == 0) {
				System.out.println("El número ingresado es cero, por favor ingrese un número entero distinto de cero: ");
				num = Integer.valueOf(entrada.readLine());
			}
			
			eliminarOcurrencia(arreglo, num);
			mostrarArreglo(arreglo);
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}
	
	public static void eliminarOcurrencia(int[] arreglo, int num) {
		boolean existe = false;
		
		for (int i = 0; i < MAX; i++) {
			if (arreglo[i] == num) {
				arreglo[i] = 0;
				existe = true;
				break;
			}
		}
		
		if (existe == false) {
			System.out.println("El número no se encuentra en el arreglo.");
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