import java.util.Scanner;

public class laba1_task8 {
    public static void main(String[] args) {
        Scanner myscan = new Scanner (System.in);

        System.out.println ("Hi");
        System.out.println ("What  will be if 25*5 ?");

        int x = 0;
        x = myscan.nextInt (); //

        if (x == 125){
            System.out.println ("yes, that's cool");
        } else {
            System.out.println("Absolute lie");
            System.out.println ("What  will be if 5*5 ?");
            int a = myscan.nextInt();
            if (a == 25){
                System.out.println("Yes, that's cool");
            } else {
                System.out.println("absolute lie");
            }
                System.out.println("what will be if 9*5");
                int b = myscan.nextInt();
                if (b==45) {
                    System.out.println("Yes, that's cool");
                } else {
                    System.out.println("absolute lie");
                }
            }
        }
        }