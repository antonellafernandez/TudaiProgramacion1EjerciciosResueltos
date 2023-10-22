package practica_03;

/* Ejercicio 16: Escribir un programa que mientras el usuario ingresa un número de mes (entero) 
 * entre 1 y 12 inclusive, muestre por pantalla la cantidad de días del mes ingresado (suponer febrero
 * de 28 días) (Mostrar por pantalla la cantidad de días del mes debería realizarse con un método). */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica03_Ejercicio16 {
	public static void main(String[] args) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		int mes;
		
		try {
			do {
				System.out.println("Ingrese número de mes: ");
				mes = Integer.valueOf(entrada.readLine());
				
				if (mes < 1 || mes > 12) {
					System.out.println("El programa ha finalizado.");
				} else {
					validarMes(mes);
				}
			} while (mes >= 1 && mes <= 12);
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}
	
	public static void validarMes(int mes) {
		int dd;
		
		switch (mes) {
		case 2: dd = 28; break;
		case 4: case 6: case 9: case 11: dd = 30; break;
		default: dd = 31;
		}
		
		System.out.println("El mes " + mes + " tiene " + dd + " días!");
	}
}