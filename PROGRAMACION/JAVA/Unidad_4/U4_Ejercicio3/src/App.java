/**
 * 
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App{
    public static void main(String[] args){
        System.out.println("Dime un número del 1 al 7:");
        String linea = System.console().readLine();
        int num = Integer.parseInt(linea);
        if (num == 1) {
            System.out.println("El número 1 equivale al Lunes");
        } else {
            if (num == 2) {
                System.out.println("El número 2 equivale al Martes");
            } else {
                if (num == 3) {
                    System.out.println("El número 3 equivale al Miércoles");
                } else {
                    if (num == 4) {
                        System.out.println("El número 4 equivale al Jueves");
                    } else {
                        if (num == 5) {
                            System.out.println("El número 5 equivale al Viernes");
                        } else {
                            if (num == 6) {
                                System.out.println("El número 6 equivale al Sabado");
                            } else {
                                if (num == 7) {
                                    System.out.println("El número 7 equivale al Domingo");
                                } else {
                                    System.out.println("El número introducido no esta comprendido entre el 1 y el 7");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}