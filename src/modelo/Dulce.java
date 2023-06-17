package modelo;

public class Dulce {
    private String nombre;
    private String tipo;
    private int cantidad;
    private double precio;
    
    // Constructor
    public Dulce(String nombre, String tipo, int cantidad, double precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

