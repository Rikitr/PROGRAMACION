/**
 * 
 * Escribe un programa que calcule el total de una factura a partir de la base
imponible (precio sin IVA). La base imponible estará almacenada en una
variable.
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App {
    public static void main(String[] args) {
        double factura=506.59;
        double iva=factura*0.21;
        double factura_final=factura+iva;
        System.out.println("El precio de la factura de "+factura+" euros con IVA serian: "+factura_final);
    }
}