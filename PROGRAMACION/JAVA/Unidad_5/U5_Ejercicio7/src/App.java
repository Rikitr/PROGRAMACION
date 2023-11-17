/**
 * 
 * Realiza el control de acceso a una caja fuerte. La combinación será un
número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
Tendremos cuatro oportunidades para abrir la caja fuerte.
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App{
    public static void main(String[] args){
        System.out.println("Esto es la caja fuerte");
        int pass=6969;
        int tries=0;
        int code;
        int fin=0;
        do {
            System.out.print("Introduce el código de la caja fuerte: ");
            code = Integer.parseInt(System.console().readLine());
            if (code==pass) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                fin++;
            } else {
                if (code < 1000 || code > 9999) {
                    tries++;
                    if (tries==4) {
                        System.out.println("Lo siento, esa no es la combinación. El código debe ser de 4 dígitos");
                        System.out.println("Te has quedado sin intentos, reinicia el programa para intentarlo de nuevo");
                        fin++;
                    } else {
                        System.out.println("Lo siento, esa no es la combinación. El código debe ser de 4 dígitos");
                        System.out.println("Te quedan "+(4-tries)+" intentos restantes.");
                    }
                } else {
                    tries++;
                    if (tries==4) {
                        System.out.println("Lo siento, esa no es la combinación");
                        System.out.println("Te has quedado sin intentos, reinicia el programa para intentarlo de nuevo");
                        fin++;
                    } else {
                        System.out.println("Lo siento, esa no es la combinación");
                        System.out.println("Te quedan "+(4-tries)+" intentos restantes.");
                    }
                }
            }
        } while (fin==0);
    }
}