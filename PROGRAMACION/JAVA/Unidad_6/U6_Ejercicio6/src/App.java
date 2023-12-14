/**
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,
el programa dirá cuántas oportunidades quedan y si el número introducido es
menor o mayor que el número secreto.
 * 
 * @author Ricardo Troyano Ostios
 */
public class App {
    public static void main(String[] args) {
        System.out.println("-------Adivina el número del 0 al 100, tienes 5 intentos-------");
        int key = (int)(Math.random()*100);
        int tries = 1;
        int num;
        int fin = 0;
        do {
            System.out.println(tries+"º Intento:");
            do {
                System.out.print("Introduce un número: ");
                num = Integer.parseInt(System.console().readLine());
                if (num < 0 || num > 100) {
                    System.out.println("Escribe un número entre 0 y 100.");
                }
            } while (num < 0 || num > 100);
            if (tries != 5) {
                if (num < key) {
                System.out.println("El número secreto es mayor que "+num);
                } 
                if (num > key) {
                    System.out.println("El número secreto es menor que "+num);
                }
                if (num == key) {
                    System.out.println("¡ENHORABUENA! Has acertado el número");
                    fin++;
                }
            }
            tries++;
        } while (fin < 1 && tries<=5);
        if (tries == 6) {
            System.out.println("Lo siento, has perdido, el número secreto era "+key);
        }
    }
}