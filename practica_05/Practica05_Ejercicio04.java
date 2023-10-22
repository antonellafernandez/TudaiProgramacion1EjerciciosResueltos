package practica_05;

// Ejercicio 04: Buscar un elemento en un arreglo de caracteres ya cargado de tamaño 10 
// y mostrar la/s posición/es del elemento, en caso de no estar indicarlo también.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica05_Ejercicio04 {
	final static int MAX = 10;
	public static void main(String[] args) {
		char[] caracteres = {'a', 'b', 'c', '*', 'c', 'c', '*', 'c', 'b', 'a'};
		posicionCaracter(caracteres);
	}
	
	public static void posicionCaracter(char[] arreglo) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		char c;
		try {
			System.out.println("Ingrese un caracter para mostrar su posición: ");
			c = entrada.readLine().charAt(0);
			
			for (int i = 0; i < MAX; i++) {
				if (c == arreglo[i]) {
					System.out.println(c + " se encuentra en la posición " + i);
				} else { 
					System.out.println(c + " no se encuentra en la posición " + i);
				}
			}
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}
}