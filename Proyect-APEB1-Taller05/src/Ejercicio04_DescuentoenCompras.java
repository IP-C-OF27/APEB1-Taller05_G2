import java.util.Scanner;
/**
 * Ejercicio 04: " Calcular el precio final de un producto con un descuento del
 * 10% si el precio original es mayor de $100; de lo contrario, no hay descuento.."
 * @author Sofia, Felipe
 * @version */
public class Ejercicio04_DescuentoenCompras {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double producto, total ;
        System.out.println("Ingresar el precio del producto");
        producto = tcl.nextDouble();
        total = producto;
            if (producto >= 100)
                total = producto * 0.9;
        System.out.println("El precio final del producto es: " + total );   
    }
}
/***
 * EVIDENCIA DEL RUN
 run:
Ingresar el precio del producto
120
El precio final del producto es: 108.0
BUILD SUCCESSFUL (total time: 2 seconds)

 */

