import java.util.ArrayList;
public class Lista_estud {
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();
    
    public void agregarEstudiante(Estudiante e){
        estudiantes.add(e);
    }
    
    public void mostrarEstudiantes(){
        for(Estudiante e:estudiantes){
            e.mostrarDatos();
            System.out.println("---------------");
        }
    }
}
