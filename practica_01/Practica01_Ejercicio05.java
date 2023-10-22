package practica_01;

// Ejercicio 05: Escribir un programa que solicite nombre, edad, altura y ocupación,
// y los imprima por pantalla.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica01_Ejercicio05 {
	public static void main(String[] args) {
		
		String nombre, ocupacion;
		int edad, altura;
		
		try {
		
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Ingrese nombre: ");
			nombre = entrada.readLine();
			
			System.out.println("Ingrese edad: ");
			edad = Integer.valueOf(entrada.readLine());
			
			System.out.println("Ingrese altura (cm): ");
			altura = Integer.valueOf(entrada.readLine());
			
			System.out.println("Ingrese ocupación: ");
			ocupacion = entrada.readLine();
			
			System.out.println("Hola " + nombre + "!");
			System.out.println("Edad: " + edad + " años");
			System.out.println("Altura: " + altura + "cm");
			System.out.println("Ocupación: " + ocupacion);
			
		}
		
		catch (Exception exc) {
			System.out.println(exc);
		}
		
	}
}