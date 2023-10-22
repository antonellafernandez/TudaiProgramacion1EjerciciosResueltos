package practica_05;

// Dado un arreglo de tamaño de arreglo MAX = 20 de secuencias. 
// En el caso de eliminar secuencias se debe hacer corrimiento.

// Ejercicio 15: Hacer un programa que devuelva la posición de inicio y 
// fin de la primera secuencia de números distinta de ceros.

public class Practica05_Ejercicio15 {
	final static int MAX = 20;
	public static void main(String[] args) {
		int[] arreglo = {0, 0, 1, 2, 3, 4, 5, 6, 0, 0, 0, 0, 7, 8, 9, 10, 11, 12, 0, 0};
        int[] secuencia = buscarSecuencia(arreglo);

        if (secuencia != null) {
            System.out.println("Posición de inicio de la secuencia: " + secuencia[0]);
            System.out.println("Posición de fin de la secuencia: " + secuencia[1]);
        } else {
            System.out.println("No se encontró una secuencia de números distintos de cero.");
        }
    }

    public static int[] buscarSecuencia(int[] arreglo) {
        int inicio = -1;
        int fin = -1;

        for (int i = 0; i < MAX; i++) {
            if (arreglo[i] != 0) {
                inicio = i;
                for (i = inicio; i < MAX; i++) {
                    if (arreglo[i] == 0) {
                        fin = i - 1;
                        break;
                    }
                }
                break;
            }
        }
        
        if (fin == -1) {
            fin = MAX - 1;
        }

        if (inicio != -1 && fin != -1) {
            return new int[]{inicio, fin};
        } else {
            return null;
        }
    }
}