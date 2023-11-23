/**
 * 
 * Escribe un programa que muestre por pantalla todos los números enteros
positivos menores a uno leído por teclado que no sean divisibles entre otro
también leído de igual forma.
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App{
    public static void main(String[] args){
        System.out.print("Introduzca un número entero positivo (relativamente grande): ");
        int numeroGrande = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca otro número (relativamente pequeño): ");
        int numeroPequeño = Integer.parseInt(System.console().readLine());
        System.out.print("Los números enteros positivos menores que " + numeroGrande + " que no son divisibles entre " + numeroPequeño + " son los siguientes: ");
        for (int i = 1; i < numeroGrande; i++) {
            if ((i % numeroPequeño) != 0) {
                System.out.print(i + ", ");
            }
        }
    }
}