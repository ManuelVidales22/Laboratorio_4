

package vista;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AcercaDe extends JFrame implements ActionListener{

    public JButton jbcerrar;
    public JLabel jlImg;
    
    public AcercaDe(){
        
        
        setSize(400, 400);
        setLocationRelativeTo(null);
        setLayout(null);
        crearGUI();
        
        setVisible(true);
        
    }
        
    private void crearGUI() {
        
        setTitle("Acerca De...");
        ImageIcon ii = new ImageIcon(getClass().getResource("../imagenes/oso.png"));  
        jlImg = new JLabel(ii);
        jlImg.setBounds(160, 20, 70, 70); 
        jlImg.setToolTipText(" MANUEL ");
        add(jlImg);
        
                  
        JLabel jl = new JLabel("Manuel Antonio Vidales Duran");
        jl.setBounds(90, 50, 200, 100);
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        add(jl);
        
        JLabel j2 = new JLabel("Codigo: 202155481");
        j2.setBounds(90, 70, 200, 100);
        j2.setHorizontalAlignment(SwingConstants.CENTER);
        add(j2);
        
        JLabel j3 = new JLabel("manuel.vidales@correouni..");
        j3.setBounds(90, 90, 200, 100);
        j3.setHorizontalAlignment(SwingConstants.CENTER);
        add(j3);
        
        
        JLabel j7 = new JLabel("Versión App: ");
        j7.setBounds(90, 130, 200, 100);
        j7.setHorizontalAlignment(SwingConstants.CENTER);
        add(j7);
        
        
        jbcerrar = new JButton("Cerrar");
        jbcerrar.setBounds(100, 200, 200, 30);
        add(jbcerrar);
        jbcerrar.addActionListener(this);
        
    }
 
    /*public static void main(String[] args) {
        AcercaDe Ac = new AcercaDe();
        
    
}*/

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbcerrar) {
            JOptionPane.showMessageDialog(null, "Gracias por utilizar mi aplicación");
            setVisible(false);
        }
    }
}
    


    
    

