package practica_05;

// Ejercicio 01: Cargar un arreglo de tamaño 15, pidiendo el ingreso por teclado
// de valores entre 1 y 12. Luego mostrar cómo quedó cargado.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica05_Ejercicio01 {
	final static int MAX = 15; // Define la variable MAX como global
	public static void main(String[] args) {
		int[] enteros = new int[MAX];
		
		cargarArreglo(enteros);
		mostrarArreglo(enteros);
	}
	
	public static void cargarArreglo(int[] arreglo) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			for (int i = 0; i < MAX; i++) {
				System.out.println("Ingrese un entero entre 1 y 12 para la posición " + i + ": ");
				arreglo[i] = Integer.valueOf(entrada.readLine());
				
				if ((arreglo[i] < 1) || (arreglo[i] > 12)) {
					System.out.println("El valor ingresado no es válido!");
					i--;
				}
			}
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}
	
	public static void mostrarArreglo(int[] arreglo) {
		System.out.println("El arreglo cargado es: ");
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