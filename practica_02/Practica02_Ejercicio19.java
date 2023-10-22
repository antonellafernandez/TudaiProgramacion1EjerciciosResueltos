package practica_02;

/* Ejercicio 19: Construir un programa que solicite desde teclado un número de mes válido y 
 * posteriormente notifique por pantalla la cantidad de días de ese mes. En el caso de que ingrese 2 
 * como número de mes (febrero) deberá además solicitar ingresar un número de año
 * entre 2000 y 2019 inclusive (no debe seguir si no está en ese rango), 
 * y dependiendo de si es bisiesto o no imprimir la cantidad de días correspondiente. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica02_Ejercicio19 {
	public static void main(String[] args) {
		
		int dd, mm, aaaa;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Ingrese un número de mes (aa): ");
			mm = Integer.valueOf(entrada.readLine());
			
			switch (mm) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: dd = 31;
			System.out.println("El mes " + mm + " tiene " + dd + " días"); break;
			
			case 4: case 6: case 9: case 11: dd = 30;
			System.out.println("El mes " + mm + " tiene " + dd + " días"); break;
			
			case 2:
			System.out.println("Ingrese el número de año entre 2000 y 2019 inclusive (aaaa): ");
			aaaa = Integer.valueOf(entrada.readLine());
			
			if (aaaa >= 2000 && aaaa <= 2019) {
				if  ((aaaa % 4 == 0) && ((aaaa % 100 != 0) || (aaaa % 400 == 0))) {
					dd = 29;
				} else {
					dd = 28;
				};
				System.out.println("El mes " + mm + " tiene " + dd + " días");
			} else {
				System.out.println("El número de año ingresado no es válido");
			} break;
			
			default: System.out.println("El número de mes ingresado no es válido");
			}
		}
		
		catch (Exception exc) {
			System.out.println(exc);
		}
		
	}
}