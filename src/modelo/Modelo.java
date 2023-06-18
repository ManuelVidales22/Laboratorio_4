package modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import vista.ConsultarDatos;
import java.io.FileWriter;
import java.io.IOException;

public class Modelo  {
    
    // Array de los dulces
    private ArrayList<Dulce> dulces = new ArrayList<Dulce>();
    // Array de los provedores
    private ArrayList<Proveedor> proveedores = new ArrayList<Proveedor>();

    
   
    
    // Constructor de dulces por defecto
    public Modelo(){
        
        // Dulce 1
        Dulce dulce1 = new Dulce("Frunas", "Dulce", 2, 5000);
        dulces.add(dulce1);
        
        // Dulce 2
        Dulce dulce2 = new Dulce("Gomitas", "Acido", 4, 2000);
        dulces.add(dulce2);
        
        // Dulce 3
        Dulce dulce3 = new Dulce("Tosh", "Sin azucar", 6, 3000);
        dulces.add(dulce3);

        // Dulce 4
        Dulce dulce4 = new Dulce("Chocoso", "Dulce", 2, 8000);
        dulces.add(dulce4);

        // Proveedor 1
        Proveedor proveedor1 = new Proveedor("123","Ana","Perez",22,"313",'F',"Cali");
        proveedores.add(proveedor1);

        //proveedor 2
        Proveedor proveedor2 = new Proveedor("987","Javier","Sanchez",50,"318",'M',"Buga");
        proveedores.add(proveedor2);


    }
    


