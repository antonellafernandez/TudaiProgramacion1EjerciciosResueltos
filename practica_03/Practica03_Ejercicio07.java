package practica_03;

/* Ejercicio 07: Escribir un programa que mientras el usuario cargue desde teclado un número entero 
 * distinto de 0, imprima por pantalla la suma que se obtiene de invocar un método que calcula la
 * sumatoria de los primeros 200 números naturales (son números enteros entre 1 y 200). */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica03_Ejercicio07 {
	public static void main(String[] args) {
		int num = 0;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			do {
				System.out.println("Ingrese un número entero (0 para Salir): ");
				num = Integer.valueOf(entrada.readLine());
				
				if (num == 0) {
					System.out.println("El programa ha finalizado!");
				} else {
					System.out.println("La sumatoria de los primeros 200 números naturales es " + sumarPrimeros200Naturales());
				}
				
			} while (num != 0);
		} catch (Exception exc){
			System.out.println(exc);
		}
	}
	
	public static int sumarPrimeros200Naturales() {
		int sumatoria = 0;
		
		for (int i = 1; i <= 200; i++) {
			sumatoria = sumatoria + i;
		}
		
		return sumatoria;
	}
}