package practica_01;

// Ejercicio 07: Escribir un programa que dado tres números reales ingresados
// por el usuario, divida el primero por el segundo y al resultado
// obtenido le reste el tercero. Muestre por pantalla el resultado
// obtenido. Puede o no usar variables auxiliares para los cálculos.
// Tenga en cuenta posibles errores en las operaciones.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica01_Ejercicio07 {
	public static void main(String[] args) {
		
		double num_1, num_2, num_3, resultado;
	
		try {
			
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Ingrese tres números reales: ");
			num_1 = Double.valueOf(entrada.readLine());
			num_2 = Double.valueOf(entrada.readLine());
			num_3 = Double.valueOf(entrada.readLine());
			
			if (num_2 == 0) {
				System.out.println("El divisor es cero, por favor ingrese un nuevo número: ");
				num_2 = Double.valueOf(entrada.readLine());
			}	
			
			resultado = (num_1 / num_2) - num_3;
			System.out.println("(" + num_1 + " / " + num_2 + " - " + num_3 + ") = " + resultado);

		}
		
		catch (Exception exc) {
			System.out.println(exc);
		}
		
	}
}
