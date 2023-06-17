package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.IngresarDatos;
import vista.Ventana;

public class ControladorIngresar implements ActionListener {
    public IngresarDatos ingresar;

    public ControladorIngresar(IngresarDatos ingresar) {
        this.ingresar = ingresar;
        this.ingresar.jbGuardar.addActionListener(this);
        this.ingresar.jbVolver.addActionListener(this);
        this.ingresar.jbLimpiar.addActionListener(this);
        this.ingresar.jbLimpiar1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ingresar.jbGuardar) {
            System.out.println("Se presionó el botón Guardar");
            // Lógica para guardar los datos
        } else if (e.getSource() == ingresar.jbVolver) {
            System.out.println("Se presionó el botón Volver");
            Ventana ventana = new Ventana();
            ControladorVentana menu = new ControladorVentana(ventana);
            ingresar.setVisible(false);
            // Lógica para volver a la ventana anterior
        } else if (e.getSource() == ingresar.jbLimpiar) {
            System.out.println("Se presionó el botón Limpiar");
            // Lógica para limpiar los campos de entrada
        } else if (e.getSource() == ingresar.jbLimpiar1) {
            System.out.println("Se presionó el botón Limpiar 1");
            // Lógica para limpiar otros elementos
        }
    }
}

