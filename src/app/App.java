package app;
import modelo.Modelo;
import controlador.ControladorVentana;
import vista.Ventana;
import vista.Ventas;

public class App {
    public static void main(String[] args) throws Exception {
        Ventana ventana = new Ventana();
        Modelo m = new Modelo();
        Ventas v = new Ventas();
        ControladorVentana menu = new ControladorVentana(ventana,m,v);
    }

}