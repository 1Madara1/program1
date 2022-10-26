import java.util.Scanner;
public class Task2_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("next number for " + a);
        int b = ++a;
        System.out.println(" is " + b );
        System.out.print("Previous number for " + a);
        int c = a--;
        System.out.print(" is "+ c);
    }
}
