/**
 * 
 * Escribe un programa que calcule el área de un rectángulo
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App{
    public static void main(String[] args){
        String linea;
        System.out.println("Voy a calcular el area de un triángulo");
        System.out.println("Ingresa la base del triángulo en centimetros:");
        linea = System.console().readLine();
        int base;
        base = Integer.parseInt(linea);
        System.out.println("Ingresa la altura del triángulo en centimetros:");
        linea = System.console().readLine();
        int altura;
        altura = Integer.parseInt(linea);
        int area=(base*altura)/2;
        System.out.println("El area de un triángulo de base "+base+"cm y altura "+altura+"cm es: "+area+"cm^2");
    }
}