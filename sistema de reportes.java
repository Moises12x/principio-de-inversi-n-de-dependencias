public interface GeneradorReporte {
    void generarReporte(String datos);
}
public class ReportePDF implements GeneradorReporte {
    public void generarReporte(String datos) {
        System.out.println("Generando reporte de PDF"); 
    }
}
        class ReporteExcel implements GeneradorReporte {
    public void generarReporte(String datos) {
        System.out.println("Generando reporte de Excel");}
}
public class GestorReportes {
    private GeneradorReporte generador;
    public GestorReportes(GeneradorReporte generador) {
        this.generador = generador;}
    public void procesarReporte(String datos) {
        generador.generarReporte(datos);}
}
