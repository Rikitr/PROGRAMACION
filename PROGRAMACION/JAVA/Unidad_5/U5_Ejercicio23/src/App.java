/**
 * 
 * Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media.
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App{
    public static void main(String[] args){
        System.out.println("Introduce números, si su suma llega a 10000 deja de pedir: ");
        int num;
        int sumanum=0;
        int cont=0;
        do {
            num = Integer.parseInt(System.console().readLine());
            sumanum += num;
            cont++;
        } while (sumanum < 10000);
        System.out.println("Has introducido  "+(cont-1)+" números");
        System.out.println("La suma de tus numeros es: "+(sumanum-num));
        System.out.println("La media de los números es: "+((sumanum-num)/cont));
    }
}