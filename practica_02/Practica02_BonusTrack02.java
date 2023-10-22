package practica_02;

// Ejercicio 01: Dados los siguientes códigos, analizar y detectar los errores.
// Justificar en cada caso.

/* a.

public class Practica02_BonusTrack02 {
	public static void main(String[] args) {

		char opcion = 'a';
		int valor = 0;

		switch (opcion) {
		case 'a': {
			valor = 5;
			System.out.println("El valor es " + valor); break;
		}
		case 'b': {
			valor = 4; 
			System.out.println("El valor es " + valor); break;
		}
		case 'c': case 'd': case 'e': {
			valor = 99; 
			System.out.println("El valor es " + valor); break;
		}
		default: System.out.println("La opción no es válida");
		}
	}
} */


/* b.
public class Practica02_BonusTrack02 {
	public static void main(String[] args) {

		int valor = 5;
		System.out.println("Valor es: " + valor);
	}
} */

/* c.
public class Practica02_BonusTrack02 {
	public static void main(String[] args) {

		final int MAX = 100;
		int valor = 5;
		
		if (valor < MAX) {
			System.out.println("Valor es: " + valor);
		}
	}
} */

// Ejercicio 02: Dados los siguientes enunciados y códigos, analizar y detectar los errores. 
// Justificar en cada caso.

/* a. Dado un caracter ingresado por el usuario: imprimir si es caracter minúscula, 
// imprimir si es carácter mayúscula, o imprimir no es caracter letra.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica02_BonusTrack02 {
	public static void main(String[] args) {

		char caracter;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		try{
			System.out.println("Ingrese un caracter :");
			caracter = entrada.readLine().charAt(0);
			
			if (Character.isLowerCase(caracter)) {
				System.out.println("Es carácter minúscula");
			} else if (Character.isUpperCase(caracter)) {
				System.out.println("Es carácter mayúscula");
			} else {
				System.out.println("No es caracter letra");
			}
		}
		
		catch (Exception exc){
			System.out.println(exc);
		}
		
	}
} */

// b. Dado un número positivo, imprimir “Tiene 1 dígito” si el número pertenece al rango [0..9] 
// o “Tiene 2 dígitos” si el número pertenece al rango [10..99] o 
// “Tiene 3 o más dígitos” si el número es mayor o igual a 100.

public class Practica02_BonusTrack02 {
	public static void main(String[] args) {
		
		int numero = 235; // Valor de ejemplo
		
		if (numero >= 0 && numero < 10){
			System.out.println("Tiene 1 dígito");
		} else if (numero >= 10 && numero <= 99){
			System.out.println("Tiene 2 dígitos");
		} else if (numero >= 100) {
		System.out.println("Tiene 3 o más dígitos");
		}
		
	}
}