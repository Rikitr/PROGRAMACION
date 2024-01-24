/**
* Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
muestre por pantalla separados por espacios. El programa pedirá entonces por
teclado dos valores y a continuación cambiará todas las ocurrencias del primer
valor por el segundo en la lista generada anteriormente. Los números que se
han cambiado deben aparecer entrecomillados.
*
* @author Ricardo Troyano Ostios
*/
public class App {
    public static void main(String[] args) {
        int valor1;
        int valor2;
        int[] numeros = new int[100];
        for (int i = 0; i < 100; i++) {
            numeros[i] = (int)(Math.random()*21);
            System.out.print(numeros[i]+" ");
        }
        System.out.println("");
        System.out.println("A continuación, ingrese dos valores para intercambiarlos:");
        do {
            System.out.print("Primer valor: ");
            valor1 = Integer.parseInt(System.console().readLine());
            if (valor1 < 0 || valor1 > 20) {
                System.out.print("Escribe un valor entre 0 y 20");
            }
        } while (valor1 < 0 || valor1 > 20);
        System.out.print("Segudo valor: ");
        valor2 = Integer.parseInt(System.console().readLine());
        for (int i = 0; i < 100; i++) {
            if (numeros[i] == valor1) {
                numeros[i] = valor2;
            }
            System.out.print(numeros[i]+" ");
        }
    }
}