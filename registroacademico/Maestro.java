package registroacademico;

public class Maestro extends DatoGeneral
{
 private String dui;
 private String grados;
 public Maestro() {
 }
 public Maestro(String nombre, String direccion, String telefono, String email, String dui, String grados) {
    super(nombre, direccion, telefono, email);
    this.dui = dui;
    this.grados = grados;
 }
 public String getDui() {
    return dui;
 }
 public void setDui(String dui) {
    this.dui = dui;
 }
 public String getGrados() {
    return grados;
 }
 public void setGrados(String grados) {
    this.grados = grados;
 }

 public void pasarLista() {
    // Implementar la lógica para pasar lista
    System.out.println("Pasando lista del maestro " + getNombre() + ":");
    // Aquí se puede agregar la lógica para pasar lista
 }
 @Override
 public void modificar() {
    // Implementar la lógica de modificación
    System.out.println("Modificación de datos del maestro:");
    System.out.println("Número de DUI: " + dui);
    System.out.println("Grados: " + grados);
 }
 
}
