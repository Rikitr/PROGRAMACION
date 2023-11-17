/**
 * 
 * Escribe un programa que pida una base y un exponente (entero positivo) y que
calcule la potencia.
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App{
    public static void main(String[] args){
        System.out.println("Voy a calcularte un potencia");
        System.out.print("Dime el valor de la base: ");
        int base=Integer.parseInt(System.console().readLine());
        System.out.print("Dime el valor del exponente: ");
        int exp=Integer.parseInt(System.console().readLine());
        int calc=base;
        int paso=exp;
        do {
            calc=calc*base;
            paso--;
        } while (paso>1);
        System.out.print("El resultado de "+base+"^"+exp+" es: "+calc);
    }
}