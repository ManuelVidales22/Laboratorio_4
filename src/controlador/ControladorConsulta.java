package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.ConsultarDatos;
import vista.Ventana;

public class ControladorConsulta implements ActionListener {
    public ConsultarDatos consulta;

    public ControladorConsulta(ConsultarDatos consulta) {
        this.consulta = consulta;
        this.consulta.jbConsultar.addActionListener(this);
        this.consulta.jbVolver.addActionListener(this);
        this.consulta.jbLimpiar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == consulta.jbConsultar) {
            System.out.println("Se presionó el botón consultar");
            // Lógica para buscar los datos
        } else if (e.getSource() == consulta.jbVolver) {
            System.out.println("Se presionó el botón Volver");
            Ventana ventana = new Ventana();
            ControladorVentana menu = new ControladorVentana(ventana);
            consulta.setVisible(false);
        } else if (e.getSource() == consulta.jbLimpiar) {
            System.out.println("Se presionó el botón Limpiar");
            // Lógica para limpiar los campos de búsqueda
        } 
    }
}

