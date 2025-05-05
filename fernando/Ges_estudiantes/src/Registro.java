
public class Registro {
    public void registrarPromedio(double promedio){
        try{
            if(promedio < 0 || promedio > 20){
                throw new IllegalArgumentException("Debe ser un promedio entre 0 y 20");          
            }
            System.out.println("El promedio registrado es: "+promedio);            
        }catch(IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
