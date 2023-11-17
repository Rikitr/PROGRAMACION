/**
 * 
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App{
    public static void main(String[] args){
        int i = 0;
        System.out.println("Estos son los mútiplos de 5 hasta el 100");
        while (i < 100) {
            i=i+5;
            System.out.println(i);
        }
    }
}