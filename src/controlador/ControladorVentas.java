package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Ventana;
import vista.Ventas;

public class ControladorVentas implements ActionListener {
    public Ventas ventas;

    public ControladorVentas(Ventas ventas) {
        this.ventas = ventas;
        this.ventas.jbGuardar.addActionListener(this);
        this.ventas.jbVolver.addActionListener(this);
        this.ventas.jbLimpiar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ventas.jbGuardar) {
            System.out.println("Se presionó el botón guardar");
            // Lógica para agregar un producto a la venta
        } else if (e.getSource() == ventas.jbLimpiar) {
            System.out.println("Se presionó el botón limpiar");
            // Lógica para realizar la venta
        } else if (e.getSource() == ventas.jbVolver) {
            System.out.println("Se presionó el botón volver");
            Ventana ventana = new Ventana();
            ControladorVentana menu = new ControladorVentana(ventana);
            ventas.setVisible(false);
            
        } else if (e.getSource() == ventas.jbLimpiar) {
            System.out.println("Se presionó el botón Limpiar");
            // Lógica para limpiar los campos de venta
        }
    }
}

