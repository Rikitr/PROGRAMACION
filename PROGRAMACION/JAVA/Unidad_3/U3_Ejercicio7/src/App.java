/**
 * 
 * Escribe un programa que calcule el total de una factura a partir de la base
imponible.
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App{
    public static void main(String[] args){
        String linea;
        System.out.println("Voy a calcularte el total de una factura a partir de la base imponible");
        System.out.println("Ingresa la base imponible en euros:");
        linea = System.console().readLine();
        double base = Double.parseDouble(linea);
        System.out.println("+-----------------------------------------------+");
        System.out.println("Base imponible: "+base+" Euros");
        System.out.println("IVA (21%)= "+base*0.21+" Euros");
        System.out.println("-------------------------------------------------");
        System.out.println("Total: "+(base*0.21+base)+" Euros");
        System.out.println("+-----------------------------------------------+");
    }
}