package Clasespadre;

/**
 *
 * @author gaell
 * 
 */
public abstract class Producto<T> { 
   final private String nombre;
    final private float precio;
    final private T infomacion;

    public Producto(String nombre, float precio, T infomacion) {
        this.nombre = nombre;
        this.precio = precio;
        this.infomacion = infomacion;
    }
 
    public String getNombre() {
        return nombre;
    }


    public float getPrecio() {
        return precio;
    }

    public T getInfomacion() {
        return infomacion;
    }

    public abstract void mostrarDetalles();
}

   

