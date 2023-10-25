/**
 * 
 * Realiza un conversor de Kb a Mb.
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App {
    public static void main(String[] args) {
        String linea;
        System.out.println("Conversor de KB a MB");
        System.out.println("Introduzca la cantidad de KB que desea convertir: ");
        linea = System.console().readLine();
        double kb = Double.parseDouble(linea);
        double conversion = kb/1000;
        System.out.println(kb+" KB equivalen a "+conversion+" MB.");
    }
}