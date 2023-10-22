package practica_02;

// Ejercicio 01: Escribir un programa completo (declaración de constantes y variables, carga de datos, 
// procesamiento e impresión de resultados) para cada caso o ítem que:
// a. solicite un número e indique si es positivo o negativo.
// b. solicite un número e imprima “grande” si es mayor a 100 y “chico “ si es menor.
// c. solicite un número del 1 al 7 e imprima el día de la semana.
// d. solicite una letra e imprima si es vocal o consonante.
// e. solicite 3 números e imprima “creciente” si los tres números están en orden creciente, 
// “decreciente” si están en orden decreciente o “error” si no cumplen ningún orden.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica02_Ejercicio01 {
	public static void main(String[] args) {
		
		int num, num_1, num_2, num_3;
		String letra;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			/* a. solicite un número e indique si es positivo o negativo.
			System.out.println("Ingrese un número: ");
			num = Integer.valueOf(entrada.readLine());
			
			if (num > 0) {
				System.out.println(num + " es positivo!");
			} else {
				if (num < 0) {
					System.out.println(num + " es negativo!");
				} else {
					System.out.println(num + " no es positivo ni negativo!");
				}
			} */
			
			/* b. solicite un número e imprima “grande” si es mayor a 100 y “chico “ si es menor.
			System.out.println("Ingrese un número: ");
			num = Integer.valueOf(entrada.readLine());
			
			if (num > 100) {
				System.out.println("Grande");
			} else {
				if (num < 100) {
					System.out.println("Chico");
				}
			} */
			
			/* c. solicite un número del 1 al 7 e imprima el día de la semana.
			System.out.println("Ingrese un número entre 1 y 7: ");
			num = Integer.valueOf(entrada.readLine());
			
			switch (num) {
			case 1: System.out.println("Lunes"); break;
			case 2: System.out.println("Martes"); break;
			case 3: System.out.println("Miércoles"); break;
			case 4: System.out.println("Jueves"); break;
			case 5: System.out.println("Viernes"); break;
			case 6: System.out.println("Sábado"); break;
			case 7: System.out.println("Domingo"); break;
			default: System.out.println("¡El número ingresado no está entre 1 y 7!");
			} */
			
			/* d. solicite una letra e imprima si es vocal o consonante.
			System.out.println("Ingrese una letra: ");
			letra = String.valueOf(entrada.readLine());
			letra = letra.toLowerCase();
			
			switch (letra) {
			case "a": case "e":case "i":case "o":case "u": System.out.println("Es una vocal"); break;
			default: System.out.println("Es una consonante");
			} */
			
			// e. solicite 3 números e imprima “creciente” si los tres números están en orden creciente, 
			/* “decreciente” si están en orden decreciente o “error” si no cumplen ningún orden.
			System.out.println("Ingrese un número: ");
			num_1 = Integer.valueOf(entrada.readLine());
			
			System.out.println("Ingrese un número: ");
			num_2 = Integer.valueOf(entrada.readLine());
			
			System.out.println("Ingrese un número: ");
			num_3 = Integer.valueOf(entrada.readLine());
			
			if (num_1 < num_2 && num_1 < num_3 && num_2 < num_3) {
				System.out.println("Creciente");
			} else if (num_3 < num_2 && num_3 < num_1 && num_2 < num_1) {
				System.out.println("Decreciente");
			} else {
				System.out.println("Error");
			} */
		}
		
		catch (Exception exc) {
			System.out.println(exc);
		}
		
	}
}