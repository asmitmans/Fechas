import java.nio.Buffer;
import java.util.Scanner;

public class Fechas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la primera fecha como DD/MM/AAAA");
        String fecha1 = scanner.nextLine();
        System.out.println("Ingrese la segunda fecha como DD/MM/AAAA");
        String fecha2 = scanner.nextLine();
        int day1 = Integer.parseInt(fecha1.substring(0,2));
        int month1 = Integer.parseInt(fecha1.substring(3,5));
        int year1 = Integer.parseInt(fecha1.substring(6,10));
        int day2 = Integer.parseInt(fecha2.substring(0,2));
        int month2 = Integer.parseInt(fecha2.substring(3,5));
        int year2 = Integer.parseInt(fecha2.substring(6,10));

        if (year1 < year2) {
            System.out.println("persona 1 es mayor");
            return;
        } else if (year2 < year1) {
            System.out.println("persona 2 es mayor");
            return;
        }

        // Same year =>
        if (month1 < month2) {
            System.out.println("persona 1 es mayor");
            return;
        } else if (month2 < month1) {
            System.out.println("persona 2 es mayor");
            return;
        }

        // Same year and month =>
        if (day1 < day2) {
            System.out.println("persona 1 es mayor");
            return;
        } else if (day2 < day1) {
            System.out.println("persona 2 es mayor");
            return;
        }

        // Same date
        System.out.println("Tienen la misma edad");
        return;

    }
}
