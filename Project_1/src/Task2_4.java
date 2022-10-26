
import java.util.Scanner;

public class Task2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a + 1;
        int c = a + 2;
        if (a % 2 == 0) {
            System.out.println(c);
        }else{
            System.out.println(b);
        }
    }
}
