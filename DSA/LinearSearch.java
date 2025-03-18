public class LinearSearch {

    // Linear Search:
    // Iterate through a collection one element at a time
    // Runtime complexity = O(n)

    // Disadvantages:
    // 1. Slow for large data sets

    // Advantages:
    // 1. Fast for searches of small to medium data sets
    // 2. Does not need to sorted
    // 3. Useful for data structures that do not have random access (Linked List)

    public static void main(String[] args) {

        int[] array = { 9, 1, 3, 6, 2, 7, 0 };

        int index = linearSearch(array, 4);

        if (index != -1) {
            System.out.println("Element found at Index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    private static int linearSearch(int[] array, int value) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
