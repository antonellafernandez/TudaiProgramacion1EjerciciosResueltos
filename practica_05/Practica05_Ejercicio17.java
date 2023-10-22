package practica_05;

// Ejercicio 17: Hacer un programa que devuelva la posición de inicio y fin de la
// anteúltima secuencia de números distintos de ceros.

public class Practica05_Ejercicio17 {
	final static int MAX = 20;
	public static void main(String[] args) {
		int[] arreglo = {0, 1, 2, 3, 0, 0, 4, 5, 6, 0, 7, 8, 9, 0, 0, 10, 11, 12, 0, 0};
        buscarAnteultimaSecuencia(arreglo);
    }

    public static void buscarAnteultimaSecuencia(int[] arreglo) {
    	int inicio_auxiliar = -1;
        int fin_auxiliar = -1;
        int inicio = -1;
        int fin = -1;
        
        for (int i = MAX - 1; i >= 0; i--) {
        	if (arreglo[i] != 0) {
        		fin_auxiliar = i;
        		for (i = fin_auxiliar; i >= 0; i--) {
        			if (arreglo[i] == 0) {
        				inicio_auxiliar = i + 1;
        				for (i = inicio_auxiliar - 1; i >= 0; i--) {
        					if (arreglo[i] != 0) {
        						fin = i;
        						for ( i = fin; i >= 0; i--) {
        							if (arreglo[i] == 0) {
        								inicio = i + 1;
        								break;
        							} else if (i == 0 && arreglo[i] != 0) {
        								inicio = i;
        								break;
        							}
        						}
        						break;
        					}
        				}
        				break;
        			} else if (i == 0 && arreglo[i] != 0) {
        				inicio_auxiliar = i;
        				break;
        			}
        		}
        		break;
        	}
        }
        if (inicio != -1 && fin != -1) {
        	System.out.println("Posición de inicio de la secuencia: " + inicio);
            System.out.println("Posición de fin de la secuencia: " + fin);
        } else if (inicio_auxiliar != -1 && fin_auxiliar != -1){
        	System.out.println("Se ha encontrado una única secuencia de números distintos de cero.");
        	System.out.println("No se puede mostrar una anteúltima secuencia.");
        } else {
        	System.out.println("No se encontró una secuencia de números distintos de cero.");
        }
    }
}    