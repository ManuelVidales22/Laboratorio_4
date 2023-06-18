package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Modelo;
import vista.Ventana;
import vista.Ventas;

public class ControladorVentas implements ActionListener {
    public Ventas ventas;
    public Modelo modelo;
    

    public ControladorVentas(Ventas ventas, Modelo modelo) {
        this.ventas = ventas;
        this.modelo = modelo;
        this.ventas.jbGuardar.addActionListener(this);
        this.ventas.jbVolver.addActionListener(this);
        this.ventas.jbLimpiar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ventas.jbGuardar) {
            System.out.println("Se presionó el botón guardar");
            // Lógica para agregar un producto a la venta
            vender();
        } else if (e.getSource() == ventas.jbLimpiar) {
            System.out.println("Se presionó el botón limpiar");
            ventas.jsCantidad.setValue(0);
            ventas.jcNomProd.setSelectedIndex(0);
            ventas.jtCampo.setText(" ");
            // Lógica para realizar la venta
        } else if (e.getSource() == ventas.jbVolver) {
            System.out.println("Se presionó el botón volver");
            Ventana ventana = new Ventana();
            
            ControladorVentana menu = new ControladorVentana(ventana,modelo,ventas);
            ventas.setVisible(false);
            
        } 
    }

    public void vender() {
    String tipo = ventas.jcNomProd.getSelectedItem().toString();
    int cant = (int) ventas.jsCantidad.getValue();

    // Validar selección en el JComboBox
    if (tipo.isEmpty()) {
        JOptionPane.showMessageDialog(ventas, "Debe seleccionar un producto", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    // Validar selección en el JSpinner
    if (cant==0) {
        JOptionPane.showMessageDialog(ventas, "Debe seleccionar una cantidad", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    modelo.actualizarInventarioEnSegundoPlano();
    modelo.actualizarInventario(tipo, cant);
    ventas.jtCampo.setText(modelo.facturar());
    

}


}

