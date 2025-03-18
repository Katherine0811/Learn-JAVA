public class loops {
    public static void main(String[] args) {
        // 1. For Loops
        for (int num = 1; num <= 10; num++) {
            // System.out.println(num);
        }

        int sum = 0;
        int arrays[] = { 1, 3, 5, 7, 9, 11, 13 };
        for (int index = 0; index < arrays.length; index++) {
            // System.out.println(arrays[index]);
            sum += arrays[index];
        }
        for (int array : arrays) {
            System.out.println(array);
            sum += array;
        }

        System.out.println(sum);

        int number = 5;
        for (int multiplier = 1; multiplier < 10; multiplier++) {
            System.out.printf("%d X %d = %d \n", number, multiplier, number * multiplier);
        }

        for (int x = 1; x <= 10; x++) {
            for (int multiplier = 1; multiplier <= 10; multiplier++) {
                // System.out.printf("%d X %d = %d \n", x, multiplier, x * multiplier);
            }
        }

        // 2. While Loop
        int x = 5;
        int y = 1;
        while (y <= 10) {
            System.out.printf("%d X %d = %d \n", x, y, x * y);
            y++;
        }

        // 3. Do While Loop
        int a = 3;
        int b = 1;
        do {
            System.out.printf("%d + %d = %d \n", a, b, a + b);
            b++;
        } while (b <= 10);
    }
}
