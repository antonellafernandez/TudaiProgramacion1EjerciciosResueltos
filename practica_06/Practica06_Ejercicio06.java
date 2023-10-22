package practica_06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// Ejercicio 06: Hacer un programa que dada una matriz de enteros de tamaño 5*10 que se encuentra precargada, 
// solicite al usuario un número entero y elimine todas las ocurrencias de número en la matriz si existe. 
// Mientras exista (en cada iteración tiene que buscar la posición fila y columna) tendrá que usar dicha
// posición para realizar un corrimiento a izquierda (quedarán tantas copias de la
// última posición de cada fila como cantidad de ocurrencias del número). 
// Tener en cuenta, como se hizo en arreglos, si el elemento a eliminar es el último de alguna fila de la matriz.

public class Practica06_Ejercicio06 {
	public static int FILAS = 5;
	public static int COLUMNAS = 10;
	public static void main(String[] args) {
		int [][] matrizEnteros = {{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
				{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
				{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
				{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
				{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}};

		int num = ingresarNum();
		
		int[] indicesValoresValidos = new int[FILAS];
		calcularIndiceValoresValidos(matrizEnteros, indicesValoresValidos, num);
		
		eliminarOcurrencias(matrizEnteros, indicesValoresValidos, num);
		
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
	
	public static void calcularIndiceValoresValidos(int[][] matriz, int[] indicesValoresValidos, int num) {
		for (int i = 0; i < FILAS; i++) {
	        indicesValoresValidos[i] = COLUMNAS;

	        while (indicesValoresValidos[i] > 0 && matriz[i][indicesValoresValidos[i] - 1] == num) {
	            indicesValoresValidos[i]--;
	        }
	    }
	}
	
	public static void eliminarOcurrencias(int[][] matriz, int[] indicesValoresValidos, int num) {
		 int i = 0;
	        
	        while (i < FILAS) {
	        	int j = 0;
	        	
	        	while (j < indicesValoresValidos[i]) {
	        		if (matriz[i][j] == num) {
	        			corrimientoIzquierda(matriz, i, j);
	        			indicesValoresValidos[i]--;
	        		} else {
	        			j++;
	        		}
	        	}
	        	i++;
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