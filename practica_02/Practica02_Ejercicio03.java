package practica_02;

// Ejercicio 03: Escribir un programa que solicite el ingreso de un número mayor a
// 50, y lo muestre por pantalla en caso de ser múltiplo de 2 o 3.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica02_Ejercicio03 {
	public static void main(String[] args) {
	
		int num;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Ingrese un número entero mayor a 50: ");
			num = Integer.valueOf(entrada.readLine());
			
			if (num > 50) {
				if (num % 2 == 0 || num % 3 == 0) {
					System.out.println(num);
				}
			} else {
				System.out.println("El número ingresado no es mayor a 50");
			}	
		}
		
		catch (Exception exc) {
			System.out.println(exc);
		}
		
	}
}