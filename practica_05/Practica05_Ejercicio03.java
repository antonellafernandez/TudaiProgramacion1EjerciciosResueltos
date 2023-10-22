package practica_05;

// Ejercicio 03: Con el mismo arreglo del ejercicio anterior informe por pantalla
// cuantos elementos del mismo están por encima del promedio calculado.

public class Practica05_Ejercicio03 {
	final static int MAX = 10;
	public static void main(String[] args) {
		int[] enteros = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
		
		System.out.println("El promedio de los valores del arreglo es " + promedioArreglo(enteros));
		contadorMayores(enteros, promedioArreglo(enteros));
	}
	
	public static double promedioArreglo(int[] arreglo) {
		double suma = 0;
		double promedio;

		for (int i = 0; i < MAX; i++) {
			suma += arreglo[i];
		}
		
		promedio = suma / MAX;
		return promedio;
	}
	
	public static void contadorMayores(int[] arreglo, double num) {
		int contador = 0;
		
		for (int i = 0; i < MAX; i++) {
			if (arreglo[i] > num) {
				contador++;
			}
		}
		
		System.out.println(contador + " valores están por encima del promedio calculado.");
	}
}