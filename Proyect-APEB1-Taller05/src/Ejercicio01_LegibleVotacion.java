import java.util.Scanner;
/**
 * Ejercicio 01: "Edad para Votar: Determinar si una persona es elegible para
 * votar en función de su edad (mayor o igual a 16 años)."
 * @author Felipe, Sofia
 * @version 1.0
 */
public class Ejercicio01_LegibleVotacion {
    public static void main(String[] args) {
        //AQUÍ AGREGUE TODO SU CÓDIGO...
        Scanner tcl = new Scanner(System.in);
        int edad;
        System.out.println("Ingrese su edad: ");
        edad = tcl.nextInt();
        if (edad >= 16) {
            System.out.println("Usted es elegible para votar");
        } else {
            System.out.println("Usted no puede votar");
        }
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
