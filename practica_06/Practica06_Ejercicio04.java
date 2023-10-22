package practica_06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// Ejercicio 04: Hacer un programa que dada una matriz de enteros de tamaño 5*10 que se encuentra precargada, 
// solicite al usuario un número entero y una posición fila, columna. Con estos datos tendrá que
// realizar un corrimiento a derecha (se pierde el último valor en dicha fila) y colocar el número 
// en la matriz en la posición fila, columna indicada.

public class Practica06_Ejercicio04 {
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
			System.out.println("Ingrese un número entero: ");
			int num = Integer.valueOf(entrada.readLine());
			
			System.out.println("Ingrese una posición fila: ");
			int fila = Integer.valueOf(entrada.readLine());
			
			System.out.println("Ingrese una posición columna: ");
			int columna = Integer.valueOf(entrada.readLine());
			
			corrimientoDerecha(matrizEnteros, fila, columna, num);
			insertarNum(matrizEnteros, fila, columna, num);
			mostrarMatriz(matrizEnteros);
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}
	
	public static void corrimientoDerecha(int [][] matriz, int fila, int columna, int num) {
		for (int j = COLUMNAS - 1; j > columna; j--) {
			matriz[fila][j] = matriz[fila][j-1];
		}
	}
	
	public static void insertarNum(int [][] matriz, int fila, int columna, int num) {
		matriz[fila][columna] = num;
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