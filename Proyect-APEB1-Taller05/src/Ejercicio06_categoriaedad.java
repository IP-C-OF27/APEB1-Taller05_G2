import java.util.Scanner;
/**
 * Ejercicio 06: "Clasificar a una persona en una categoría de edad
 * (niño, adolescente, adulto) en función de su edad."
 * @author Sofia, Felipe
 * @version */
public class Ejercicio06_categoriaedad {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int edad;
        System.out.println("Ingrese su edad:");
        edad = tcl.nextInt();
        if (edad <= 12)
            System.out.println("lA CATEGORIA ES NIÑO");
        else
           if (edad >= 13 && edad <=17 )
                System.out.println("LA CATEGORIA ES ADOLESCCENTE");
           else
                System.out.println("LA CATEGORIA ES ADULTO");
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
