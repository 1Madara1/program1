import java.util.Scanner;

public class laba1_task10 {
    public static void main(String[] args) {
        System.out.println("take a try in wheel of fortune ");
        System.out.println("Enter number from 0 to 100...");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 49:
                System.out.println("you win");
                break;
            default:
                System.out.println("you lose");
                break;
        }
    }
}
