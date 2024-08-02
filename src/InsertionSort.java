public class InsertionSort {

    public static void main(String[] args) {
        RandomNumberGenerator rng = new RandomNumberGenerator(100000);
        int[] array = rng.getNumbers();

        long startTime = System.currentTimeMillis();
        insertionSort(array);
        long endTime = System.currentTimeMillis();

        System.out.println("Insertion Sort Time: " + (endTime - startTime) + " ms");
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
}
