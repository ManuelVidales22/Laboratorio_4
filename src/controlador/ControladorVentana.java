package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.AcercaDe;
import vista.ConsultarDatos;
import vista.IngresarDatos;
import vista.Ventana;
import vista.Ventas;
public class ControladorVentana implements ActionListener{
    public Ventana ventana;
    public ControladorVentana(Ventana ventana) {
        this.ventana= ventana;
        this.ventana.jbAcercaDe.addActionListener(this);
        this.ventana.jbIngresoDatos.addActionListener(this);
        this.ventana.jbConsulta.addActionListener(this);
        this.ventana.jbVentas.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == ventana.jbIngresoDatos){
            IngresarDatos ingreso = new IngresarDatos(); 
            ControladorIngresar obj = new ControladorIngresar(ingreso);
            ventana.setVisible(false);
        }

        if(e.getSource() == ventana.jbConsulta){
            ConsultarDatos consultar = new ConsultarDatos(); 
            ControladorConsulta obj2 = new ControladorConsulta(consultar);
            ventana.setVisible(false);
        }

        if(e.getSource() == ventana.jbVentas){
            Ventas ventas = new Ventas(); 
            ControladorVentas obj3 = new ControladorVentas(ventas);
            ventana.setVisible(false);
        }

        if(e.getSource() == ventana.jbAcercaDe){
            AcercaDe dr = new AcercaDe(); 
            ventana.setVisible(false);
        }
    }
    
}
