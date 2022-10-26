import java.util.Scanner; // импорт сканера

public class task5ta4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любые 2 слова или фразу: ");
        String phrase1 = sc.nextLine();
        String phrase2 = sc.nextLine();
        System.out.println(phrase1 + " " + phrase2);
    }
   }