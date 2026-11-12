import java.util.Scanner;
/**
 Ejercicio 10: "Valores pares o impares: Dado un valor entero ingresado por 
 * teclado (positivo o negativo), determinar si se trata de un valor par o impar..).."
 * @author Sofia , Felipe
 * @version 1.0
 */
public class Ejercicio10_valoresparesoimpares {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese el numero a determinar");
        numero = tcl.nextInt();
        if (numero  % 2 == 0)
            System.out.println("El numero es par");
        else
            System.out.println("El numero es impar"); 
    }
}
/***
 * EVIDENCIA DEL RUN
 run:
Ingrese el numero a determinar
-8
El numero es par
BUILD SUCCESSFUL (total time: 2 seconds)
 */