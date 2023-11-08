/**
 * 
 * Escribe un programa que dada una hora determinada (horas y minutos), calcule
los segundos que faltan para llegar a la medianoche.
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App{
    public static void main(String[] args){
        System.out.println("Calculador de segundos hasta la medianoche");
        System.out.print("dime el número de hora (0-24): ");
        int hora = Integer.parseInt(System.console().readLine());
        if (hora < 0 || hora > 24) {
            System.out.println("El número de hora introducido es incorrecto");
        }
        System.out.print("dime el número de minutos (0-59): ");
        int minutos = Integer.parseInt(System.console().readLine());
        if (minutos < 0 || minutos > 59) {
            System.out.println("El número de minutos introducido es incorrecto");
        }
        int resultado = 86400-((hora*3600)+(minutos*60));
        System.out.println("Faltan "+resultado+" segundos hasta la medianoche");
    }
}
