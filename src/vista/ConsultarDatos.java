
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
import javax.swing.JTable;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import javax.swing.border.EtchedBorder;


public class ConsultarDatos extends JFrame{
    
    public JLabel jlTitu1, jlTitu2;
    public JTable tabla;
    public JButton regresar;
    public char tipo;
    public JComboBox<String> jcBucar1, jbBuscar2 ;
    public ConsultarDatos(){
        
        setTitle("Listados");
        setSize(600, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(new Color(255, 147, 169));
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
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
        
        jlTitu1 =  new JLabel("Consulta 1");
        jlTitu1.setBounds(30, 40, 300, 60); 
        //jlTitulo.setOpaque(true);// esto sirve para poner el fondo blanco del texto 
        jlTitu1.setForeground(Color.BLACK);
        jlTitu1.setFont(new Font("Arial", Font.BOLD|Font.BOLD,20)); 
        jlTitu1.setHorizontalAlignment(JLabel.CENTER);  
        add(jlTitu1);
        
        jlTitu2 =  new JLabel("Consulta 2");
        jlTitu2.setBounds(260, 40, 300, 60); 
        //jlTitulo.setOpaque(true);// esto sirve para poner el fondo blanco del texto 
        jlTitu2.setForeground(Color.BLACK);
        jlTitu2.setFont(new Font("Arial", Font.BOLD|Font.BOLD,20)); 
        jlTitu2.setHorizontalAlignment(JLabel.CENTER);  
        add(jlTitu2);
        
        
       

        

        
        
    }
    public static void main(String[] args) {
       ConsultarDatos dt = new ConsultarDatos();
    }
    
}
