package practica_01;

// Ejercicio 02: Escribir un programa que declare una variable de tipo double
// y una constante de tipo double con valor 1.0. Luego, deberá asignar el
// doble del valor de la constante a la variable y mostrar ambos por pantalla.

public class Practica01_Ejercicio02 {
	public static void main(String[] args) {
		
		double var;
		final double CONST = 1.0;
		
		var = 2 * CONST;
		
		System.out.println("La constante es " + CONST);
		System.out.println("El doble de la constante es " + var);
		
	}
}