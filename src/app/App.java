package app;
import modelo.Modelo;
import controlador.Controlador;
import vista.Ventana;

public class App {
    public static void main(String[] args) throws Exception {
        
        Ventana vista = new Ventana();
        Modelo modelo  = new Modelo();
        
                Controlador controlador = new Controlador(modelo, vista);
                controlador.inicializacion();
                  
            }
    }

