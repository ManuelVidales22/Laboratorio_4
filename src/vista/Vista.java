package vista;

import controlador.Controlador;

public interface Vista {
  
    public void iniciar(Controlador controlador);
    public void insertarDulce();
    public String getNombre();
    public String getTipo();
    public int getCantidad();
    public double getPrecio();
    
 
    public void actualizarNombresListComboboxes(); // Este metodo solo en al GUI, en la terminal no se implementa

    
}
