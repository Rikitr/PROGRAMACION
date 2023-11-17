/**
 * 
 * Realiza un programa que pida un número por teclado y que luego muestre ese
número al revés.
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App{
    public static void main(String[] args){
        System.out.print("Introduzca un número entero: ");
        int num = Integer.parseInt(System.console().readLine());
        int calc = num;
        int volteado = 0;
        while (calc > 0) {
            volteado = (volteado * 10) + (calc % 10);
            calc /= 10;
        }
        System.out.println("Si le damos la vuelta al " + num + " tenemos el " + volteado);
    }
}