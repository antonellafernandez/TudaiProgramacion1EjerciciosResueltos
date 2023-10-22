package practica_06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// Ejercicio 09: Hacer un programa que dada una matriz de enteros de tamaño 4*5 que se encuentra precargada, 
// solicite al usuario el ingreso de una fila y dos números enteros (columnas de la matriz), y ordene
// de forma creciente la matriz en la fila indicada entre las dos posiciones columnas ingresadas.

public class Practica06_Ejercicio09 {
	public static int FILAS = 5;
	public static int COLUMNAS = 10;
	public static void main(String[] args) {
		int [][] matrizEnteros = {{0, 3, 2, 1, 4, 7, 6, 5, 8, 9},
				{0, 3, 2, 1, 4, 7, 6, 5, 8, 9},
				{0, 3, 2, 1, 4, 7, 6, 5, 8, 9},
				{0, 3, 2, 1, 4, 7, 6, 5, 8, 9},
				{0, 3, 2, 1, 4, 7, 6, 5, 8, 9}};
		
		System.out.println("Ingreso de fila");
		int fila = ingresarNum();
		
		System.out.println("Ingreso de primer columna");
		int columna_1 = ingresarNum();
		
		System.out.println("Ingreso de segunda columna");
		int columna_2 = ingresarNum();
		
		ordenarCrecientemente(matrizEnteros, fila, columna_1, columna_2);
		
		mostrarMatriz(matrizEnteros);
	}
	
	public static int ingresarNum() {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		boolean valido = false;
		
		do {
			try {
				System.out.println("Ingrese un número entero: ");
				num = Integer.valueOf(entrada.readLine());
				
				valido = true;
			} catch (Exception exc) {
				System.out.println("¡El número ingresado no es válido!");
			}
		} while (!valido);

		return num;
	}
	
	public static void ordenarCrecientemente(int[][] matriz, int fila, int columna_1, int columna_2) {
		int auxiliar;
		
		for (int i = columna_1; i <= columna_2; i++) {
			for (int j = columna_1; j < columna_2; j++) {
				if (matriz[fila][j] > matriz[fila][j+1]) {
					auxiliar = matriz[fila][j];
					matriz[fila][j] = matriz[fila][j+1];
					matriz[fila][j+1] = auxiliar;
				}
			}
		}
	}

	public static void mostrarMatriz(int [][] matriz) {
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}