package practica_05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// Ejercicio 11: Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra precargado, 
// solicite al usuario un número entero y elimine todas las ocurrencia de número en el arreglo.
// Mientras exista (en cada iteración tiene que buscar la posición dentro del arreglo) tendrá que usar 
// la posición para realizar un corrimiento a izquierda (quedarán tantas copias de la última
// posición del arreglo como cantidad de ocurrencias del número).

// Ejercicio 12: Suponer a partir de lo resuelto en el ejercicio anterior (11) que el elemento a eliminar coincide 
// con el último que hay en el arreglo. ¿Qué pasa en este caso? ¿Cómo daría una solución al problema?

public class Practica05_Ejercicio11y12 {
	final static int MAX = 10;
	public static void main(String[] args) {
		int[] arreglo = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
		int num = ingresoNum();
		eliminarOcurrencia(arreglo, num);
	}	
	
	public static int ingresoNum() {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		
		try {
			System.out.println("Ingrese un número entero para buscar en el arreglo: ");
			num = Integer.valueOf(entrada.readLine());
			
		} catch (Exception exc) {
			System.out.println(exc);
		}
		
		return num;
	}
	
	public static void eliminarOcurrencia(int[] arreglo, int num) {
		int indiceValoresValidos = MAX;
		int pos = -1;
		
	    int i = 0;
	    while (i < indiceValoresValidos) {
	    	if (arreglo[i] == num) {
	        pos = i;
	        corrimientoIzquierdaPosicion(arreglo, pos);
	        indiceValoresValidos--;
	        } else {
	        	i++;
	        }
	    }

	    if (pos == -1) {
	    	System.out.println("No se han encontrado ocurrencias.");
	    } else {
	    	mostrarArreglo(arreglo, indiceValoresValidos);
	    }
	}
	
	public static void corrimientoIzquierdaPosicion(int[] arreglo, int pos) {
		for (int i = pos; i < MAX - 1; i++) {
			arreglo[i] = arreglo[i + 1];
		}
	}
	
	public static void mostrarArreglo(int[] arreglo, int indiceValoresValidos) {
		System.out.println("El arreglo final es: ");
		System.out.print("{");
		for (int i = 0; i < indiceValoresValidos; i++) {
			if (i == indiceValoresValidos - 1) {
				System.out.print(arreglo[i]);
			} else {
				System.out.print(arreglo[i] + ", ");
			}
		}
		System.out.println("}");
	}
}