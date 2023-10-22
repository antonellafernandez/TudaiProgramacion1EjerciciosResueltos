package practica_05;

// Ejercicio 30: Hacer un programa que cargue un arreglo (sin orden) de tamaño MAX = 10 con números enteros 
// aleatorios entre 0 y 100. Finalmente imprima por pantalla el arreglo ordenado. Hacerlo para
// orden creciente y decreciente.

import java.util.Random;

public class Practica05_Ejercicio30 {
	final static int MAX = 10;
	public static void main(String[] args) {
		int[] arreglo = new int[10];
		
		llenarArregloAleatorio(arreglo);
		System.out.println("El arreglo aleatorio es: ");
		mostrarArreglo(arreglo);
		
		ordenarArregloCreciente(arreglo);
		System.out.println("El arreglo ordenado crecientemente es: ");
		mostrarArreglo(arreglo);
		
		ordenarArregloDecreciente(arreglo);
		System.out.println("El arreglo ordenado decrecientemente es: ");
		mostrarArreglo(arreglo);
	}
	
	public static void llenarArregloAleatorio(int[] arreglo) {
        Random random = new Random();
        
        for (int i = 0; i < MAX; i++) {
            arreglo[i] = random.nextInt(100); // Números aleatorios entre 0 y 99
        }
    }
	
	public static void ordenarArregloCreciente(int[] arreglo) {
		for (int i = 0; i < MAX - 1; i++) {
			for (int j = 0; j < MAX - i - 1; j++) {
				if (arreglo[j] >= arreglo[j+1]) {
					int auxiliar = arreglo[j];
					arreglo[j] = arreglo[j+1];
					arreglo[j+1] = auxiliar;
				}
			}
		}
	}
	
	public static void ordenarArregloDecreciente(int[] arreglo) {
		for (int i = 0; i < MAX - 1; i++) {
			for (int j = 0; j < MAX - i - 1; j++) {
				if (arreglo[j] <= arreglo[j+1]) {
					int auxiliar = arreglo[j];
					arreglo[j] = arreglo[j+1];
					arreglo[j+1] = auxiliar;
				}
			}
		}
	}
	
	public static void mostrarArreglo(int[] arreglo) {
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