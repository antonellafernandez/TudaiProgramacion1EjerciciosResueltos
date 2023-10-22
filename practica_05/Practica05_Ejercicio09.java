package practica_05;

// Ejercicio 09: Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra cargado, 
// solicite al usuario un número entero y lo agregue al principio del arreglo (posición 0). 
// Para ello tendrá que realizar un corrimiento a derecha (se pierde el último valor del
// arreglo) y colocar el número en el arreglo en la posición indicada.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica05_Ejercicio09 {
	final static int MAX = 10;
	public static void main(String[] args) {
		int num;
		int[] arreglo = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
		System.out.println("Ingrese un número entero para agregar al principio del arreglo: ");
		num = Integer.valueOf(entrada.readLine());
		corrimientoDerecha(arreglo, 0, num);
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}	
	
	public static void corrimientoDerecha(int[] arreglo, int pos, int num) {
		for (int i = MAX - 1; i > pos; i--) {
			arreglo[i] = arreglo[i - 1];
		}
		arreglo[pos] = num;
		mostrarArreglo(arreglo);
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