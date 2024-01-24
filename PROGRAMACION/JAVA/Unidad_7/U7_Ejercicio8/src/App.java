/**
* Realiza un programa que pida la temperatura media que ha hecho en cada mes
de un determinado año y que muestre a continuación un diagrama de barras
horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
de asteriscos o cualquier otro carácter.
*
* @author Ricardo Troyano Ostios
*/
public class App {
    public static void main(String[] args) {
        System.out.print("Ingrese el año: ");
        int año = Integer.parseInt(System.console().readLine());
        System.out.println("A continuación ingrese las temperaturas medias de cada mes:");
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Noviembre", "Diciembre"};
        int[] temps = new int[12];
        for (int i = 0; i < 11; i++) {
            System.out.print(meses[i]+": ");
            temps[i] = Integer.parseInt(System.console().readLine());
        }
        System.out.println("-----DATOS FINALES DEL AÑO "+año+"-----");
        for (int j = 0; j < 11; j++) {
            System.out.printf("%-10s: %-3dº --> ", meses[j], temps[j]);
            for (int k = 0; k < temps[j]; k++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}