package practica_03;

/* Ejercicio 01: La cadena de supermercados Carrefive ha pedido la refactorización del componente de software 
que usa para el control de stock. El código original no estaba modularizado por lo tanto no era legible y 
no se aprovechaba la reutilización. El componente que maneja el stock atiende algunas necesidades como:

a. Cuando la cantidad de unidades de un artículo llega a un límite de seguridad se debe agregar una línea 
en un pedido para luego ser enviado al proveedor. El informe debe tener los siguientes datos: 
ID_Producto, Nombre, Fecha, Hora, Cantidad, Prioridad baja.

b. Cuando la cantidad de unidades está por debajo del límite de seguridad en más de un 30% se debe aumentar la
prioridad de baja a media y actualizar la cantidad, la fecha y la hora en el informe.

c. Cuando la cantidad de unidades está por debajo del límite de seguridad en más de un 70% la prioridad 
cambia a alta y se debe actualizar la cantidad, la fecha y la hora en el informe.

d. Cuando la cantidad es cero se debe imprimir por consola un mensaje 
“No hay más unidades del producto” + ID_Producto + Nombre. 
También se debe actualizar la cantidad (0), la fecha y la hora en el informe.

e. Si la cantidad vendida excede lo que hay en stock se debe informar y no descontar del stock. 
Informar cuánto stock queda para vender de ese producto.

Escribir el método que genera/modifica el informe para un artículo a partir de los datos que necesita 
(solo imprimir por consola no hay que armar un informe en sí). Luego escribir un programa con
declaración de constantes y variables que haga uso de dicho método y que mientras el usuario no ingrese 0 
(en un sistema real lo genera otro componente por ejemplo el que se ejecuta en la caja registradora) 
pida el ingreso de los datos necesarios (la prioridad se debe obtener automáticamente dependiendo de los
valores) para generar el informe correctamente. Modularizar la solución. */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalTime;

public class Practica03_BonusTrack01_Ejercicio01 {
	public static void main(String[] args) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		final int LIMITE_SEGURIDAD = 10;
        int idProducto, cantidad;
        String nombre;
        
        try {
        	 // Ciclo principal
            do {
                // Pedir al usuario los datos del producto
                System.out.println("Ingrese los datos del producto (o ingrese 0 para salir):");
                System.out.print("- ID_Producto: ");
                idProducto = Integer.valueOf(entrada.readLine());
                
                if (idProducto == 0) {
                    System.out.println("El programa ha finalizado.");
                } else {
                	System.out.print("- Nombre: ");
                	nombre = String.valueOf(entrada.readLine());
                	System.out.print("- Cantidad: ");
                	cantidad = Integer.valueOf(entrada.readLine());
                	
                	if (cantidad < 0) {
                		System.out.println("La cantidad ingresada no es válida.");
                	} else if (cantidad > LIMITE_SEGURIDAD) {
                		// Verificar si la cantidad vendida excede el stock
                		System.out.println("La cantidad vendida (" + cantidad + ") excede el stock disponible.");
                		System.out.println("Stock disponible para el producto " + idProducto + ": " + cantidad);
                	}

                	// Generar/modificar el informe del producto
                	generarInforme(idProducto, nombre, cantidad, LIMITE_SEGURIDAD);
                }
            } while (idProducto != 0);
        } catch (Exception exc) {
        	System.out.println(exc);
        }
	}
	
	public static void generarInforme(int idProducto, String nombre, int cantidad, int limiteSeguridad) {
	    // Obtener la fecha y hora actual
	    LocalDate fecha = LocalDate.now();
	    LocalTime hora = LocalTime.now();

	    // Calcular la prioridad según la cantidad de unidades
	    String prioridad = "Baja";
	    if (cantidad >= limiteSeguridad) {
	        prioridad = "Baja";
	    } else if (cantidad <= limiteSeguridad * 0.3) {
	        prioridad = "Media";
	    } else if (cantidad <= limiteSeguridad * 0.7) {
	    	prioridad = "Alta";
	    } else if (cantidad == 0) {
		    System.out.println("No hay más unidades del producto " + idProducto + ": " + nombre);
		    System.out.println();
		    
		    prioridad = "Alta";
	    }

	    // Actualizar la cantidad, fecha, hora y prioridad del informe
	    System.out.println("Actualizando informe para producto " + idProducto + ":");
	    System.out.println("- Nombre: " + nombre);
	    System.out.println("- Cantidad: " + cantidad);
	    System.out.println("- Límite de seguridad: " + limiteSeguridad);
	    System.out.println("- Fecha: " + fecha);
	    System.out.println("- Hora: " + hora);
	    System.out.println("- Prioridad: " + prioridad);
	    System.out.println();

	    // Verificar si se necesita agregar un pedido
	    if (cantidad <= limiteSeguridad) {
	        System.out.println("¡Se debe realizar un pedido para el producto " + idProducto + "!");
	        System.out.println("- ID_Producto: " + idProducto);
	        System.out.println("- Nombre: " + nombre);
	        System.out.println("- Fecha: " + fecha);
	        System.out.println("- Hora: " + hora);
	        System.out.println("- Cantidad: " + cantidad);
	        System.out.println("- Prioridad: " + prioridad);
	        System.out.println();
	    }

	}
}