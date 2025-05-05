
public class Main {
    public static void main(String[] args) {
        Lista_estud lista = new Lista_estud();
        
        Estudiante e1 = new Estudiante("Jose");
        Estudiante e2 = new Estudiante("Carlos",17);
        Estudiante e3 = new Estudiante("Juan",14,17.5);
        
        lista.agregarEstudiante(e1);
        lista.agregarEstudiante(e2);
        lista.agregarEstudiante(e3);
        
        lista.mostrarEstudiantes();
        
        Registro r = new Registro();
        r.registrarPromedio(21);//Para errores
        r.registrarPromedio(20);//Forma correcta
    }
}
