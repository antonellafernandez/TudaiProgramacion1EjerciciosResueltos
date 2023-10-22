package practica_01;

// Ejercicio 12: Escribir un programa que permita ingresar dos números enteros,
// incremente el primero y decremente el segundo, para luego mostrar por pantalla en ambos casos, 
// el valor original y el modificado.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica01_Ejercicio12 {
	public static void main(String[] args) {
	
		int num_1, num_2;
		
		try {
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
			
			System.out.println("Ingrese dos números enteros: ");
			num_1 = Integer.valueOf(entrada.readLine());
			num_2 = Integer.valueOf(entrada.readLine());
			
			System.out.println(num_1 + " -> " + ++num_1);
			System.out.println(num_2 + " -> " + --num_2);
		}
		
		catch (Exception exc) {
			System.out.println(exc);
		}
		
	}
}
