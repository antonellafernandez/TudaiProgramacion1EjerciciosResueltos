package practica_02;

/* Ejercicio 10: Escribir un programa que mientras que el usuario ingrese un número 
 * entero entre 1 y 10 inclusive, lleve la suma de los números ingresados. Finalmente, 
 * cuando sale del ciclo muestre por pantalla el resultado de la suma. ¿En qué casos termina? */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica02_Ejercicio10 {
	public static void main(String[] args) {
		
		int num, suma;
		suma = 0;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			do {
				System.out.println("Ingrese un número entero entre 1 y 10 inclusive: ");
				num = Integer.valueOf(entrada.readLine());
				
				suma = suma + num;
			} while (num >= 1 && num <= 10);
			
			suma = suma - num;
			System.out.println("El resultado de la suma es " + suma);
		}
		
		catch (Exception exc) {
			System.out.println(exc);
		}
		
	}
}