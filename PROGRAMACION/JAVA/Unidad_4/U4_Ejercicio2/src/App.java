/**
 * 
 * Realiza un programa que pida una hora por teclado y que muestre luego buenos
días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
horas, los minutos no se deben introducir por teclado.
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App{
    public static void main(String[] args){
        System.out.println("Dime que hora es (solo la hora, y en ciclo de 24 horas):");
        String linea = System.console().readLine();
        int hora = Integer.parseInt(linea);
        if (hora >= 6 && hora <= 12) {
            System.out.println("Son las "+hora+" horas del día, ¡BUENOS DÍAS!");
        } else {
            if (hora >= 13 && hora <= 20) {
                System.out.println("Son las "+hora+" horas del día, ¡BUENAS TARDES!");
            } else {
                if (hora >= 21 && hora <= 5) {
                    System.out.println("Son las "+hora+" horas del día, ¡BUENAS NOCHES!");
                } else {
                    System.out.println("La hora introducida no es válida");
                }
            }
        }
    }
}