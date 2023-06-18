package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.AcercaDe;
import vista.ConsultarDatos;
import vista.IngresarDatos;
import vista.Ventana;
import vista.Ventas;
public class ControladorVentana implements ActionListener{
    public Ventana ventana;
    public Modelo modelo;
    public Ventas ventas;
    public ControladorVentana(Ventana ventana, Modelo modelo, Ventas ventas) {
        this.ventana= ventana;
        this.modelo= modelo;
        this.ventas= ventas;
        this.ventana.jbAcercaDe.addActionListener(this);
        this.ventana.jbIngresoDatos.addActionListener(this);
        this.ventana.jbConsulta.addActionListener(this);
        this.ventana.jbVentas.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == ventana.jbIngresoDatos){
            IngresarDatos ingreso = new IngresarDatos(); 
            ControladorIngresar obj = new ControladorIngresar(ingreso,modelo, ventas);
            ventana.setVisible(false);
        }

        if(e.getSource() == ventana.jbConsulta){
            ConsultarDatos consultar = new ConsultarDatos(); 
            ControladorConsulta obj2 = new ControladorConsulta(consultar,modelo,ventas);
            //consultar.jcTipo.setModel(new javax.swing.DefaultComboBoxModel<>(modelo.listarDulces()));
            //modelo.agregarNombresDulcesAlComboBox(consultar.jcTipo);
            ventana.setVisible(false);
        }

        if(e.getSource() == ventana.jbVentas){
            Ventas ventas = new Ventas(); 
            ControladorVentas obj3 = new ControladorVentas(ventas,modelo);
            ventas.jcNomProd.setModel(modelo.getNombresDulces());
            modelo.listarDulces();
            ventas.setVisible(true);
            ventana.setVisible(false);
        }

        if(e.getSource() == ventana.jbAcercaDe){
            AcercaDe dr = new AcercaDe(); 
            ventana.setVisible(false);
            
        }
    }


}

    
        
        
    
    

