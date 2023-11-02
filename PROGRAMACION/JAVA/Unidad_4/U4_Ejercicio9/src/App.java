/**
 * 
 * Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax2 + bx + c = 0).
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App{
    public static void main(String[] args){
        System.out.println("Voy a resolver una ecuación de segundo grado");
        System.out.println("Ax^2 + Bx + C = 0");
        System.out.println("Dime el valor de A");
        Double a = Double.parseDouble(System.console().readLine());
        System.out.println("Dime el valor de B");
        Double b = Double.parseDouble(System.console().readLine());
        System.out.println("Dime el valor de C");
        Double c = Double.parseDouble(System.console().readLine());
        double calculo = (b*b)-4*a*c;
        if (calculo>0) {
            double x1 = (-b+calculo)/(2*a);
            double x2 = (-b-calculo)/(2*a);
            System.out.println("Las soluciones son x1 = "+x1+" y x2 = "+x2);
        } else
            if (calculo == 0) {
                double x = (-b/(2*a));
                System.out.println("La solución única es x = "+x);
            } else {
                System.out.println("La ecuación no tiene soluciones reales");
        }
    }
}