
package ejercicio2;

/**
 *
 * @author dark_
 */
public class Main {

  
    public static void main(String[] args) {
       Lavadora lavadora = new Lavadora();
        System.out.println("Lavadora");
        lavadora.crearLavadora();
        lavadora.precioFinal();
        System.out.println(lavadora);
       Televisor televisor=new Televisor();
        System.out.println("Televisor");
        televisor.crearTelevisor();
        televisor.precioFinal();
        System.out.println(televisor);
    }
    
}
