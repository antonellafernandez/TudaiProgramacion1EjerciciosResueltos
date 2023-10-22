package practica_01;

// Ejercicio 09: Escribir un programa que permita el ingreso de un número entero por 
// teclado e imprima el cociente de la división de dicho número por 2, 3, y 4. 
// En base a los resultados obtenidos analice cada caso si es correcto o no.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica01_Ejercicio09 {
	public static void main(String[] args) {
		
		int num;
		double cociente;
		
		try {
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
			
			System.out.println("Ingrese un número entero: ");
			num = Integer.valueOf(entrada.readLine());
			
			for (int i = 2; i <= 4; i++) {
				cociente = num / i;
				System.out.println(num + " / " + i + " = " + cociente);
			}
				
		}
		
		catch (Exception exc) {
			System.out.println(exc);
		}
		
	}
}
