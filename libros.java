package Clasehijo;
import Clasespadre.Producto;
/**
 *
 * @author gaell
 */
public class Libros extends Producto {
    public Libros (String nombre, float precio, Object informacion) {
    super (nombre, precio, informacion);
    }
    
    @Override
    public void mostrarDetalles() {
    System.out.println("libros" + getNombre() + "Precio: " + getPrecio()
          + "Informacion" + getInfomacion());}
    
}
