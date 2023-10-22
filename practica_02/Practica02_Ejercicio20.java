package practica_02;

/* Ejercicio 20: Pedir números enteros positivos por teclado. En cada iteración el usuario puede ingresar 0 
para salir del programa. Si ingresa un número distinto de 0 se debe pedir el ingreso de un carácter.

a. Si es ‘a’ se debe permitir al usuario escribir un texto libre e imprimirlo por pantalla.

b. Si es ‘b’ se deben pedir 5 números positivos e informar si fueron ingresados en orden ascendente.

c. Si es ‘c’ se deben pedir dos números enteros negativos e imprimir la raíz cuadrada de su multiplicación. 
La raíz cuadrada de un número se calcula con la sentencia: Math.sqrt(numero).

d. Ante cualquier otro carácter ingresado se debe informar un error y pedir nuevamente el carácter. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica02_Ejercicio20 {
	public static void main(String[] args) {
        
		int num = 1;
		int num_1, num_2, num_3, num_4, num_5;
		boolean ordenAscendente;
		char c;
		double resultado;
		String texto;
		
		try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            while (num != 0) {
            	System.out.println("Ingrese un número entero positivo (0 para salir): ");
            	num = Integer.valueOf(entrada.readLine());
            	
            	if (num > 0) {
            		System.out.println("Ingrese un carácter: ");
            		c = entrada.readLine().charAt(0);
            		
            		switch (c) {
            			case 'a': {
            				System.out.println("Ingrese un texto libre: ");
            				texto = entrada.readLine();
            				
            				System.out.println(texto);
    				
            				; break;
            			}
            			case 'b': {
            				 System.out.println("Ingrese el primer número: ");
            			     num_1 = Integer.valueOf(entrada.readLine());
            			     
            			     System.out.println("Ingrese el segundo número: ");
            			     num_2 = Integer.valueOf(entrada.readLine());
            			     
            			     System.out.println("Ingrese el tercer número: ");
            			     num_3 = Integer.valueOf(entrada.readLine());
            			     
            			     System.out.println("Ingrese el cuarto número: ");
            			     num_4 = Integer.valueOf(entrada.readLine());
            			     
            			     System.out.println("Ingrese el quinto número: ");
            			     num_5 = Integer.valueOf(entrada.readLine());
            			     
            			     if (num_1 <= num_2 && num_2 <= num_3 && num_3 <= num_4 && num_4 <= num_5) {
            			            ordenAscendente = true;
            			        }
            			        
            			        if (ordenAscendente = true) {
            			            System.out.println("Los números fueron ingresados en orden ascendente");
            			        } else {
            			            System.out.println("Los números no fueron ingresados en orden ascendente");
            			        }
            			        
            				; break;
            			}
            			case 'c': {
            				 System.out.print("Ingrese el primer número entero negativo: ");
            			     num_1 = Integer.valueOf(entrada.readLine());

            			     System.out.print("Ingrese el segundo número entero negativo: ");
            			     num_2 = Integer.valueOf(entrada.readLine());

            			     if (num_1 < 0 && num_2 < 0) {
            			         resultado = Math.sqrt(num_1 * num_2);
            			         System.out.println("La raíz cuadrada de la multiplicación de " + num_1 + " y " + num_2 + " es: " + resultado);
            			     } else {
            			         System.out.println("Debe ingresar dos números enteros negativos");
            			     }
            			     
            				; break;
            			}
            			default: {
            				System.out.println("El carácter ingresado no es válido, ingrese un carácter: ");
            				c = entrada.readLine().charAt(0);
            			}
            		}
            	} else if (num == 0) {
            		System.out.println("Fin del programa");
            	} else {
            		System.out.println("El número ingresado no es válido");
            	}
            }
            
            
		}
		
		catch (Exception exc) {
			System.out.println(exc);
        }
		
	}
}