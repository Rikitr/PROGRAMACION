/**
 * 
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
suficiente, bien, notable o sobresaliente).
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App{
    public static void main(String[] args){
        System.out.println("Voy a calcular la media entre tres notas, y si es (insuficiente, suficiente, bien, notable o sobresaliente)");
        System.out.println("dime la primera nota:");
        double nota_1 = Double.parseDouble(System.console().readLine());
        System.out.println("dime la segunda nota:");
        double nota_2 = Double.parseDouble(System.console().readLine());
        System.out.println("dime la tercera nota:");
        double nota_3 = Double.parseDouble(System.console().readLine());
        if (nota_1 < 0 || nota_1 > 10 || nota_2 < 0 || nota_2 > 10 || nota_3 < 0 || nota_3 > 10) {
            System.out.println("Una de las notas introducidas no es correcta, recuerda que deben ser entre 0 y 10");
        } else {
            Double media = (nota_1+nota_2+nota_3)/3;
            if (media >= 0 && media < 5) {
                System.out.println("Tu media es de "+media+" por lo que es un INSUFICIENTE");
            } else {
                if (media == 5) {
                    System.out.println("Tu media es de "+media+" por lo que es un SUFICIENTE");
                } else {
                    if (media > 5 && media < 7) {
                        System.out.println("Tu media es de "+media+" por lo que es un BIEN");
                    } else {
                        if (media >=7 && media < 9) {
                            System.out.println("Tu media es de "+media+" por lo que es un NOTABLE");
                        } else {
                            if (media >= 9 && media < 10) {
                                System.out.println("Tu media es de "+media+" por lo que es un SOBRESALIENTE");
                            }
                        }
                    }
                }
            }
        }
    }
}