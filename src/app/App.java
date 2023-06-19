package app;
import modelo.Modelo;
import controlador.ControladorVentana;
import vista.Ventana;
import vista.Ventas;


/*
NOMBRE DEL PROGRAMA: INVENTARIO DULCERIA
PROGRAMADOR: MANUEL ANTONIO VIDALES DURAN -  2155481-2724

*************** DESCRIPCION GENERAL **************
El inventario de dulces es un sistema que permite almacenar y gestionar la información relacionada 
con los dulces disponibles para la venta.

*/

///////////////////// Main principal //////////////////

public class App {
    public static void main(String[] args) throws Exception {
        Ventana ventana = new Ventana();
        Modelo m = new Modelo();
        Ventas v = new Ventas();
        ControladorVentana menu = new ControladorVentana(ventana,m,v);
    }

}