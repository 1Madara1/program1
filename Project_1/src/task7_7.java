import java.util.Arrays;
public class task7_7 {
    public static void main(String[] args) {
        int[] mas1 = new int[5];
        int[] mas2 = new int[5];
        for (int i = 0; i < 5; i++) {
            mas1[i] = (int) (Math.random() * 6);
            mas2[i] = (int) (Math.random() * 6);
        }
        System.out.println(Arrays.toString(mas1));
        System.out.println(Arrays.toString(mas2));
        double average1 = 0;
        double average2 = 0;

        for (int i = 0; i < 5; i++) {
            average1 += mas1[i];
            average2 += mas2[i];
        }
        average1 /= 5;
        average2 /= 5;

        if (average1 > average1) {
            System.out.println("Arithmetic mean of the first array (" + average1 + ") more than the arithmetic mean " +
                    "the second array (" + average2 + ")");
        } else if (average1 < average2) {
            System.out.println("Arithmetic mean of the first array (" + average1 + ") less than the arithmetic mean " +
                    "the second array (" + average2 + ")");
        } else {
            System.out.println("The arithmetic averages of arrays are equal to (" + average1 + ")");
        }
    }
}