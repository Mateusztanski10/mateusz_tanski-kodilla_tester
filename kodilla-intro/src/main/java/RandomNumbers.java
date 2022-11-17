import java.util.Random;

public class RandomNumbers {
    int min;
    int max;

    public int getMin() {
        return this.min;
    }
    public int getMax() {
        return this.max;
    }
    public static void main(String[] args) {

        Random random = new Random();
        int sum = 0;
        int max = 5000;
        for (int i = 0; i <= max; i++) {
            if (sum < max) {
                int temp = random.nextInt(31);
                sum = sum + temp;
                System.out.println(sum);
            }
        }

    }
}
