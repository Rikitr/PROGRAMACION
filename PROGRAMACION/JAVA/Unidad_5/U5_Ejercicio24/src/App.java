/**
 * 
 * Escribe un programa que lea un número n e imprima una pirámide de números
con n filas como en la siguiente figura:
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App{
    public static void main(String[] args){
        System.out.print("Introduce el número de altura de la pirámide: ");
        int n = Integer.parseInt(System.console().readLine());
        int altura=1;
        int a=0;
        int espacios=n-1;
        while (altura<=n) {
            for (a=1; a<=espacios; a++) {
                System.out.print(" ");
            }
            for (a=1; a<altura; a++) {
                System.out.print(a);
            }
            for (a=altura; a>0; a--) {
                System.out.print(a);
            }
            System.out.println();
            altura++;
            espacios--;
        }
    }
}