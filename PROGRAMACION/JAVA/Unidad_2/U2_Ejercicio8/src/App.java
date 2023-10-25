/**
 * 
 * Escribe un programa que declare 5 variables de tipo char. A continuación, crea
otra variable como cadena de caracteres y asígnale como valor la concatenación de las anteriores 5 variables. Por último, muestra la cadena de caracteres
por pantalla ¿Qué problemas te encuentras? ¿cómo lo has solucionado?
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App {
    public static void main(String[] args) {
        char letra1='H';
        char letra2='o';
        char letra3='l';
        char letra4='a';
        char letra5='!';
        String cadena=" "+letra1+letra2+letra3+letra4+letra5;
        System.out.println(cadena);
    }
}   