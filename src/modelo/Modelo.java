package modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Modelo  {
    
    // Array de los dulces
    private ArrayList<Dulce> dulces = new ArrayList<Dulce>();
    // Array de los provedores
    private ArrayList<Proveedor> proveedores = new ArrayList<Proveedor>();
   
    
    // Constructor de dulces por defecto
    public Modelo(){
        
        // Dulce 1
        Dulce dulce1 = new Dulce("Frunas", "Dulce", 10, 5000);
        dulces.add(dulce1);
        
        // Dulce 2
        Dulce dulce2 = new Dulce("Gomitas", "Acido", 20, 2000);
        dulces.add(dulce2);
        
        // Dulce 3
        Dulce dulce3 = new Dulce("Tosh", "Sin azucar", 15, 3000);
        dulces.add(dulce3);

        // Proveedor 1
        Proveedor proveedor1 = new Proveedor("Carlos","123",30,"carlos@example.com","313750482",'M',"Cali");
        proveedores.add(proveedor1);

        //proveedor 2
        Proveedor proveedor2 = new Proveedor("Ana", "456", 28, "ana@example.com", "987654321", 'F', "Buga");
        proveedores.add(proveedor2);


    }
   
    // Metodo que permite agregar dulces
    public void insertarDulces(String nombreDulce, String tipoDulce, int cantidad, double precio) {
    Dulce dulce = new Dulce(nombreDulce, tipoDulce, cantidad, precio);
    dulces.add(dulce);
    }

    // Metodo que permite agregar proveedores
     public void insertarProveedor(String nombre, String identificacion, int edad, String correo, String numero, char sexo, String ciudad) {
        Proveedor proveedor = new Proveedor(nombre, identificacion, edad, correo, numero, sexo, ciudad);
        proveedores.add(proveedor);
    }

    public void listarDulces() {
        System.out.println("Lista de dulces:");
        for (Dulce dulce : dulces) {
            System.out.println(dulce.getNombre() + " - " + dulce.getTipo() + " - " + dulce.getCantidad());
        }
    }

    public void listarProveedores() {
        System.out.println("Lista de proveedores:");

        for (Proveedor proveedor : proveedores) {
            System.out.println(proveedor.getNombre());
        }
    }
    


    public void actualizarInventario(String nombreDulce, int cantidadVendida) {
    
    for (Dulce dulce : dulces) {
        if (dulce.getNombre().equalsIgnoreCase(nombreDulce)) {
            if (cantidadVendida > 0 && cantidadVendida <= dulce.getCantidad()) {
            dulce.setCantidad(dulce.getCantidad()-cantidadVendida);
            } else {
                // Manejo de error o excepción si la cantidad vendida es inválida
                System.out.println("Error: Cantidad vendida inválida para el dulce ");
            }
                break;
        }
    }
}

public void actualizarInventarioEnSegundoPlano(String nombreDulce, int cantidadVendida) {
        Thread thread = new Thread(() -> {
            // Mostrar mensaje al entrar en el subproceso
            JOptionPane.showMessageDialog(null, "Subproceso Actualizar");
            actualizarInventario(nombreDulce, cantidadVendida);
            JOptionPane.showMessageDialog(null, "Subproceso Listar");
            listarDulces();
        });
        thread.start();
    }

 
}

