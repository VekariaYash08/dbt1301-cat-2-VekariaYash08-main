public class SelectionSort {

    public static void main(String[] args) {
        RandomNumberGenerator rng = new RandomNumberGenerator(100000);
        int[] array = rng.getNumbers();

        long startTime = System.currentTimeMillis();
        selectionSort(array);
        long endTime = System.currentTimeMillis();

        System.out.println("Selection Sort Time: " + (endTime - startTime) + " ms");
    }

    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }
    }
}
