/**
 * 
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
la salvedad de que el anterior estaba limitado a números de 5 dígitos como
máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
esta manera, la única limitación en el número de dígitos la establece el tipo de
dato que se utilice (int o long).
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App{
    public static void main(String[] args){

        System.out.print("Introduzca un número entero y te diré cuántos dígitos tiene: ");
        int numeroIntroducido = Integer.parseInt(System.console().readLine());
        int n = numeroIntroducido;
        int numeroDeDigitos = 1;
        while (n > 10) {
            n = n/10;
            numeroDeDigitos++;
        }
        System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos + " dígito/s.");
    }
}
