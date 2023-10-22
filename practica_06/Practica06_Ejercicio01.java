package practica_06;

// Ejercicio 01: Hacer un programa que dada una matriz de enteros de tamaño 5*10 que se encuentra precargada, 
// invierta el orden del contenido por fila. Este intercambio no se debe realizar de manera explícita,
// hay que hacer un método que incluya una iteración de intercambio.

public class Practica06_Ejercicio01 {
	public static int FILAS = 5;
	public static int COLUMNAS = 10;
	public static void main(String[] args) {
		int [][] matrizEnteros = {{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
				{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
				{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
				{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
				{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}};
		
		System.out.println("La matriz inicial es: ");
		mostrarMatriz(matrizEnteros);
		
		int [][] matrizEnteros_invertida = invertirMatriz(matrizEnteros);
		System.out.println(" ");
		System.out.println("La matriz invertida es: ");
		mostrarMatriz(matrizEnteros_invertida);
	}

	public static int [][] invertirMatriz(int [][] matriz) {
		int [][] matrizInvertida = new int [FILAS][COLUMNAS];
		int k = FILAS - 1;
		int l = COLUMNAS - 1;
		
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				matrizInvertida[i][j] = matriz[k - i][l - j];
			}
		}
		
		return matrizInvertida;
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