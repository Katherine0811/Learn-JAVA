public class BubbleSort {

    // Bubble Sort:
    // Pairs of adjacent elements are compared, and the elements swapped if they are
    // not in order

    // Less efficient as data increases
    // Quadratic Time = O(n ^ 2)
    // Don't use for large data set !

    public static void main(String[] args) {

        int array[] = { 9, 1, 2, 8, 7, 4, 6, 3, 5 };

        bubbleSort(array);
        for (int i : array) {
            System.out.print(i);
        }
    }

    private static void bubbleSort(int array[]) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
