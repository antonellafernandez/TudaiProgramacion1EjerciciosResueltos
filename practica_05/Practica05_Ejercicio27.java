package practica_05;

// Ejercicio 27: Hacer un programa que dado un arreglo ordenado creciente de enteros de tamaño 10 
// que se encuentra precargado, solicite al usuario un número entero y lo inserte en el arreglo manteniendo
// su orden. Para ello tendrá que realizar un corrimiento a derecha (se pierde el último valor del arreglo) 
// y colocar el número en el arreglo en la posición indicada.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica05_Ejercicio27 {
	final static int MAX = 10;
	public static void main(String[] args) {
		int[] arreglo = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Ingrese un número entero: ");
			int num = Integer.valueOf(entrada.readLine());
			
			insertarNum(arreglo, num);
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}
	
	public static void insertarNum(int[] arreglo, int num) {
		for (int i = 0; i < MAX; i++) {
			if (num <= arreglo[i]) {
				corrimientoDerecha(arreglo, i);
				arreglo[i] = num;
				break;
			}
		}
		mostrarArreglo(arreglo);
	}
	
	public static void corrimientoDerecha(int[] arreglo, int pos) {
		for (int i = MAX - 1; i > pos; i--) {
			arreglo[i] = arreglo[i - 1];
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