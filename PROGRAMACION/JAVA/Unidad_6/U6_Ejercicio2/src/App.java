/**
 * 
 * Realiza un programa que muestre al azar el nombre de una carta de la baraja
francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el
1). Para convertir un número en una cadena de caracteres podemos usar
String.valueOf(n).
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App{
    public static void main(String[] args){
        System.out.println("Voy a mostrar una carta al azar de la baraja de Poker.");
        int num = ((int)(Math.random()*13)+1);
        String carta = "";
        switch (num) {
            case 1:
                carta = "As";
                break;
            case 11:
                carta = "J";
                break;
            case 12:
                carta = "Q";
                break;
            case 13:
                carta = "K";
                break;
            default:
                carta = String.valueOf(num);
        }
        int palo = ((int)(Math.random()*4)+1);
        switch (palo) {
            case 1:
                System.out.println("Tu carta es: "+carta+" de Picas");
                break;
            case 2:
                System.out.println("Tu carta es: "+carta+" de Trebol");
                break;
            case 3:
                System.out.println("Tu carta es: "+carta+" de Corazon");
                break;
            case 4:
                System.out.println("Tu carta es: "+carta+" de Diamante");
                break;
        }
    }
}