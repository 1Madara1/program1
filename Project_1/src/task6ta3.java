public class task6ta3 {
    public static void main(String args[]) {
        int i = 1;
        int sum = 0;
        while (i < 10) {
            sum += i; // увеличить значение суммы на величину i=1,2,…9
            i = i + 1;
            System.out.println("Сумма равна" + sum);
        }
    }
}