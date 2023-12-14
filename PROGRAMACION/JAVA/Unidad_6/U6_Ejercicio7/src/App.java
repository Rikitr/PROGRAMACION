/**
 * Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
para los 14 partidos y el pleno al quince (15 filas).
 * 
 * @author Ricardo Troyano Ostios
 */
public class App {
    public static void main(String[] args) {
        System.out.println("-------Apuestas de la quiniela-------");
        int row = 15;
        int col = 3;
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                int numApuesta = (int)(Math.random()*3);
                String apuesta;
                if (numApuesta == 0){
                    apuesta = "X";
                } else {
                    apuesta = String.valueOf(numApuesta);
                }
                System.out.print(apuesta + "  ");
            }
            System.out.println();
        }
    }
}