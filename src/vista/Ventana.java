
package vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;


public class Ventana extends JFrame{

        JButton jbIngresoDatos, jbConsulta, jbAcercaDe;
        JLabel jlImg, jlImg1, jlTitu;
        
        public Ventana(){
            
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
        
        jbIngresoDatos = new JButton("ENTRAR");
        jbIngresoDatos.setBounds(250, 520, 100, 30);
        jbIngresoDatos.setToolTipText("Entrar");
        //jbEntrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        //jbEntrar.addActionListener(lc);
        //add(jbEntrar);
            
        }
        
    public static void main(String[] args) {
        Ventana Vn = new Ventana();
        
    }
    
}
