/**
 * 
 * Escribe un programa que ordene tres números enteros introducidos por teclado.
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App{
    public static void main(String[] args){
        int aux;
        System.out.println("Voy a ordenar tres números introducidos por teclado.");
        System.out.println("Vaya introduciendo los tres números y pulsando INTRO:");
        int a = Integer.parseInt(System.console().readLine());
        int b = Integer.parseInt(System.console().readLine());
        int c = Integer.parseInt(System.console().readLine());
        if (a > b) {
            aux = a;
            a = b;
            b = aux;
        }
        if (b > c) {
            aux = b;
            b = c;
            c = aux;
        }
        if (a > b) {
            aux = a;
            a = b;
            b = aux;
        }
        System.out.println("Los números introducidos ordenados de menor a mayor son "+a+", "+b+" y "+c+".");
    }
}