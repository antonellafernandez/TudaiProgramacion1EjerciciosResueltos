package practica_03;

/* Escribir un diseño de programa que mientras que el usuario ingrese un número natural, 
 * pida ingresar otro número cualquiera y lo imprima. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica03_Ejercicio03 {
	public static void main(String[] args) {
		try {
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
			int num;
			
			do {
				System.out.println("Ingrese un número natural: ");
				num = Integer.valueOf(entrada.readLine());
			
				if (verificarNatural(num) == true) {
					System.out.println("Ingrese otro número cualquiera: ");
					double num_1 = Double.valueOf(entrada.readLine());
					
					System.out.println("El número ingresado es: " + num_1);
				} else {
					System.out.println("El número ingresado no es natural!");
				}
			} while (verificarNatural(num) == true);
		} catch (Exception exc) {
			System.out.println(exc);
		} finally {
			System.out.println("El programa ha finalizado.");
		}
	}
	
	public static boolean verificarNatural(int num) {
		boolean retorno = true;
		
		try {
			if (num > 0) {
				retorno = true;
			} else {
				retorno = false;
			}
		} catch (Exception exc) {
			System.out.println(exc);
		}
		
		return retorno;
	}
}