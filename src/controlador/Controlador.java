package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import vista.Vista;
import modelo.Modelo;

public class Controlador  implements ActionListener, ListSelectionListener {
    Modelo modelo;
    Operaciones operacion;
    Vista vista;
 

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    public Operaciones getOperacion() {
        return operacion;
    }
    public void setOperacion(Operaciones operacion) {
        this.operacion = operacion;
    }

    public void inicializacion(){
        vista.iniciar(this);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(operacion){
            case INSERTAR:
                vista.insertarDulce();
                String nuevoDulce = vista.getNombre();
                String tipo = vista.getTipo();
                int cantidad = vista.getCantidad();
                double precio = vista.getPrecio();
                modelo.insertarDulces(tipo, nuevoDulce, cantidad, precio);
                modelo.listarDulces();
                break;
            case ACTUALIZAR:
                vista.actualizarNombresListComboboxes();
                String nombre = vista.getNombre();
                int cantidadComprada = vista.getCantidad();
                modelo.actualizarInventarioEnSegundoPlano(nombre, cantidadComprada);
                break;
            
            default: 
                break;
        }
        
        
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'valueChanged'");
    }


}

