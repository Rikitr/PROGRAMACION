/**
 * 
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un
numero negativo y nos diga cuantos números se han introducido, la media de
los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo.
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App{
    public static void main(String[] args){
        System.out.println("Por favor, vaya introduciendo números enteros.");
        System.out.println("Puede terminar mediante la introducción de un número negativo.");
        int num;
        int cont = 0;
        int sumaImpares = 0;
        int numeroDeElementosImpares = 0;
        int maximoPar = 0;
        do {
            num = Integer.parseInt(System.console().readLine());
            if (num >= 0) {
                cont++;
                if ((num % 2) == 1) {
                    sumaImpares += num;
                    numeroDeElementosImpares++;
                } else {
                    if (num > maximoPar)
                        maximoPar = num;
                }
            }
        } while (num >= 0);
        System.out.println("Ha introducido " + cont + " números");
        System.out.println("La media de los impares es " + sumaImpares/numeroDeElementosImpares);
        System.out.println("El máximo de los pares es " + maximoPar);
    }
}