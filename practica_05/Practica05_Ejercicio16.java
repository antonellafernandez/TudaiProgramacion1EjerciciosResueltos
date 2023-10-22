package practica_05;

// Ejercicio 16: Hacer un programa que devuelva la posición de inicio y fin de la
// secuencia de números distintos de ceros cuya suma del contenido sea mayor.


public class Practica05_Ejercicio16 {
	final static int MAX = 20;
	public static void main(String[] args) {
		int[] arreglo = {0, 0, 1, 2, 3, 4, 5, 6, 0, 0, 0, 0, 7, 8, 9, 10, 11, 12, 0, 0};
        mayorSecuencia(arreglo);
    }
	
    public static void mayorSecuencia(int[] arreglo) {
    	int inicioSecuencia = -1;	// Posición de inicio de la secuencia
        int finSecuencia = -1;		// Posición de fin de la secuencia
        int sumaMaxima = 0;			// Suma máxima encontrada
        
        int inicioActual = -1;		// Posición de inicio de la secuencia actual
        int sumaActual = 0;			// Suma actual de la secuencia
        
        for (int i = 0; i < MAX; i++) {
            if (arreglo[i] != 0) {
                if (inicioActual == -1) {
                    inicioActual = i;	// Iniciar nueva secuencia
                }
                sumaActual += arreglo[i];  // Actualizar la suma actual
            } else {
                if (inicioActual != -1 && sumaActual > sumaMaxima) {
                    inicioSecuencia = inicioActual;	// Actualizar posición de inicio de la secuencia máxima
                    finSecuencia = i - 1;			// Actualizar posición de fin de la secuencia máxima
                    sumaMaxima = sumaActual;		// Actualizar suma máxima
                }
                inicioActual = -1;		// Reiniciar para buscar una nueva secuencia
                sumaActual = 0;			// Reiniciar la suma actual
            }
        }
        
        // Verificar si la última secuencia es la de mayor suma
        if (inicioActual != -1 && sumaActual > sumaMaxima) {
            inicioSecuencia = inicioActual;
            finSecuencia = MAX - 1;
            sumaMaxima = sumaActual;
        }
        
        if (inicioSecuencia == -1 || finSecuencia == -1) {
            System.out.println("No se encontró ninguna secuencia de números distintos de cero.");
        } else {
            System.out.println("Posición de inicio de la secuencia: " + inicioSecuencia);
            System.out.println("Posición de fin de la secuencia: " + finSecuencia);
            System.out.println("Suma del contenido de la secuencia: " + sumaMaxima);
        }
    }
}