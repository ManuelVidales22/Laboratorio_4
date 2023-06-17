
package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;



public class IngresarDatos extends JFrame {
    JLabel  jlTitu,jlTitu1, jlNumIde, jlApe, jlNom, jlEdad , jlNumCelu, jlCiuRe, jlNomDulce, jlTipoDul, jlCantidad,jlprecio;
    public JTextField jtNumIde, jtNombre, jtApellido, jtEdad;
    public JTextField jtNomDulce;
    public JTextField jtTipoDul, jtCantidad, jtPrecio;
    public JTextField jtCiuRe;
    public JTextField jtNumCelu;
    public JComboBox<String> jcGenero ;
    public JRadioButton jr1, jr2, jr3;
    public JSpinner jsCantidad;
    public JButton jbGuardar, jbVolver, jbLimpiar1, jbLimpiar;
    
    public IngresarDatos(){
        
        setTitle("Datos");
        setSize(700, 500);
        getContentPane().setBackground(new Color(255, 174, 204));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        crearGUI();
        //setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setVisible(true);
    }
    
    public void crearGUI(){
        
        jlTitu =  new JLabel("Datos proveedor");
        jlTitu.setBounds(20, 10, 300, 60); 
        //jlTitulo.setOpaque(true);// esto sirve para poner el fondo blanco del texto 
        jlTitu.setForeground(Color.BLACK);
        jlTitu.setFont(new Font("Arial", Font.BOLD|Font.BOLD,15)); 
        jlTitu.setHorizontalAlignment(JLabel.CENTER);  
        add(jlTitu);
       
        
        jlNumIde =  new JLabel("Numero de idenificacion: ");
        jlNumIde.setBounds( 30 , 60, 180, 30);
        jlNumIde.setForeground(Color.WHITE);
        jlNumIde.setFont(new Font("Tomaha", Font.BOLD|Font.BOLD,13));
        add(jlNumIde);
        
        jtNumIde =  new JTextField();
        jtNumIde.setBounds( 200 , 60, 120, 30);
        jtNumIde.setBorder(null);
        add(jtNumIde);
        
        jlNom =  new JLabel("Nombre: ");
        jlNom.setBounds( 30 , 100, 180, 30);
        jlNom.setForeground(Color.WHITE);
        jlNom.setFont(new Font("Tomaha", Font.BOLD|Font.BOLD,13));
        add(jlNom);
        
        jtNombre = new JTextField();
        jtNombre.setBounds(100, 100, 170, 30);
        jtNombre.setBorder(null);
        add(jtNombre);   
        
        jlApe =  new JLabel("Apellido: ");
        jlApe.setBounds( 30 , 140, 180, 30);
        jlApe.setForeground(Color.WHITE);
        jlApe.setFont(new Font("Tomaha", Font.BOLD|Font.BOLD,13));
        add(jlApe);
        
        jtApellido = new JTextField();
        jtApellido.setBounds(100, 140, 170, 30);
        jtApellido.setBorder(null);
        add(jtApellido);
        
        jlEdad =  new JLabel("Edad: ");
        jlEdad.setBounds( 30 , 180, 180, 30);
        jlEdad.setForeground(Color.WHITE);
        jlEdad.setFont(new Font("Tomaha", Font.BOLD|Font.BOLD,13));
        add(jlEdad);
        
        jtEdad = new JTextField();
        jtEdad.setBounds(80, 180, 150, 30);
        jtEdad.setBorder(null);
        add(jtEdad);
        
        jlNumCelu =  new JLabel("Numero Telefonico: ");
        jlNumCelu.setBounds( 30 , 220, 180, 30);
        jlNumCelu.setForeground(Color.WHITE);
        jlNumCelu.setFont(new Font("Tomaha", Font.BOLD|Font.BOLD,13));
        add(jlNumCelu);
        
        jtNumCelu = new JTextField();
        jtNumCelu.setBounds(170, 220, 150, 30);
        jtNumCelu.setBorder(null);
        add(jtNumCelu);
        
        
        jcGenero = new JComboBox<>();
        jcGenero.addItem("Genero");
        jcGenero.addItem("M"); 
        jcGenero.addItem("F");
        jcGenero.setBounds(30, 260, 200, 30);  
        setResizable(false);
        
        add(jcGenero);
        
        jlCiuRe =  new JLabel("Ciudad de recidencia: ");
        jlCiuRe.setBounds( 30 , 300, 180, 30);
        jlCiuRe.setForeground(Color.WHITE);
        jlCiuRe.setFont(new Font("Tomaha", Font.BOLD|Font.BOLD,13));
        add(jlCiuRe);
        
        jtCiuRe = new JTextField();
        jtCiuRe.setBounds(180, 300, 140, 30);
        jtCiuRe.setBorder(null);
        add(jtCiuRe);
        
        ////////////////////// DATOS DULCERIA //////////////////////////////
        
        jlTitu1 =  new JLabel("Insertar Dulces");
        jlTitu1.setBounds(340, 10, 300, 60); 
        //jlTitulo.setOpaque(true);// esto sirve para poner el fondo blanco del texto 
        jlTitu1.setForeground(Color.BLACK);
        jlTitu1.setFont(new Font("Arial", Font.BOLD|Font.BOLD,15)); 
        jlTitu1.setHorizontalAlignment(JLabel.CENTER);  
        add(jlTitu1); 
        
        
        jlNomDulce =  new JLabel("Nombre del dulce: ");
        jlNomDulce.setBounds( 350 , 60, 180, 30);
        jlNomDulce.setForeground(Color.WHITE);
        jlNomDulce.setFont(new Font("Tomaha", Font.BOLD|Font.BOLD,13));
        add(jlNomDulce);
        
        jtNomDulce =  new JTextField();
        jtNomDulce.setBounds( 480 , 60, 180, 30);
        jtNomDulce.setBorder(null);
        add(jtNomDulce);
        
        
        jlTipoDul =  new JLabel(" Categoria del dulce ");
        jlTipoDul.setBounds( 420 , 100, 180, 30);
        jlTipoDul.setForeground(Color.WHITE);
        jlTipoDul.setFont(new Font("Tomaha", Font.BOLD|Font.BOLD,13));
        add(jlTipoDul);
        
        jr1 = new JRadioButton(" Dulce ");
        jr1.setBounds(360, 130, 80, 30);
        jr1.setOpaque(false);
        add(jr1);
        
        jr2 = new JRadioButton(" Acido ");
        jr2.setBounds(460, 130, 80, 30);
        jr2.setOpaque(false);
        add(jr2);
        
        jr3 = new JRadioButton(" Sin azucar ");
        jr3.setBounds( 560, 130, 100, 30);
        jr3.setOpaque(false);
        add(jr3);
        
        
        jlCantidad =  new JLabel(" Cantidad: ");
        jlCantidad.setBounds( 400 , 180, 180, 30);
        jlCantidad.setForeground(Color.WHITE);
        jlCantidad.setFont(new Font("Tomaha", Font.BOLD|Font.BOLD,13));
        add(jlCantidad);
        
        
        SpinnerNumberModel snm = new SpinnerNumberModel(0, -10, 20, 1);
        jsCantidad =  new JSpinner(snm);
        jsCantidad.setBounds(480, 180, 60, 30);
        add(jsCantidad);
        
        jlprecio =  new JLabel(" Precio: ");
        jlprecio.setBounds( 400 , 230, 180, 30);
        jlprecio.setForeground(Color.WHITE);
        jlprecio.setFont(new Font("Tomaha", Font.BOLD|Font.BOLD,13));
        add(jlprecio);
        
        
        jtPrecio =  new JTextField();
        jtPrecio.setBounds( 460 , 230, 100, 30);
        jtPrecio.setBorder(null);
        add(jtPrecio);
        
        
        
        ///////////// BOTONES //////////////////////
       
        
       jbGuardar = new JButton("Guardar");
       jbGuardar.setBounds(350, 400, 100, 30);
       add(jbGuardar);
       
       
       jbVolver =  new JButton("Volver");
       jbVolver.setBounds(230, 400, 100, 30);
       add(jbVolver); 
       
       
       jbLimpiar =  new JButton("Limpiar");
       jbLimpiar.setBounds(120, 350, 100, 30);
       add(jbLimpiar);
       
       
       jbLimpiar1 =  new JButton("Limpiar");
       jbLimpiar1.setBounds(460, 350, 100, 30);
       add(jbLimpiar1);
       
       
       
        
    }
   
    /*public static void main(String[] args) {
        IngresarDatos in =  new IngresarDatos();
    }*/

    
}
