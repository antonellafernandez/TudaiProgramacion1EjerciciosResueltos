package practica_02;

/* Ejercicio 01: La clínica “Dolores” tiene un sistema de historias clínicas para todos sus pacientes. 
 * El gerente de administración solicita emitir algunos informes y elige en un menú de opciones:
 
 * a. Si la opción es ‘1’ se debe pedir ingrese la cantidad de pacientes (no mayor a 15) 
 * y por cada uno solicitar la edad. Informar cuántos pacientes son mayores de 78 años.
 
 * b. Si la opción es ‘2’ se debe ingresar una cantidad de prestadores de servicios que tiene 
 * la clínica (no mayor a 10).
 
 * Por cada prestador solicitar la cantidad de pacientes que ha atendido en los últimos 2 días. 
 * Finalmente, informar cuántos prestadores han atendido a más de 10 pacientes en los últimos 2 días.
 
 * c. Si la opción es ‘3’ se desea saber la cantidad de pacientes de cada sexo y el promedio 
 * de edades de cada grupo. Para ello deberá solicitar primero que ingrese qué cantidad son femeninos 
 * (no mayor a 10) y qué cantidad son masculinos (no mayor a 10). 
 
 * Por cada grupo solicitar el ingreso de las edades para luego informar los promedios correspondientes.
 
 * d. Por último, si la opción es ‘4’ se desea conocer cuántos pacientes no tienen obra social.
 
 * Para ello se debe solicitar la cantidad de pacientes (no mayor a 15) y por cada uno solicitar si 
 * tiene o no obra social. Puede suponer un valor numérico para verdadero y otro para falso.
 
 * e. Cualquier otra opción se debe informar que “No es una opción válida” y debe volver a pedirla. 
 * Con ‘0’ termina.
 
 * Escribir un programa que permita obtener al gerente de administración los informes que necesita. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica02_BonusTrack01_Ejercicio01 {
	public static void main(String[] args) {
		
		int opcion, cantidad_pacientes, i, edad, cantidad_prestadores, femeninas, masculinos, obraSocial;
		int contador = 0;
		int sumaEdades_femeninas = 0;
		int sumaEdades_masculinos = 0;
		double promedioFemeninas, promedioMasculinos;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Ingrese una opción del 1 al 4: ");
			opcion = Integer.valueOf(entrada.readLine());

			switch (opcion) {
			case 1: {
				System.out.println("Ingrese la cantidad de pacientes (no mayor a 15): ");
				cantidad_pacientes = Integer.valueOf(entrada.readLine());
				
				if (cantidad_pacientes > 15) {
					System.out.println("La cantidad de pacientes no es válida");
				} else {
					for (i = 1; i <= cantidad_pacientes; i++) {
						System.out.println("Ingrese edad: ");
						edad = Integer.valueOf(entrada.readLine());
						
						if (edad > 78) {
							contador = contador + 1;
						}
					}
					System.out.println("Cantidad de pacientes mayores a 78 años: " + contador);
				} 
				
				break; 
			}

			case 2: {
				System.out.println("Ingresar cantidad de prestadores de servicios de la clínica (no mayor a 10): ");
				cantidad_prestadores = Integer.valueOf(entrada.readLine());
				
				if (cantidad_prestadores > 10) {
					System.out.println("La cantidad de prestadores no es válida");
				} else {
					for (i = 1; i <= cantidad_prestadores; i++) {
						System.out.println("Ingrese la cantidad de pacientes atendidos en los últimos 2 días: ");
						cantidad_pacientes = Integer.valueOf(entrada.readLine());
						
						if (cantidad_pacientes > 10) {
						contador = contador + 1;
						}
					}
					System.out.println("Cantidad de prestadores que han atendido a más de 10 pacientes en los últimos 2 días: " + contador);
				} 
				
				break; 
			}
		
			case 3: {
				System.out.println("Ingrese cantidad de pacientes femeninas (no mayor a 10): ");
				femeninas = Integer.valueOf(entrada.readLine());
				
				if (femeninas > 10) {
					System.out.println("La cantidad de pacientes no es válida");
				} else {
					for (i = 1; i <= femeninas; i++) {
						System.out.println("Ingrese edad de la paciente: ");
						edad = Integer.valueOf(entrada.readLine());
						
						sumaEdades_femeninas = sumaEdades_femeninas + edad;
					}
				}
				
				System.out.println("Ingrese cantidad de pacientes masculinos (no mayor a 10): ");
				masculinos = Integer.valueOf(entrada.readLine());
				
				if (femeninas > 10) {
					System.out.println("La cantidad de pacientes no es válida");
				} else {
					for (i = 1; i <= masculinos; i++) {
						System.out.println("Ingrese edad del paciente: ");
						edad = Integer.valueOf(entrada.readLine());
						
						sumaEdades_masculinos = sumaEdades_masculinos + edad;
					}
				}
					
				promedioFemeninas = sumaEdades_femeninas / femeninas;
				promedioMasculinos = sumaEdades_masculinos / masculinos;
				
				System.out.println("Cantidad de pacientes femeninas: " + femeninas);
				System.out.println("El promedio de edades de femeninas es: " + promedioFemeninas);
				
				System.out.println("Cantidad de pacientes masculinos: " + masculinos);
				System.out.println("El promedio de edades de masculinos es: " + promedioMasculinos);
				
				break;
			}

			case 4: {
				System.out.println("Ingrese la cantidad de pacientes (no mayor a 15): ");
				cantidad_pacientes = Integer.valueOf(entrada.readLine());
				
				if (cantidad_pacientes > 15) {
					System.out.println("La cantidad de pacientes no es válida");
				} else {
					for (i = 1; i <= cantidad_pacientes; i++) {
						System.out.println("Ingrese (1) si el paciente tiene Obra Social, sino ingrese (0): ");
						obraSocial = Integer.valueOf(entrada.readLine());
						
						if (obraSocial == 0) {
							contador = contador + 1;
						}
					}
					System.out.println("Cantidad de pacientes sin Obra Social: " + contador);
				} 
				
				break;
			}
				
			default: System.out.println("No es una opción válida");
			}
			
		}
		
		catch (Exception exc) {
			System.out.println(exc);
		}
		
	}
}