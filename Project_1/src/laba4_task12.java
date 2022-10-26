import java.util.Objects;
import java.util.Scanner;
public class laba4_task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = sc.next();
        if (Objects.equals(c, "+")) {
            System.out.println(a+b);
        } else if (Objects.equals(c, "-"))  {
            System.out.println(a-b);
        } else if (Objects.equals(c, "*")) {
            System.out.println(a*b);
        } else if (Objects.equals(c, "/")) {
            System.out.println(a/b);
        } else {
            System.out.println("null");

        }
    }
}
