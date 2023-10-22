package practica_03;

// Ejercicio 11: Escribir un método que retorne el mayor de dos números. Usar ese método para calcular 
// el máximo de una serie de números ingresados por el usuario (20 números en total).

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica03_Ejercicio11 {
	public static void main(String[] args) {
		int num_1, num_2, contador, maximo;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Ingrese un número entero: ");
			num_1 = Integer.valueOf(entrada.readLine());
			contador = 1;
			
			do {
				System.out.println("Ingrese un número entero: ");
				num_2 = Integer.valueOf(entrada.readLine());
				contador = contador + 1;
				
				maximo = numMaximo(num_1, num_2);
				num_1 = maximo;
			} while (contador < 20);
			
			System.out.println("El máximo número ingresado ha sido " + maximo);
			
		} catch (Exception exc) {
			System.out.println(exc);
		} finally {
			System.out.println("El programa ha finalizado.");
		}
	}
	
	public static int numMaximo(int num_1, int num_2) {
		int max;
		
		if (num_1 >= num_2) {
			max = num_1;
		} else {
			max = num_2;
		}
		
		return max;
	}
}