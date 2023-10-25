/**
 * 
 * Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
convertir deberá estar almacenada en una variable.
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App {
    public static void main(String[] args) {
        double tasaConversion = 166.386;
        double euros = 100.0;
        double pesetas=euros*tasaConversion;
        System.out.println(euros+" euros son equivalentes a "+pesetas+" pesetas.");
    }
}