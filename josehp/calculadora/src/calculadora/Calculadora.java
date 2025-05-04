
package calculadora;

public class Calculadora {
    //public int suma (int a, int b){
    //    return a+b ;
    //}
    public double suma (double a, double b){
        return a+b ;
    }
    public int suma (int a, int b ,int c){
        return a+b+c ;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
       System.out.println("La suma de 2 numeros enteros 2 + 3 = " + calc.suma(2 ,3));
       System.out.println("La suma de 2 numeros decimales 2.5 + 2.5 = " + calc.suma(2.5 ,2.5));
       System.out.println("La suma de 3 numeros enteros 1 + 2 + 3 = " + calc.suma(1 ,2 ,3));
       
    }
    
}
