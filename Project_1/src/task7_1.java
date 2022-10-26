import java.util.Scanner;
 class task7_1 {
     public static void main(String[] args) {

         String[] rico = {"PoPa", "PiPa", "Popka", "Jopa", "OSEL"};
         for (int i = 0; i < rico.length; i++) {
             System.out.println(rico[i]);
         }
        System.out.println();
         int n = rico.length;
         String me;
         for (int i = 0;i < n / 2;i++){
           me = rico [n - i - 1];
           rico[n - i -1] = rico[i];
           rico[i] = me;
         }
      for (int i =0; i < rico.length;i++){
          System.out.println(rico[i]);
      }

     }
 }