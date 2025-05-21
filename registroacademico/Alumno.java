package registroacademico;

public class Alumno extends DatoGeneral{

    private String nCarnet;
    private String encargado;
    public Alumno() {
    }
    public Alumno(String nombre, String direccion, String telefono, String email, String nCarnet, String encargado) {
        super(nombre, direccion, telefono, email);
        this.nCarnet = nCarnet;
        this.encargado = encargado;
    }
    public String getnCarnet() {
        return nCarnet;
    }
    public void setnCarnet(String nCarnet) {
        this.nCarnet = nCarnet;
    }
    public String getEncargado() {
        return encargado;
    }
    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }
public void verNotas() {
        // Implementar la lógica para ver notas
        System.out.println("Notas del alumno " + getNombre() + ":");
        // Aquí se puede agregar la lógica para mostrar las notas
    }
  public void entregarTareas() {
        // Implementar la lógica para entregar tareas
        System.out.println("Entrega de tarea del alumno " + getNombre() + ":");
        // Aquí se puede agregar la lógica para entregar tareas
    }
  @Override
  public void resgistrar() {
        // Implementar la lógica de registro
        System.out.println("Registro de datos del alumno:");
        System.out.println("Número de carnet: " + nCarnet);
        System.out.println("Encargado: " + encargado);
    }
   
    
}