    // Metodo que permite agregar dulces
public void insertarDulces(String nombreDulce, String tipoDulce, int cantidad, double precio) {
    Dulce dulce = new Dulce(nombreDulce, tipoDulce, cantidad, precio);
    dulces.add(dulce);
    
    
}
//Metodo listar Proveedores
public void listarProveedores() {
    System.out.println("Lista de proveedores:");

    // Encabezados de columna
    System.out.println("-------------------------------------------------------------------------------------------------");
    System.out.printf("| %-5s | %-15s | %-10s | %-20s | %-10s | %-5s | %-10s |\n",
            "ID", "Nombre", "Apellido", "Edad", "Número", "Sexo", "Ciudad");
    System.out.println("-------------------------------------------------------------------------------------------------");

    for (Proveedor proveedor : proveedores) {
        String id = proveedor.getIdentificacion();
        String nombre = proveedor.getNombre();
        String apellido = proveedor.getApellido();
        int edad = proveedor.getEdad();
        String numero = proveedor.getNumero();
        char sexo = proveedor.getSexo();
        String ciudad = proveedor.getCiudad();

        System.out.printf("| %-5s | %-15s | %-10s | %-20d | %-10s | %-5s | %-10s |\n",
                id, nombre, apellido, edad, numero, sexo, ciudad);
    }
    System.out.println("-------------------------------------------------------------------------------------------------");
}


//Metodo listar Dulces
public void listarDulces() {
    System.out.println("Lista de dulces:");

    // Encabezados de columna
    System.out.println("------------------------------------------------");
    System.out.printf("| %-15s | %-15s | %-8s |\n",
            "Nombre", "Tipo", "Cantidad");
    System.out.println("------------------------------------------------");

    for (Dulce dulce : dulces) {
        String nombre = dulce.getNombre();
        String tipo = dulce.getTipo();
        int cantidad = dulce.getCantidad();

        System.out.printf("| %-15s | %-15s | %-8d |\n",
                nombre, tipo, cantidad);
    }
    System.out.println("------------------------------------------------");

    // Obtener los nombres de los dulces en un arreglo
    String[] nombresDulces = new String[dulces.size()];
    int index = 0;

    for (Dulce dulce : dulces) {
        nombresDulces[index] = dulce.getNombre();
        index++;
    }

    
}

public ComboBoxModel<String> getNombresDulces() {
    DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();

    for (Dulce dulce : dulces) {
        comboBoxModel.addElement(dulce.getNombre());
    }

    return comboBoxModel;
}


public String[][] consulta1(String tipo, String cantidad) {
        ArrayList<String[]> resultados = new ArrayList<>();
        boolean existe = false;

        for (Dulce dulce : dulces) {
            if (dulce.getTipo().equals(tipo) && String.valueOf(dulce.getCantidad()).equals(cantidad)) {
                String[] fila = {dulce.getNombre(), dulce.getTipo(), String.valueOf(dulce.getCantidad()), String.valueOf(dulce.getPrecio())};
                resultados.add(fila);
                existe = true;
            }
        }

        if (existe) {
            JOptionPane.showMessageDialog(null, "Se encontraron datos.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        String[][] datos = new String[resultados.size()][4];
        for (int i = 0; i < resultados.size(); i++) {
            datos[i] = resultados.get(i);
        }

        return datos;
    }





    // Metodo que permite agregar proveedores
public void insertarProveedor(String identificacion, String nombre, String apellido ,int edad, String numero, char sexo, String ciudad) {
        Proveedor proveedor = new Proveedor(identificacion, nombre, apellido,edad, numero, sexo, ciudad);
        proveedores.add(proveedor);
    }

    //Metodo de facturar
public String facturar() {
    StringBuilder sb = new StringBuilder();

    sb.append("Facturar:\n");
    sb.append("------------------------------------------------\n");
    sb.append(String.format("| %-15s | %-15s | %-8s |\n",
            "Nombre", "Tipo", "Cantidad"));
    sb.append("------------------------------------------------\n");

    for (Dulce dulce : dulces) {
        String nombre = dulce.getNombre();
        String tipo = dulce.getTipo();
        int cantidad = dulce.getCantidad();

        sb.append(String.format("| %-15s | %-15s | %-8d |\n",
                nombre, tipo, cantidad));
    }
    sb.append("------------------------------------------------\n");

    // Obtener los nombres de los dulces en un arreglo
    String[] nombresDulces = new String[dulces.size()];
    int index = 0;

    for (Dulce dulce : dulces) {
        nombresDulces[index] = dulce.getNombre();
        index++;
    }

    return sb.toString();
}


// Metodo generar factura
public void generarFactura() {
    String contenidoFactura = facturar();

    try (FileWriter fileWriter = new FileWriter("factura.txt")) {
        fileWriter.write(contenidoFactura);
        System.out.println("Archivo de factura generado exitosamente.");
    } catch (IOException e) {
        System.out.println("Error al generar el archivo de factura: " + e.getMessage());
    }
}






    


public void actualizarInventario(String nombreDulce, int cantidadVendida) {
    
    for (Dulce dulce : dulces) {
        if (dulce.getNombre().equalsIgnoreCase(nombreDulce)) {
            if (cantidadVendida > 0 && cantidadVendida <= dulce.getCantidad()) {
            dulce.setCantidad(dulce.getCantidad()-cantidadVendida);
            } else {
                // Manejo de error o excepción si la cantidad vendida es inválida
                JOptionPane.showMessageDialog(null,"Error: Cantidad vendida inválida para el dulce", "Error", JOptionPane.ERROR_MESSAGE);

            }
                break;
        }
    }
}

public void actualizarInventarioEnSegundoPlano() {
    Thread thread = new Thread(() -> {
        // Mostrar mensaje al entrar en el subproceso
        

        // Obtener el orden aleatorio para ejecutar los métodos
        List<Runnable> metodos = Arrays.asList(
            () -> {
                JOptionPane.showMessageDialog(null, "Subproceso Listar", "Advertencia", JOptionPane.WARNING_MESSAGE);
                listarDulces();
            },
            () -> {
                JOptionPane.showMessageDialog(null, "Subproceso Generar txt", "Advertencia", JOptionPane.WARNING_MESSAGE);
                generarFactura();
            }
        );
        Collections.shuffle(metodos);

        // Ejecutar los métodos en el orden aleatorio
        for (Runnable metodo : metodos) {
            metodo.run();
        }
    });
    thread.start();
}

    public void listarensegundoplano() {
    Thread thread = new Thread(() -> {
        // Mostrar mensaje al entrar en el subproceso
        System.out.println("Subproceso en ejecución");

        // Obtener el orden aleatorio para ejecutar los métodos
        List<Runnable> metodos = Arrays.asList(this::listarDulces, this::listarProveedores);
        Collections.shuffle(metodos);

        // Ejecutar los métodos en el orden aleatorio
        for (Runnable metodo : metodos) {
            metodo.run();
        }

        // Mostrar mensajes al finalizar los métodos
        JOptionPane.showMessageDialog(null, "Subproceso listar dulces", "Advertencia", JOptionPane.WARNING_MESSAGE);

        JOptionPane.showMessageDialog(null, "Subproceso listar proveedores", "Advertencia", JOptionPane.WARNING_MESSAGE);

        System.out.println("Subproceso finalizado");
    });
    thread.start();
}



 
}

