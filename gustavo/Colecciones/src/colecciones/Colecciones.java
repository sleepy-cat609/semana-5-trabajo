
package colecciones;
import java.util.ArrayList;
import java.util.Scanner;

public class Colecciones {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        
        System.out.println(" ---LISTA DE ANIMALES--- ");
        System.out.println("Ingresa el tamaño de la lista: ");
        int n = teclado.nextInt(); teclado.nextLine();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Animal " + (i+1));
            String animal = teclado.nextLine();
            lista.add(animal);
        }
        
        System.out.println();
        System.out.println("Lista ingresada: ");
        for (String anim : lista) {
            System.out.println("-" +anim);
        }
        
    }
    
}
