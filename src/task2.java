public class task2 {
    public static void main(String[] args) {
        int a = 2;
        int value = 2 * a - 1;

        while (value < 5000) {
            System.out.println(value);
            a++;
            value = 2 * a - 1;
        }
    }
}