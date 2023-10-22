package practica_02;

// Ejercicio 16: Pedir por consola 15 caracteres. Imprimir la mayor cantidad de ‘a’ seguidas que se ingresaron.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica02_Ejercicio16 {
	public static void main(String[] args) {
        
		int contador = 0;
        int contadorMaximo = 0;
        String caracteres;
		
		try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Ingrese 15 caracteres: ");
            caracteres = entrada.readLine();
            
            for (int i = 0; i < caracteres.length(); i++) {
                if (caracteres.charAt(i) == 'a') {
                    contador++;
                    if (contador > contadorMaximo) {
                        contadorMaximo = contador;
                    }
                } else {
                    contador = 0;
                }
            }
            System.out.println("La mayor cantidad de 'a' seguidas que se ingresaron es: " + contadorMaximo);
        
        } catch (Exception exc) {
            System.out.println(exc);
        }
	}
}