package practica_05;

// Ejercicio 10: Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra precargado, 
// solicite al usuario un número entero y elimine la primera ocurrencia del número (un número
// igual) en el arreglo (si existe). Para ello tendrá que buscar la posición y si está, 
// realizar un corrimiento a izquierda (queda una copia de la última posición del arreglo en la anteúltima posición).

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica05_Ejercicio10 {
	final static int MAX = 10;
	public static void main(String[] args) {
		int num, posicion;
		int[] arreglo = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Ingrese un número entero para buscar en el arreglo: ");
			num = Integer.valueOf(entrada.readLine());
			posicion = buscarNum(arreglo, num);

			if (posicion < 0) {
				System.out.println("El entero ingresado no se encuentra en el arreglo.");
			} else {
				corrimientoIzquierdaPosicion(arreglo, posicion);
			}
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}	
	
	public static int buscarNum(int[] arreglo, int num) {
		int pos = -1;
		int i = 0;
		while (pos < 0 || i < MAX) {
			if (arreglo[i] == num) {
				pos = i;
			}
			i = i + 1;
		}
		return pos;
	}
	
	public static void corrimientoIzquierdaPosicion(int[] arreglo, int pos) {
		for (int i = pos; i < MAX - 1; i++) {
			arreglo[i] = arreglo[i + 1];
		}
		mostrarArreglo(arreglo);
	}
	
	public static void mostrarArreglo(int[] arreglo) {
		System.out.println("El arreglo con un corrimiento a la izquierda es: ");
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