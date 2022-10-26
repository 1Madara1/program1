import java.util.Scanner;

public class laba1_task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi");
        System.out.println("What will be if 2*2?");
        int a = sc.nextInt();
        if  (a != 4) {
            System.out.println("You are dumb");
        } else {
            System.out.println("You are smart");
        }
    }
}
