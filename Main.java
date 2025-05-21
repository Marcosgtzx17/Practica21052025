import registroacademico.Alumno;
import registroacademico.DatoGeneral;
import registroacademico.ISearch;
import registroacademico.Maestro;
public class Main {
public static void main(String[] args) {
    Alumno alumno = new Alumno();
    alumno.setNombre("Juan Perez");
    alumno.setDireccion("Calle 123");
    alumno.resgistrar();
    alumno.modificar();


    Maestro maestro = new Maestro();
    maestro.setNombre("Maria Lopez");
    maestro.setDireccion("Avenida 456");
    maestro.resgistrar();
    maestro.modificar();
  }
 
      public static void ver(ISearch iSearch) {
       iSearch.obtenerTodos();
       iSearch.obtenerPorId(1);
    }

    // Aquí puedes agregar más instancias y pruebas según sea necesario
}
   

