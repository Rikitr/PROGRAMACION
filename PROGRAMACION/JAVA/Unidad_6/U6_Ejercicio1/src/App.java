/**
 * 
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
también la suma total (los puntos que suman entre los tres dados).
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App{
    public static void main(String[] args){
        System.out.println("Voy a mostrar 3 tiradas de dados y te daré la suma de todas.");
        int tirada = 1;
        int suma = 0;
        int num = 0;
        do {
            System.out.print(tirada+"º tirada: ");
            num=((int)(Math.random()*6)+1);
            System.out.println(num);
            suma=suma+num;
            tirada++;
        } while (tirada<4);
        System.out.println("La suma de las tres tiradas es: "+suma);
    }
}