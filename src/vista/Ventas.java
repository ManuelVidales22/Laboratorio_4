
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
import javax.swing.JTextArea;
import javax.swing.SpinnerNumberModel;


public class Ventas extends JFrame {
    
    
    public JButton jbLimpiar, jbGuardar, jbVolver;
    public JLabel jlImg, jlImg1, jlTitu, jlVentas, jlNomprod,jlCantidad;
    public JComboBox<String> jcNomProd ;
    public JSpinner jsCantidad;
    public JTextArea jtCampo;
    
    
    //Constructor de JFrame    
    public Ventas(){
        
        setTitle("Ventas");
        setSize(600, 500);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(new Color(255, 174, 204));
        Image icn = new ImageIcon(
                getClass().getResource("/imagenes/Dulceria.png")).getImage();
        setIconImage(icn);
        //setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        crearGUI();
        
        //setVisible(true);
    }
    
    // GUI PRINCIPAL 
    public void crearGUI() {
        
       
          
        jlTitu = new JLabel("<html>Ventas de dulces<br></center>");
        jlTitu.setBackground(new Color(255, 116, 148));
        jlTitu.setHorizontalAlignment(JLabel.CENTER);
        jlTitu.setBounds(0, 0, 600, 60);
        //jlTitu.setBounds(0, 0, 80, 60);// este metodo sirve hubicar en la pantalla 
        jlTitu.setOpaque(true);// esto sirve para poner el fondo blanco del texto 
        //jlTitu.setBackground(Color.WHITE);
        jlTitu.setForeground(Color.BLACK);// estesirve para cambiar el color de la letra
        jlTitu.setFont(new Font("Tomaha", Font.BOLD|Font.BOLD,25)); // sirve para cambiar el tipo de letra
        
        
        add(jlTitu); 
        
        jlVentas = new JLabel("<html>Ventas<br></center>");
        jlVentas.setBounds(350, 60, 160, 60);
        jlVentas.setFont(new Font("Tomaha", Font.BOLD|Font.BOLD,25));  
        jlVentas.setForeground(Color.BLACK);
        add(jlVentas);
        
       
        ImageIcon ii = new ImageIcon(getClass().getResource("../imagenes/bananas.png"));  
        jlImg = new JLabel(ii);
        jlImg.setBounds(40, 70, 128, 128); // sirve para cetrar la imagen 
        //jlImg.setBorder(new LineBorder(Color.CYAN));
        jlImg.setToolTipText(" Endulzate la vida ");
        add(jlImg);
        
        
        jlImg1 = new JLabel("");
        jlImg1.setBounds(0, 60, 180, 160);
        jlImg1.setBackground(new Color(255, 147, 169));
        jlImg1.setOpaque(true);
        add(jlImg1);
        
        jlNomprod =  new JLabel(" Nombre productos: ");
        jlNomprod.setBounds( 220 , 120, 180, 30);
        jlNomprod.setForeground(Color.WHITE);
        jlNomprod.setFont(new Font("Tomaha", Font.BOLD|Font.BOLD,13));
        
        add(jlNomprod);
        
        jcNomProd = new JComboBox<>();
        jcNomProd.addItem("Tipos de Dulces");
        jcNomProd.addItem(""); 
        jcNomProd.addItem("");
        jcNomProd.setBounds(350, 120, 200, 30);  
        setResizable(false);
        
        add(jcNomProd);
        
        jlCantidad =  new JLabel(" Cantidad de producto: ");
        jlCantidad.setBounds( 220 , 160, 180, 30);
        jlCantidad.setForeground(Color.WHITE);
        jlCantidad.setFont(new Font("Tomaha", Font.BOLD|Font.BOLD,13));
        add(jlCantidad);
        
        
        SpinnerNumberModel snm = new SpinnerNumberModel(0, -10, 20, 1);
        jsCantidad =  new JSpinner(snm);
        jsCantidad.setBounds(370, 160, 60, 30);
        add(jsCantidad);
        
       jtCampo = new JTextArea();
       jtCampo.setBorder(null);
       jtCampo.setLineWrap(true);
       jtCampo.setWrapStyleWord(true);
       jtCampo.setEditable(false);               //Bloquea El TEXTAREA
       JScrollPane js = new JScrollPane(jtCampo);        
       js.setBounds(210, 200, 350, 200);
       add(js);
        
        
        ////////////////// BOTONES /////////////////////////////
        jbLimpiar = new JButton("Limpiar");
        jbLimpiar.setBounds(30, 240, 150, 30);
        jbLimpiar.setToolTipText("Entrar");
        add(jbLimpiar);
       
            
        
        jbGuardar = new JButton("Guardar");
        jbGuardar.setBounds(30, 290, 150, 30);
        jbGuardar.setToolTipText("Entrar");
        add(jbGuardar);
        
        
        jbVolver = new JButton("Volver");
        jbVolver.setBounds(30, 340, 150, 30);
        jbVolver.setToolTipText("Entrar");
        add(jbVolver);
        
        }

    

       
    
    
    
    /*public static void main(String[] args) {
        Ventas vn = new Ventas();
    }*/
    
}
