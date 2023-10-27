/**
 * 
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
asignatura toca a primera hora ese día.
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App{
    public static void main(String[] args){
        System.out.println("Dime un dia de la semana:");
        String dia = System.console().readLine();
        if (dia.equals("lunes")) {
            System.out.println("El lunes tienes Sistemas Informáticos a primera hora");
        } else {
            if (dia.equals("martes")) {
                System.out.println("El martes tienes Sistemas Informáticos a primera hora");
            } else {
                if (dia.equals("miercoles")) {
                    System.out.println("El miércoles tienes Bases de Datos a primera hora");
                } else {
                    if (dia.equals("jueves")) {
                        System.out.println("El jueves tienes Lenguajes de Marcas a primera hora");
                    } else {
                        if (dia.equals("viernes")) {
                            System.out.println("El viernes tienes Bases de Datos a primera hora");
                        } else {
                            if (dia.equals("sabado")) {
                                System.out.println("El sabado no tienes clases");
                            } else {
                                if (dia.equals("domingo")) {
                                    System.out.println("El domingo no tienes clases");
                                } else {
                                    System.out.println("El día introducido es incorrecto");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}