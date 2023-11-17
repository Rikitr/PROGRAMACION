/**
 * 
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App{
    public static void main(String[] args){
        System.out.println("Voy a mostrarte la tabla de muntiplicar del número que me pidas");
        System.out.print("Dime un número: ");
        String linea = (System.console().readLine());
        int num = Integer.parseInt(linea);
        int paso=1;
        System.out.println("La tabla de multiplicar de "+num+" es:");
        do {
            System.out.println(paso+" x "+num+" = "+(paso*num));
            paso++;
        } while (paso!=11);
    }
}