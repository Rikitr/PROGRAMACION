/**
 * 
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
convertir debe ser introducida por teclado.
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App{
    public static void main(String[] args){
        String linea;
        System.out.println("Bienvenido al conversor de Pesetas a Euros");
        System.out.println("Ingresa la cantidad en pesetas que desea convertir:");
        linea = System.console().readLine();
        int pesetas;
        pesetas = Integer.parseInt(linea);
        double resultado;
        double conversion;
        conversion = 166.386;
        resultado = pesetas/conversion;
        System.out.println(pesetas+" Pesetas equivalen a "+resultado+" Euros");
    }
}