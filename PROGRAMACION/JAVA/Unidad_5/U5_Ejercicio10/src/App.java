/**
 * 
 * Escribe un programa que calcule la media de un conjunto de números positivos
introducidos por teclado. A priori, el programa no sabe cuántos números se
introducirán. El usuario indicará que ha terminado de introducir los datos
cuando meta un número negativo.
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App{
    public static void main(String[] args){
        System.out.println("Voy a calcular la media de numeros positivos");
        System.out.println("Escribe un número negativo para indicar que has terminado de escribir números");
        int a = 0;
        int paso = 0;
        int fin = 0;
        do {
            System.out.print("Escribe un número: ");
            int num = Integer.parseInt(System.console().readLine());
            if (num<0) {
                fin=1;
            } else {
                a=a+num;
                paso++;
            }
        } while (fin==0);
        System.out.println("La media de los números introducidos es: "+a/paso);
    }
}
