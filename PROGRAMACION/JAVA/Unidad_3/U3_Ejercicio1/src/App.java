/**
 * 
 * Realiza un programa que pida dos números y que luego muestre el resultado
de su multiplicación.
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App{
    public static void main(String[] args){
        String linea;
        System.out.print("Ingresa el primer número: ");
        linea = System.console().readLine();
        int primer_numero;
        primer_numero = Integer.parseInt(linea);
        System.out.print("Ingresa el segundo número: ");
        linea = System.console().readLine();
        int segundo_numero;
        segundo_numero = Integer.parseInt(linea);
        int resultado;
        resultado = primer_numero*segundo_numero;
        System.out.println("El resultado de la multiplicación es: "+resultado);
    }
}