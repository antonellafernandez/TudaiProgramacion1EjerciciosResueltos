package practica_05;

// Ejercicio 02: Hacer un programa que dado un arreglo ya cargado con 10
// enteros, calcule el promedio y lo muestre por la consola.

public class Practica05_Ejercicio02 {
	final static int MAX = 10;
	public static void main(String[] args) {
		int[] enteros = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
		promedioArreglo(enteros);
	}
	
	public static void promedioArreglo(int[] arreglo) {
		double suma = 0;
		double promedio;
		for (int i = 0; i < MAX; i++) {
			suma += arreglo[i];
		}
		
		promedio = suma / MAX;
		System.out.println("El promedio de los valores del arreglo es " + promedio);
	}
}