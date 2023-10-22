package practica_03;

/* Ejercicio 05: Hacer un método que dado un número entero con valor inicial 1, haga una iteración incrementando 
 * el número de a uno hasta un valor MAX = 4 (constante). Mientras itera deberá imprimir el número. 
 * Luego invocarlo desde el programa principal y cuando termina imprimir por pantalla “terminó”. */

public class Practica03_Ejercicio05 {
	public static void main(String[] args) {
		try {
			imprimirIteracion();
			System.out.println("El programa ha finalizado.");
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}
	
	public static void imprimirIteracion() {
		final int MAX = 4;
		
		for (int i = 1; i <= MAX; i++) {
			System.out.println(i);
		}
	}
}