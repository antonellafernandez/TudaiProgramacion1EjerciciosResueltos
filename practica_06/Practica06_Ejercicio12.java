package practica_06;

// Ejercicio 12: Hacer un programa que dada la matriz de secuencias de caracteres definida y precargada, 
// permita encontrar por cada fila la posición de inicio y fin de la anteúltima secuencia (considerar
// comenzar a buscarla a partir de la última posición de la fila).


public class Practica06_Ejercicio12 {
	public static int FILAS = 4;
	public static int COLUMNAS = 20;
	public static void main(String[] args) {
		int [][] matrizSecuencias = {{0, 1, 2, 3, 4, 0, 7, 6, 5, 0, 0, 9, 8, 7, 0, 1, 2, 3, 4, 0},
				{0, 1, 2, 3, 4, 0, 7, 6, 5, 0, 0, 9, 8, 7, 6, 1, 2, 3, 4, 0},
				{0, 1, 2, 3, 4, 0, 7, 6, 5, 0, 0, 9, 8, 7, 0, 1, 2, 3, 4, 0},
				{0, 1, 2, 3, 4, 0, 7, 6, 5, 0, 0, 9, 8, 7, 6, 1, 2, 3, 4, 0}};
		
		anteultimaSecuencia(matrizSecuencias);
	}
	
	public static void anteultimaSecuencia(int[][] matriz) {
		for (int i = 0; i < FILAS; i++) {
			int inicioAux = -1;
			int finAux = -1;
			int inicio = -1;
			int fin = -1;
			
			for (int j = COLUMNAS - 1; j >= 0; j--) {
				if (matriz[i][j] != 0 && finAux == -1) {
					finAux = j;
				} else if (matriz[i][j] == 0 && finAux != -1 && inicioAux == -1) {
					inicioAux = j + 1;
				} else if (matriz[i][j] != 0 && inicioAux != -1 && fin == -1) {
					fin = j;
				} else if (matriz[i][j] == 0 && fin != -1 && inicio == -1) {
					inicio = j + 1;
					System.out.println("La posición de inicio de la anteúltima secuencia es [" + i + ", " + inicio + "]");
					System.out.println("La posición de fin de la anteúltima secuencia es [" + i + ", " + fin + "]");
					System.out.println("");
					break;
				}
			}
		}
	}
}