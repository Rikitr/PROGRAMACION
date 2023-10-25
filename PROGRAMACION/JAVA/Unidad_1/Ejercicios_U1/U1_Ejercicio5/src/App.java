/**
 * 
 * Modifica el programa anterior añadiendo colores. Puedes mostrar cada asignatura de un color diferente.
 * 
 * @author Ricardo Troyano Ostios
 * 
 */
public class App {
    public static void main(String[] args) {
        System.out.printf("%-16s %-17s %-10s %-10s %-10s %-10s\n", "\033[0;37mHORA", "\033[0;033mLunes", "Martes", "Miercoles", "Jueves", "Viernes");
        System.out.println("\033[0;37m--------------------------------------------------------------");
        System.out.printf("%-16s %-16s %-10s %-10s %-10s %-10s\n", "\033[0;32m15:15", "\033[0;34mPROG", "PROG", "PROG", "PROG", "PROG");
        System.out.printf("%-16s %-16s %-10s %-10s %-10s %-10s\n", "\033[0;32m16:15", "\033[0;34mPROG", "PROG", "PROG", "PROG", "PROG");
        System.out.printf("%-16s %-16s %-10s %-10s %-10s %-10s\n", "\033[0;32m17:15", "\033[0;34mPROG", "PROG", "PROG", "PROG", "PROG");
        System.out.printf("%-16s %-16s %-10s %-10s %-10s %-10s\n", "\033[0;32m18:15", "\033[0;37mDE", " SC", " AN", " SI", " TO");
        System.out.printf("%-16s %-16s %-10s %-10s %-10s %-10s\n", "\033[0;32m18:30", "\033[0;34mPROG", "PROG", "PROG", "PROG", "PROG");
        System.out.printf("%-16s %-16s %-10s %-10s %-10s %-10s\n", "\033[0;32m19:30", "\033[0;34mPROG", "PROG", "PROG", "PROG", "PROG");
        System.out.printf("%-16s %-16s %-10s %-10s %-10s %-10s\n", "\033[0;32m20:30", "\033[0;34mPROG", "PROG", "PROG", "PROG", "PROG");
    }
}
