/**
 * 
 * Realiza un programa que pida primero un número y a continuación un dígito.
El programa nos debe dar la posición (o posiciones) contando de izquierda a
derecha que ocupa ese dígito en el número introducido.
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App{
    public static void main(String[] args){
        System.out.print("Introduzca un número entero: ");
        int numeroIntroducido = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca un dígito: ");
        int digito = Integer.parseInt(System.console().readLine());
        System.out.print("Contando de izquierda a derecha, el " + digito + " aparece dentro de " + numeroIntroducido + " en las siguientes posiciones: ");
        int numero = numeroIntroducido;
        int volteado = 0;
        int posicion = 1;
        while (numero > 0) {
            volteado = (volteado * 10) + (numero % 10);
            numero /= 10;
        }
        while (volteado > 0) {
            if ((volteado % 10) == digito) {
                System.out.print(posicion + " ");
            }
            volteado /= 10;
        }
        System.out.println();
    }
}