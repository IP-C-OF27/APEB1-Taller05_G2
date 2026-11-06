import java.util.Scanner;
/**
 * Ejercicio 03: "Mayor de tres números: Dados tres números distintos, determinar cuál es el mayor."
 */
public class Ejercicio03_Mayor_de_tres{
    public static void main(String[] args) {
        //AQUÍ AGREGUE TODO SU CÓDIGO...
        Scanner tcl = new Scanner(System.in);
        int num1, num2, num3, mayor;
        System.out.println("Ingrese el primer numero: ");
        num1 = tcl.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = tcl.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        num3 = tcl.nextInt();
        if (num1 >= num2 && num1 >= num3 )
            mayor = num1;
        else 
            if (num2 >= num1 && num2 > num3)
                mayor = num2;
            else
                mayor = num3;
        System.out.println("El numero mayor es: "+mayor);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del java
 * run:
Ingrese su edad: 
20
Usted es elegible para votar
BUILD SUCCESSFUL (total time: 11 seconds)
 */
