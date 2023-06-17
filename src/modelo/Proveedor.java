package modelo;

public class Proveedor {
    private String nombre;
    private String identificacion;
    private int edad;
    private String correo;
    private String numero;
    private char sexo;
    private String ciudad;
    
    // Constructor
    public Proveedor(String nombre, String identificacion, int edad, String correo, String numero, char sexo, String ciudad) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edad = edad;
        this.correo = correo;
        this.numero = numero;
        this.sexo = sexo;
        this.ciudad = ciudad;
    }
    
   
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getIdentificacion() {
        return identificacion;
    }
    
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getCorreo() {
        return correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public char getSexo() {
        return sexo;
    }
    
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    public String getCiudad() {
        return ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}

