package practica_02;

/* Ejercicio 18: Escribir un programa que mientras que el usuario ingrese un número distinto de 0, 
 * pida ingresar otros dos números e imprima el resultado de la división entre los dos últimos números
 * ingresados. ¿Existe alguna restricción para la división? */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica02_Ejercicio18 {
	public static void main(String[] args) {
		
		double num, num_1, num_2;
		double resultado = 0;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Ingrese un número: ");
			num = Double.valueOf(entrada.readLine());
			
			if (num == 0) {
				System.out.println("El valor ingresado no es válido");
			} else {
				System.out.println("Ingrese un número entero: ");
				num_1 = Double.valueOf(entrada.readLine());
				
				System.out.println("Ingrese un número entero: ");
				num_2 = Double.valueOf(entrada.readLine());
				
				if (num_2 != 0) {
					resultado = num_1 / num_2;
					System.out.println("El resultado es " + resultado);
				} else {
					System.out.println("No se puede dividir por cero");
				}
			}
		}
		
		catch (Exception exc) {
			System.out.println (exc);
		}
		
	}
}