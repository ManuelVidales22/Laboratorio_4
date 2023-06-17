package app;
import modelo.Modelo;
import controlador.ControladorVentana;
import vista.Ventana;

public class App {
    public static void main(String[] args) throws Exception {
        Ventana ventana = new Ventana();
        ControladorVentana menu = new ControladorVentana(ventana);
    }

}