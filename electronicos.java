package Clasehijo;
import Clasespadre.Producto;

/**
 *
 * @author gaell
 */
public class Electronicos extends Producto  {
    public Electronicos (String nombre, float precio, Object informacion){
    super (nombre, precio, informacion);
    }
    
  @Override
  public void mostrarDetalles() {
  System.out.println("electronico"+ getNombre() + "Precio: " + getPrecio()
          + "Informacion" + getInfomacion());
  }
    
}
