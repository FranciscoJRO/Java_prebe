package LambdasMas;

public class Personas {
    int edad;
    String nombre;
    int id;

    public Personas(int edad, String nombre, int id) {
        this.edad = edad;
        this.nombre = nombre;
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
