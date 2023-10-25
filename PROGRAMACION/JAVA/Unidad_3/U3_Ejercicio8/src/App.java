/**
 * 
 * Escribe un programa que calcule el salario semanal de un empleado en base a
las horas trabajadas, a razón de 12 euros la hora.
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App{
    public static void main(String[] args){
        System.out.print("introduzca el número de horas trabajadas durante la semana: ");
        String linea=System.console().readLine();
        int horasTrabajadas;
        horasTrabajadas=Integer.parseInt(linea);
        System.out.println("Su salario semanal es de "+(horasTrabajadas*12)+" Euros.");
    }
}