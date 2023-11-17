/**
 * 
 * Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle
do-while.
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App{
    public static void main(String[] args){
        System.out.println("Números del 320 al 160 de 20 en 20:");
        int i=320;
        do {
            System.out.println(i);
            i-=20;
        } while (i>=160);
    }
}