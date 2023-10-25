/**
 * 
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
convertir debe ser introducida por teclado.
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App{
    public static void main(String[] args){
        String linea;
        System.out.println("Bienvenido al conversor de Euros a Pesetas");
        System.out.println("Ingresa la cantidad en euros que desea convertir:");
        linea = System.console().readLine();
        int euros;
        euros = Integer.parseInt(linea);
        double resultado;
        double pesetas;
        pesetas = 166.386;
        resultado = euros*pesetas;
        System.out.println(euros+" Euros equivalen a "+resultado+" Pesetas");
    }
}