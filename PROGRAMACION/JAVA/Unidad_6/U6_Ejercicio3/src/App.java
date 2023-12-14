/**
 * 
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App{
    public static void main(String[] args){
        System.out.println("Voy a mostrar una carta al azar de la baraja española.");
        int num = ((int)(Math.random()*10)+1);
        String carta = "";
        switch (num) {
            case 1:
                carta = "As";
                break;
            case 8:
                carta = "Sota";
                break;
            case 9:
                carta = "Caballo";
                break;
            case 10:
                carta = "Rey";
                break;
            default:
                carta = String.valueOf(num);
        }
        int palo = ((int)(Math.random()*4)+1);
        switch (palo) {
            case 1:
                System.out.println("Tu carta es: "+carta+" de Bastos");
                break;
            case 2:
                System.out.println("Tu carta es: "+carta+" de Copas");
                break;
            case 3:
                System.out.println("Tu carta es: "+carta+" de Espadas");
                break;
            case 4:
                System.out.println("Tu carta es: "+carta+" de Oro");
                break;
        }
    }
}