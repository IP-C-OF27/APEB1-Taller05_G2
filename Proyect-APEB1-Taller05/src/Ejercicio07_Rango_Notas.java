import java.util.Scanner;
/**
 * Ejercicio 07: "Rango de Notas: Asignar una letra (A, B, C, D) a una calificación en función de su rango (A para 90-100, B para 80-89, etc.)."
 */
public class Ejercicio07_Rango_Notas{
    public static void main(String[] args) {
        //AQUÍ AGREGUE TODO SU CÓDIGO...
        Scanner tcl = new Scanner(System.in);
        int nota;
        char asignacion;
        System.out.println("Ingrese la calificacion: ");
        nota = tcl.nextInt();
        if (nota >= 90)
            asignacion = 'A';
        else
            if(nota >= 80)
                asignacion = 'B';
            else
                if (nota >=70)
                    asignacion = 'C';
                else
                    asignacion = 'D';
        System.out.println("La calificacion es de: "+asignacion);
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
