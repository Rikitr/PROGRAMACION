/**
* Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array.
*
* @author Ricardo Troyano Ostios
*/
public class App {
    public static void main(String[] args) {
        int[] numeros = new int[15];
        System.out.println("Ingrese 15 números:");
        for (int i = 0; i < 15; i++) {
            System.out.print((i + 1) + "º Número: ");
            numeros[i] = Integer.parseInt(System.console().readLine());
        }
        int save = numeros[14];
        for (int i = 14; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }
        numeros[0]=save;
        for (int i = 0; i < 15; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}