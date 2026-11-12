import java.util.Scanner;
/**
Ejercicio 08: "Calculadora de IMC: Calcular el índice de masa corporal (IMC) 
 * de una persona y clasificarla en función de su valor (bajo peso, 
 * peso normal, sobrepeso, etc.)."
 * @author Sofia, Felipe
 * @version */
public class Ejercicio08_CalculadoraIMC {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double Imc,altura,peso;
        System.out.println("Ingrese su peso en Kg");
        peso = tcl.nextDouble();
        System.out.println("Ingrese su altura en metros");
        altura = tcl.nextDouble();
        Imc = peso / (altura * altura);
        System.out.printf("Su Imc es: %.2f" , Imc);
        if (Imc <= 18.5){
            System.out.println(" por lo tanto es de bajo peso " );
        }
        else 
            if (Imc < 30){
            System.out.println(" por lo tanto es de peso normal " );
        }
        else {
            System.out.println(" por lo tanto es de sobrepeso ");  
        }
    }
}
/***
 * EVIDENCIA DEL RUN
 run:
Ingrese su peso en Kg
53
Ingrese su altura en metros
1,58
Su Imc es: 21,23 por lo tanto es de peso normal 
BUILD SUCCESSFUL (total time: 5 seconds)
 */