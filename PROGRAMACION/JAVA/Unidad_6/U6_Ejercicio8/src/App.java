/**
 * Modifica el programa anterior para que la probabilidad de que salga un 1 sea
de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.
 * 
 * @author Ricardo Troyano Ostios
 */
public class App {
    public static void main(String[] args) {
        System.out.println("-------Apuestas de la quiniela-------");
        int row = 15;
        int col = 3;
        String apuesta = "";
        int numApuesta;
        for (int i = 0; i < row; i++){
            System.out.print("| ");
            for (int j = 0; j < col; j++){
                numApuesta = ((int)(Math.random()*6)+1);
                switch (numApuesta) {
                case 1, 2, 3:
                    apuesta = "1";
                    break;
                case 4, 5:
                    apuesta = "X";
                    break;
                case 6:
                    apuesta = "2";
                    break;
                }
                System.out.print(apuesta+" | ");
            }
            System.out.println();
        }
    }
}