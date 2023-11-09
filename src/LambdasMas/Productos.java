package LambdasMas;
public class Productos {
    int id;
    String nombre;
    int precios;

    public Productos(int id, String nombre, int precios) {
        this.id = id;
        this.nombre = nombre;
        this.precios = precios;
    }

   public void setId(int id) {
       this.id = id;
   }

   public int getId() {
       return id;
   }

   public void setNombre(String nombre) {
       this.nombre = nombre;
   }
   public String getNombre() {
       return nombre;
   }
   public void setPrecios(int precios) {
       this.precios = precios;
   }
   public int getPrecios() {
       return precios;
   }
    @Override
    public String toString() {
        return "Productos{" + "id=" + id + ", nombre=" + nombre + ", precios=" + precios + '}';
    }
}
