/**
 * 
 * Escribe un programa que sume, reste, multiplique y divida dos números
introducidos por teclado.
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App{
    public static void main(String[] args){
        String linea;
        System.out.println("Bienvenido a la calculadora");
        System.out.println("Ingresa el primer número:");
        linea = System.console().readLine();
        int primer_numero;
        primer_numero = Integer.parseInt(linea);
        System.out.println("Ingresa el segundo número:");
        linea = System.console().readLine();
        int segundo_numero;
        segundo_numero = Integer.parseInt(linea);
        int suma=primer_numero+segundo_numero;
        int resta=primer_numero-segundo_numero;
        int multiplicacion=primer_numero*segundo_numero;
        int division=primer_numero/segundo_numero;
        System.out.println("SUMA: "+primer_numero+" + "+segundo_numero+" = "+suma);
        System.out.println("RESTA: "+primer_numero+" - "+segundo_numero+" = "+resta);
        System.out.println("MULTIPLICACIÓN: "+primer_numero+" por "+segundo_numero+" = "+multiplicacion);
        System.out.println("DIVISIÓN: "+primer_numero+" entre "+segundo_numero+" = "+division);
    }
}