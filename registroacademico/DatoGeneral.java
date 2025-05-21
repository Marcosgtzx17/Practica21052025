package registroacademico;

public class DatoGeneral {
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    public DatoGeneral() {
    }
    public DatoGeneral(String nombre, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void resgistrar() {
        // Implementar la lógica de registro
        System.out.println("Registro de datos generales:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Email: " + email);
    }
   public void modificar() {
        // Implementar la lógica de modificación
        System.out.println("Modificación de datos generales:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Email: " + email);
    }
    public void eliminar() {
        // Implementar la lógica de eliminación
        System.out.println("Eliminación de datos generales:");
        System.out.println("Nombre: " + nombre);
       
    }


}
