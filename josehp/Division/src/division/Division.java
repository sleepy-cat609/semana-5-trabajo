package division;

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
       try {
           System.out.print("Ingresa el numerador: ");
           double a = scanner.nextDouble();
           
           System.out.print("Ingresa el denominador: ");
           double b = scanner.nextDouble();
            if (b == 0) {
                System.out.println("Error: División entre cero no permitida.");
            } else {
                double resultado = a / b;
                System.out.println("Resultado: " + resultado);
            }
           
            //double resultado = a/b;
            //System.out.println("Resultado: "+resultado );
           
       
       }catch (ArithmeticException e){
          System.out.println("Error: Divicion entre cero no es posible. ");
       }catch (Exception e){
           System.out.println("Error: Entrada no valida. ");
       }
    }
    
}
