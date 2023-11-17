/**
 * 
 * Escribe un programa que muestre los n primeros términos de la serie de
Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe
introducir por teclado.
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App{
    public static void main(String[] args){
        System.out.println("Voy a calcular los n primeros numeros de la sucesion de fibonacci");
        System.out.print("¿cuantos números quieres de la sucesión? ");
        int num = Integer.parseInt(System.console().readLine());
        switch (num) {
            case 1:
                System.out.print("0");
                break;
            case 2:
                System.out.print("0, 1");
                break;
            default:
                System.out.print("0, 1");
                int a=0;
                int b=1;
                int c=0;
                while (num>2) {
                    c=a;
                    a=b;
                    b=c+a;
                    System.out.print(", "+b);
                    num--;
                }
            }
        }
}
