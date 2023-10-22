package practica_02;

/* Ejercicio 04: Escribir un programa donde el usuario ingrese un número entre 0 y 999, y muestre un mensaje 
 * de cuántos dígitos tiene. Además, si tiene 3 dígitos debe informar qué número es. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica02_Ejercicio04 {
	public static void main(String[] args) {
	
		int num, digitos;
		digitos = 0;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Ingrese un número entero entre 0 y 999");
			num = Integer.valueOf(entrada.readLine());
			
			if (num > 0 && num < 999) {
				while (num != 0) {
					num = num / 10;
					digitos = digitos + 1;
				}
				System.out.println("El número tiene " + digitos + " dígitos");
			} else {
				System.out.println("El número ingresado es inválido");
			}
		}
		
		catch (Exception exc) {
			System.out.println(exc);
		}
		
	}
}