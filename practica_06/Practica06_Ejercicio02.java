package practica_06;

// Ejercicio 02: Hacer un programa que dada una matriz de enteros de tamaño 5*10 que se encuentra precargada, 
// obtenga la cantidad de números pares que tiene y la imprima.

public class Practica06_Ejercicio02 {
	public static int FILAS = 5;
	public static int COLUMNAS = 10;
	public static void main(String[] args) {
		int [][] matrizEnteros = {{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
				{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
				{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
				{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
				{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}};
		
		cantidadPares(matrizEnteros);
	}
	
	public static void cantidadPares(int [][] matriz) {
		int contador = 0;
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				if (matriz[i][j] % 2 == 0) {
					contador++;
				}
			}
		}
		
		System.out.println("La matriz contiene " + contador + " números pares");
	}
}