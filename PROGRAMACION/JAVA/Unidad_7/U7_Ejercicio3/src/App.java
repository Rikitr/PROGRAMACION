/**
* Escribe un programa que lea 10 números por teclado y que luego los muestre
en orden inverso, es decir, el primero que se introduce es el último en mostrarse
y viceversa.
*
* @author Ricardo Troyano Ostios
*/
public class App {
    public static void main(String[] args) {
        int[] num = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Escribe un número: ");
            num[i] = Integer.parseInt(System.console().readLine());
        }
        System.out.println("Los numeros al reves serian:");
        for (int i = 9; i >= 0; i--) {
            System.out.println(num[i]);
        }
    }
}