
package manejo_de_excepciones;
import java.util.Scanner;

public class Manejo_De_Excepciones {

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String n;
        int b;
        
        System.out.println("Ingresa un numero entero real: ");
        n = teclado.nextLine();
        System.out.println();
        try {
            b = Integer.parseInt(n);
            System.out.println("Usted ingresó un numero correctamente");
        } catch(NumberFormatException e) {
            System.out.println("Por favor Ingresa un numero entero real");
        } finally {
            teclado.close();
            System.out.println("Fin del programa");
        }
    }
    
}
