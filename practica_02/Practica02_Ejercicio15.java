package practica_02;

/* Ejercicio 15: Pedir por consola el ingreso de números enteros. Cuando se ingrese un 0 se debe terminar 
el programa informando el promedio de los números ingresados, cuál fue el mayor número y
cuál fue el menor número. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica02_Ejercicio15 {
	public static void main(String[] args) {
		
		int num = 1; 
		double promedio;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int cantidadNum = 0;
		int sumaNum = 0;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			while (num != 0) {
				System.out.println("Ingrese un número entero: ");
				num = Integer.valueOf(entrada.readLine());
				
				cantidadNum = cantidadNum + 1;
				sumaNum = sumaNum + num;
				
				if (num < min && num != 0) {
					min = num;
				} else if (num > max) {
					max = num;
				}
			}
			
			cantidadNum = cantidadNum - 1;
			promedio = sumaNum / cantidadNum;
			
			System.out.println("El promedio de los números ingresados es " + promedio);
			System.out.println("El mínimo número ingresado es " + min);
			System.out.println("El máximo número ingresado es " + max);
		}
		
		catch (Exception exc) {
			System.out.println(exc);
		}
		
	}
}