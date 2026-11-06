import java.util.Scanner;
/**
 * Ejercicio 05: "Año Bisiesto: Comprobar si un año ingresado es bisiesto o no. Si es bisiesto, mostrar un mensaje especial."
 */
public class Ejercicio05_Año_Bisiesto{
    public static void main(String[] args) {
        //AQUÍ AGREGUE TODO SU CÓDIGO...
        Scanner tcl = new Scanner(System.in);
        int anio;
        System.out.println("Ingrese un anio: ");
        anio = tcl.nextInt();
        if (( anio % 4 == 0 && anio % 100 != 0) || ( anio % 400 == 0))
            System.out.println("El año es Bisiesto");
        else
            System.out.println("El año no es Bisiesto");
    }
}

/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del java
 * run:
Ingrese un anio: 
2001
El a�o no es Bisiesto
BUILD SUCCESSFUL (total time: 2 seconds)

 */
