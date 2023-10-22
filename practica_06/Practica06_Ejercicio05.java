package practica_06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// Ejercicio 05: Hacer un programa que dada una matriz de enteros de tamaño 5*10 que se encuentra precargada, 
// solicite al usuario un número entero y elimine la primera ocurrencia de número en la matriz (un
// número igual) si existe. Para ello tendrá que buscar la posición y si está, 
// realizar un corrimiento a izquierda y no continuar buscando.

public class Practica06_Ejercicio05 {
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
			
			eliminarOcurrencia(matrizEnteros, num);
			mostrarMatriz(matrizEnteros);
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}
	
	public static void eliminarOcurrencia(int [][] matriz, int num) {
		int contador = 0;
		
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				if (matriz[i][j] == num) {
					corrimientoIzquierda(matriz, i, j);
					contador ++;
				}
				
				if (contador > 0) {
					break;
				} else if (contador == 0 && i == FILAS - 1 && j == COLUMNAS - 1) {
					System.out.println(" ");
					System.out.println("El número ingresado no se encuentra en la matriz!");
					System.out.println(" ");
				}
			}
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