public class task6ta6 {
    public static void main(String args[]) {
        int sum = 0;
        int znak = 1;
        for (int i = 1; i <= 6; i++) {
            sum += znak * i;
            znak *= -1;
        }
        System.out.println(sum);
    }
}
