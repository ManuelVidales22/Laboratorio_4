
package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import javax.swing.border.EtchedBorder;


public class ConsultarDatos extends JFrame{
    
    public JLabel jlTitu1, jlTitu2, jlCantidad, jlEdad;
    public JTextField jtEdad;
    public JTable tabla;
    public JButton regresar;
    public char tipo;
    public JComboBox<String> jcTipo, jcGenero ;
    public JSpinner jsCantidad;
    public JTextArea jtCampo;
    public JButton  jbConsultar, jbVolver, jbLimpiar;
    
    
    public ConsultarDatos(){
        
        setTitle("Listados");
        setSize(600, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(new Color(255, 147, 169));
        //setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Image icn = new ImageIcon(
                getClass().getResource("/imagenes/Dulceria.png")).getImage();
        setIconImage(icn);

        crearGUI();
        
        

        setVisible(true);
    }
    private void crearGUI() {
        JLabel jl = new JLabel("  Listado de Consultas");
        jl.setBounds(0, 0, 600, 50);
        jl.setBorder(null);
        jl.setHorizontalAlignment(JLabel.CENTER);
        jl.setBorder(new EtchedBorder());
        jl.setOpaque(true);
        jl.setBackground(Color.WHITE);
        jl.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(jl);
        
        jlTitu1 =  new JLabel("Consulta de datos #1");
        jlTitu1.setBounds(140, 40, 300, 60); 
        //jlTitulo.setOpaque(true);// esto sirve para poner el fondo blanco del texto 
        jlTitu1.setForeground(Color.BLACK);
        jlTitu1.setFont(new Font("Arial", Font.BOLD|Font.BOLD,20)); 
        jlTitu1.setHorizontalAlignment(JLabel.CENTER);  
        add(jlTitu1);
        
        jcTipo = new JComboBox<>();
        jcTipo.addItem("Tipo Dulce");
        jcTipo.addItem(""); 
        jcTipo.addItem("");
        jcTipo.setBounds(80, 90, 200, 30);  
        setResizable(false);
        
        add(jcTipo);
        
        jlCantidad =  new JLabel(" Cantidad: ");
        jlCantidad.setBounds( 330 , 90, 180, 30);
        jlCantidad.setForeground(Color.WHITE);
        jlCantidad.setFont(new Font("Tomaha", Font.BOLD|Font.BOLD,13));
        add(jlCantidad);
        
        SpinnerNumberModel snm = new SpinnerNumberModel(0, -10, 20, 1);
        jsCantidad =  new JSpinner(snm);
        jsCantidad.setBounds(400, 90, 60, 30);
        add(jsCantidad);
        
        
        jlTitu2 =  new JLabel("Consulta de datos #2");
        jlTitu2.setBounds(140, 110, 300, 60); 
        //jlTitulo.setOpaque(true);// esto sirve para poner el fondo blanco del texto 
        jlTitu2.setForeground(Color.BLACK);
        jlTitu2.setFont(new Font("Arial", Font.BOLD|Font.BOLD,20)); 
        jlTitu2.setHorizontalAlignment(JLabel.CENTER);  
        add(jlTitu2);
        
        jlEdad =  new JLabel("Edad: ");
        jlEdad.setBounds( 170 , 160, 180, 30);
        jlEdad.setForeground(Color.WHITE);
        jlEdad.setFont(new Font("Tomaha", Font.BOLD|Font.BOLD,13));
        add(jlEdad);
        
        jtEdad = new JTextField();
        jtEdad.setBounds(210, 160, 60, 30);
        jtEdad.setBorder(null);
        add(jtEdad);
        
        
        jcGenero = new JComboBox<>();
        jcGenero.addItem("Genero");
        jcGenero.addItem("M"); 
        jcGenero.addItem("F");
        jcGenero.setBounds(310, 160, 120, 30);  
        setResizable(false);
        
        add(jcGenero);
        
        
       jtCampo = new JTextArea();
       jtCampo.setBorder(null);
       jtCampo.setLineWrap(true);
       jtCampo.setWrapStyleWord(true);
       jtCampo.setEditable(false);               //Bloquea El TEXTAREA
       JScrollPane js = new JScrollPane(jtCampo);        
       js.setBounds(70, 200, 450, 200);
       add(js);
       
        /////////////////// BOTONES /////////////////////
        
       jbConsultar = new JButton("Consultar");
       jbConsultar.setBounds(370, 420, 100, 30);
       add(jbConsultar);
       
       
       jbLimpiar =  new JButton("Limpiar");
       jbLimpiar.setBounds(250, 420, 100, 30);
       add(jbLimpiar); 
       
       jbVolver =  new JButton("Volver");
       jbVolver.setBounds(120, 420, 100, 30);
       add(jbVolver);

        
        
    }
    public static void main(String[] args) {
       ConsultarDatos dt = new ConsultarDatos();
    }
    
}
