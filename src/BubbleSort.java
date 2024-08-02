public class BubbleSort {


    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // main method
    public static void main(String[] args) {
        RandomNumberGenerator rng = new RandomNumberGenerator(100000);
        int[] array = rng.getNumbers();

        long startTime = System.currentTimeMillis();
        bubbleSort(array);
        long endTime = System.currentTimeMillis();

        System.out.println("Bubble Sort Time: " + (endTime - startTime) + " ms");
    }
}
