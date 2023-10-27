/**
 * 
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
una altura h. Aplica la fórmula t = √(2h/g) siendo g = 9.81 m/s^2
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App{
    public static void main(String[] args){
        System.out.println("Voy a calcular el tiempo que tarda en caer un objeto usando la fórmula: t=√(2h/g)");
        System.out.println("dime desde que altura en metros cae el objeto");
        String linea = System.console().readLine();
        double h = Double.parseDouble(linea);
        if (h == 0) {
            System.out.println("Como la altura es 0, el tiempo en caer es 0 tambien");
        } else {
            System.out.println("El tiempo que tarda en caer es de: "+(Math.sqrt(2*h/9.81))+" Segundos");
        }
    }
}