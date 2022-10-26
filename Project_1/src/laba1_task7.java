import java.util.Scanner;

public class laba1_task7 {
    public static void main(String[] args) {
        Scanner myscan = new Scanner (System.in);

        System.out.println ("Привет!");
        System.out.println ("Введи первое число");

        double x = 0;
        x = myscan.nextDouble ();

        System.out.println ("Введи второе число");
        double y = 0;
        y = myscan.nextDouble ();

        System.out.println (x + y); //складывает введеные числа
    }

}
