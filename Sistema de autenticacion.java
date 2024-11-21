public interface servicioAutenticacion {
    boolean autenticar(String usuario, String credenciales);
}
public class AutenticacionLocal implements ServicioAutenticacion {
    public boolean autenticar(String usuario, String credenciales){}
}
public class AutenticacionOAuth implements ServicioAutenticacion {
    public boolean autenticar(String usuario, String credenciales){}
}
public class GestorAutenticacion {
    public class GestorAutenticacion {
        - final ServicioAutenticacion servicioAutenticacion;
        public GestorAutenticacion(ServicioAutenticacion servicio) {
            this.servicioAutenticacion = servicioAutenticacion;
        }
        public boolean login(String usuario, String credenciales);
    }
} 
