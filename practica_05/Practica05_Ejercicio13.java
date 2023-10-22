package practica_05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// Ejercicio 13: Hacer un programa que inserte un elemento en un arreglo 
// (ordenado decrecientemente) de tamaño MAX = 10.

public class Practica05_Ejercicio13 {
	final static int MAX = 10;
	public static void main(String[] args) {
		int num;
		int[] arreglo = {9, 7, 5, 3, 1, -1, -3, -5, -7, -9};
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Ingrese un número entero para insertar en el arreglo: ");
			num = Integer.valueOf(entrada.readLine());
			
			insertarDecreciente(arreglo, num);
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}	
	
	public static void insertarDecreciente(int[] arreglo, int num) {
		int i = MAX - 1;
		int contador = 0;
		while (contador == 0 && i >= 0) {
			if (arreglo[i] == num) {
				System.out.println("El número ingresado ya existe en el arreglo");
				contador = contador + 1;
			} else if (arreglo[i] > num) {
				arreglo[i] = num;
				contador = contador + 1;
			} else {
				i = i - 1;
			}
		}
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