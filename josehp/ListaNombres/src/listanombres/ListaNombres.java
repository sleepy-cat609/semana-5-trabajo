package listanombres;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        ArrayList<String> nombres = new ArrayList<>();
        
        System.out.println("¿Cuantos nombres ingresara? ");
        int cant = scanner.nextInt();
        scanner.nextLine();
        
        for (int i=0; i<cant; i++){
            System.out.print("Ingresa el nombre "+(i+1)+": ");  
            String nombre = scanner.nextLine();
            nombres.add(nombre);  
        }  
        System.out.println("Los nombre ingresados: ");
        int i=1;
        for (String nombre : nombres){
            System.out.println(i+"- "+nombre);
            i++;
        }
    }
}


