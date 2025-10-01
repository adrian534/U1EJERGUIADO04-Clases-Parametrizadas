package clasesHijo;
import clasesPadre.Animal;
import interfaz.Mascota;
/**
 *
 * @author gaell
 */
public class Canguro extends Animal implements Mascota{
    
    public Canguro (String nombre, int edad) {
      super (nombre, edad);
}
    @Override
    public void hacerSonido() {
    System.out.println(nombre + "gruñe suavemente");
    }
    
    @Override
    public void moverse () {
    System.out.println(nombre + "golpetea con sus manos");
    }
    
    @Override
    public void jugar() {
    System.out.println(nombre + "juega con su pelota");
    }
}
