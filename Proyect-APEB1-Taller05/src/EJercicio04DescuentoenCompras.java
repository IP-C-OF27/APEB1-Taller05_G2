import java.util.Scanner;
/**
 * Ejercicio 04: " Calcular el precio final de un producto con un descuento del
 * 10% si el precio original es mayor de $100; de lo contrario, no hay descuento.."
 * @author Sofia, Felipe
 * @version */
public class EJercicio04DescuentoenCompras {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double producto, descuento;
        System.out.println("Ingresar el precio del producto");
        producto = tcl.nextDouble();
            if (producto >= 100)
                descuento = producto * 0.90;
            else 
                descuento = 0;
        System.out.println("El precio final del producto es: " + descuento );   
    }
}
/***
 * EVIDENCIA DEL RUN
 run:
Ingresar el precio del producto
100
El precio final del producto es: 90.0
BUILD SUCCESSFUL (total time: 0 seconds)

 */

