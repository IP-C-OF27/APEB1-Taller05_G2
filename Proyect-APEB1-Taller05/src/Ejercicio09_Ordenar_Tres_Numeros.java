import java.util.Scanner;
/**
 * Ejercicio 09: "Ordenamiento de Tres Números: Dados tres números, ordenarlos en orden ascendente."
 */
public class Ejercicio09_Ordenar_Tres_Numeros{
    public static void main(String[] args) {
        //AQUÍ AGREGUE TODO SU CÓDIGO...
        Scanner tcl = new Scanner(System.in);
        int num1, num2, num3, ordenar;
        System.out.println("Ingrese el primer numero: ");
        num1 = tcl.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = tcl.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        num3 = tcl.nextInt();
        if (num1 >= num2 && num1 >= num3)
            System.out.println("El numero mayor es : "+num1);
        else
            if(num2>= num1 && num2 >= num3)
                System.out.println("El numero mayor es: "+num2);
            else
                System.out.println("El numero mayor es: "+num3);
        if (num1 => num2 && num1 <= num3)
            System.out.println("El numero intermedio es: "+num1);
        else
            if(num2 => num1 && num2 <= num3)
                System.out.println("El numero intermedio es: " +num2);
            else
                System.out.println("El numero intermedio es " +num3);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del java
 * run:
Ingrese la calificacion: 
75
La calificacion es de: C
BUILD SUCCESSFUL (total time: 3 seconds)
 */
