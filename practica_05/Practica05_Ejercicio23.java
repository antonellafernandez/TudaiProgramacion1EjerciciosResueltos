package practica_05;

// Ejercicio 23: Hacer un programa que invierta el orden de la última secuencia en un arreglo.

public class Practica05_Ejercicio23 {
	final static int MAX = 20;
	public static void main(String[] args) {
		int[] arreglo = {0, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 0, 1, 2, 3, 0, 1, 2, 3, 0};
		
		buscarSecuencia(arreglo);
		mostrarArreglo(arreglo);
	}
	
	public static void buscarSecuencia(int[] arreglo) {
		int inicio = -1;
		int fin = -1;
		
        for (int i = MAX - 1; i >= 0; i--) {
        	if (arreglo[i] != 0) {
        		if (fin == -1) {
        			fin = i;
        		}
        		
        		if (i == 0) {
        			inicio = i;
        			invertirOrden(arreglo, inicio, fin);
        			break;
        		}
        	} else {
        		if (fin != -1) {
					inicio = i + 1;
					invertirOrden(arreglo, inicio, fin);
					break;
        		}
        	}
        }
	}
	
	public static void invertirOrden(int[] arreglo, int inicio, int fin) {
		int[] auxiliar = new int[fin - inicio + 1];
		int j = 0;
		
		for (int i = inicio; i <= fin; i++) {
			auxiliar[j] = arreglo[i];
			j++;
		}
		
		j = 0;
		for (int i = fin; i >= inicio; i--) {
			arreglo[i] = auxiliar[j];
			j++;
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