public class InsertionSort {

    // Insertion Sort:
    // After comparing elements to the left
    // Shift elements to the right to make room to insert a value

    // Less efficient as data increases
    // Quadratic Time = O(n ^ 2)
    // Don't use for large data set !
    
    public static void main(String[] args) {
        int array[] = { 9, 1, 8, 2, 7, 3, 6, 5, 4 };
        insertionSort(array);
        for (int i : array) {
            System.out.print(i);
        }
    }

    private static void insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
}
