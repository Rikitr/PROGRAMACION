import java.util.Scanner;
/**
 * 
 * Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce
su jugada y luego el usuario 2. Si alguno de los usuarios introduce una opción
incorrecta, el programa deberá mostrar un mensaje de error
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
        String jugada1 = s.nextLine();
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
        String jugada2 = s.nextLine();
        if (jugada1.equals(jugada2)) {
        System.out.println("Empate");
        } else {
        int ganador = 2;
        switch(jugada1) {
        case "piedra":
        if (jugada2.equals("tijera")) {
        ganador = 1;
        }
        break;
        case "papel":
        if (jugada2.equals("piedra")) {
        ganador = 1;
        }
        break;
        case "tijera":
        if (jugada2.equals("papel")) {
        ganador = 1;
        }
        break;
        default:
        }
        System.out.println("Gana el jugador " + ganador);
        }
        
    }
}