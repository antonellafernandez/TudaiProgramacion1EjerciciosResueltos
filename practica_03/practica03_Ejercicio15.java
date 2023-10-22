package practica_03;

/* Ejercicio 15: Escribir un programa que mientras que el usuario ingrese un número entero natural, 
 * llame a un método que calcule la sumatoria entre 1 y dicho número y se lo retorne como resultado. */

import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class practica03_Ejercicio15 {
	public static void main(String[] args) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		int num;
		
		try {
			do {
				System.out.println("Ingrese un número entero natural: ");
				num = Integer.valueOf(entrada.readLine());
				
				if (num < 1) {
					System.out.println("El programa ha finalizado.");
				} else {
					System.out.println("La sumatoria entre 1 y " + num + " es de " + sumatoriaNros(num));
				}
			} while (num >= 1);
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}
	
	public static int sumatoriaNros(int num) {
		int sumatoria = 0;
		
		for (int i = 1; i <= num; i++) {
			sumatoria = sumatoria + i;
		}
		
		return sumatoria;
	}
}