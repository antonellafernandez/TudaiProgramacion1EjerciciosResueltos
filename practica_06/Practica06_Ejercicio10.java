package practica_06;

// Ejercicio 10: Hacer un programa que dada la matriz de secuencias de enteros definida y precargada, 
// permita obtener a través de métodos la posición de inicio y la posición de fin de la secuencia
// ubicada a partir de una posición entera y una fila, ambas ingresadas por el usuario. 
// Finalmente, si existen imprima por pantalla ambas posiciones obtenidas.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica06_Ejercicio10 {
	public static int FILAS = 4;
	public static int COLUMNAS = 20;
	public static void main(String[] args) {
		int [][] matrizSecuencias = {{0, 1, 2, 3, 4, 0, 7, 6, 5, 0, 0, 5, 6, 7, 0, 1, 2, 3, 4, 0},
				{0, 1, 2, 3, 4, 0, 7, 6, 5, 0, 0, 5, 6, 7, 0, 1, 2, 3, 4, 0},
				{0, 1, 2, 3, 4, 0, 7, 6, 5, 0, 0, 5, 6, 7, 0, 1, 2, 3, 4, 0},
				{0, 1, 2, 3, 4, 0, 7, 6, 5, 0, 0, 5, 6, 7, 0, 1, 2, 3, 4, 0}};
		
		int fila = ingresarEntero("Para fila - Ingrese un número entero entre 0 y 3 (inclusives): ", 0, FILAS);
		int columna = ingresarEntero("Para columna - Ingrese un número entero entre 0 y 19 (inclusives): ", 0, COLUMNAS);
		
		buscarSecuencia(matrizSecuencias, fila, columna);
	}

	public static int ingresarEntero(String mensaje, int min, int max) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		boolean valido = false;
	
		do {
			try {
				System.out.println(mensaje);
				num = Integer.valueOf(entrada.readLine());
				
				if (num >= min && num < max) {
					valido = true;
				}
			} catch (Exception exc) {
				System.out.println("¡El número ingresado no es válido! Debe ser un número entero.");
			}
		} while (!valido);

		return num;
	}
	
	public static void buscarSecuencia(int[][] matriz, int fila, int columna) {
		int inicio = -1;
		int fin = -1;
		
		if (matriz[fila][columna] == 0 && columna != COLUMNAS - 1) {
			inicio = columna + 1;
			for (int j = inicio; j < COLUMNAS; j++) {
				if (matriz[fila][j] == 0) {
					fin = j--;
					break;
				}
			}
		} else if (matriz[fila][columna] != 0 && columna != COLUMNAS - 1){
			for (int izquierda = columna; izquierda >= 0; izquierda--) {
				if (matriz[fila][izquierda] == 0) {
					inicio = izquierda + 1;
					break;
				}
			}
			
			for (int derecha = columna; derecha < COLUMNAS; derecha++) {
				if (matriz[fila][derecha] == 0) {
					fin = derecha - 1;
					break;
				}
			}
		}
		
		if (inicio != -1 && fin != -1) {
			System.out.println("La posición de inicio de la secuencia es [" + fila + ", " + inicio + "]");
			System.out.println("La posición de fin de la secuencia es [" + fila + ", " + fin + "]");
		} else {
			System.out.println("No se ha encontrado ninguna secuencia a partir de la posición.");
		}
	}
}