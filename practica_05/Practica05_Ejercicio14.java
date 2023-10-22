package practica_05;

// Ejercicio 14: Hacer un programa que elimine los valores pares en un arreglo de tamaño MAX = 10.

public class Practica05_Ejercicio14 {
	final static int MAX = 10;
	public static void main(String[] args) {
		int[] arreglo = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		eliminarPares(arreglo);
	}
	
	public static void eliminarPares(int[] arreglo) {
		for (int i = 0; i < MAX; i++) {
			if (arreglo[i] % 2 == 0) {
				arreglo[i] = 0;
			}
		}
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