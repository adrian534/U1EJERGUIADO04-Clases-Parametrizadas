package clasesPadre;

/**
 *
 * @author gaell
 */



public abstract class Animal {
    protected String nombre;
    protected int edad;

    
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    
    public abstract void hacerSonido();
    public abstract void moverse();

   
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}

    