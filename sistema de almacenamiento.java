public interface Almacenamiento {
    void guardarArchivo(String nombre, String contenido);
    String recuperarArchivo(String nombre);
}
public class AlmacenamientoLocal implements Almacenamiento {
    public void guardarArchivo(String nombre, String contenido) {
        almacenamiento.put(nombre, contenido);
        System.out.println("Archivo guardado localmente: " + nombre);
    } 
    public String recuperarArchivo(String nombre) {
        return almacenamiento (nombre, "Archivo no encontrado localmente");
    }
    public class AlmacenamientoNube implements Almacenamiento{
        public void guardarArchivo(String nombre, String contenido) {
            almacenamiento.put(nombre, contenido);
            System.out.println("Archivo guardado en la nube")
        }
    }
    public String recuperarArchivo(String nombre) {
        return almacenamiento (nombre, "El archivo no fue encontrado en la nube");
    }
}
public class GestorArchivos {
    - final Almacenamiento almacenamiento;
    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    public void guardar(String nombre, String contenido) {
        almacenamiento.guardarArchivo(nombre, contenido);
    }
    public String recuperar(String nombre) {
        return almacenamiento.recuperarArchivo(nombre);
    }
}