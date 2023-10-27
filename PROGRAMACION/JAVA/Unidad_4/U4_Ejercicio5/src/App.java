/**
 * 
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b = 0).
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App{
    public static void main(String[] args){
        System.out.println("Voy a resolver la ecuación: ax + b = 0");
        System.out.println("Dime el valor de --> a");
        String linea = System.console().readLine();
        double a = Double.parseDouble(linea);
        System.out.println("Dime el valor de --> b");
        String linea2 = System.console().readLine();
        double b = Double.parseDouble(linea2);
        if (a == 0) {
            System.out.println("La ecuación no tiene solución real");
        } else {
            System.out.println("x = "+(-b/a));
        }
    }
}