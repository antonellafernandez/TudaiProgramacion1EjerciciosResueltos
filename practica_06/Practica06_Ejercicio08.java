package practica_06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// Ejercicio 08: Hacer un programa que dada una matriz de enteros ordenada creciente por filas de tamaño 4*5 que se 
// encuentra precargada, solicite al usuario un número entero y una fila, y elimine la primera
// ocurrencia de número en la fila indicada (un número igual) si existe.

public class Practica06_Ejercicio08 {
	public static int FILAS = 5;
	public static int COLUMNAS = 10;
	public static void main(String[] args) {
		int [][] matrizEnteros = {{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
				{10, 11, 12, 13, 14, 15, 16, 17, 18, 19},
				{20, 21, 22, 23, 24, 25, 26, 27, 28, 29},
				{30, 31, 32, 33, 34, 35, 36, 37, 38, 39},
				{40, 41, 42, 43, 44, 45, 46, 47, 48, 49}};

		int num = ingresarNum();
		int fila = ingresarFila();
		
		int[] indicesValoresValidos = new int[FILAS];
		calcularIndiceValoresValidos(matrizEnteros, indicesValoresValidos);
		
		eliminarOcurrencia(matrizEnteros, indicesValoresValidos, fila, num);
		
		mostrarMatriz(matrizEnteros, indicesValoresValidos);

	}
	
	public static int ingresarNum() {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		
		try {
			System.out.println("Ingrese un número entero: ");
			num = Integer.valueOf(entrada.readLine());
		
		} catch (Exception exc) {
			System.out.println(exc);
		}
		
		return num;
	}
	
	public static int ingresarFila() {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int fila = 0;
		
		try {
			System.out.println("Ingrese fila: ");
			fila = Integer.valueOf(entrada.readLine());
		
		} catch (Exception exc) {
			System.out.println(exc);
		}
		
		return fila;
	}
	
	public static void calcularIndiceValoresValidos(int[][] matriz, int[] indicesValoresValidos) {
		for (int i = 0; i < FILAS; i++) {
	        indicesValoresValidos[i] = COLUMNAS;
	    }
	}
	
	public static void eliminarOcurrencia(int [][] matriz, int[] indicesValoresValidos, int fila, int num) {
		int contador = 0;
		
		for (int j = 0; j < indicesValoresValidos[fila]; j++) {
			if (matriz[fila][j] == num) {
				corrimientoIzquierda(matriz, fila, j);
				indicesValoresValidos[fila]--;
				contador++;
			}
				
			if (contador > 0) {
				break;
			} else if (contador == 0 && j == indicesValoresValidos[fila] - 1) {
				System.out.println(" ");
				System.out.println("El número ingresado no se encuentra en la matriz!");
				System.out.println(" ");
			}
		}
	}
	
	public static void corrimientoIzquierda(int [][] matriz, int fila, int columna) {
		for (int j = columna; j < COLUMNAS - 1; j++) {
			matriz[fila][j] = matriz[fila][j+1];
		}
	}
	
	public static void mostrarMatriz(int [][] matriz, int[] indicesValoresValidos) {
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < indicesValoresValidos[i]; j++) {
	            System.out.print(matriz[i][j] + " ");
	        }
	        System.out.println(" ");
	    }
	}
}