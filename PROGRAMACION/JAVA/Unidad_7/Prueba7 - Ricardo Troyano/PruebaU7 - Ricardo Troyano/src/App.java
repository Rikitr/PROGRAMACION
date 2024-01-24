/*
 * Examen Unidad 7: Juego "Tres o más"
 * 
 * @Author Ricardo Troyano Ostios
 */
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("----------BIENVENIDO A 'TRES O MÁS'----------");
        System.out.println("");
        int numRonda = 1;
        int puntosJugador1 = 0;
        int puntosJugador2 = 0;
        while (numRonda <= 10) { // Cambiado el número de rondas a 10
            System.out.println("Ronda " + numRonda + ":");
            // Tirada del jugador 1
            System.out.print("Tirada " + numRonda + " del jugador 1: ");
            int[] tirada = new int[5];
            int[] recuento = new int[7];
            for (int j = 0; j < 5; j++) {
                tirada[j] = ((int) (Math.random() * 6) + 1);
                System.out.print(tirada[j] + "-");
                recuento[tirada[j]]++;
            }
            int tiradaExtra1 = 0;
            if (recuento[1] < 2 && recuento[2] < 2 && recuento[3] < 2 && recuento[4] < 2 && recuento[5] < 2
                    && recuento[6] < 2) {
                System.out.print(" ; 0 puntos");
                // No hay tirada extra
            } else if (recuento[1] == 3 || recuento[2] == 3 || recuento[3] == 3 || recuento[4] == 3 || recuento[5] == 3
                    || recuento[6] == 3) {
                System.out.print(" ; 3 puntos");
                puntosJugador1 += 3;
                // Tirada extra
                tiradaExtra1 = 1;
            } else {
                System.out.print(" ; Tirada extra");
                // Tirada extra
                tiradaExtra1 = 1;
            }
            System.out.println("");
            // Tirada del jugador 2
            System.out.print("Tirada " + numRonda + " del jugador 2: ");
            tirada = new int[5];
            recuento = new int[7];
            for (int j = 0; j < 5; j++) {
                tirada[j] = ((int) (Math.random() * 6) + 1);
                System.out.print(tirada[j] + "-");
                recuento[tirada[j]]++;
            }
            int tiradaExtra2 = 0;
            if (recuento[1] < 2 && recuento[2] < 2 && recuento[3] < 2 && recuento[4] < 2 && recuento[5] < 2
                    && recuento[6] < 2) {
                System.out.print(" ; 0 puntos");
                // No hay tirada extra
            } else if (recuento[1] == 3 || recuento[2] == 3 || recuento[3] == 3 || recuento[4] == 3 || recuento[5] == 3
                    || recuento[6] == 3) {
                System.out.print(" ; 3 puntos");
                puntosJugador2 += 3;
                // Tirada extra
                tiradaExtra2 = 1;
            } else {
                System.out.print(" ; Tirada extra");
                // Tirada extra
                tiradaExtra2 = 1;
            }
            System.out.println("");
            System.out.println("Fin de la ronda " + numRonda + " ; Jugador 1 - " + puntosJugador1
                    + " puntos ; Jugador 2 - " + puntosJugador2 + " puntos");
            numRonda++;
        }
        // Mensaje al final de la partida
        System.out.println("Fin de la partida");
        if (puntosJugador1 > puntosJugador2) {
            System.out.println("¡Gana el jugador 1 con " + puntosJugador1 + " puntos!");
        } else if (puntosJugador2 > puntosJugador1) {
            System.out.println("¡Gana el jugador 2 con " + puntosJugador2 + " puntos!");
        } else {
            System.out.println("La partida termina en empate con " + puntosJugador1 + " puntos para ambos jugadores.");
        }
    }
}