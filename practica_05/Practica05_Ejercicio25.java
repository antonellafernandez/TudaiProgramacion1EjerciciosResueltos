package practica_05;

// Ejercicio 25: Hacer un programa que dado el arreglo definido y precargado, y un número entero ingresado 
// por el usuario, copie de forma continua las secuencias de tamaño igual al número ingresado en
// otro arreglo de iguales características e inicializado con 0. 
// La copia en este último arreglo deben comenzar desde el principio del mismo.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica05_Ejercicio25 {
	final static int MAX = 20;
	public static void main(String[] args) {
		int[] arreglo = {0, 1, 2, 3, 0, 4, 5, 6, 0, 7, 8, 0, 1, 2, 3, 0, 4, 5, 6, 0};
		int[] arreglo_copia = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Ingrese un número entero: ");
			int num = Integer.valueOf(entrada.readLine());
			
			buscarTamaño(arreglo, arreglo_copia, num);
			mostrarArreglo(arreglo_copia);
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}
	
	public static void buscarTamaño(int[] arreglo, int[] arreglo_copia, int num) {
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
            			copiarSecuencia(arreglo, arreglo_copia, inicio, fin);
            		}
            		inicio = -1;
            		contador = 0;
        		}
        	} else {
        		fin = i - 1;
        		if (contador == num) {
        			copiarSecuencia(arreglo, arreglo_copia, inicio, fin);
        		}
        		inicio = -1;
        		contador = 0;
        	}
        }
	}
	
	public static void copiarSecuencia(int[] arreglo, int[] arreglo_copia, int inicio, int fin) {
		int inicio_copia = -1;
		
		for (int i = 0; i < MAX; i++) {
			if (arreglo_copia[i] == 0) {
				inicio_copia = i;
				break;
			}
		}
		
		for (int j = inicio; j <= fin; j++) {
			arreglo_copia[inicio_copia] = arreglo[j];
			inicio_copia += 1;
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