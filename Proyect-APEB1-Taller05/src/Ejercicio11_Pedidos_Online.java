import java.util.Scanner;
/**
 * Ejercicio 11: Pedidos online: Desarrollar una solución que imprima el costo 
 * de un pedido de un artículo del cual se tiene la descripción, la cantidad }
 * que se requiere y el precio unitario. Si la cantidad pedida excede de 50 
 * unidades, se hace un descuento de 15%."
 * @author Felipe, Sofia
 * @version 1.0
 */
public class Ejercicio11_Pedidos_Online {
    public static void main(String[] args) {
        //AQUÍ AGREGUE TODO SU CÓDIGO...
        Scanner tcl = new Scanner(System.in);
        String desc;
        int cant;
        double precio, total;
        System.out.println("Ingrese la descripcion del producto: ");
        desc = tcl.nextLine ();
        System.out.println("Ingrese la cantidad del pruducto: ");
        cant = tcl.nextInt();
        System.out.println("Ingrese el precio del producto: ");
        precio = tcl.nextDouble();
        total = cant * precio;
        if ( cant > 50) 
            total = total * 0.85;
        System.out.println("El costo total del producto " + desc + " es de: $" + total);
            
    }
}

/***
run:
Ingrese la descripcion del producto: 
Gafas
Ingrese la cantidad del pruducto: 
80
Ingrese el precio del producto: 
10
El costo total del producto Gafas es de: $680.0
BUILD SUCCESSFUL (total time: 9 seconds)

 */