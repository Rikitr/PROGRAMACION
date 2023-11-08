/**
 * 
 * Escribe un programa que diga cuál es la última cifra de un número entero
introducido por teclado.
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App{
    public static void main(String[] args){
        System.out.print("Por favor, introduzca un número entero: ");
        int num = Integer.parseInt(System.console().readLine());
        System.out.println("La última cifra del número introducido es el " + (num % 10));
    }
}