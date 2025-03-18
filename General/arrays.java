import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        char vowels[] = { 'e', 'o', 'x', 'u', 'a' };
        vowels[2] = 'i';
        System.out.println(vowels.length);

        // 1. Sorting an Array
        Arrays.sort(vowels);

        int startIndex = 1;
        int endIndex = 4;
        Arrays.sort(vowels, startIndex, endIndex);

        // 2. Binary Search Methods - Sorted Array only
        char key = 'o';
        int foundIndex = Arrays.binarySearch(vowels, key);
        int foundIndex2 = Arrays.binarySearch(vowels, startIndex, endIndex, key);
        System.out.println(Arrays.toString(vowels));
        System.out.println(foundIndex);
        System.out.println(foundIndex2);

        // 3. Change a range of Array Value
        Arrays.fill(vowels, 'x');
        Arrays.fill(vowels, startIndex, endIndex, 'y');
        System.out.println(Arrays.toString(vowels));

        // 4. Arrays are references pointing to the original arrays
        int numbers[] = { 1, 2, 3, 4, 5 };
        int copyOfNumFalse[] = numbers;
        int copyOfNumTrue[] = Arrays.copyOf(numbers, numbers.length);
        int copyOfNumRange[] = Arrays.copyOfRange(numbers, startIndex, endIndex);

        Arrays.fill(numbers, 0);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(copyOfNumFalse));
        System.out.println(Arrays.toString(copyOfNumTrue));
        System.out.println(Arrays.toString(copyOfNumRange));

        System.out.println(Arrays.equals(numbers, copyOfNumFalse));

        // 5. Extend an Array
        int extOfNum[] = Arrays.copyOf(copyOfNumTrue, numbers.length + 5);
        System.out.println(Arrays.toString(extOfNum));
    }
}
