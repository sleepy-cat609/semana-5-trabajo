
package sobrecarga;


public class Sobrecarga {

    public static void main(String[] args) {
        
        Calculo sum = new Calculo();
        System.out.println("Suma Sobrecarga 1: " + sum.Suma(4,5));
        System.out.println("Suma Sobrecarga 2: " +sum.Suma(4.5,5.5));
        
    }
    
}
