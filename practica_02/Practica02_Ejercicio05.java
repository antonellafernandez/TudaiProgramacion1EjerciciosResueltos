package practica_02;

/* Ejercicio 05: Escribir un programa que solicite una hora del día (valor entero de la hora solamente) 
 * y resuelva en cada caso:
 *
 * a. Si la hora está entre las 0 y las 5, pida ingresar la temperatura y si la misma es menor a 20 grados imprima
 * “Encender la calefacción”. Si es mayor a 25, imprima “Apagar calefacción”. Si está en el rango de 20 a 25 imprima
 * “Calefacción encendida, no abra las ventanas!!!”.
 * 
 * b. Si la hora está entre las 6 y las 11, pida un carácter letra minúscula y si es vocal imprima por la consola 
 * la cantidad de vocales que tiene la palabra que corresponde con la hora.
 * Ejemplo 8 (ocho) tiene 2 vocales. Si no es vocal imprima la cantidad de consonantes que tiene, 
 * para el ejemplo 8 (ocho) tiene 2 consonantes.
 * 
 * c. Si la hora está entre las 12 y 17 y es par, imprima el promedio entre la hora ingresada y el límite inferior 
 * del rango. Si la hora es impar debe imprimir el promedio entre la hora ingresada y el límite superior del rango.
 
 * d. Si la hora está entre las 18 y 23, pida ingresar una clave numérica, si coincide con la clave almacenada 
 * previamente en una constante, pida ingresar una segunda clave de verificación (un valor entre 100 y 999). 
 * Para esta segunda clave (que solo la conoce el usuario) se debe verificar que el dígito de mayor peso 
 * (centena) es múltiplo del dígito de mayor peso de la clave almacenada. 
 * Si todo esto se cumple debería mostrar por la consola el mensaje “Clave correcta”. 
 * Ejemplo: clave almacenada 364, clave ingresada 364, segunda clave ingresada 698. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica02_Ejercicio05 {
	public static void main(String[] args) {
		
		int hh, temperatura, contador, claveNum, clave, claveVerif;
		char vocalConsonante;
		double promedio;
		String letra, horaString;
		claveNum = 364;
		
		contador = 0;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Ingrese un valor entero de hora (hh): ");
			hh = Integer.valueOf(entrada.readLine());
	
			if (hh > 0 && hh < 5) {
				System.out.println("Ingrese la temperatura: ");
				temperatura = Integer.valueOf(entrada.readLine());
				
				if (temperatura < 20) {
					System.out.println("Encender la calefacción");
				} else if (temperatura > 25) {
					System.out.println("Apagar calefacción");
				} else if (temperatura >= 20 && temperatura <= 25) {
					System.out.println("Calefacción encendida, no abra las ventanas!!!");
				}

			} else if (hh > 6 && hh < 11) {
				System.out.println("Ingrese una letra: ");
				letra = String.valueOf(entrada.readLine());
				letra = letra.toLowerCase();
				
				switch (letra) {
				case "a": case "e":case "i":case "o":case "u": letra = "vocal"; break;
				default: letra = "consonante";
				}
				
				System.out.println("Ingrese la hora en letras, por ejemplo ocho: ");
				horaString = String.valueOf(entrada.readLine());
				horaString = horaString.toLowerCase();
				
				if (letra == "vocal") {
					for (int i = 0; i < horaString.length(); i++) {
			            vocalConsonante = horaString.charAt(i);
			            
			            if (vocalConsonante == 'a' || vocalConsonante == 'e' || vocalConsonante == 'i' || vocalConsonante == 'o' || vocalConsonante == 'u') {
			                contador++;
			            }
			        }
					System.out.println(hh + "(" + horaString + ") tiene " + contador + " vocales");
				} else {
					for (int i = 0; i < horaString.length(); i++) {
			            vocalConsonante = horaString.charAt(i);
			            
			            if (vocalConsonante != 'a' && vocalConsonante != 'e' && vocalConsonante != 'i' && vocalConsonante != 'o' && vocalConsonante != 'u') {
			                contador++;
			            }			                 
					}
					System.out.println(hh + "(" + horaString + ") tiene " + contador + " consonantes");
				}

			} else if (hh > 12 && hh < 17) {
				
				if (hh % 2 == 0) {
					promedio = (hh + 12) / 2;
				} else {
					promedio = (hh + 17) / 2;
				}
				System.out.println(promedio);
				
			} else if (hh > 18 && hh < 23) {
				System.out.println("Ingrese una clave numérica de tres dígitos: ");
				clave = Integer.valueOf(entrada.readLine());
				
				if (clave == claveNum) {
					System.out.println("Ingrese un valor entre 100 y 999 (clave de verificación): ");
					claveVerif = Integer.valueOf(entrada.readLine());
					
					if (claveVerif <= clave) {
						if ((clave / 100) % (claveVerif / 100) == 0) {
							System.out.println("Clave correcta");
						} else {
							System.out.println("Clave incorrecta");
						}
					} else {
						if ((claveVerif / 100) % (clave / 100) == 0) {
							System.out.println("Clave correcta");
						} else {
							System.out.println("Clave incorrecta");
						}
					}
				} else {
					System.out.println("Clave incorrecta");
				}
			}
		}
		
		catch (Exception exc) {
			System.out.println(exc);
		}
		
	}
}