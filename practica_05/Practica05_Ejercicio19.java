package practica_05;

// Ejercicio 19: Hacer un programa que dado un número N ingresado por el
// usuario, elimine las secuencias de tamaño N de números distintos de cero.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica05_Ejercicio19 {
	final static int MAX = 20;
	public static void main(String[] args) {
		int[] arreglo = {1, 2, 3, 0, 4, 5, 6, 7, 0, 8, 9, 10, 11, 12, 0, 13, 14, 15, 16, 0};
		int num;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Ingrese un valor entero como tamaño de las secuencias a eliminar: ");
			num = Integer.valueOf(entrada.readLine());
			
			buscarTamaño(arreglo, num);
			mostrarArreglo(arreglo);
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}
	
	public static void buscarTamaño(int[] arreglo, int num) {
		int inicio = -1;
		int fin = -1;
        int contador = 0;
        
        for (int i = 0; i < MAX; i++) {
        	if (arreglo[i] != 0) {
        		if (inicio == -1) {
        			inicio = i;
        		}
        		contador += 1;
        		
        		if (i == MAX - 1) {
        			fin = i;
        			if (contador == num) {
            			eliminarSecuencia(arreglo, inicio, fin);
            		}
            		inicio = -1;
            		contador = 0;
        		}
        	} else {
        		fin = i - 1;
        		if (contador == num) {
        			eliminarSecuencia(arreglo, inicio, fin);
        		}
        		inicio = -1;
        		contador = 0;
        	}
        }
	}
	
	public static void eliminarSecuencia(int[] arreglo, int inicio, int fin) {
		for (int i = inicio; i <= fin; i++) {
			arreglo[i] = 0;
		}
	}
	
	public static void mostrarArreglo(int[] arreglo) {
		System.out.println("El arreglo final es: ");
		System.out.print("{");
		for (int i = 0; i < MAX; i++) {
			if (i == MAX - 1) {
				System.out.print(arreglo[i]);
			} else {
				System.out.print(arreglo[i] + ", ");
			}
		}
		System.out.println("}");
	}
}