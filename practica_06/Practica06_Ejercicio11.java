package practica_06;

// Ejercicio 11: Hacer un programa que dada la matriz de secuencias de enteros definida y precargada 
// permita encontrar por cada fila la posición de inicio y fin de la secuencia cuya suma de valores sea mayor.

public class Practica06_Ejercicio11 {
	public static int FILAS = 4;
	public static int COLUMNAS = 20;
	public static void main(String[] args) {
		int [][] matrizSecuencias = {{0, 1, 2, 3, 4, 0, 7, 6, 5, 0, 0, 9, 8, 7, 0, 1, 2, 3, 4, 0},
				{0, 1, 2, 3, 4, 0, 7, 6, 5, 0, 0, 9, 8, 7, 0, 1, 2, 3, 4, 0},
				{0, 1, 2, 3, 4, 0, 7, 6, 5, 0, 0, 9, 8, 7, 0, 1, 2, 3, 4, 0},
				{0, 1, 2, 3, 4, 0, 7, 6, 5, 0, 0, 9, 8, 7, 0, 1, 2, 3, 4, 0}};
		
		secuenciaMayorValor(matrizSecuencias);
	}
	
	public static void secuenciaMayorValor(int[][] matriz) {
		int mayorValor = 0;
		int inicio = -1;
		int fin = -1;
		
		for(int i = 0; i < FILAS; i++) {
			int suma = 0;
			int inicioAux = -1;
			int finAux = -1;
			
			for (int j = 0; j < COLUMNAS; j++) {
				if (matriz[i][j] != 0) {
					if (inicioAux == -1) {
						inicioAux = j;
					}
					suma += matriz[i][j];
				} else if (matriz[i][j] == 0 && suma != 0) {
					finAux = j - 1;
					if (suma > mayorValor) {
						mayorValor = suma;
						inicio = inicioAux;
						fin = finAux;
					}
					suma = 0;
					inicioAux = -1;
					finAux = -1;
				}
			}
			System.out.println("En la fila " + i + " la secuencia de mayor valor tiene inicio en " + inicio + " y fin en " + fin);
		}
	}
}