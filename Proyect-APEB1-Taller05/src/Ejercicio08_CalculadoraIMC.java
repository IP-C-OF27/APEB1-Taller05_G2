import java.util.Scanner;
/**
Ejercicio 08: "Calculadora de IMC: Calcular el índice de masa corporal (IMC) 
 * de una persona y clasificarla en función de su valor (bajo peso, 
 * peso normal, sobrepeso, etc.)."
 * @author Sofia, Felipe
 * @version */
public class Ejercicio08_CalculadoraIMC {
    public static void main(String[] args) {
        //AQUÍ AGREGUE TODO SU CÓDIGO...
        Scanner tcl = new Scanner(System.in);
        double Imc,altura,peso;
        System.out.println("Ingrese su peso en Kg");
        peso = tcl.nextDouble();
        System.out.println("Ingrese su altura en metros");
        altura = tcl.nextDouble();
        Imc = peso / (altura * altura);
        System.out.printf("Su Imc es: %.2f" , Imc);
        if (Imc < 18.5) {
            System.out.println(" por lo tanto es de bajo peso ");}
        else 
            if (Imc < 25) {
                System.out.println(" por lo tanto es de peso normal ");}
            else
                if (Imc < 30) {
                    System.out.println(" por lo tanto es de sobrepeso ");}
                else {
                    System.out.println(" por lo tanto es de obesidad ");}
    }
}
/***
 * EVIDENCIA DEL RUN
 run:
Ingrese su peso en Kg
90
Ingrese su altura en metros
1,60
Su Imc es: 35,16 por lo tanto es de obesidad 
BUILD SUCCESSFUL (total time: 13 seconds)

 */