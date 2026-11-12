import java.util.Scanner;
/**
 * Ejercicio 13: "Sistema de reservas hoteleras: En una hostería de la ciudad de
 * Loja se hace un descuento del 10% si el cliente se hospeda más de 5 días, del
 * 15% si se hospeda más de 10 días y del 20% si se hospeda más de 15 días. 
 * Elaborar una solución que pida el número de días y el precio diario de la 
 * habitación y luego calcule e imprima el subtotal por pagar, el descuento y 
 * el total por pagar.."
 * @author Felipe, Sofia
 * @version 1.0
 */
public class Ejercicio13_Reserva_Hotel {
    public static void main(String[] args) {
        //AQUÍ AGREGUE TODO SU CÓDIGO...
        Scanner tcl = new Scanner(System.in);
        double descuento, precio, total, subtotal;
        int dias;
        descuento = 0;
        System.out.println("Ingrese el numero de dias que se va a hospedar: ");
        dias = tcl.nextInt();
        System.out.println("Ingrese el precio de la habitacion por dia: ");
        precio = tcl.nextDouble();
        if (dias > 5 )
            descuento = 0.10;
        if( dias > 10)
            descuento = 0.15;
        if (dias > 15)
            descuento = 0.20;
        subtotal = dias * precio;
        descuento = subtotal * descuento;
        total = subtotal - descuento;
        System.out.println("El subtoal es de :"+ subtotal);
        System.out.println("El descuento es de: "+ descuento);
        System.out.println("El total a pagar es de: "+total);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del java
 * run:
Ingrese el numero de dias que se va a hospedar: 
11
Ingrese el precio de la habitacion por dia: 
5
El subtoal es de :55.0
El descuento es de: 8.25
El total a pagar es de: 46.75
BUILD SUCCESSFUL (total time: 9 seconds)
 */
