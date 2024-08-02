import java.util.Random;

public class RandomNumberGenerator {
    private int[] numbers;

    public RandomNumberGenerator(int size) {
        this.numbers = new int[size];
        generateNumbers();
    }

    private void generateNumbers() {
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100000);
        }
    }

    public int[] getNumbers() {
        return numbers;
    }
}
