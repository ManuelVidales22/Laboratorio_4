package modelo;

public class Proveedor {

    private String identificacion;
    private String nombre;
    private String apellido;
    private int edad;
    private String numero;
    private char sexo;
    private String ciudad;

    
    // Constructor
public Proveedor(String identificacion, String nombre, String apellido ,int edad, String numero, char sexo, String ciudad) {
    this.identificacion = identificacion;
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
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




    public String getApellido() {
        return apellido;
    }




    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}

