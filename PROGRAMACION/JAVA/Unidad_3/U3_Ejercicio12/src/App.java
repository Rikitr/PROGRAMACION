/**
 * 
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo
examen de la asignatura Programación para obtener la media deseada. Hay
que tener en cuenta que la nota del primer examen cuenta el 40% y la del
segundo examen un 60%.
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App {
    public static void main(String[] args) {
        String linea;
        System.out.println("Calculador de nota para llegar a la media que quieras");
        System.out.println("¿Que media te gustaria conseguir?");
        linea = System.console().readLine();
        double media = Double.parseDouble(linea);
        System.out.println("¿Cual fue la nota de tu primer examen?");
        linea = System.console().readLine();
        double primer_examen = Double.parseDouble(linea);
        double calculo = (media-0.4*primer_examen)/0.6;
        System.out.println("Para sacar un "+media+" de media, tendrias que sacar un "+calculo+" en el segundo examen.");
    }
}