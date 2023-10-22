package practica_05;

// Ejercicio 20: Hacer un programa que elimine de un arreglo todas las
// ocurrencias de una secuencia patrón dada por otro arreglo.

public class Practica05_Ejercicio20 {
	final static int MAX = 20;
	public static void main(String[] args) {
		int[] arreglo_1 = {0, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 0, 1, 2, 3, 0, 1, 2, 3, 0};
		int[] arreglo_2 = {1, 2, 3};
		
		patronSecuencia(arreglo_1, arreglo_2);
		mostrarArreglo(arreglo_1);
	}
	
	public static void patronSecuencia(int[] arreglo_1, int[] arreglo_2) {
		int inicio = -1;
		int fin = -1;
        int contador = 0;
        int j = 0;
        
        for (int i = 0; i < MAX; i++) {
        	if (arreglo_1[i] != 0) {
        		if (inicio == -1) {
        			inicio = i;
        		}
        		
        		if (arreglo_1[i] == arreglo_2[j])
        		contador += 1;
        		j += 1;
        		
        		if (i == MAX - 1) {
        			fin = i;
        			if (contador == arreglo_2.length) {
                    	eliminarSecuencia(arreglo_1, inicio, fin);
                    }
        			inicio = -1;
                	contador = 0;
                	j = 0;
        		}
        	} else {
        		fin = i - 1;
        		
        		if (contador == arreglo_2.length) {
        			eliminarSecuencia(arreglo_1, inicio, fin);
                }
        		
        		inicio = -1;
        		contador = 0;
        		j = 0;
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