import java.util.Scanner;

public class Task2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double s = a*b;
        System.out.println("ploshad pryamougolnika " + s);
        double p = 2*a+2*b;
        System.out.println("Perimetr pryamougolnika " + p);

    }
}
