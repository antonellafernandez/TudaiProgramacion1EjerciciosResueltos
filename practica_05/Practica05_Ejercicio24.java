package practica_05;

// Ejercicio 24: Se tiene un arreglo de enteros de tamaño 20 de secuencias de números entre 1 y 9, 
// separadas por 0. El arreglo está precargado, y además empieza y termina con uno o más separadores 0. 
// Hacer un programa que permita obtener a través de métodos la posición de inicio y la posición 
// de fin de la secuencia ubicada a partir de una posición entera ingresada por el usuario. 
// Finalmente, si existen imprima por pantalla ambas posiciones obtenidas.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica05_Ejercicio24 {
	final static int MAX = 20;
	public static void main(String[] args) {
		int[] arreglo = {0, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 0, 1, 2, 3, 0, 1, 2, 3, 0};
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Ingrese una posición entera para la secuencia: ");
			int posicion = Integer.valueOf(entrada.readLine());
			
			 int inicio = obtenerInicioSecuencia(arreglo, posicion);
		     int fin = obtenerFinSecuencia(arreglo, posicion);
			
			 if (inicio != -1 && fin != -1) {
			        System.out.println("Posición de inicio: " + inicio);
			        System.out.println("Posición de fin: " + fin);
			    } else {
			        System.out.println("No se encontró ninguna secuencia a partir de la posición ingresada.");
			    }
			
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}

	public static int obtenerInicioSecuencia(int[] arreglo, int posicion) {
		int inicio = -1;
		
		if (arreglo[posicion] == 0) {
			inicio = posicion + 1;
		} else {
			for (int i = posicion; i >= 0; i--) {
	        	if (arreglo[i] == 0) {
	        		inicio = i + 1;
	        		break;
	        	}
	    	}
		}
    	return inicio;
	}

	public static int obtenerFinSecuencia(int[] arreglo, int posicion) {
		int fin = -1;
		
		if (arreglo[posicion] == 0) {
			for (int i = posicion + 1; i < MAX; i++) {
				if (arreglo[i] == 0) {
					fin = i - 1;
					break;
				}
			}
		} else {
			for (int i = posicion; i < MAX; i++) {
				if (arreglo[i] == 0) {
					fin = i - 1;
					break;
				}
			}
		}
		return fin;
	}
}