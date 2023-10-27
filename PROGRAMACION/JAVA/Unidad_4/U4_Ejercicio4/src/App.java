/**
 * 
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
las horas extras. Escribe un programa que calcule el salario semanal de un
trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
la hora.
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App{
    public static void main(String[] args){
        System.out.println("¿Cuántas horas has trabajado esta semana?");
        int horas = Integer.parseInt(System.console().readLine());
        if (horas > 168 || horas < 1) {
            System.out.println("El número de horas introducido es incorrecto");
        } else {
            if (horas <= 40) {
                int calculo_1 = (horas*12);
                System.out.println("Como has trabajado "+horas+" horas, tu salario esta semana es de "+calculo_1+" Euros");
            } else {
                int calculo_2 = (horas-40);
                int resultado = ((calculo_2*16)+480);
                System.out.println("Como has trabajado "+horas+" horas, tu salario esta semana es de "+resultado+" Euros");
            }
        }
    }
}