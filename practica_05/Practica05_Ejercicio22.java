package practica_05;

// Ejercicio 22: Hacer un programa que reemplace de un arreglo A todas las
// ocurrencias de una secuencia patrón dada en un arreglo P, por la
// secuencia contenida en el arreglo R de igual tamaño.

public class Practica05_Ejercicio22 {
	final static int MAX = 20;
	public static void main(String[] args) {
		int[] arreglo_1 = {0, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 0, 1, 2, 3, 0, 1, 2, 3, 0};
		int[] arreglo_2 = {1, 2, 3};
		int[] arreglo_3 = {9, 9, 9};
		
		patronCambioSecuencia(arreglo_1, arreglo_2, arreglo_3);
		mostrarArreglo(arreglo_1);
	}
	
	public static void patronCambioSecuencia(int[] arreglo_1, int[] arreglo_2, int[] arreglo_3) {
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
                    	reemplazarSecuencia(arreglo_1, inicio, fin, arreglo_3);
                    }
        			inicio = -1;
                	contador = 0;
                	j = 0;
        		}
        	} else {
        		fin = i - 1;
        		
        		if (contador == arreglo_2.length) {
        			reemplazarSecuencia(arreglo_1, inicio, fin, arreglo_3);
                }
        		
        		inicio = -1;
        		contador = 0;
        		j = 0;
        	}
        }
	}
	
	public static void reemplazarSecuencia(int[] arreglo_1, int inicio, int fin,int[] arreglo_2) {
		int j = 0;
		for (int i = inicio; i <= fin; i++) {
			arreglo_1[i] = arreglo_2[j];
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