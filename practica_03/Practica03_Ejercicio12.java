package practica_03;

/* Ejercicio 12: Escribir un programa que simule 1000 lanzamientos de un dado y muestre por pantalla cuántas 
 * veces salió el valor del dado correspondiente al número entero N ingresado por el usuario.
 * Considerar que el valor N ingresado se corresponda a un valor posible para un dado. 
 * Usar la sentencia Math.random() que devuelve un valor aleatorio real entre 0 y 1.
 * 
 * Para asignar un posible valor a la variable dado entero:
 * dado = (int) (6*Math.random() + 1) */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica03_Ejercicio12 {
	public static void main(String[] args) {
		int num;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Ingrese un número entero que corresponda a un valor de 1d6: ");
			num = Integer.valueOf(entrada.readLine());
			
			System.out.println("El valor del dado correspondiente al número entero " + num);
			System.out.println("ha salido " + contadorLanzamientoD6(num) + " veces.");
			
		} catch (Exception exc) {
			System.out.println(exc);
		} finally {
			System.out.println("El programa ha finalizado.");
		}
	}
	
	public static int contadorLanzamientoD6(int n) {
		int contador = 0;
		
		for (int i = 1; i <= 1000; i++) {
			int dado = (int) (6 * Math.random() + 1);
			
			if (dado == n) {
				contador = contador + 1;
			}
		}
		
		return contador;
	}
}