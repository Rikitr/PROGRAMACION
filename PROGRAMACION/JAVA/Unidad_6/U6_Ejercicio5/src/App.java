/**
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 * separados por espacios. Muestra también el máximo, el mínimo y la media
 * de esos números.
 * 
 * @author Ricardo Troyano Ostios
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Voy a mostrar 50 números aleatorios entre 100 y 199 incluidos, y te mostraré el máximo, el mínimo y la media.");
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int suma = 0;
        for (int cont = 0; cont < 50; cont++) {
            int numero = (int) (Math.random() * 100) + 100;
            System.out.print(numero + " ");
            maximo = Math.max(maximo, numero);
            minimo = Math.min(minimo, numero);
            suma += numero;
        }
        System.out.println();
        double media = (double) suma / 50;
        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
        System.out.println("Media: " + media);
    }
}