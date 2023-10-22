package practica_05;

// Ejercicio 06: Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra cargado, 
// obtenga la cantidad de números pares que tiene y la imprima.

public class Practica05_Ejercicio06 {
	final static int MAX = 10;
	public static void main(String[] args) {
		int[] enteros = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
		mostrarArreglo(enteros);
		cantidadPares(enteros);
	}
	
	public static void cantidadPares(int[] arreglo) {
		int contador = 0;
		for (int i = 0; i < MAX; i++) {
			if (arreglo[i] % 2 == 0) {
				contador++;
			}
		}
		System.out.println("El arreglo tiene " + contador + " números pares.");
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