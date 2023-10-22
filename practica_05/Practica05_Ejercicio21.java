package practica_05;

// Ejercicio 21: Hacer un programa que elimine de un arreglo todas las
// secuencias que tienen orden descendente entre sus elementos.

public class Practica05_Ejercicio21 {
	final static int MAX = 20;
	public static void main(String[] args) {
		int[] arreglo = {3, 2, 1, 0, 1, 2, 3, 0, 6, 5, 4, 0, 4, 5, 6, 0, 6, 5, 4, 0};
		
		buscarSecuencia(arreglo);
		mostrarArreglo(arreglo);
	}
	
	public static void buscarSecuencia(int[] arreglo) {
		int inicio = -1;
		int fin = -1;
		
        for (int i = 0; i < MAX; i++) {
        	if (arreglo[i] != 0) {
        		if (inicio == -1) {
        			inicio = i;
        		}
        		
        		if (i == MAX - 1) {
        			fin = i;
        			verificarDescendente(arreglo, inicio, fin);
        		}
        	} else {
        		fin = i - 1;
        		verificarDescendente(arreglo, inicio, fin);
    			inicio = -1;
        	}
        }
	}
	
	public static void verificarDescendente(int[] arreglo, int inicio, int fin) {
		boolean descendente = false;
		
		for (int i = inicio; i < fin; i++) {
			if (arreglo[i] >= arreglo[i + 1]) {
				descendente = true;
			} else {
				descendente = false;
				break;
			}
		}
		
		if (descendente == true) {
			eliminarSecuencia(arreglo, inicio, fin);
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