package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

import vista.IngresarDatos;
import vista.Ventana;
import modelo.Modelo;
public class ControladorIngresar implements ActionListener {
    public IngresarDatos ingresar;

    Modelo m = new Modelo();

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
            insertar(); 
        } else if (e.getSource() == ingresar.jbVolver) {
            System.out.println("Se presionó el botón Volver");
            Ventana ventana = new Ventana();
            ControladorVentana menu = new ControladorVentana(ventana);
            ingresar.setVisible(false);
            // Lógica para volver a la ventana anterior
        } else if (e.getSource() == ingresar.jbLimpiar) {
            System.out.println("Se presionó el botón Limpiar");
            limpiar();
            // Lógica para limpiar los campos de entrada
        } else if (e.getSource() == ingresar.jbLimpiar1) {
            System.out.println("Se presionó el botón Limpiar 1");
            limpiar1();
            // Lógica para limpiar otros elementos
        }
    }
    public void insertar() {
    // Lógica para guardar los datos del proveedor
    String numId = ingresar.jtNumIde.getText();
    String nombre = ingresar.jtNombre.getText();
    String apellido = ingresar.jtApellido.getText();
    String edadStr = ingresar.jtEdad.getText();
    String ciuRe = ingresar.jtCiuRe.getText();
    String numCelu = ingresar.jtNumCelu.getText();
    char genero = ingresar.jcGenero.getSelectedItem().toString().charAt(0);

    // Lógica para guardar los datos del dulce
    String nomDulce = ingresar.jtNomDulce.getText();
    String precioStr = ingresar.jtPrecio.getText();
    int cant = (int) ingresar.jsCantidad.getValue();
    String tipo = "";
    
    if (ingresar.jr1.isSelected()) {
        tipo = "Dulce";
    } else if (ingresar.jr2.isSelected()) {
        tipo = "Acido";
    } else if (ingresar.jr3.isSelected()) {
        tipo = "Sin azucar";
    }
    
    // Validar que se hayan ingresado todos los datos requeridos
    if (numId.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || edadStr.isEmpty() ||
        ciuRe.isEmpty() || numCelu.isEmpty() || precioStr.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Error: Faltan datos por ingresar", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Salir del método sin continuar
    }
    
    try {
        int edad = Integer.parseInt(edadStr);
        double precio = Double.parseDouble(precioStr);

        m.insertarDulces(nomDulce, tipo, cant, precio);
        m.insertarProveedor(nombre, apellido, edad, numCelu, numId, genero, ciuRe);
        //pruebas
        m.listarProveedores();
        m.listarDulces();

        JOptionPane.showMessageDialog(null, "Se agregaron datos con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Error: Datos numéricos inválidos", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    public void limpiar(){
        ingresar.jtNumIde.setText("");
        ingresar.jtNombre.setText("");
        ingresar.jtApellido.setText("");
        ingresar.jtEdad.setText("");
        ingresar.jtCiuRe.setText("");
        ingresar.jtNumCelu.setText("");
        ingresar.jcGenero.removeAllItems();
        ingresar.jcGenero.addItem("Genero");
    }
    public void limpiar1() {
    ingresar.jtNomDulce.setText("");
    ingresar.jtPrecio.setText("");
    ingresar.jsCantidad.setValue(0);
    ButtonGroup buttonGroup = new ButtonGroup();
    buttonGroup.add(ingresar.jr1);
    buttonGroup.add(ingresar.jr2);
    buttonGroup.add(ingresar.jr3);
    buttonGroup.clearSelection();
}


    
}

