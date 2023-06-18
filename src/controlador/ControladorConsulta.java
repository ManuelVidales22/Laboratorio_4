package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import modelo.Modelo;
import vista.ConsultarDatos;
import vista.Ventana;
import vista.Ventas;

public class ControladorConsulta implements ActionListener {
    public ConsultarDatos consulta;
    public Modelo modelo;
    public Ventas ventas;

    public ControladorConsulta(ConsultarDatos consulta, Modelo modelo, Ventas ventas) {
        this.consulta = consulta;
        this.modelo = modelo;
        this.ventas = ventas;
        this.consulta.jbConsultar.addActionListener(this);
        this.consulta.jbVolver.addActionListener(this);
        this.consulta.jbLimpiar.addActionListener(this);
        modelo.listarDulces();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == consulta.jbConsultar) {
            System.out.println("Se presionó el botón consultar");
            consultarDatos();
            // Lógica para buscar los datos
        } else if (e.getSource() == consulta.jbVolver) {
            System.out.println("Se presionó el botón Volver");
            Ventana ventana = new Ventana();
            ControladorVentana menu = new ControladorVentana(ventana,modelo,ventas);
            consulta.setVisible(false);
        } else if (e.getSource() == consulta.jbLimpiar) {
            System.out.println("Se presionó el botón Limpiar");
            limpiar();
            // Lógica para limpiar los campos de búsqueda
        } 
    }

    public void consultarDatos() {
    String tipo = consulta.jcTipo.getSelectedItem().toString();
    String cant = consulta.jsCantidad.getValue().toString();

    // Validar selección en el JComboBox
    if (tipo.equals("Tipo Dulce")) {
        JOptionPane.showMessageDialog(consulta, "Debe seleccionar un tipo de dulce", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validar selección en el JSpinner
    if (cant.equals("0")) {
        JOptionPane.showMessageDialog(consulta, "Debe seleccionar una cantidad", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String[][] datos = modelo.consulta1(tipo, cant);
    // Actualizar los datos en el modelo de la tabla
    consulta.mt.setDataVector(datos, consulta.encabezados);
}

    public void limpiar(){
        consulta.jsCantidad.setValue(0);
        consulta.jcTipo.setSelectedIndex(0);
        String datos[][] = {{"", "", "", ""}};
        consulta.mt.setDataVector(datos, consulta.encabezados);
    }
}

