package practica_06;

// Ejercicio 13: Hacer un programa que dada la matriz de secuencias de enteros definida y precargada, 
// y un número entero ingresado por el usuario, elimine de cada fila las secuencias de tamaño igual al
// número ingresado.

import java.io.BufferedReader;
import java.io.InputStreamReader;
¡VER!
public class Practica06_Ejercicio13 {
	public static int FILAS = 4;
	public static int COLUMNAS = 20;
	public static void main(String[] args) {
		int [][] matrizSecuencias = {{0, 1, 2, 3, 4, 0, 7, 6, 5, 0, 0, 9, 8, 7, 0, 1, 2, 3, 4, 0},
				{0, 1, 2, 3, 4, 0, 7, 6, 5, 0, 0, 9, 8, 7, 6, 1, 2, 3, 4, 0},
				{0, 1, 2, 3, 4, 0, 7, 6, 5, 0, 0, 9, 8, 7, 0, 1, 2, 3, 4, 0},
				{0, 1, 2, 3, 4, 0, 7, 6, 5, 0, 0, 9, 8, 7, 6, 1, 2, 3, 4, 0}};
		
		int num = ingresarEntero();
		int[] indicesValoresValidos = new int[FILAS];
		calcularIndiceValoresValidos(matrizSecuencias, indicesValoresValidos);
		
		buscarSecuencia(matrizSecuencias, indicesValoresValidos, num);
		mostrarMatriz(matrizSecuencias, indicesValoresValidos);
	}
	
	public static int ingresarEntero() {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		
		try {
			System.out.println("Ingrese un número entero: ");
			num = Integer.parseInt(entrada.readLine());
		} catch (Exception exc) {
			System.out.println("¡El número ingresado no es válido! Debe ser un número entero.");
		}

		return num;
	}
	
	public static void calcularIndiceValoresValidos(int[][] matriz, int[] indicesValoresValidos) {
		for (int i = 0; i < FILAS; i++) {
	        indicesValoresValidos[i] = COLUMNAS;
	    }
	}
	
	public static void buscarSecuencia(int[][] matriz, int[] indicesValoresValidos, int num) {
		int inicio = -1;
		int fin = -1;
		int contador = 0;
		
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				if (matriz[i][j] != 0) {
	        		if (inicio == -1) {
	        			inicio = j;
	        		}
	        		contador++;
	        		
	        		if (j == COLUMNAS - 1) {
	        			fin = j;
	        			if (contador == num) {
	            			corrimientoIzquierda(matriz, indicesValoresValidos, i, inicio, fin);
	            		}
	            		inicio = -1;
	            		contador = 0;
	        		}
	        	} else {
	        		fin = j - 1;
	        		if (contador == num) {
	        			corrimientoIzquierda(matriz, indicesValoresValidos, i, inicio, fin);
	        		}
	        		inicio = -1;
	        		contador = 0;
	        	}
			}
        }
	}
	
	public static void corrimientoIzquierda(int[][] matriz, int[] indicesValoresValidos, int fila, int inicio, int fin) {
		for (int j = fin; j >= inicio; j--) {
	        for (int k = j; k < COLUMNAS - 1; k++) {
	            matriz[fila][k] = matriz[fila][k + 1];
	        }
	        indicesValoresValidos[fila]--;
	    }
	}
	
	public static void mostrarMatriz(int[][] matriz, int[] indicesValoresValidos) {
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < indicesValoresValidos[i]; j++) {
	            System.out.print(matriz[i][j] + " ");
	        }
	        System.out.println();
	    }
	}
}