/**
 * 
 * Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios.
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App{
    public static void main(String[] args){
        System.out.println("Voy a mostrar 20 números aleatorios entre 0 y 10 incluidos.");
        int cont = 0;
        do {
            System.out.print((int)(Math.random()*11)+" ");
            cont++;
            } while (cont<20);
    }
}