/**
 * 
 * Escribe un programa que calcule el volumen de un cono según la fórmula V =(1/3)*π*r^2*h
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App {
    public static void main(String[] args) {
        String linea;
        System.out.println("Volumen de un cono");
        System.out.println("Por favor, introduzca la altura (cm): ");
        linea = System.console().readLine();
        double altura = Double.parseDouble(linea);
        System.out.println("Introduzca el radio (cm): ");
        linea = System.console().readLine();
        double radio = Double.parseDouble(linea);
        double PI = 3.141592654;
        double volumen = (1.0/3.0) * PI * radio * radio * altura;
        System.out.println("El volumen del cono es de " + volumen + " cm³");
    }
}