package practica_05;

// Ejercicio 18: Hacer un programa que devuelva la posición de inicio y de fin de la secuencia de mayor tamaño.

public class Practica05_Ejercicio18 {
	final static int MAX = 20;
	public static void main(String[] args) {
		int[] arreglo = {0, 1, 2, 3, 0, 0, 4, 5, 6, 0, 7, 8, 9, 0, 0, 10, 11, 12, 0, 0};
        int[] secuencia = secuenciaMayor(arreglo);

        if (secuencia != null) {
            System.out.println("Posición de inicio de la secuencia: " + secuencia[0]);
            System.out.println("Posición de fin de la secuencia: " + secuencia[1]);
        } else {
            System.out.println("No se encontró una secuencia de números distintos de cero.");
        }
    }
	
	public static int[] secuenciaMayor(int[] arreglo) {
		int contador = 0;
		int contador_auxiliar = 0;
		
		int inicio = -1;
		int fin = -1;
		int inicio_auxiliar = -1;
        int fin_auxiliar = -1;
		
        for (int i = 0; i < MAX; i++) {
            if (arreglo[i] != 0) {
                if (inicio_auxiliar == -1) {
                    inicio_auxiliar = i;
                }
                contador_auxiliar += arreglo[i];
            } else {
                if (inicio_auxiliar != -1) {
                    fin_auxiliar = i - 1;
                    if (contador_auxiliar > contador) {
                        contador = contador_auxiliar;
                        inicio = inicio_auxiliar;
                        fin = fin_auxiliar;
                    }
                    inicio_auxiliar = -1;	// Reinicio variables
                    contador_auxiliar = 0;
                }
            }
        }
		
		if (inicio != -1 && fin != -1) {
			return new int[] {inicio, fin};
		} else {
			return null;
		}
	}
}