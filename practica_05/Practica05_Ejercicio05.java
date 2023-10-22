package practica_05;

// Ejercicio 05: Hacer un programa que dado un arreglo de caracteres de tamaño 10 que se encuentra cargado, 
// invierta el orden del contenido. Este intercambio no se debe realizar de manera explícita, hay que
// hacer un método que incluya una iteración de intercambio.

public class Practica05_Ejercicio05 {
	final static int MAX = 10;
	public static void main(String[] args) {
		char[] caracteres = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
		mostrarArreglo(invertirArreglo(caracteres));
	}
	
	public static char[] invertirArreglo(char[] arreglo) {
		char[] auxiliar = new char[MAX];
		int j = 0;
		for (int i = MAX - 1; i >= 0; i--) {
			auxiliar[j] = arreglo[i];
			j++;
		}
		return auxiliar;
	}
	
	public static void mostrarArreglo(char[] arreglo) {
		System.out.println("El arreglo cargado es: ");
		System.out.print("{");
		for (int i = 0; i < MAX; i++) {
			if (i == MAX - 1) {
				System.out.print(arreglo[i]);
			} else {
				System.out.print(arreglo[i] + ", ");
			}
		}
		System.out.print("}");
	}
}