package clasesHijo;
import clasesPadre.Animal;
import interfaz.Mascota;
/**
 *
 * @author gaell
 */
public class Elefante extends Animal implements Mascota {
  
    public Elefante (String nombre, int edad){
    super (nombre, edad);
    }
    
    @Override
    public void hacerSonido (){
    System.out.println(nombre + "trompetea");
    }
    
    @Override 
    public void moverse () {
    System.out.println(nombre + "se revcuelca en el lodo");
    }
    
    @Override
    public void jugar () {
    System.out.println(nombre + "juega con su trompa en el agua");
    }
    
}