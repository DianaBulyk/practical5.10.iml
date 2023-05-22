public class task5 {
    public static void main(String[] args) {
        int count = 0;

        for (int hours = 0; hours <= 23; hours++) {
            for (int minutes = 0; minutes <= 59; minutes++) {
                String time = String.format("%02d:%02d", hours, minutes);

                if (isSymmetric(time)) {
                    count++;
                }
            }
        }

        System.out.println("Кількість симетричних комбінацій на електронному годиннику: " + count);
    }

    private static boolean isSymmetric(String time) {
        return time.charAt(0) == time.charAt(4) && time.charAt(1) == time.charAt(3);
    }
}