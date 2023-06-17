
package vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;



public class Ventana extends JFrame{

        JButton jbIngresoDatos, jbConsulta, jbAcercaDe, jbVentas;
        JLabel jlImg, jlImg1,jlImg2, jlTitu, jlBienbenidos;
        
        public Ventana(){
            
        setTitle("Inventario Dulceria");
        setSize(600, 500);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(new Color(255, 174, 204));
        Image icn = new ImageIcon(
                getClass().getResource("/imagenes/Dulceria.png")).getImage();
        setIconImage(icn);
        //setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        crearGUI();
        
        setVisible(true);
        
        }
        
        public void crearGUI() {
        
       
          
        jlTitu = new JLabel("<html>Inventario Dulceria<br></center>");
        jlTitu.setBackground(new Color(255, 116, 148));
        jlTitu.setHorizontalAlignment(JLabel.CENTER);
        jlTitu.setBounds(0, 0, 600, 60);
        //jlTitu.setBounds(0, 0, 80, 60);// este metodo sirve hubicar en la pantalla 
        jlTitu.setOpaque(true);// esto sirve para poner el fondo blanco del texto 
        //jlTitu.setBackground(Color.WHITE);
        jlTitu.setForeground(Color.WHITE);// estesirve para cambiar el color de la letra
        jlTitu.setFont(new Font("Tomaha", Font.BOLD|Font.BOLD,25)); // sirve para cambiar el tipo de letra
        
        
        add(jlTitu); 
        
        jlBienbenidos = new JLabel("<html>Bienvenidos<br></center>");
        jlBienbenidos.setBounds(300, 60, 160, 60);
        jlBienbenidos.setFont(new Font("Tomaha", Font.BOLD|Font.BOLD,25));  
        jlBienbenidos.setForeground(Color.WHITE);
        add(jlBienbenidos);
        
       
        ImageIcon ii = new ImageIcon(getClass().getResource("../imagenes/Dulceria.png"));  
        jlImg = new JLabel(ii);
        jlImg.setBounds(40, 70, 128, 128); // sirve para cetrar la imagen 
        //jlImg.setBorder(new LineBorder(Color.CYAN));
        jlImg.setToolTipText(" Endulzate la vida ");
        add(jlImg);
        
        ImageIcon iii = new ImageIcon(getClass().getResource("../imagenes/dulces.png"));
        jlImg2 = new JLabel(iii);
        jlImg2.setBounds(260, 130, 256, 256);
        add(jlImg2);
        
        jlImg1 = new JLabel("");
        jlImg1.setBounds(0, 60, 180, 160);
        jlImg1.setBackground(new Color(255, 147, 169));
        jlImg1.setOpaque(true);
        add(jlImg1);
        
        
        
        jbIngresoDatos = new JButton("Ingresar Datos");
        jbIngresoDatos.setBounds(30, 240, 150, 30);
        jbIngresoDatos.setToolTipText("Entrar");
        add(jbIngresoDatos);
            
        
        jbConsulta = new JButton("Consultar Datos");
        jbConsulta.setBounds(30, 290, 150, 30);
        jbConsulta.setToolTipText("Entrar");
        add(jbConsulta);
        
        jbVentas = new JButton("Ventas");
        jbVentas.setBounds(30, 340, 150, 30);
        jbVentas.setToolTipText("Entrar");
        add(jbVentas);
        
        
        jbAcercaDe = new JButton("Acerca De..");
        jbAcercaDe.setBounds(30, 390, 150, 30);
        jbAcercaDe.setToolTipText("Entrar");
        add(jbAcercaDe);
        
        
        }
        
    public static void main(String[] args) {
        Ventana Vn = new Ventana();
        
    }
    
}
