public class task6ta7 {
    public static void main(String args[]) {
        long a = 5;
        int i = 1;
        while (i <= 100) {
            a = 3 * a + 1;
            i++;
        }
        if (a > 2000000000000000000L) {
                System.out.println("До фига получилось!");
                System.out.println("Оборотов цикла было " + (i - 1));
            }
        }
    }

