public class Series {
    public static void main(String[] args) {
        int n = 1;
        int count = 0;
        while (count < 10) {
            int value = 3 * n + 1;
            if (value % 4 != 0) {
                System.out.print(value + " ");
                count++;
            }
            n++;
        }
    }
}