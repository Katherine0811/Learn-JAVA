public class SelectionSort {

    // Selection Sort:
    // Search through an array and keep track of the minimum value during each
    // iteration. At the end of each iteration, we swap variables.

    // Less efficient as data increases
    // Quadratic Time = O(n ^ 2)
    // Don't use for large data set !

    public static void main(String[] args) {
        int array[] = { 8, 3, 9, 2, 6, 1, 4, 7, 5 };
        selectionSort(array);
        for (int i : array) {
            System.out.print(i);
        }
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
