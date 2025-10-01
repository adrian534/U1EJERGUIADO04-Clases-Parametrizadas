package clasesHijo;
import clasesPadre.Animal;
import interfaz.Mascota;
/**
 *
 * @author gaell
 */


public class Ballena extends Animal implements Mascota {

    public Ballena(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " canta en ballena");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " nada en el océano");
    }
    
    @Override 
    public void jugar() {
       System.out.println(nombre + "esta jugando en el mar");
    }
}
