/**
 * 
 * Realiza un programa que calcule la media de tres notas.
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App{
    public static void main(String[] args){
        System.out.println("Voy a calcular la media entre tres notas");
        System.out.println("dime la primera nota:");
        double nota_1 = Double.parseDouble(System.console().readLine());
        System.out.println("dime la segunda nota:");
        double nota_2 = Double.parseDouble(System.console().readLine());
        System.out.println("dime la tercera nota:");
        double nota_3 = Double.parseDouble(System.console().readLine());
        if (nota_1 < 0 || nota_1 > 10 || nota_2 < 0 || nota_2 > 10 || nota_3 < 0 || nota_3 > 10) {
            System.out.println("Una de las notas introducidas no es correcta, recuerda que deben ser entre 0 y 10");
        } else {
            System.out.println("La media entre las tres notas es de: "+((nota_1+nota_2+nota_3)/3));
        }
    }
}