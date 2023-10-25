/**
 * 
 * Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
convertir deberá estar almacenada en una variable.
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App {
    public static void main(String[] args) {
        double tasaConversion = 166.386;
        double pesetas = 1000000.0;
        double euros=pesetas/tasaConversion;
        System.out.println(pesetas+" pesetas son equivalentes a "+euros+" euros.");
    }
}