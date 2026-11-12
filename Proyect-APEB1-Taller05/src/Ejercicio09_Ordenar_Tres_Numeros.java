import java.util.Scanner;
/**
 * Ejercicio 09: "Ordenamiento de Tres Números:
 * Dados tres números, ordenarlos en orden ascendente."
 * @author Felipe, Sofia
 * @version 1.0
 */
public class Ejercicio09_Ordenar_Tres_Numeros {
    public static void main(String[] args) {
        //AQUÍ AGREGUE TODO SU CÓDIGO...
        Scanner tcl = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Ingrese el primer numero: ");
        num1 = tcl.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = tcl.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        num3 = tcl.nextInt();
        // numero menor
        if (num1 <= num2 && num1 <= num3)
            System.out.println("El numero menor es: " + num1);
        else
            if (num2 <= num1 && num2 <= num3)
                System.out.println("El numero menor es: " + num2);
            else
                System.out.println("El numero menor es: " + num3);

        // intermedio
        if ((num1 >= num2 && num1 <= num3) ||
            (num1 <= num2 && num1 >= num3))
            System.out.println("El numero intermedio es: " + num1);
        else
            if ((num2 >= num1 && num2 <= num3) ||
                (num2 <= num1 && num2 >= num3))
                System.out.println("El numero intermedio es: " + num2);
            else
                System.out.println("El numero intermedio es: " + num3);

        // mayorr
        if (num1 >= num2 && num1 >= num3)
            System.out.println("El numero mayor es: " + num1);
        else
            if (num2 >= num1 && num2 >= num3)
                System.out.println("El numero mayor es: " + num2);
            else
                System.out.println("El numero mayor es: " + num3);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del java
run:
Ingrese el primer numero: 
6
Ingrese el segundo numero: 
3
Ingrese el tercer numero: 
12
El numero menor es: 3
El numero intermedio es: 6
El numero mayor es: 12
BUILD SUCCESSFUL (total time: 10 seconds)

 */
