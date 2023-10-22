package practica_06;

// Ejercicio 03: Hacer un programa que dada una matriz de enteros de tamaño 5*10 que se encuentra precargada, 
// solicite al usuario una posición fila, columna y realice un corrimiento a izquierda.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica06_Ejercicio03 {
	public static int FILAS = 5;
	public static int COLUMNAS = 10;
	public static void main(String[] args) {
		int [][] matrizEnteros = {{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
				{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
				{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
				{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
				{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}};

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Ingrese una posición fila: ");
			int fila = Integer.valueOf(entrada.readLine());
			
			System.out.println("Ingrese una posición columna: ");
			int columna = Integer.valueOf(entrada.readLine());
			
			corrimientoIzquierda(matrizEnteros, fila, columna);
			mostrarMatriz(matrizEnteros);
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}
	
	public static void corrimientoIzquierda(int [][] matriz, int fila, int columna) {
		for (int j = columna; j < COLUMNAS - 1; j++) {
			matriz[fila][j] = matriz[fila][j+1];
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