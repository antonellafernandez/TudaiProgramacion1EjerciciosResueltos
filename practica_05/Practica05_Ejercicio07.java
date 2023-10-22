package practica_05;

// Ejercicio 07: Implementar un método que realice un corrimiento a derecha en
// un arreglo ordenado de tamaño MAX = 10 a partir de una posición.

public class Practica05_Ejercicio07 {
	final static int MAX = 10;
	public static void main(String[] args) {
		int[] arreglo = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		corrimientoDerecha(arreglo, 3);
	}
	
	public static void corrimientoDerecha(int[] arreglo, int pos) {
		for (int i = MAX - 1; i > pos; i--) {
			arreglo[i] = arreglo[i - 1];
		}
		arreglo[pos] = 0;
		mostrarArreglo(arreglo);
	}
	
	public static void mostrarArreglo(int[] arreglo) {
		System.out.println("El arreglo cargado es: ");
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