package practica_03;

/* Ejercicio 02: Los días lunes se recibe la mercadería que envían los proveedores y se debe actualizar el stock. 
Suponga que se tiene un método que modifica el stock con la cantidad recibida y que invoca a otro método 
que elimina la línea del pedido para el producto recibido (se conoce el ID_Producto). 
Programar un método al cual se le pase el día de la semana y si es lunes pida al usuario el ID_Producto y 
la cantidad recibida. Con estos datos invoque al método que modifica el stock (no implementar) y al que
elimina la línea del pedido (no implementar). Hacer un programa que llame a los diferentes métodos, 
establezca variables y constantes. Finalmente imprima cuanto stock quedó. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica03_BonusTrack01_Ejercicio02 {
	public static void main(String[] args) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		// Definimos la variable dia de la semana
        String diaSemana;
        
        // Definimos las variables para el ID_Producto y la cantidad recibida
        int idProducto;
        int cantidadRecibida;
        
		try {
         // Pedimos al usuario que ingrese el día de la semana
         System.out.print("Ingrese el día de la semana: ");
         diaSemana = entrada.readLine().toLowerCase();
         
         // Si es lunes, pedimos el ID_Producto y la cantidad recibida
         if (diaSemana.equals("lunes")) {

             
             // Pedimos al usuario que ingrese el ID_Producto
             System.out.print("Ingrese el ID_Producto: ");
             idProducto = Integer.valueOf(entrada.readLine());
             
             // Pedimos al usuario que ingrese la cantidad recibida
             System.out.print("Ingrese la cantidad recibida: ");
             cantidadRecibida = Integer.valueOf(entrada.readLine());
             
             // Aquí se llamaría al método que modifica el stock con el ID_Producto y la cantidad recibida
             // Y luego se llamaría al método que elimina la línea del pedido para ese producto
             
             // Imprimimos el stock actual
             System.out.println("El stock actual es: " + Stock());
         }
     } catch (Exception exc) {
         System.out.println(exc);
     }
 }
 
 	public static int Stock() {
 	     // Aquí se obtendría el stock actual y se retornaría su valor
 		int stock = 100;
 		return stock;
 	}
}