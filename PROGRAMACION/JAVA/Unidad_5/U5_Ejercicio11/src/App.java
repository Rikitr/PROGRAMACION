/**
 * 
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado.
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App{
    public static void main(String[] args){
        System.out.println("Voy a calcular el cuadrado y el cubo de los 5 numeros consecutivos al que me digas");
        System.out.print("Introduzca un número: ");
        int num = Integer.parseInt(System.console().readLine());
        for (int i = num; i < num + 5; i++) {
            System.out.printf("%4d %6d %8d\n", i, i * i, i * i * i);
        }
    }
}
